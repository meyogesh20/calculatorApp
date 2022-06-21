import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int n1 = sc.nextInt();
        System.out.print("\nEnter the Second Number: ");
        int n2 = sc.nextInt();
        
        Calculator c = new Calculator();
        System.out.println(c.add(n1, n2));

        sc.close();
    }
    public int add(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

}