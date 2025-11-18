package com.health.repository;

import com.health.model.User;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends IGenericRepository<User, Integer>{
    //SELECT * FROM User u WHERE u.username = ?
    //@Query("FROM User u WHERE u.username = :username")
    //DerivedQueries
    User findOneByUsername(String username);
}
