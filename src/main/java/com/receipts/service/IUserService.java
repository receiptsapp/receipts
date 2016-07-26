package com.receipts.service;

import com.receipts.dto.GetUserResponse;
import com.receipts.model.User;

/**
 * Created by karthikkpati on 7/25/2016.
 */
public interface IUserService {

    public GetUserResponse findUserById(Long userId);

}
