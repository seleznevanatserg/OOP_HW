package HW_02;

import java.util.Queue;
import java.util.UUID;


public interface IMarketBehaviour {

    
    
    default void queueBuyersAdd (Queue queue, Object object){
        queue.add(object);  
    }

    default void queueBuyersRemove (Queue queue){
        queue.remove();  
    }

    default void update(Queue queue){
        System.out.println(queue);
    }

    public static Integer generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }

    final int numberStart = generateUniqueId();

    

    
}
