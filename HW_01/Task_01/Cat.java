// Создайте класс "Кот" (Cat) со следующими свойствами:

// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. 
// Добавьте соответствующее поле в классе "Кот" и методы доступа для него. 
// Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

package HW_01.Task_01;

public class Cat {

    private String name;
    private int age;
    private String nameOwner;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOwner() {
        return nameOwner;
    }
    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void greet (String name, int age, String nameOwner){
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + nameOwner + ".");
    }
    
}
