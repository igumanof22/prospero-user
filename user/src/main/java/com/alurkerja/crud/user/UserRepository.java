package com.alurkerja.crud.user;

import com.alurkerja.core.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User> {
}
