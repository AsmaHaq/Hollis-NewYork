package practice;

public class Drive007 {
    public static void main (String [] args) {
        MethodParameter mp = new MethodParameter();
        mp.StudentSalary(90000);

        mp.increaseStudentSalary(90000, 5000);

        mp.StudentSalary(92000);

        mp.increaseStudentSalary(92000, 6000);

        mp.StudentSalary(94000);

        mp.increaseStudentSalary(94000, 3000);
    }
}
