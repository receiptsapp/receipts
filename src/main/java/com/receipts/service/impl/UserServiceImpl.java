package com.receipts.service.impl;

import com.receipts.dao.UserDAO;
import com.receipts.dto.GetUserResponse;
import com.receipts.model.User;
import com.receipts.service.IUserService;
import com.receipts.utils.EntityDtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by karthikkpati on 7/25/2016.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public GetUserResponse findUserById(Long userId) {
        User user = userDAO.findActiveUserById(userId);
        GetUserResponse getUserResponse = new GetUserResponse();
        getUserResponse.setUserDTO(EntityDtoUtils.getUserDTO(user));
        return getUserResponse;
    }
}
