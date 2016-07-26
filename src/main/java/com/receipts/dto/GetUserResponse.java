package com.receipts.dto;

/**
 * Created by karthikkpati on 7/25/2016.
 */
public class GetUserResponse extends BaseResponse {

    private UserDTO userDTO;

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
