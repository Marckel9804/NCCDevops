package org.Ncc.Mar.t08.bufferStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Example2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Changho\\Desktop\\tt.txt");
        BufferedReader br = new BufferedReader(fr);

        ArrayList<String> arr = new ArrayList<String>(  );
        Iterator<String> it = br.lines().iterator();
        while (it.hasNext() ) {
            arr.add(it.next());
        }
        it = arr.iterator();
        for (int j = 0; j < arr.size(); j++) {
            System.out.println(it.next());
        }
    }
}
