package com.bird.file.service;

import com.bird.file.common.result.BaseResult;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface IFileService {
    public boolean downloadTemp(HttpServletResponse response) ;

    public BaseResult<Boolean> saveFile(String fileName, CommonsMultipartFile file);
}
