package HW_05;

public class Main {
    public static void main(String[] args) {

        ModelCalculation mCalc = new ModelCalculation();
        ViewCalculaton vCalc = new ViewCalculaton();
        PresenterCalculation pCalc = new PresenterCalculation(mCalc, vCalc);
        pCalc.select();
    }
}
