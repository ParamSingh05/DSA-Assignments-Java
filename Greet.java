import java.util.Scanner;
public class Greet {
    public static void main(String[] args){
        System.out.println("Enter the name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
