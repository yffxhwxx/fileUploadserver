package com.bird.file.job;

import com.bird.file.bean.ExcelFileQuery;
import com.bird.file.bean.File;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

import java.util.List;
/*
拉去带转换的Excel文件 然后转换为对应的实体，进行保存到db
 */
public class TransExcelFile2B implements DataflowJob<File> {
    public List<File> fetchData(ShardingContext shardingContext) {
        ExcelFileQuery excelFileQuery=new ExcelFileQuery();
        excelFileQuery.setCount(5);
        excelFileQuery.setFileStatus(0);


        return null;
    }

    public void processData(ShardingContext shardingContext, List<File> list) {

    }
}
