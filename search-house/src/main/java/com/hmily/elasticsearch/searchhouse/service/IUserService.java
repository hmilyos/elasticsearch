package com.hmily.elasticsearch.searchhouse.service;

import com.hmily.elasticsearch.searchhouse.entity.User;

public interface IUserService {

    User findUserByName(String userName);

}
