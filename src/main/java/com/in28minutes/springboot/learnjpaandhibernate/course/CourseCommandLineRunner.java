package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    CourseJdbcRepository repository;

//    @Autowired
//    CourseJpaRepository repository;

    @Autowired
    CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        // JDBC && JPA
//        repository.insert(new Course(1, "Learn AWS NOW!", "in28minutes"));
//        repository.insert(new Course(2, "Learn Azure NOW!", "in28minutes"));
//        repository.insert(new Course(3, "Learn DevOps NOW!", "in28minutes"));
//        repository.deleteById(1);
//
//        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(3));



        // Spring Data JPA
        repository.save(new Course(1, "Learn AWS NOW!", "chi ho"));
        repository.save(new Course(2, "Learn Azure NOW!", "tam"));
        repository.save(new Course(3, "Learn DevOps NOW!", "alvin"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("tam"));
        System.out.println(repository.findByName("Learn DevOps NOW!"));

    }
}
