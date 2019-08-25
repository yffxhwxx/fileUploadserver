package com.bird.file.controller;

import com.bird.file.common.result.BaseResult;
import com.bird.file.service.IFileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller
public class FileController {
    @Resource
    IFileService fileService;
    /*
    下载模板
     */
    @RequestMapping(value = "/downLoadTemplete")
    public String downLoadTemplete(HttpServletResponse response){
        response.setHeader("Content-Disposition", "attachment;filename=templete.xlsx");
        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
        fileService.downloadTemp(response);
        return null;
    }
 /*
 上传文件
  */
    //解决给前端返回中文是问好 produces = "application/json; charset=utf-8"
    @RequestMapping(value = "/uploadFile",method= RequestMethod.POST)
    @ResponseBody
    public BaseResult<Boolean> uploadFile(@RequestParam("file") CommonsMultipartFile file, String service,
                                 HttpServletRequest request){
        if(null == file){
            BaseResult baseResult=new BaseResult<Boolean>();
            baseResult.setCode(-1);
            baseResult.setMessg("文件为空");
            baseResult.setData(false);
            return baseResult;
        }
        BaseResult baseResult=fileService.saveFile(file.getOriginalFilename(),file);

        return baseResult;
    }


}
