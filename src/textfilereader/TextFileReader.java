/*
 * Created by Jordan Hamilton on march 30, 2020
 * this Program takes the file name as input in a dialog box and print's the file's contenets
 */
package textfilereader;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Jordan Hamilton
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input, text, fileName = "";
        
        input = JOptionPane.showInputDialog("Please Enter The File Name, Please Note: do not enter file extension and if it is anything other than txt this will not work");
        fileName  = input;
        try{
            
            File file  = new File("E:\\Coding\\TextFileReader\\src\\textfilereader\\" + input + ".txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            while((text = reader.readLine()) != null){
                System.out.println(text);
            }
        }
        catch(IOException ex){
            System.out.println("Could Not Find File: " + fileName + ".txt");
        }
    }
    
}
