package com.caveofprogramming.tests;

import javax.transaction.Transactional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.caveofprogramming.model.StatusUpdate;
import com.caveofprogramming.model.StatusUpdateDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
@Transactional
public class StatusTest {

	@Autowired
	private StatusUpdateDao statusUpdateDao;
	
	@Test
	public void testSave()
	{
		StatusUpdate status = new StatusUpdate("This is a test status update.");
		
		statusUpdateDao.save(status);
		
		assertNotNull("Non-Null ID", status.getId());
		assertNotNull("Non-Null Date", status.getAdded());
		
		StatusUpdate retrieved = statusUpdateDao.findOne(status.getId());
		
		assertEquals("Matching StatusUpdate" , status , retrieved);
		
	}
}
