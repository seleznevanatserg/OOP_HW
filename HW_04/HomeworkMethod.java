package HW_04;

public class HomeworkMethod <T> {

    T e;
    T [] elements;

    public void printElement(T e){
        System.out.println(e);
    }

    public void printArray (T [] elements){
        for (T e: elements) {
            System.out.println(e);
        }
    }
    
}
