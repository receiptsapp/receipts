package com.receipts.dto;

/**
 * Created by karthikkpati on 7/25/2016.
 */
import java.util.List;

public class BaseResponse {

    private List<ErrorDetail> errorDetailList;

    public List<ErrorDetail> getErrorDetailList() {
        return errorDetailList;
    }

    public void setErrorDetailList(List<ErrorDetail> errorDetailList) {
        this.errorDetailList = errorDetailList;
    }
}
