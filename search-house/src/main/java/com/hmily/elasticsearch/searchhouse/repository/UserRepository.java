package com.hmily.elasticsearch.searchhouse.repository;

import com.hmily.elasticsearch.searchhouse.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

    User findByName(String userName);
}
