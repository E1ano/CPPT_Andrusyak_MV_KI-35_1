package Lab5AndrusiakKI35;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CalcTgApp {
    public static void main(String[] args) {
        System.out.println("Your expression : 1/tg(2x)\n");
        System.out.print("Enter x, must be integer : \n");
        Scanner in = new Scanner(System.in);

        if (!in.hasNextDouble()) {
            throw new CalcException("Invalid input!");
        }

        try {
            PrintWriter fout = new PrintWriter("Calc.txt");

            try {

                try {
                    CalcTg c1 = new CalcTg();
                    fout.print("Your result : " + c1.calc(in.nextDouble()));
                } finally {
                    fout.close();
                }
            } catch (CalcException ex) {
                System.out.print(ex.getMessage());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}