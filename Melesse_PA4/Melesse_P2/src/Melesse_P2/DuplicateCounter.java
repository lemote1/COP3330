
package Melesse_P2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCounter {
    HashMap<String, Integer> wordCounter;
    public DuplicateCounter(){
        wordCounter = new HashMap<String, Integer>();
    }
 
    public void count(String dataFile){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                String[] words = line.split(" ");
                for (int i = 0; i<words.length; i++){
                    String word = words[i].replace("\n", "").replace(" ", "").toLowerCase();
                    if (wordCounter.containsKey(word)){
                        wordCounter.put(word, wordCounter.get(word)+1);
                    }
                    else{
                        wordCounter.put(word, 1);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Error reading file.");
            System.out.println(e);
        }
    }
    
    public void write(String outputFile){
        try{
            File file = new File(outputFile);
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            Iterator i = wordCounter.entrySet().iterator(); 
            while (i.hasNext()){
                HashMap.Entry mapElement = (HashMap.Entry)i.next();
                writer.write(mapElement.getKey() + " : " + mapElement.getValue() + "\n");
            }
            writer.close();
        }
        catch (Exception e){
            System.out.println("Error writing file.");
            System.out.println(e);
        }   
    }
}
