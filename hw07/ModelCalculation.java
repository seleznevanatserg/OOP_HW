package hw07;

public class ModelCalculation {

    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    public double divide(double value1, double value2) {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо. Не заглядывайте в бесконечность.");
        }
    }

    public double mul(double value1, double value2) {
        return value1 * value2;
    }

    public double sub(double value1, double value2) {
        return value1 - value2;
    }
}
