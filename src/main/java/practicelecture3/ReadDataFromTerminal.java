package practicelecture3;

import java.util.Scanner;

public class ReadDataFromTerminal {

public void getInputFromUser(){
    Scanner in =new Scanner(System.in);
    System.out.println("Enter your name:");
    String s=in.nextLine();
    System.out.println("Your Enter String:" +s);
    System.out.println("Enter your Age:");
    int a=in.nextInt();
    System.out.println("Your Enter String:" +a);
    System.out.println("Enter your product price:");
    float f=in.nextFloat();
    System.out.println("Your Enter String:" +f);

}

}
