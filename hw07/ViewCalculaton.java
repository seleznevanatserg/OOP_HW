package hw07;

import java.util.Scanner;

public class ViewCalculaton {
    Scanner in = new Scanner(System.in);

    public double userInput() {
        System.out.println("Введите число: ");
        return in.nextDouble();
    }

    public void showOutput(double value) {
        System.out.println("Результат: " + value);
    }

    public char chooseOperation() {
        System.out.println("Введите операцию [+],[-],[*],[/]: ");
        return in.next().charAt(0);
    }
    
}
