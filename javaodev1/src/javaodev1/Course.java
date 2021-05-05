package javaodev1;

public class Course {
	
	public Course() {
		
		System.out.println("Ben cok calistim");
	}
	
	
	public Course(int id, String courseName, String courseTeacherName, String progressStatus, double price) {
		this();
		this.id=id;
		this.courseName=courseName;
		this.courseTeacherName=courseTeacherName;
		this.progressStatus=progressStatus;
		this.price=price;
		
		
		
	}
	
	int id;
	String courseName;
	String courseTeacherName;
	String progressStatus;
	double price;

}
