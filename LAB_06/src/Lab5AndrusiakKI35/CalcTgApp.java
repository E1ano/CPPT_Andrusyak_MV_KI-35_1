package Lab5AndrusiakKI35;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class CalcTgApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Your expression : 1/tg(2x)\n");


        FileService fS = new FileService();

        for(double i = 25; i < 30; i++) {
            //System.out.print("Enter x : \n");
            fS.calcTg(i);
            fS.writeToFile("Calc.txt");
        }
        System.out.println(fS.readFromFile("Calc.txt"));


        //fS.writeResTxt("Calc.txt");
        //fS.writeResBin("Calcbin.bin");

        //fS.readResTxt("Calc.txt");
        //System.out.println(fS.getResult());
        //fS.readResBin("Calcbin.bin");
        //System.out.println(fS.getResult());

   }
}