package oopWorkshop2;

public class Course {
	
	private int id;
	private double price;
	private String courseName;
	private String courseDescription;
	private Instructor[] instructors;
	private Category category;
	
	public Course() {
		super();
	}
	
	public Course(int id, double price, String courseName, String courseDescription) {
		super();
		this.id = id;
		this.price = price;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public Instructor[] getInstructors() {
		return instructors;
	}
	public void setInstructors(Instructor[] instructors) {
		this.instructors = instructors;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
