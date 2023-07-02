package basic;
//
//class StudentDetails {
//	String lname;
//	String ldegree;
//	String lcity;
//}
//public class LearnerDetail{
//	public void StudentEnrollment() {
//		String enrollmentNo="EBEON0623816887";
//		System.out.println(enrollmentNo);
//	}
//	
//	public static void main(String[] args) {
//		LearnerDetail id=new LearnerDetail();
//		StudentDetails lrn=new StudentDetails();
//		lrn.lname="Ramya Kudumula";
//		lrn.ldegree="MCA";
//		lrn.lcity="Hyderabad";
//		id.StudentEnrollment() ;
//		System.out.println(lrn.lname);
//		System.out.println(lrn.ldegree);
//		System.out.println(lrn.lcity);
//		}
//
//}

class Details{
	String name;
	String qualification;
	String location;
	float percentage;
}


class LearnerDetail{
	void studentEnrollment(){
		String enrollmentNo = "ABC";
		System.out.println(enrollmentNo);
	}
	
	public static void main(String[] args ) {
		LearnerDetail eNo = new LearnerDetail();
		
		
		Details d= new Details();
		
		d.name="RK";
		d.qualification="MCA";
		d.location="Hyderabad";
		d.percentage=8.0f;
		String qualification=d.qualification;
		System.out.println(d.name);
		eNo.studentEnrollment();
		System.out.println(qualification);
		System.out.println(d.location);
	}
}