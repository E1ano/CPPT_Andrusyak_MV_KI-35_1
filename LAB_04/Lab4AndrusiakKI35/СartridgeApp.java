package Lab4AndrusiakKI35;
import java.io.*;
import java.util.Scanner;

/**
 * Cartridge Application class implements main method for Cartridge class possibilities demonstration
 * @author Andrusiak Marko KI35
 * @version 1.0
 */

public class СartridgeApp {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //SmartCartridge smartCartridge = new SmartCartridge(new Bullet(7.62f, 15),
                //new Powder("alum", 30),
               // new CartridgeCase("round", 1917), 3600 );

        //smartCartridge.autoAim();
        //smartCartridge.changeShape("acuminate");
        //fout = new PrintWriter(new File("MethodDesc.txt"));

        SmartCartridge SC1 = new SmartCartridge(new Bullet(7.62f, 15),
                new Powder("alum1", 30),
                new CartridgeCase("round", 1917), 3600 );

        SmartCartridge SC2 = new SmartCartridge(new Bullet(5.56f, 10),
                new Powder("alum2", 25),
                new CartridgeCase("round", 1927), 3000 );



        SmartCartridgeTest SCT2 = new SmartCartridgeTest(new Bullet(7.62f, 15),
                new Powder("a2", 30),
                new CartridgeCase("round", 1917), 3600 );


        //3 object smart-catridge
        //2 object - smart-catridgeTest
        //вивести загальну к-сть об'єктів

        SCT2.getCount();
        SCT2.dispose();
    }
}

