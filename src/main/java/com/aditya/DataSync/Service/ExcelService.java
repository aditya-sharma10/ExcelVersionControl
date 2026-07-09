package com.aditya.DataSync.Service;

import com.aditya.DataSync.Util.ExcelParser;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ExcelService {

    private final ExcelParser excelParser;

    public ExcelService(ExcelParser excelParser) {
        this.excelParser = excelParser;
    }

    public Workbook parseExcel(MultipartFile file) throws IOException {
        return excelParser.parseWorkbook(file);
    }

    public List<String> getSheetNames(MultipartFile file) throws IOException {

        Workbook workbook = excelParser.parseWorkbook(file);

        try {
            return excelParser.getSheetNames(workbook);
        } finally {
            workbook.close();
        }
    }
}