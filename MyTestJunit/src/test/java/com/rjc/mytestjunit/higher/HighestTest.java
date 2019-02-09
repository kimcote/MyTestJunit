package com.rjc.mytestjunit.higher;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.rjc.mytestjunit.middle.Middlest;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HighestTest {

	@Autowired
	private Highest highest;
	
	@MockBean
	private Middlest middlest;
	
	@Test
	public void testHighest() {
		when(middlest.getMiddlest()).thenReturn("");
		
		assertEquals(highest.getHighest()," Highest");
	}
}
