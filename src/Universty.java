
//importing the arraylist class
import java.util.ArrayList;

//university class
public class Universty {

    // arraylist to act as our database
   public ArrayList<String> StudentName = new ArrayList<>();
   public ArrayList<String> CourseName = new ArrayList<>();
   public ArrayList<String> CourseCode = new ArrayList<>();
   public ArrayList<Integer> CreditHour = new ArrayList<>();
   public ArrayList<String> StudentID = new ArrayList<>();


   //a constructor
    Universty(ArrayList<String> studentName,
              ArrayList<String> courseName,
              ArrayList<String> courseCode,
              ArrayList<Integer> creditHour,
              ArrayList<String> studentID) {
        StudentName = studentName;
        CourseName = courseName;
        CourseCode = courseCode;
        CreditHour = creditHour;
        StudentID = studentID;
    }

    // constructor chaining to initialize the constructor with some values
    Universty(){
        this.StudentName.add("Mahamadou jabbie");
        this.CourseName.add("Computer programming 1");
        this.CourseCode.add("C201");
        this.CreditHour.add(3);
        this.StudentID.add("M001");
    }

}

