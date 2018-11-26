package com.hmily.elasticsearch.elasticsearchapi.web;

import com.hmily.elasticsearch.elasticsearchapi.common.ServerResponse;
import com.hmily.elasticsearch.elasticsearchapi.entity.Person;
import com.hmily.elasticsearch.elasticsearchapi.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping("/person/{id}")
    public ServerResponse getPerson(@PathVariable("id") String id) {
        return personService.getByid(id);
    }

    /**
     * 聚合查询
     *
     * @param name
     * @param age
     * @param introduce
     * @return
     */
    @PostMapping("/person/_search")
    public ServerResponse queryPerson(@RequestParam(name = "name", required = false) String name
            , @RequestParam(name = "age", required = false, defaultValue = "0") Integer age
            , @RequestParam(name = "introduce", required = false) String introduce) {
        Person person = new Person(name, age, null, null, introduce);
        return personService.query(person);
    }

    @PostMapping("/save/person")
    public ServerResponse savePerson(@RequestParam(name = "name") String name,
                             @RequestParam(name = "sex") String sex,
                             @RequestParam(name = "age") Integer age,
                             @RequestParam(name = "introduce") String introduce,
                             @RequestParam(name = "birthday") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date birthday
    ) {
        Person person = new Person(name, age, sex, birthday, introduce);
        return personService.save(person);
    }

    @PutMapping("/person/{id}")
    public ServerResponse updatePerson(@PathVariable("id") String id
            ,@RequestParam(name="name") String name
            ,@RequestParam(name="sex") String sex
            ,@RequestParam(name="age") int age
            ,@RequestParam(name="introduce") String introduce
            ,@RequestParam(name="birthday") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")Date birthday
    ) {
        Person person = new Person(name, age, sex, birthday, introduce);
        person.setId(id);
        return personService.update(person);
    }

    @DeleteMapping("/person/{id}")
    public ServerResponse delPerson(@PathVariable("id") String id) {
        return personService.deltele(id);
    }
}
