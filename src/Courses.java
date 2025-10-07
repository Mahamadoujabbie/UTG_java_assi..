
//course class
public class Courses {

    //creating an object for university class
    Universty universty = new Universty();

    //A method to add a course
    public void addCourse(String new_Course) {
        universty.CourseName.add(new_Course);
    }

    //A method to add a course code
    public void addCourseCode(String new_code){
        universty.CourseCode.add(new_code);
    }

    //A method to add a course credit hour
    public void addCreditHour(int new_houre){
        universty.CreditHour.add(new_houre);
    }


}
