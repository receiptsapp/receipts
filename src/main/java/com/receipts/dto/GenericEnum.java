package com.receipts.dto;

/**
 * Created by karthikkpati on 7/25/2016.
 */
public enum GenericEnum {

    Success("0000", "Success"), DB_EXCEPTION("0001", "Exception while updating database");

    public String code;
    public String message;

    private GenericEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
