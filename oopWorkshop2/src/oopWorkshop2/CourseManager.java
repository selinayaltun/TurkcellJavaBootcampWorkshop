package oopWorkshop2;

public class CourseManager {
	
	public void getAll(Course[] courses) {
		
		for (Course course : courses) {
			System.out.println(course.getCourseName());
		}
	}
	
}
