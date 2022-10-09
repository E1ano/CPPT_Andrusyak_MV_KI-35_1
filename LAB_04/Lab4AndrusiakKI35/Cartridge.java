package Lab4AndrusiakKI35;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Cartridge {

    //-------------Об'єкти класу-----------------//
    private Bullet bullet;
    private Powder powder;
    private CartridgeCase cartridgeCase;
    private int bulletEnergy;

    public static int count = 0;
    public PrintWriter fout; // об'єкт для запису інформації
    //-------------ОБ'ЄКТИ КЛАСУ-----------------//

    //-------------КОНСТРУКТОРИ-----------------//
    public Cartridge(Bullet bullet, Powder powder, CartridgeCase cartridgeCase,
                     int bulletEnergy) throws FileNotFoundException {
        this.bullet = bullet;
        this.cartridgeCase = cartridgeCase;
        this.powder = powder;
        this.bulletEnergy = bulletEnergy;

        count ++;
        fout = new PrintWriter(new File("MethodDesc.txt"));
        fout.print("The cartridge was created!\n");
    }

    public Cartridge(Bullet bullet, Powder powder) throws FileNotFoundException {
        this.bullet = bullet;
        this.powder = powder;

        fout = new PrintWriter(new File("MethodDesc.txt"));
        fout.print("The cartridge was created!\n");
    }

    public Cartridge(CartridgeCase cartridgeCase, int bulletEnergy) throws FileNotFoundException {
        this.bulletEnergy = bulletEnergy;
        this.cartridgeCase = cartridgeCase;

        fout = new PrintWriter(new File("MethodDesc.txt"));
        fout.print("The cartridge was created!\n");
    }
    //-------------КОНСТРУКТОРИ-----------------//

    //-------------МЕТОДИ КЛАСУ-----------------//

    public void Fire() { // ІМІТАЦІЯ СТРІЛЬБИ
       fout.print("--->FIRE\n");
       powder.setAmount(0);
    }

    // ПЕРЕВІРКА ПУЛІ НА ПРОБИТТЯ БРОНІ
    public void bulletTest() {
        if (bulletEnergy >= 3000 && bullet.getBulletDiameter() > 5) {
            fout.print("BulletTest : Bullet penetration APPROVED\n");
        } else {
            fout.print("BulletTest : I recommend finding a larger cartridge!\n");
        }
    }

    // ПЕРЕВІРКА НА АКТУАЛЬНІСТЬ ПАТРОНУ
    public void isThisCartridgeActual() {
        if (cartridgeCase.getCreationTime() <= 1930) {
            fout.print("ITCA : Sorry man, it`s too OLD\n");
        } else {
            fout.print("ITCA : Bright as a Button!\n");
        }
    }

    // ГЕТЕРИ
    public Bullet getBullet() {
        return bullet;
    }

    public Powder getPowder() {
        return powder;
    }

    public CartridgeCase getCartridgeCase() {
        return cartridgeCase;
    }

    public int getBulletEnergy() {
        return bulletEnergy;
    }
    // ГЕТЕРИ

    // СЕТЕРИ

    public void setBullet(float bulletDiameter, int width) {
        fout.print("Changed : " + bullet.getBulletDiameter() + " to " +  bulletDiameter +"\n");
        fout.print("Changed : " + bullet.getWidth() + " to " + width +"\n");

        bullet.setBulletDiameter(bulletDiameter);
        bullet.setWidth(width);
    }

    public void setPowder(String type, int amount) {
        fout.print("Changed : " + powder.getAmount() + " to " +  amount +"\n");
        fout.print("Changed : " + powder.getType() + " to " + type +"\n");

        powder.setAmount(amount);
        powder.setType(type);
    }

    public void setCartridgeCase(String shape, int creationTime) {
        fout.print("Changed : " + cartridgeCase.getShape() + " to " +  shape +"\n");
        fout.print("Changed : " + cartridgeCase.getCreationTime() + " to " + creationTime +"\n");

        cartridgeCase.setShape(shape);
        cartridgeCase.setCreationTime(creationTime);
    }

    public void setBulletEnergy(int bulletEnergy) {

        this.bulletEnergy = bulletEnergy;
    }

    // СЕТЕРИ

    public void dispose() {
        fout.close();
    }

    public void getCount() {
        fout.print("Was created - " + count + " object!");
    }
}
