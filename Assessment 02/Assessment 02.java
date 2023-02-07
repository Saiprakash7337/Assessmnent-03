package Course_Registeration;

 class CourseRegistration 
 {

	  private int studentId;
	  private int qualifyingMarks;
	  private int courseId;
	  private double courseFee;

	  public  CourseRegistration(int studentId, int qualifyingMarks, int courseId)
	  {
	    this.studentId = studentId;
	    this.qualifyingMarks = qualifyingMarks;
	    this.courseId = courseId;
	  }

	  public boolean validateMarks()
	  {
	    if (qualifyingMarks >= 65 && qualifyingMarks <= 100) {
	      return true;
	    }
	    return false;
	  }

	  public boolean validateCourseId()
	  {
	    if (courseId >= 1001 && courseId <= 1005) {
	      return true;
	    }
	    return false;
	  }

	  public double calculateCourseFee(double baseFee) 
	  {
	    if (qualifyingMarks >= 85) 
	    {
	      courseFee = baseFee - (baseFee * 0.15);
	    }
	    else if (qualifyingMarks >= 70 && qualifyingMarks < 84)
	    {
	      courseFee = baseFee - (baseFee * 0.1);
	    } 
	    else if (qualifyingMarks >= 65 && qualifyingMarks<69)
	    {
	      courseFee = baseFee - (baseFee * 0.05);
	    } 
	    else 
	    {
	      courseFee = baseFee;
	    }
	    return courseFee;
	  }

	  public int getStudentId()
	  {
	    return studentId;
	  }

	  public int getQualifyingMarks()
	  {
	    return qualifyingMarks;
	  }

	  public int getCourseId()
	  {
	    return courseId;
	  }

	  public double getCourseFee() 
	  {
	    return courseFee;
	  }
	}

public class Tester 
{
	  public static void main(String[] args)
	  {
	    CourseRegistration cr1 = new CourseRegistration(1001, 65, 1002);
	    CourseRegistration cr2 = new CourseRegistration(1002, 71, 1004);
	    CourseRegistration cr3 = new CourseRegistration(1003, 86, 1003);

	    double baseFee = 50000;

	    if (cr1.validateMarks() && cr1.validateCourseId())
	    {
	      System.out.println("Student ID: " + cr1.getStudentId());
	      System.out.println("Qualifying Marks: " + cr1.getQualifyingMarks());
	      System.out.println("Course ID: " + cr1.getCourseId());
	      System.out.println("Course Fee: " + cr1.calculateCourseFee(baseFee));
	      System.out.println();
	    }
	    else 
	    {
	      System.out.println("Admission Denied");
	      System.out.println();
	    }
	    
	    if (cr2.validateMarks() && cr2.validateCourseId())
	    {
	      System.out.println("Student ID: " + cr2.getStudentId());
	      System.out.println("Qualifying Marks: " + cr2.getQualifyingMarks());
	      System.out.println("Course ID: " + cr2.getCourseId());
	      System.out.println("Course Fee: " + cr2.calculateCourseFee(baseFee));
	      System.out.println();
	    }
	    else 
	    {
	      System.out.println("Admission Denied");
	      System.out.println();
	    }
	    
	    if (cr3.validateMarks() && cr3.validateCourseId())
	    {
	      System.out.println("Student ID: " + cr3.getStudentId());
	      System.out.println("Qualifying Marks: " + cr3.getQualifyingMarks());
	      System.out.println("Course ID: " + cr3.getCourseId());
	      System.out.println("Course Fee: " + cr3.calculateCourseFee(baseFee));
	      System.out.println();
	    }
	    else 
	    {
	      System.out.println("Admission Denied");
	      System.out.println();
	    }
}
	}