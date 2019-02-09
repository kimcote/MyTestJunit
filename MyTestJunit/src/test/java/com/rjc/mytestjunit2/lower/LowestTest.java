package com.rjc.mytestjunit2.lower;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rjc.mytestjunit.lower.Lowest;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LowestTest {

	@Autowired
	private Lowest lowest;
	
	@Test
	public void testLowest() {
		assertEquals(lowest.getLowest(),"Lowest");
	}
}
