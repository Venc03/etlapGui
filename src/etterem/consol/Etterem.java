package etterem.consol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Etterem {
    
    private ArrayList<Etelek> etlap;
    private ArrayList<Asztalok> asztalok;

    public ArrayList<Asztalok> getAsztalok() {
        return asztalok;
    }
    
    public void etlapFeltolt(){
        etlap = new ArrayList<>();
        File file = new File("etlap.txt"); 
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {
                    line = line.substring(1, line.length() - 1); // Remove square brackets
                    String[] items = line.split(", ");
                    for (String item : items) {
                        String[] parts = item.split("\\|");
                        if (parts.length == 2) {
                            String itemName = parts[0].trim();
                            int price = Integer.parseInt(parts[1].trim());
                            Etelek etel = new Etelek(itemName, price);
                            etlap.add(etel);
                        } else {
                            System.err.println("Invalid item format: " + item);
                        }
                    }
                } else {
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void rendelesFeltolt() throws IOException{
        asztalok = new ArrayList<>();
        File file = new File("asztal.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine())) {
               
    }
    
    private Etelek etelKivalasztas(String etelekNeve){
        
        return null;
        
    }
}
