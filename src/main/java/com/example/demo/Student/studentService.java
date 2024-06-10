package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class studentService {
    public List<student> hello(){
		return List.of(new student(1L, "Mariam", LocalDate.of(2005, Month.MARCH, 26), "Mariam@gmail.com", 12));
	}
    
}
