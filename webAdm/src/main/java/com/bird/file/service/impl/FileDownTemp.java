package com.bird.file.service.impl;

import com.bird.file.bean.ExcelFile;
import com.bird.file.common.result.BaseResult;
import com.bird.file.dao.ExcelFileMapper;
import com.bird.file.service.IFileService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.UUID;

@Service
public class FileDownTemp implements IFileService {

    @Resource
    ExcelFileMapper fileMapper;

    @Value("${dangdang_fileUploadPath}")
    String filePath;

    public boolean downloadTemp(HttpServletResponse response)  {

        //构建一个excel文件
        String goods[]={"商品id","商品名称","在售价格","在线库存","价格","库存"};

        //相当于创建一个Excel工作区域
        Workbook workbook =new SXSSFWorkbook();
        //创建sheet页
        Sheet sheet=workbook.createSheet();
        int columnNums= goods.length;
        Row row=sheet.createRow(0);
        //设置第一行属性名字：姓名 年龄.....
        for(int i=0;i<columnNums;i++){
            Cell cell=row.createCell(i);
            cell.setCellValue(goods[i]);
        }
        //把excll以流形式输出
        OutputStream os= null;
        try {
            os = response.getOutputStream();
            BufferedOutputStream bufferedOutPut = new BufferedOutputStream(os);
            workbook.write(bufferedOutPut);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
/*
job去找文件时候 是path:fileId-fileName
 */
    public BaseResult<Boolean> saveFile(String fileName, CommonsMultipartFile file) {
        BaseResult baseResult=new BaseResult<Boolean>();
        baseResult.setCode(200);
        baseResult.setMessg("文件为空");
        baseResult.setData(true);

        UUID uuid= UUID.randomUUID();
        String uuidString=uuid.toString();
        String uuidS=uuidString.replace("-","");
        String newFileName=uuidS+"-"+fileName;
        File path=new File(filePath);
        BufferedInputStream in=null;
        BufferedOutputStream os=null;
        try {
            byte bts[]=new byte[1024*1024];
            int len;
            in=new BufferedInputStream(file.getInputStream());
            os=new BufferedOutputStream(new FileOutputStream(path+ File.separator + newFileName));
            while((len = in.read(bts)) != -1){
                os.write(bts,0,len);
            }
            //保存文件到db
            ExcelFile fileDB=new ExcelFile();
            fileDB.setFileId(uuidS);
            fileDB.setFileName(fileName);
            fileDB.setFileStatus(0);
            String pathString=path.toString();
            fileDB.setFilePath(pathString);
            fileDB.setLastDealTime(new Date());
            fileMapper.insert(fileDB);
        }catch (Exception e){
            baseResult.setCode(-1);
            baseResult.setMessg(e.getMessage().toString());
            baseResult.setData(false);
            e.printStackTrace();
        }finally {
            try {
                os.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return baseResult;
    }
}
