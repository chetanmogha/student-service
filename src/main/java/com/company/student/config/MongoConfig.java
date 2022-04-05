package com.company.student.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.student.repo.StudentRepository;


/**
 * 
 * @author Chetan
 * @version 2.0
 * @see MongoConfig for Student
 *
 */


@Configuration
@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
public class MongoConfig {

	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository studentRfepo) {
		
		return null;
	}
}
