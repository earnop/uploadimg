package com.liuyangnop.uploadimg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class UploadController {

    /**
     * 接收图片二进制的方法，可以用byte[]接收file.getBytes存入数据库等操作
     * @param file
     * @return
     */
    @RequestMapping("/image")
    @ResponseBody
    public String uploadImg(MultipartFile file){
        try {
            byte[] imgBytes = file.getBytes();
            for(int i=0;i<imgBytes.length;i++){
                System.out.print(imgBytes[i]);
                if(i % 100 == 0){
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传成功";
    }

}
