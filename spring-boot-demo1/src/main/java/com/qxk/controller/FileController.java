package com.qxk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * TODO
 *
 * @author 86080
 * @version 1.0
 * @date 2023/06/19 10:51
 */
@RestController
public class FileController {
    @Value("${file.path}")
    String path;
    @RequestMapping("file/upload")
    public String fileUpload(MultipartFile file){
        try {
            file.transferTo(new File(path,file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
