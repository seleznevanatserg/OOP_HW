package HW_05;

import java.util.Scanner;

public class PresenterCalculation {
    ModelCalculation model;
    ViewCalculaton view;
    

    public PresenterCalculation (ModelCalculation m, ViewCalculaton v){
        model = m;
        view = v;
    }


    public void select() {
        int num1 = view.userInput();
        int num2 = view.userInput();
        char ch = view.chooseOperation();
        int result = 0;
        switch (ch) {
            case '+':
                result = model.sum(num1, num2);
                break;
            case '-':
                result = model.sub(num1, num2);
                break;
            case '/':
                result = model.divide(num1, num2);
                break;
            case '*':
                result = model.mul(num1, num2);
                break;
            default:
                System.out.println("Введена неверная операция");
        }
        view.showOutput(result);
}}
