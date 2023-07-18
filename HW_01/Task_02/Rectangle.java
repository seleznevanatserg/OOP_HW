// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:

// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).

package HW_01.Task_02;

public class Rectangle {
// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
    private double width;
    private double height;

// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
    public Rectangle (){
        this.height = 3.14;
        this.width = 2.71;
    }

// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
    public Rectangle (double height, double wight) {
        this.height = height;
        this.width = wight;
    }

// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
    public static double calculateSquare (double height ,double width){
        return height * width;
    }

// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
    public static double calculatePerimeter (double height ,double width){
        return (height + width) * 2;
    }

}
