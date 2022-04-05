package com.company.student.repo;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.company.student.beans.Student;






@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

	

}