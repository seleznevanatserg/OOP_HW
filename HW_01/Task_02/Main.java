package HW_01.Task_02;

public class Main {
    public static void main(String[] args) {
        Rectangle rect01 = new Rectangle();
        Rectangle rect02 = new Rectangle(20.0, 11.0);
        

        System.out.println("Height: " + rect01.getHeight() + ";  Wight: " + rect01.getWidth());
        System.out.println("Perimeter: " + rect01.calculatePerimeter(rect01.getHeight(), rect01.getWidth()));
        System.out.println("Square: " + rect01.calculateSquare(rect01.getHeight(), rect01.getWidth()));
        System.out.println("\n");
        System.out.println("Height: " + rect02.getHeight() + ";  Wight: " + rect02.getWidth());
        System.out.println("Perimeter: " + rect02.calculatePerimeter(rect02.getHeight(), rect02.getWidth()));
        System.out.println("Square: " + rect02.calculateSquare(rect02.getHeight(), rect02.getWidth()));
    }
    
}
