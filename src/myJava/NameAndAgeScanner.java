 import java.util.Scanner;
public class NameAndAgeScanner{
  public static void main(String [] args){
    String prompt = args[0];
    System.out.println(prompt);
    String myName;
    int myAge;
    Scanner myObj = new Scanner(System.in);
    myName = myObj.nextLine();
    myAge = myObj.nextInt();
    System.out.println("My name is " + myName + " and i am " + myAge + " years old");
  }
}
