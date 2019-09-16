package com.bird.file.dao;

import com.bird.file.bean.ExcelFile;
import com.bird.file.bean.ExcelFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelFileMapper {
    long countByExample(ExcelFileExample example);

    int deleteByExample(ExcelFileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(ExcelFile record);

    int insertSelective(ExcelFile record);

    List<ExcelFile> selectByExample(ExcelFileExample example);

    ExcelFile selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") ExcelFile record, @Param("example") ExcelFileExample example);

    int updateByExample(@Param("record") ExcelFile record, @Param("example") ExcelFileExample example);

    int updateByPrimaryKeySelective(ExcelFile record);

    int updateByPrimaryKey(ExcelFile record);
}