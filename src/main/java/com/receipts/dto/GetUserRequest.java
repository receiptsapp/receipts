package com.receipts.dto;

/**
 * Created by karthikkpati on 7/25/2016.
 */
public class GetUserRequest extends BaseRequest {

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
