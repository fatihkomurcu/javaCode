package javaodev1;


public class Main {

	public static void main(String[] args) {
		
		Course course1= new Course(53,"Yazýlým Geliþtirici Yetistirme Kampý (JAVA + REACT)","Engin","%31",500);
		Course course2= new Course(54,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin","%38",300);
		Course course3= new Course(55,"Programlamaya Giriþ için Temel Kurs","Engin","%40",400);
		
		Course[] courses= {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
		CourseManager courseManager= new CourseManager();
		courseManager.add(course1);
		courseManager.update(course2);
		courseManager.delete(course3);
	}

}
