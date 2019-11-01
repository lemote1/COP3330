package Melesse_P1;
import java.util.ArrayList;
import java.io.*;

public class DuplicateRemover {
    ArrayList<String> uniqueWords;
    public DuplicateRemover(){
        uniqueWords = new ArrayList<String>();
    };
    public  void remove(String dataFile){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                String[] words = line.split(" ");
                for (int i = 0; i<words.length; i++){
                    String word = words[i].replace("\n", "").replace(" ", "");
                    if (uniqueWords.contains(word.toLowerCase()) == false && word != ""){
                        uniqueWords.add(words[i]);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Error reading file.");
            System.out.println(e);
        }   
    }
    
    public  void write(String outputFile){      
        try{
            File file = new File(outputFile);
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (int i = 0; i<uniqueWords.size(); i++){
                writer.write(uniqueWords.get(i) + "\n");
            }
            writer.close();
        }
        catch (Exception e){
            System.out.println("Error writing file.");
            System.out.println(e);
        }   
    }
}
