public class StudentPractice {
    public static void main(String[] args){

        Student student = new Student("Lathan",123,1,4.0);
        System.out.println(student.getName() + " \n" + student.getStudentId()+"\n"+student.getNumberOfCredits()+"\n"+student.getGpa());
        student.setGpa(2.3);
        System.out.println(student.getGpa());

        Course course = new Course("Math",3,"kyle" 123 2 1);
}
