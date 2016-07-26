package com.receipts.utils;

import com.receipts.dto.UserDTO;
import com.receipts.model.User;

/**
 * Created by karthikkpati on 7/25/2016.
 */
public class EntityDtoUtils {

    public static UserDTO getUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getId());
        userDTO.setUserStatus(user.getUserStatus().name());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setEmailId(user.getEmail());
        return userDTO;
    }
}
