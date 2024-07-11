//Param Singh
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in rupees: ");
        double rupees = sc.nextInt();
        double dollar = rupees/80;
        System.out.println(dollar);
    }
}