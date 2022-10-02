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
        SmartCartridge smartCartridge = new SmartCartridge(new Bullet(7.62f, 15),
                new Powder("alum", 30),
                new CartridgeCase("round", 1917), 3600 );

        smartCartridge.autoAim();
        smartCartridge.changeShape("acuminate");

        smartCartridge.dispose();

    }
}

