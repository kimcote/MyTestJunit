package com.rjc.mytestjunit.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rjc.mytestjunit.model.Child;
import com.rjc.mytestjunit.model.Parent;

@RunWith(SpringRunner.class)
@SpringBootTest // tells Spring Boot to go and look for a main configuration class (one with @SpringBootApplication for instance), and use that to start a Spring application context.
//@WebMvcTest(MyController.class)
@AutoConfigureMockMvc
public class ControllersTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	@MockBean
	private Parent parent;
	
	@MockBean
	private Child child;

	@Test
	public void child() throws Exception {

	    // studentService.addCourse to respond back with mockCourse
	    when(parent.getChild()).thenReturn(child);
		when(parent.getChild().getName()).thenReturn("Ndidi");
		
	    // Send course as body to /students/Student1/courses
	    RequestBuilder requestBuilder = MockMvcRequestBuilders
	            .post("/child")
	            .accept(MediaType.ALL)
	            .content("Ndidi")
	            .contentType(MediaType.ALL);

	    MvcResult result = mockmvc.perform(requestBuilder).andReturn();

	    MockHttpServletResponse response = result.getResponse();

	    assertEquals(HttpStatus.OK.value(), response.getStatus());

//	    assertEquals("http://localhost:8081/child",response.getHeader(HttpHeaders.LOCATION));
	    
	    result = mockmvc.perform(get("/child")).andReturn();
//	    andDo(print()).andExpect(status().isOk())
	    
	    assertEquals(result.getResponse().getContentAsString(),"Ndidi");
//        .andExpect(content().string(containsString("Ndidi")));
	}
}
