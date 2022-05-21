package io.hiyenwong.provider.service;

import io.hiyenwong.duboo.common2.dto.UserDto;
import io.hiyenwong.duboo.common2.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Hi Yen Wong
 * @date 2022/5/21 22:44
 */
@DubboService
public class UserServiceImp implements UserService {

    @Override
    public UserDto setUserDto(String userName, String email) {
        UserDto userDto = new UserDto();
        userDto.setUserName(userName);
        userDto.setEmail(email);
        return userDto;
    }
}
