import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
      //  Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter the first Number: ");
        int n1 = 25;
      //  System.out.print("\nEnter the Second Number: ");
        int n2 = 15;
        
        Calculator c = new Calculator();
        System.out.println("Addition");
        System.out.println(c.add(n1, n2));
        System.out.println("Subtraction");
        System.out.println(c.sub(n1, n2));

       // sc.close();
    }
    public int add(int num1, int num2){
        System.out.println("In addtion function");
        int sum=num1+num2;
        return sum;
    }

    public int sub(int num1, int num2){
		int value=0;
        System.out.println("In subtraction function");
        if(num1>num2){
        value = num1 - num2;
        }
        else{
           value = num2-num1;
        }
        return value;
    }

}