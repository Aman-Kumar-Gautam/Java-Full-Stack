package com.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;
import com.sun.xml.bind.v2.runtime.Name;


@SpringBootTest
class Demo1ApplicationTests {
	@Autowired
	private StudentRepository studentRepo;
	
	
	// For Creating Student Record
	@Test
	public void saveStudent() {
		Student s = new Student();
		s.setId(1);
		s.setName("Shan");
		s.setEmail("shan@gmail.com");
		s.setFee(15000);
		s.setMobile("963252578");
		
		studentRepo.save(s);
	}
	
	
	// For reading Student Record
//	@Test 
//	void studentexistsById() {
//		boolean val = studentRepo.existsById(1L);
//		System.out.println(val);
//	}
//	
//	// For deleting Student Record
//	@Test
//	public void deleteStudent() {
//		studentRepo.deleteById(1L);
//	}
//	
//	
//	// For Updating Student Record
//	@Test
//	public void updateStudent() {
//		Student s = new Student();
//		s.setId(2);
//		s.setName("Aryan");
//		s.setEmail("aru@gmail.com");
//		s.setFee(20000);
//		s.setMobile(1234567890);
//		
//		studentRepo.save(s);
//	}
	
//	@Test
//	void getStudentById() {
//		Optional<Student> s = studentRepo.findById(10L);
//		
//		if (s.isPresent()) {
//			Student s1 = s.get();
//			System.out.println(s1.getId());
//			System.out.println(s1.getName());
//			System.out.println(s1.getEmail());
//			System.out.println(s1.getFee());
//			System.out.println(s1.getMobile());
//		}else {
//			System.out.println("Somthing went Wrong...!");
//		}
//	}

//	@Test 
//	void getAllStudent(){
//		Iterable<Student> findAll = studentRepo.findAll();
//		for (Student student : findAll) {
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getEmail());
//			System.out.println(student.getFee());
//			System.out.println(student.getMobile());
//		}
//	}
//	@Test
//	public void getStudentByEmail() {
//		Optional<Student> s = studentRepo.findByEmail("shan@gmail.com");
//		Student student = s.get();
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getEmail());
//		System.out.println(student.getFee());
//		System.out.println(student.getMobile());
//	}
//	@Test
//	public void getStudentByName() {
//		Optional<Student> s = studentRepo.findByName("Aryan");
//		Student student = s.get();
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getEmail());
//		System.out.println(student.getFee());
//		System.out.println(student.getMobile());
//	}
//	@Test
//	public void getStudentByMobile() {
//		Optional<Student> s = studentRepo.findByMobile(963252578);
//		Student student = s.get();
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getEmail());
//		System.out.println(student.getFee());
//		System.out.println(student.getMobile());
//	}
//	
	
//	@Test
//	public void findByEmailormobile() {
//		Iterable<Student> students = studentRepo.findByEmailOrMobile("aru@gmail.com","963252578");
//		for (Student student : students) {
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getEmail());
//			System.out.println(student.getFee());
//			System.out.println(student.getMobile());
//		}
//	}
	
//	
//	@Test
//	public void findByEmailAndMobile() {
//		Iterable<Student> students = studentRepo.findByEmailAndMobile("aru@gmail.com","1234567890");
//		for (Student student : students) {
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getEmail());
//			System.out.println(student.getFee());
//			System.out.println(student.getMobile());
//		}
//		{
//			System.out.println("Not Found...!");
//		}
//	}
//	
	
	
//	@Test
//	public void getAllStudent() {
//		List<Student> students = studentRepo.findAll();
//		for (Student student : students) {
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getEmail());
//			System.out.println(student.getFee());
//			System.out.println(student.getMobile());
//		}
//	
//	}
	
	
	// Pagination Table Concept
	
	@Test
	public void getAllStudents() {
		Pageable pageable = PageRequest.of(0, 3, Sort.by("name"));
		Page<Student> findAll = studentRepo.findAll(pageable);
		List<Student> students = findAll.getContent();
		for (Student student : students) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			System.out.println(student.getFee());
			System.out.println(student.getMobile());
		}
		
		System.out.println(findAll.getSize());
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
