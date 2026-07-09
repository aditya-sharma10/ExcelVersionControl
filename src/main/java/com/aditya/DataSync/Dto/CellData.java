package com.aditya.DataSync.Dto;

public class CellData {

    private String sheetName;
    private int row;
    private int column;
    private String address;
    private String value;
    private String type;

    public CellData() {
    }

    public CellData(String sheetName, int row, int column,
                    String address, String value, String type) {
        this.sheetName = sheetName;
        this.row = row;
        this.column = column;
        this.address = address;
        this.value = value;
        this.type = type;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}