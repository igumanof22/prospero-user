package com.alurkerja.crud.user;

import com.alurkerja.constant.ApplicationEnum;
import com.alurkerja.core.entity.CrudEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class User extends CrudEntity {
    private String email;
    @JsonIgnore
    private String password;
    private String name;
    private ApplicationEnum.Group role;
}
