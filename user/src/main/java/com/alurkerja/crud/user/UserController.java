package com.alurkerja.crud.user;

import com.alurkerja.core.controller.CrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud/user")
public class UserController extends CrudController<User, UserDto, UserService, UserRepository> {
    protected UserController(UserService userService) {
        super(userService);
    }

    @GetMapping("/find")
    public ResponseEntity<Object> find(UserDto dto){
        return ResponseEntity.ok().body(crudService.findAll(dto).get(0));
    }
}
