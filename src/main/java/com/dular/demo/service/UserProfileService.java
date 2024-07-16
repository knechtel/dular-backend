package com.dular.demo.service;

import com.dular.demo.domain.UserProfile;
import com.dular.demo.repository.UserProfileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by maiquelknechtel on 16/07/24.
 */
@Service
public class UserProfileService {
    @Autowired
    private UserProfileDao userProfileDao;

    public UserProfile save(UserProfile userProfile){
        return userProfileDao.save(userProfile);
    }
}
