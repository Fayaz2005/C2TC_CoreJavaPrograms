package Day4three;

import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no.");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd no.");
        int b = sc.nextInt();
        System.out.println(a>b?"A is greater":"B is Greaters");

    }
    
}