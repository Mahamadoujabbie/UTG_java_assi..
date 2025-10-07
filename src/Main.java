public class Main {
    // a class to print the values
    static void main(String[] args) {
        Courses courses = new Courses();
        Student student = new Student();


        //adding a new student to the enrolled students
        student.addStudent("morri");
        student.addID("M002");
        courses.addCourse("Use of English 1");
        courses.addCourseCode("E101");
        courses.addCreditHour(6);

        //using for loop to print all the enrolled students
       for (int i =0; i<student.universty.StudentName.toArray().length; i++){
           System.out.println("====================================================");
           System.out.println("Name.............."+student.universty.StudentName.get(i));
           System.out.println("ID................"+student.universty.StudentID.get(i));
           System.out.println("Enrolled.........."+courses.universty.CourseName.get(i));
           System.out.println("Course Code......."+courses.universty.CourseCode.get(i));
           System.out.println("Credit Hours......"+courses.universty.CreditHour.get(i));
           System.out.println();
       }
    }
}
