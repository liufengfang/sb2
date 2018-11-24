package com.liu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by liufengfang on 2018/11/24.
 */
@Controller
@RequestMapping(value = "/filesUpload")
public class UploadController {

    @RequestMapping(value = "/singleFileUpload")
    @ResponseBody
    private String singleFileUpload(@RequestParam(value = "singleFile") MultipartFile file) throws IOException{
        String savePath = "/Users/liufengfang/me-me-da/pdfs";


        File dir = new File(savePath);
        if(!dir.exists()){
            dir.mkdir();
        }

        file.transferTo(new File(savePath,file.getOriginalFilename()));

        return "sucess";
    }

}
