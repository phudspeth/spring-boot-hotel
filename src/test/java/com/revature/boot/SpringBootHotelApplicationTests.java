package com.revature.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHotelApplicationTests 
{
	@Autowired
	private ApplicationContext context;
	
	@Test
	@Transactional
	public void testDBInsert() 
	{
		//count rows = 100
		//insert a test row
		//assert count rows = 101
		//test passes
		//because of the @Transactional, it will auto-rollback
		//when the method finishes.
	}

}
