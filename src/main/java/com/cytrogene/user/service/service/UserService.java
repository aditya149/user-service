package com.cytrogene.user.service.service;

import com.cytrogene.user.service.entity.User;
import com.cytrogene.user.service.repository.UserRepository;
import com.cytrogene.user.service.userVo.Department;
import com.cytrogene.user.service.userVo.UserDepartmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public UserDepartmentVo getUser(Long userId) {
        User user = userRepository.findById(userId).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),Department.class);
        UserDepartmentVo userDepartmentVo = new UserDepartmentVo();
        userDepartmentVo.setUser(user);
        userDepartmentVo.setDepartment(department);
        return userDepartmentVo;
    }
}
