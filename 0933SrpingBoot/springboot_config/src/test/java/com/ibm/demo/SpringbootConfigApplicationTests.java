package com.ibm.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.demo.config.Person;
import com.ibm.demo.config.YmlPerson;

@SpringBootTest
class SpringbootConfigApplicationTests {
	@Autowired
	Person person;

	@Autowired
	YmlPerson personConfig;

	@Test
	void contextLoads() {
		System.out.println(person);
		System.out.println(person.getCattle().getName());
	}

	@Value("${person.sex}")
	String sex;

	@Test
	void valueGet() {
		System.out.println(sex);
	}

	@Test
	void getValueByPropertySource() {
		System.out.println(personConfig.getCattle().getName() + personConfig.getLastName());
	}
}
