package io.hiyenwong.duboo.common2.dto;


import java.io.Serializable;

/**
 * @author Hi Yen Wong
 * @date 2022/5/21 22:44
 */

public class UserDto implements Serializable {
    private static final long serialVersionUID = 4469665007319459055L;
    private String userName;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
