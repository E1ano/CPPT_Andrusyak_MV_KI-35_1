package Lab4AndrusiakKI35;

import java.io.FileNotFoundException;

public class SmartCartridgeTest extends Cartridge {

    public SmartCartridgeTest(Bullet bullet, Powder powder, CartridgeCase cartridgeCase, int bulletEnergy) throws FileNotFoundException {
        super(bullet, powder, cartridgeCase, bulletEnergy);
    }

    public SmartCartridgeTest(Bullet bullet, Powder powder) throws FileNotFoundException {
        super(bullet, powder);
    }

    public SmartCartridgeTest(CartridgeCase cartridgeCase, int bulletEnergy) throws FileNotFoundException {
        super(cartridgeCase, bulletEnergy);
    }
}
