package com.savethechildren.userapi.repositories;

import com.savethechildren.userapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
