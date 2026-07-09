package com.aditya.DataSync.Controller;

import com.aditya.DataSync.Service.ExcelService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/excel")
public class ExcelController {

    private final ExcelService excelService;

    public ExcelController(ExcelService excelService) {
        this.excelService = excelService;
    }

    @PostMapping("/upload")
    public List<String> uploadExcel(@RequestParam("file") MultipartFile file)
            throws IOException {

        return excelService.getSheetNames(file);
    }
}