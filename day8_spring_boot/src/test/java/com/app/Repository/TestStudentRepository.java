package com.app.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojo.Student;
import com.app.repository.StudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TestStudentRepository {

	@Autowired
	private StudentRepository stdRepo;

	@Test
	void test() {
		assertNotNull(stdRepo);
	}

//	@Test
//	void testStudents() {
//		List<Student> stds = List.of(
//				new Student("prashant", "chede", "prashant@gmail.com", "PG-DAC",
//						LocalDate.parse("2022-11-11"), 50),
//				new Student("pramod", "chede", "pramod@gmail.com", "PG-DBDA",
//						LocalDate.parse("2026-11-26"), 75),
//				new Student("priyanka", "chede", "priyanka@gmail.com", "PG-DITIS", 
//						LocalDate.parse("2024-08-17"), 80)
//
//		);
//		List<Student> retsList = stdRepo.saveAll(stds);
//
//		assertEquals(3, retsList.size());
//
//	}

}
