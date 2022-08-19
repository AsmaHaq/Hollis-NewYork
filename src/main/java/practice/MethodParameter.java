package practice;

public class MethodParameter {
    public int StudentSalary(int currentSalary) {
        System.out.println("Student's salary is: " + currentSalary);
        return currentSalary;
    }
    public void increaseStudentSalary(int currentSalary, int increment){
        System.out.print("Student's new salary" + (currentSalary + increment));
    }
 public void UseIncreaseStudentSalary() {
     increaseStudentSalary(50000, 7000);
 }

}
