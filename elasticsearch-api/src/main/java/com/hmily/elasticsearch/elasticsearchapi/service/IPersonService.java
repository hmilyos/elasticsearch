package com.hmily.elasticsearch.elasticsearchapi.service;

import com.hmily.elasticsearch.elasticsearchapi.common.ServerResponse;
import com.hmily.elasticsearch.elasticsearchapi.entity.Person;

public interface IPersonService {

    ServerResponse save(Person person);

    ServerResponse update(Person person);

    ServerResponse deltele(String id);

    ServerResponse getByid(String id);

    ServerResponse query(Person person);
}
