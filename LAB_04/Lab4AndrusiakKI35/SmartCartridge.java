package Lab4AndrusiakKI35;

import java.io.FileNotFoundException;

public class SmartCartridge extends Cartridge implements AutoAimCartridge, ChangeShapeOfCC {

    public SmartCartridge(Bullet bullet, Powder powder, CartridgeCase cartridgeCase, int bulletEnergy) throws FileNotFoundException {
        super(bullet, powder, cartridgeCase, bulletEnergy);

    }

    public SmartCartridge(Bullet bullet, Powder powder) throws FileNotFoundException {
        super(bullet, powder);
    }

    public SmartCartridge(CartridgeCase cartridgeCase, int bulletEnergy) throws FileNotFoundException {
        super(cartridgeCase, bulletEnergy);
    }


    @Override
    public void autoAim() {
        fout.print("The target is captured!\n");
    }

    @Override
    public void changeShape(String newShape) {
        String oldShape = super.getCartridgeCase().getShape();
        super.setCartridgeCase(newShape, 2022);
    }
}
