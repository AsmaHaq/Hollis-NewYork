package practicelecture4;
// To access Interface methods,interface must be implemented
//by another sub or child class with the keywords "implement"(instead of "extends)
// the body of the interface method is provided by the "implement" class.
public class Pig1 implements Animal1{
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void run() {
        // The body of sleep() is provided here
        System.out.println("SSssssss");
    }
}
