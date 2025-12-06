package polymorphism;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("на какое число нельзя делить ? ");
        String data = input.nextLine();
        int answer = new Random().nextInt(3);
        if (Integer.parseInt(data) == 0) {
            System.out.println("yes");
        } else if (Integer.parseInt(data)  == 1) {
            System.out.println("no");
        } else {
            System.out.println("maybe");
        }
    }
}