import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseCredits;
    private ArrayList<Student> students = new ArrayList<>();

    //The next block of code is the constructor
    public Course(String courseName,int courseCredits,ArrayList<Student> students){
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.students = students;
    }


    public ArrayList<Student> getStudents() {
        return students;
    }
    public String getCourseName(){
        return courseName;
    }
}
