// 2)  Реализовать класс Market и все его обязательные методы(Придумайте любые). 
//     Этот класс должен реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу очереди. 
//     Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour, 
//     которые добавляют и удаляют людей из очереди, а также метод update, который обновляет состояние магазина путем принятия и отдачи заказов.

package HW_02;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;


public class Market implements IMarketBehaviour {

    Queue queue;
    Map orders;
    List clients;

    public int counterOrdersToday = 0;

    public Market (Queue queue, Map orders, List clients){
        this.queue = queue;
        this.orders = orders;
        this.clients = clients;
    }

    private int numberOrders = numberStart;

    public int getNumberOrders() {
        return numberOrders;
    }
    public void setNumberOrders(int numberOrders) {
        this.numberOrders = numberOrders;
    }




    public void refresh(Queue queue, Map orders, List clients) { 
        int randomNumIn = 0;
        if (queue.size() == 0){
            randomNumIn = ThreadLocalRandom.current().nextInt(1, 3);
        }
        else{
            randomNumIn = ThreadLocalRandom.current().nextInt(0, 3);
        }
        System.out.println("Orders input:" + randomNumIn);
        if (randomNumIn != 0){
            StringBuilder sb = new StringBuilder();
            int numberOrder = getNumberOrders();
            for (int i = 0; i < randomNumIn; i++){
                orders.put(numberOrder + i, clients.get(numRandomForArray(clients)));
                counterOrdersToday ++;
                sb.append("Order number: " + (numberOrder + i) + " Client: " + orders.get(numberOrder + i));
                queueBuyersAdd(queue, sb.toString());
            }
            setNumberOrders(numberOrder + randomNumIn);
        }

        int randomNumOut = ThreadLocalRandom.current().nextInt(0, 3);
        while (randomNumOut > queue.size()){
            randomNumOut = ThreadLocalRandom.current().nextInt(0, 3);
        }
        System.out.println("Orders output:" + randomNumOut);
        if (randomNumOut != 0){
            for (int i = 0; i < randomNumOut; i++){
                queueBuyersRemove(queue);
            }
        }
        System.out.println("Orders in Queue TOTAL: " + queue.size());
        update(queue);        
    }

    private static int numRandomForArray (List arr){
        int randomNum = ThreadLocalRandom.current().nextInt(0, arr.size());
        return randomNum;
    }
    
    
}
