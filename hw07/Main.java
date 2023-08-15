package hw07;

public class Main {
    public static void main(String[] args) {

        ModelCalculation mCalc = new ModelCalculation();
        ViewCalculaton vCalc = new ViewCalculaton();
        Writer writer = new Writer();
        PresenterCalculation pCalc = new PresenterCalculation(mCalc, vCalc, writer);
        pCalc.select();
    }
}
