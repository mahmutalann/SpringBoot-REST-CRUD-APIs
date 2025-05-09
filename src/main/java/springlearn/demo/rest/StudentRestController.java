package springlearn.demo.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import springlearn.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	// define @PostConstruct to load the student data, only once
	
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		
		theStudents.add(new Student ("Ali", "Veli"));
		theStudents.add(new Student ("Onur", "Yilmaz"));
		theStudents.add(new Student ("Software", "Engineer"));
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
			
		return theStudents;
	}
	
	// define endpoint or "/students/{studentId}" - return student at index
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		// just index into the list
		
		return theStudents.get(studentId);	
		
	}
}