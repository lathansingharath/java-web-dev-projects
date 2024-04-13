import java.util.ArrayList;

public class StudentPractice {


    public static void main(String[] args) {

        Student student = new Student("Lathan", 123, 1, 4.0);
        Student studentTwo = new Student("Scrappy", 12341, 2,3.5);
        ArrayList tempStudent = new ArrayList<>();

        tempStudent.add(student);
        tempStudent.add(studentTwo);
        System.out.println(student.getName() + " \n" + student.getStudentId() + "\n" + student.getNumberOfCredits() + "\n" + student.getGpa());
        student.setGpa(2.3);
        System.out.println(student.getGpa());
        Course math = new Course("Trig",3,tempStudent);
        System.out.println(math.getStudents());

    }


}
