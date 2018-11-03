package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaServiceApplication {

	@RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name)
    {
        return new Student(name, "Pune", "MCA");
    }
 
    
    public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

    
}
 
class Student
{
    String name;
    String address;
    String cls;
 
    public Student(String name, String address, String cls) {
        super();
        this.name = name;
        this.address = address;
        this.cls = cls;
    }
 
    public String getName() {
        return name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public String getCls() {
        return cls;
    }
}
