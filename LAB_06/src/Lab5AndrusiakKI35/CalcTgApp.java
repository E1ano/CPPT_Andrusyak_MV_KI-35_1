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
        System.out.print("Enter x : \n");
        Scanner in = new Scanner(System.in);

        if (!in.hasNextDouble()) {
            throw new CalcException("Invalid input!");
        }

        FileService fS = new FileService();

        fS.calcTg(in.nextDouble());

        fS.writeResTxt("Calc.txt");
        fS.writeResBin("Calcbin.bin");

        fS.readResTxt("Calc.txt");
        System.out.println(fS.getResult());
        fS.readResBin("Calcbin.bin");
        System.out.println(fS.getResult());

   }
}