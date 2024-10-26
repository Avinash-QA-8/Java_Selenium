package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Not_Found_Exception_Task {

	
	public static void main(String[] args) {
        try {
            
        	
            File file = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(file);
            
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
           
            scanner.close();
        } catch (FileNotFoundException e) {
            
        	
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
