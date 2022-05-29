package oopWorkshop2;

public class Student extends User{
	
	private Course[] courses;

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String email) {
		super(id, firstName, lastName, email);
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
	
}
