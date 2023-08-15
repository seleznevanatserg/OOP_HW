package hw07;

import java.time.LocalDateTime;

public class PresenterCalculation {
    ModelCalculation model;
    ViewCalculaton view;
    Writer writer;


    

    public PresenterCalculation (ModelCalculation m, ViewCalculaton v, Writer w){
        model = m;
        view = v;
        writer = w;
    }


    public void select() {
        String fileName = "hw07/logCalculatorOperations.txt"; 
        String stringForWrite = "";
        String separatorInput = " : [input] ";
        String separatorOutput = " : [output] ";


        double num1 = view.userInput();
        stringForWrite = (LocalDateTime.now() + separatorInput + num1).toString();
        writer.writeInFile(fileName, stringForWrite);

        double num2 = view.userInput();
        stringForWrite = (LocalDateTime.now() + separatorInput + num2).toString();
        writer.writeInFile(fileName, stringForWrite);

        char ch = view.chooseOperation();
        stringForWrite = (LocalDateTime.now() + separatorInput + ch).toString();
        writer.writeInFile(fileName, stringForWrite);

        double result = 0;
        switch (ch) {
            case '+':
                result = model.sum(num1, num2);
                stringForWrite = (LocalDateTime.now() + separatorOutput + result).toString();
                writer.writeInFile(fileName, stringForWrite);
                break;
            case '-':
                result = model.sub(num1, num2);
                stringForWrite = (LocalDateTime.now() + separatorOutput + result).toString();
                writer.writeInFile(fileName, stringForWrite);
                break;
            case '/':
                result = model.divide(num1, num2);
                stringForWrite = (LocalDateTime.now() + separatorOutput + result).toString();
                writer.writeInFile(fileName, stringForWrite);
                break;
            case '*':
                result = model.mul(num1, num2);
                stringForWrite = (LocalDateTime.now() + separatorOutput + result).toString();
                writer.writeInFile(fileName, stringForWrite);
                break;
            default:
                String messageDefault = "Введена неверная операция";
                System.out.println(messageDefault);
                stringForWrite = (LocalDateTime.now() + separatorOutput + messageDefault).toString();
                writer.writeInFile(fileName, stringForWrite);
        }
        view.showOutput(result);
}}
