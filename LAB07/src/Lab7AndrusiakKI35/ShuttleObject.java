package Lab7AndrusiakKI35;

public class ShuttleObject {
    private String nameObj;
    private int valueObj;

    public ShuttleObject(String nameObj, int valueObj) {
        this.nameObj = nameObj;
        this.valueObj = valueObj;
    }

    public String getNameObj() {
        return nameObj;
    }

    public void setNameObj(String nameObj) {
        this.nameObj = nameObj;
    }

    public int getValueObj() {
        return valueObj;
    }

    public void setValueObj(int valueObj) {
        this.valueObj = valueObj;
    }

    @Override
    public String toString() {
        return "ShuttleObject{" +
                "nameObj='" + nameObj + '\'' +
                ", value=" + valueObj +
                '}';
    }
}
