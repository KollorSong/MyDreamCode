package me.yqiang.movie.service.impl;

import me.yqiang.movie.domain.User;
import me.yqiang.movie.repository.UserMapper;
import me.yqiang.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userRepository) {
        this.userMapper=userRepository;
    }

    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

    @Override
    public User save(User user) {
        if (userMapper.save(user)>0){
            return user;
        }
        return null;
    }
}
