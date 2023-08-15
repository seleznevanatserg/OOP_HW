package hw07;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void writeInFile(String fileName, String inputString){
        
        try (FileWriter notation = new FileWriter(fileName, true)) {
            notation.append(inputString + '\n');
            notation.close();
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        } 
    }
}
