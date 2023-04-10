package com.alurkerja.crud.user;

import com.alurkerja.core.exception.AlurKerjaException;
import com.alurkerja.core.interfaces.AccessableInterface;
import com.alurkerja.core.service.CrudService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService extends CrudService<User, UserDto, UserRepository> {
    protected UserService(UserRepository simpleJpaRepository) {
        super(simpleJpaRepository);
    }

    @Override
    public String getCurrentUser() {
        return null;
    }

    @Override
    public String getCurrentGroup() {
        return null;
    }

    @Override
    public String getCurrentOrganization() {
        return null;
    }
}
