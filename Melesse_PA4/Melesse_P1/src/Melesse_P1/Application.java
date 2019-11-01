package Melesse_P1;
import java.util.ArrayList;


public class Application  {
    public static void main(String[] args) {
        DuplicateRemover dr = new DuplicateRemover();
        dr.remove("problem1.txt");
        dr.write("unique_words.txt");
    }
    
}
