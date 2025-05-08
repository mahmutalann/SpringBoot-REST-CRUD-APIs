package springlearn.demo.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springlearn.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> theStudents = new ArrayList<>();
			theStudents.add(new Student ("Ali", "Veli"));
			theStudents.add(new Student ("Onur", "Yilmaz"));
			theStudents.add(new Student ("Software", "Engineer"));
		return theStudents;
	}
}
