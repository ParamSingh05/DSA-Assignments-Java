//Param Singh
import java.util.Scanner;
public class PTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle: ");
        int P = sc.nextInt();
        System.out.println("Enter Time Period: ");
        int T = sc.nextInt();
        System.out.println("Enter the Rate Of Interest:");
        int R = sc.nextInt();
        int SI = (P*T*R)/100;
        System.out.println("The Simple Interest is: "+SI);
    }
}