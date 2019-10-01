package com.yedam.generic;

import java.util.Arrays;

public class CourseExample {
	public static void main(String[] args) {
		Course<Person> personCourse =new Course<Person>("일반인", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse=new Course<Worker>("직장인", 5);
		workerCourse.add(new Worker("직장인"));
		
		
		
		Course<Student>studentCourse= new Course<Student>("학생", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		
		Course<HighStudent> highStudentCourse= new Course<HighStudent>("고등학생",5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
		registerWorker(workerCourse);
		registerWorker(personCourse);
		
		registerStudent(studentCourse);
		registerStudent(highStudentCourse);
		
		
	
	
	
	
	}
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+": "+Arrays.toString(course.getStudent()));
		
	}
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+": "+Arrays.toString(course.getStudent()));	
	
		
	}
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+": "+Arrays.toString(course.getStudent()));
		
	}
	
	public static Course<? super Worker> getCourse(){

		Course<Person> CoursePerson= new Course<>("일반인", 5);
		Course<Worker> CourseWorker= new Course<>("직장인", 5);
		Course<Student> CourseStudent= new Course<>("학생", 5);
		Course<HighStudent> CourseHighStudent= new Course<>("고등학생", 5);
		return CourseWorker;
		
	}


}
