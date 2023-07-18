package HW_01.Task_01;

public class Main {
    public static void main(String[] args) {
     
        Cat cat01 = new Cat("Meatboll", 5);
        Owner owner01 = new Owner("Atomic Cowboy");
        
        cat01.setNameOwner(owner01.getName());

        Cat.greet(cat01.getName(), cat01.getAge(), cat01.getNameOwner());
    }
    
}
