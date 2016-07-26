package com.receipts.controller;

import com.receipts.dto.GetUserRequest;
import com.receipts.dto.GetUserResponse;
import com.receipts.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.io.IOException;

/**
 * Created by karthikkpati on 7/25/2016.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public @ResponseBody
    GetUserResponse login(@Valid @RequestBody GetUserRequest getUserRequest) throws IOException {
        return userService.findUserById(getUserRequest.getUserId());
    }

    @RequestMapping(value="/login1", method= RequestMethod.POST)
    public @ResponseBody
    GetUserRequest loginRequest() throws IOException {
        GetUserRequest getUserRequest = new GetUserRequest();
        getUserRequest.setUserId(1L);
        return getUserRequest;
    }
}
