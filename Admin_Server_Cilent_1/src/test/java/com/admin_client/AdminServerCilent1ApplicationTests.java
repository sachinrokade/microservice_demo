package com.admin_client;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import com.admin_client.contoller.SchoolController;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class AdminServerCilent1ApplicationTests {
	
	@InjectMocks
    SchoolController schoolController;
	
	@Test
	public void contextLoads() {
		
		assertEquals("Spring Admin Client 1","Spring Admin Client 1");
	}

}

