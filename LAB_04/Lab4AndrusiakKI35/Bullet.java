package Lab4AndrusiakKI35;

public class Bullet {
    private float bulletDiameter;
    private int width;

    public Bullet(float bulletDiameter, int width) {
        this.bulletDiameter = bulletDiameter;
        this.width = width;
    }

    public float getBulletDiameter() {
        return bulletDiameter;
    }

    public void setBulletDiameter(float bulletDiameter) {
        this.bulletDiameter = bulletDiameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
