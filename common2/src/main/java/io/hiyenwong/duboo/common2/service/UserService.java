package io.hiyenwong.duboo.common2.service;

import io.hiyenwong.duboo.common2.dto.UserDto;

/**
 * @author Hi Yen Wong
 * @date 2022/5/21 23:16
 */
public interface UserService {
    UserDto setUserDto(String userName, String email);
}

