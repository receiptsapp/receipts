package com.receipts.dao;

import com.receipts.model.User;
import com.receipts.model.UserStatus;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karthikkpati on 7/25/2016.
 */
@Repository
public class UserDAO extends BaseDAO<User, Long > {

    public List<User> findById(Long userId, List<UserStatus> userStatusList) {
        List<User> userList = null;

        if(userId != null){
            userList = findByCriteria(Restrictions.and(Restrictions.eq("id", userId), Restrictions.in("userStatus", userStatusList)));
        }

        return userList;
    }

    public User findActiveUserById(Long userId) {
        User user = null;
        List<UserStatus> userStatusList = new ArrayList<UserStatus>();
        userStatusList.add(UserStatus.Active);
        List<User> userList = findById(userId, userStatusList);
        if(userList != null && !userList.isEmpty()){
            user = userList.get(0);
        }
        return user;
    }
}
