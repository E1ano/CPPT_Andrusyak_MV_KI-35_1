package com.labs;
import java.io.*;
import java.util.*;

/*
    * Клас Lab2 реалізує програму до лабораторної роботи №2
    *
    * @author Marko Andrusiak
    * @version 1.0
    * @since version 1.0
    *
*/

public class Lab2AndrusiakKI35 {
/*
 * Статичний метод main є точкою входу в програму
 *
 * @param args
 * @throws FileNotFoundException
 *
*/
    public static void main(String[] args) throws FileNotFoundException
    {
        int nRows;
        char[][] arr;
        String filler;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the gear matrix, not less than 3: ");
        nRows = in.nextInt();
        if( nRows < 3 ) {
            Lab2AndrusiakKI35.main(args);
            return;
        }
        in.nextLine();

        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        arr = new char[nRows][];

        for(int i = 0; i < nRows; i++)
        {
//            if(i+1 <= nRows/2) {
//                arr[i]= new char[i+1];
//            }
//            else {
//                arr[i]= new char[nRows-i];
//            }

            arr[i] = (i+1 <= nRows/2) ? (new char[i+1]):(new char[nRows-i]);
        }


        System.out.print("\nEnter a placeholder character: ");
        filler = in.nextLine();

        if(filler.length() == 0) {
            System.out.println("No character entered");
        } else if(filler.length() == 1) {
            for(int i=0; i<nRows; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    if()
                    arr[i][j]=(char)filler.codePointAt(0);
                    System.out.print(arr[i][j]);
                    fout.print(arr[i][j]);
                }

                fout.print("\n");
                System.out.print("\n");
            }
        } else {
            System.out.println("Too many character entered");
        }

        fout.flush();
        fout.close();

    }
}
