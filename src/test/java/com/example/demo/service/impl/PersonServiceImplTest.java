package com.example.demo.service.impl;

import com.example.demo.dao.PersonRepository;
import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceImplTest {

    @Autowired
    private PersonService personService;

//    @Autowired
//    private PersonRepository personRepository;

    @Test
    public void findAll() {
        List <Person> list = personService.findAll();
        System.out.println( list );
    }

    @Test
    public void findById() {
        Person person = new Person();
        person.setId( 3 );
        System.out.println( person.getId() );
        Optional <Person> p = personService.findById( person );
        System.out.println( p );
    }

    @Test
    public void updateById() {
        Person person = new Person();
        person.setId( 4 );
        person.setName( "首都北京" );
        person.setDelState( 0 );
        personService.updateById( person );
    }


    @Test
    public void saveInfo() {
        Person person = new Person();
        person.setName( "中国" );
        person.setDelState( 0 );
        personService.saveInfo( person );
    }

    @Test
    public void pagge() {
        //第1页,显示5条
        PageRequest pageRequest = new PageRequest( 1, 5 );

        // Page <Person> stus = personRepository.findById( "1", pageRequest );

        //  System.out.println( stus );
        // Assert.assertEquals( 2, stus.getTotalPages);
    }

    @Test
    public void ceshi() {

        Person person = new Person();


        // personRepository.delete( person );

    }


    @Test
    public void deleteAllInBatch() {

        List <Integer> id = new ArrayList <>();

        // id.add( 1 );
        //id.add( 2 );
        id.add( 3 );

        List <Person> l = personService.deleteAllInBatch( id );
        System.out.println( l );
    }

    @Test
    public void delectById() {
        Person person = new Person();
        person.setId( 6 );
        person.setName( "韩旭雷爱音乐" );
        person.setDelState( 0 );
        List <Person> list = personService.delectById( person );
        System.out.println( list );
    }
}