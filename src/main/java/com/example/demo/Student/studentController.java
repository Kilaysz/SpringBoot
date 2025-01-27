package com.example.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class studentController {

    private final studentService studentService;

    @Autowired
    public studentController(studentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
	public List<student> hello(){
		return studentService.hello();
	}


    
}
