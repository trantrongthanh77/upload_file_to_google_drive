package com.spring;

import com.spring.service.GoogleDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController("/test")
public class Controller {

    @Autowired
    GoogleDriveService driveService;

    @PostMapping
    public String testUpload() {
        File file = new File("C:\\Users\\thanh\\Pictures\\Capture.PNG");
        com.google.api.services.drive.model.File file2  = driveService.upLoadFile(file.getName(), file.getAbsolutePath(),"image/jpg");
        try {
            return file2.toPrettyString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "như cc";
    }
}
