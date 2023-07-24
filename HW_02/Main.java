package HW_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

import org.w3c.dom.UserDataHandler;




public class Main {
    public static void main(String[] args) {

        Queue<String> queueClients = new LinkedList<String>();
        Map<Integer,String> orders = new TreeMap<Integer,String>();
        List <String> clients = new ArrayList<String>();
        Market market = new Market(queueClients, orders, clients);

        String file = "HW_02/clients.txt";

        //reading file and write in HashMap
        try (FileReader notation = new FileReader(file)) {
            BufferedReader br = new BufferedReader(notation);
            String line = "";
            while((line = br.readLine()) != null) {
                clients.add(line);
            }
            br.close();
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        }
        
        //Menu
        int lvl = 1;
        while (lvl > 0){
            showMenuQueue();
            int input = userInput();
            if (input == 0){
                System.out.println("Good bye. Come Again.");
                lvl = 0;
            }
            else if (input == 1){
                lvl = 1;
                market.refresh(queueClients, orders, clients);
            }
            else if (input == 2){
                lvl = 1;
                System.out.println(orders);
                System.out.println("Orders TOTAL: " + market.counterOrdersToday);
            }
            else {
                lvl = 1;
                System.out.println("Uncurrect enter. Try again.");
            }
        }
    }

    


    private static void showMenuQueue (){
        System.out.println( "[1] Show (refresh) me current orders: \n[2] Show me ALL orders: \n[0] EXIT");
    }
    // method read user input for navigation on menu
    private static int userInput (){
        Scanner iScanner = new Scanner(System.in);
        int input = iScanner.nextInt();
        return input;
    }

}
