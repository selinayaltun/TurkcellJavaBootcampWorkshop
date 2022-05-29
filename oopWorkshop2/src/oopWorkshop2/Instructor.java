package oopWorkshop2;

public class Instructor extends User{
	
	private Course[] courses;

	public Instructor() {
		super();
	}
	
	public Instructor(int id, String firstName, String lastName, String email) {
		super(id, firstName, lastName, email);
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
	
}
