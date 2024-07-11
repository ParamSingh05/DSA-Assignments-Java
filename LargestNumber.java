//Param Singh
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The larger number is: "+a);
        }
        else if(a==b){
            System.out.println("The numbers are equal.");
        }
        else{
            System.out.println("The larger number is: "+b);
        }
    }
}