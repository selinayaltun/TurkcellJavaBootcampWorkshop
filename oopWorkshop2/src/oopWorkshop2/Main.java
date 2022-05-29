package oopWorkshop2;


public class Main {

	public static void main(String[] args) {
	
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		CourseManager courseManager = new CourseManager();
		
		Category category1 = new Category(1, "Programlama");
		
		Course course1 = new Course(2, 0, "Java", "Turkcell Bootcamp");
		Course course2 = new Course(3, 0, "C#", "Bootcamp");
		Course course3 = new Course(4, 0, "React", "Bootcamp");
		course1.setCategory(category1);
		course2.setCategory(category1);
		course3.setCategory(category1);
		
		Instructor instructor1 = new Instructor(5, "Hakan", "Kahraman", "hakan@hakan.com");
		Instructor instructor2 = new Instructor(6, "Furkan", "Çevik", "furkan@furkan.com");
		Instructor[] instructors = {instructor1, instructor2};
		
		course1.setInstructors(instructors);
		
		Student student1 = new Student(7, "Resul", "Aktoz", "resul@resul.com");
		Student student2 = new Student(8, "Selinay", "Altun", "selinay@selinay.com");
		Student[] students = {student1, student2};
		Course[] courses = {course1, course2, course3};
		
		student1.setCourses(courses);
		student2.setCourses(courses);
		
		
		
		
		studentManager.add(student1);
		studentManager.registerToCourse(student2, course3);
		
		instructorManager.delete(instructor2);
		
		courseManager.getAll(courses);
		

	}

}
