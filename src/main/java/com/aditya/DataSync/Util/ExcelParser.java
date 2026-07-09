package com.aditya.DataSync.Util;

import com.aditya.DataSync.Dto.CellData;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ExcelParser {

    /**
     * Opens an uploaded Excel workbook.
     */
    public Workbook parseWorkbook(MultipartFile file) throws IOException {
        return new XSSFWorkbook(file.getInputStream());
    }

    /**
     * Returns the number of sheets.
     */
    public int getSheetCount(Workbook workbook) {
        return workbook.getNumberOfSheets();
    }

    /**
     * Returns all sheet names.
     */
    public List<String> getSheetNames(Workbook workbook) {

        List<String> sheetNames = new ArrayList<>();

        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            sheetNames.add(workbook.getSheetAt(i).getSheetName());
        }

        return sheetNames;
    }

    /**
     * Returns a sheet by index.
     */
    public Sheet getSheet(Workbook workbook, int index) {
        return workbook.getSheetAt(index);
    }

    /**
     * Returns total rows in a sheet.
     */
    public int getRowCount(Sheet sheet) {
        return sheet.getPhysicalNumberOfRows();
    }

    /**
     * Returns total columns in a row.
     */
    public int getColumnCount(Row row) {
        return row.getPhysicalNumberOfCells();
    }

    /**
     * Returns the value of a cell as String.
     */
    public String getCellValue(Cell cell) {

        if (cell == null) {
            return "";
        }

        return switch (cell.getCellType()) {

            case STRING -> cell.getStringCellValue();

            case NUMERIC -> {
                if (DateUtil.isCellDateFormatted(cell)) {
                    yield cell.getDateCellValue().toString();
                }
                yield String.valueOf(cell.getNumericCellValue());
            }

            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());

            case FORMULA -> cell.getCellFormula();

            case BLANK -> "";

            default -> "";
        };
    }

    /**
     * Close workbook safely.
     */
    public void closeWorkbook(Workbook workbook) throws IOException {
        workbook.close();
    }
    public List<CellData> readAllCells(Workbook workbook) {

        List<CellData> cells = new ArrayList<>();

        for (Sheet sheet : workbook) {

            for (Row row : sheet) {

                for (Cell cell : row) {

                    String value = "";

                    switch (cell.getCellType()) {

                        case STRING:
                            value = cell.getStringCellValue();
                            break;

                        case NUMERIC:
                            value = String.valueOf(cell.getNumericCellValue());
                            break;

                        case BOOLEAN:
                            value = String.valueOf(cell.getBooleanCellValue());
                            break;

                        case FORMULA:
                            value = cell.getCellFormula();
                            break;

                        case BLANK:
                            value = "";
                            break;

                        default:
                            value = "";
                    }

                    cells.add(new CellData(
                            sheet.getSheetName(),
                            row.getRowNum(),
                            cell.getColumnIndex(),
                            cell.getAddress().formatAsString(),
                            value,
                            cell.getCellType().name()
                    ));
                }
            }
        }

        return cells;
    }
}