package io.hiyenwong.consumer.controller;

import io.hiyenwong.consumer.service.CustomerService;
import io.hiyenwong.duboo.common2.dto.UserDto;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hi Yen Wong
 * @date 2022/5/21 23:24
 */
@RequestMapping("/user")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/setUser")
    public UserDto setUserDto(@Param(value = "userName") String username, @Param(value = "email") String email) {
        return customerService.setUserInfo(username, email);
    }
}
