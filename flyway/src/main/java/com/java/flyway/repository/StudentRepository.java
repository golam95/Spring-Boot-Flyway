package com.java.flyway.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.java.flyway.model.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	@Query("SELECT name FROM Student s WHERE s.name LIKE %:studentName%")
	String findByName(String studentName);

}