package polymorphism;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;

        while (count >= 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches < 4) {
                if (count >= matches) {
                    count -= matches;
                    System.out.println("остаток = " + count);
                    if (count == 0) {
                        System.out.println("Выиграл " + player + " !");
                    }
                    turn = !turn;
                } else {
                    System.out.println("Вы ввели = " + matches + " a остаток = " + count);
                }
            } else {
                System.out.println("Вы ввели не корректное число");
            }
        }
    }
}
