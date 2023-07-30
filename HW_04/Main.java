package HW_04;

import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        int number01 = 12481632;
        String str01 = "str01 printed succsesfull";
        double numberPi = 3.14159;

        HomeworkMethod hwMethod = new HomeworkMethod<>();
        hwMethod.printElement(number01);
        hwMethod.printElement(str01);
        hwMethod.printElement(numberPi);

        Integer [] numbers = {3, 9, 27, 81, 243};
        String [] strings = {"str00", "str01",  "str10", "str11"};

        hwMethod.printArray(numbers);
        hwMethod.printArray(strings);
    }
    
}
