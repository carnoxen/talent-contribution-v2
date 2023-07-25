package com.bitor.talentcontribution;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bitor.talentcontribution.member.*;

@SpringBootTest
class TalentContributionApplicationTests {

	@Test
	@DisplayName("inherited member test")
	void member_inheritances() {
		String name = "학생a";
		String phone = "010-1234-5678";
		Member a = Student.builder().name(name).phone(phone).build();
		Member b = Teacher.builder().name(name).phone(phone).build();
		Member c = Proprietor.builder().name(name).phone(phone).build();
		
		System.out.println("Member test start");

		assertNotNull(a, "Student must not be null");
		assertNotNull(b, "Teacher must not be null");
		assertNotNull(c, "Proprietor must not be null");

		System.out.println("Member test end");
	}

}
