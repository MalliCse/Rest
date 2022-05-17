package com.example.student.RepositoryTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import com.example.student.entity.Student;
import com.example.student.reporitory.StudentRepository;

@DataJpaTest
class StudentRepositoryTest {

	@Autowired
	StudentRepository stdrep;
	
	@Test
	void test() {
		
		Student sample=new Student(1L,"Malli","Vijay","Rani",1,"veluru");
		stdrep.save(sample);
		assertEquals(stdrep.findById(1L).get().getFathername(),"Vijay");
		
		
	}

}
