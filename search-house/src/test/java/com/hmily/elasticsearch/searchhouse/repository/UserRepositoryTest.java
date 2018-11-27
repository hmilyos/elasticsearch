package com.hmily.elasticsearch.searchhouse.repository;

import com.hmily.elasticsearch.searchhouse.SearchHouseApplicationTests;
import com.hmily.elasticsearch.searchhouse.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserRepositoryTest extends SearchHouseApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){
        User user = userRepository.findOne(1L);
        Assert.assertEquals("waliwali", user.getName());
    }
}