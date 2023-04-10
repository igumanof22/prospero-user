package com.alurkerja.crud.user;

import com.alurkerja.constant.ApplicationEnum;
import com.alurkerja.spec.entity.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends BaseDto<User, UserDto> {
    private String email;
    private String password;
    private String name;
    private ApplicationEnum.Group role;
}
