package Lab7AndrusiakKI35;

public class Wallet extends ShuttleObject {
    private String material;

    public Wallet(String nameObj, int valueObj, String material) {
        super(nameObj, valueObj);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "name = '" + getNameObj() + '\'' +
                ", value = '" + getValueObj() + '\'' +
                ", material ='" + material + '\'' +
                '}';
    }
}
