package com.example.demo;

import java.util.Date;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;





@RestController
@Api
public class EurekaServiceApplication {

	
	/*
	 * 
	 * Request format : http://localhost:8090/echoStudentName/aniket
	 * 
	 */
	@RequestMapping(value = "/echoStudentName/{name}")
    @ApiOperation("Prints the student name and the associated date")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: purple;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
	
	
	/*
	 * 
	 * 
	 * Request format : http://localhost:8090/getStudentDetails/aniket
	 * 
	 */
	
    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name)
    {
        return new Student(name, "Pune", "MCA");
    }
 
    
    
    
}
 

