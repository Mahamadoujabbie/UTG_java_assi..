
//this is the student class
public class Student {
    //instantiating the university class
    Universty universty = new Universty();

    //method for adding a new student
    public void addStudent(String new_Student) {
        universty.StudentName.add(new_Student);
    }

    //method for the ID
    public void addID(String new_ID){
        universty.StudentID.add(new_ID);
    }

}
