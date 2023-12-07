package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Student;

// CRUD operation
// Built-In method of Spring
//public interface StudentRepository extends CrudRepository<Student, Long>

public interface StudentRepository extends JpaRepository<Student, Long>{
	Optional<Student> findByEmail(String email);
	Optional<Student> findByName(String name);
	Optional<Student> findByMobile(int mobile);
	Iterable<Student> findByEmailOrMobile(String email, String mobile);
	Iterable<Student> findByEmailAndMobile(String email, String mobile);
}
