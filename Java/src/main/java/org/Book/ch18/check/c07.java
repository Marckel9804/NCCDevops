package org.Book.ch18.check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c07 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Changho\\Documents\\Projects\\NCCDevops\\Java\\src\\main\\java\\org\\Book\\ch18\\check\\VariableUseExample.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;

        while (true) {
            rowNumber++;
            rowData = br.readLine();
            if(rowData==null){
                break;
            }
            System.out.print(rowNumber+ ": ");
            System.out.println(rowData);
        }

    }
}
