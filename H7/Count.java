 //import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class Count {


    public static void main(String[] args) throws Exception {
        String [] Line = new String[30];
        int [] arr = new int[30];
        int a=0;
        for (int i=0; i<30; i++) {
            arr[i] = 0;
        }

        for(int i=1; i<30; i++) {
            for(int j=0; j<30; j++) {
//                File file = new File(i + ".csv");
                FileReader reader = new FileReader("{i}.csv");
                BufferedReader br = new BufferedReader(reader);
                Line[j] = br.readLine();
                a = Integer.parseInt(Line[j]);
                arr[a] += 1;
            }
        }
    for(int i=0; i<30; i++) {
        System.out.print(i);
        System.out.print(" ");
        System.out.print(arr[i]);
        System.out.println();
    }

    }
}  