package com.hmily.elasticsearch.searchhouse.repository;

import com.hmily.elasticsearch.searchhouse.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findRolesByUserId(Long userId);

}
