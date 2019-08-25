package com.bird.file.service;

import com.bird.file.bean.ExcelFileQuery;
import com.bird.file.bean.File;

import java.util.List;

public interface IFetchExcelService {
    public List<File> fetchExcel(ExcelFileQuery excelFileQuery);
}
