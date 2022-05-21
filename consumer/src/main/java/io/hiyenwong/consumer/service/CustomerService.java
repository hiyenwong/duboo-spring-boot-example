package io.hiyenwong.consumer.service;

import io.hiyenwong.duboo.common2.dto.UserDto;
import io.hiyenwong.duboo.common2.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author Hi Yen Wong
 * @date 2022/5/21 23:21
 */
@Service

public class CustomerService {

    @DubboReference
    private UserService userService;

    public UserDto setUserInfo(String username, String email) {
        return userService.setUserDto(username, email);
    }
}
