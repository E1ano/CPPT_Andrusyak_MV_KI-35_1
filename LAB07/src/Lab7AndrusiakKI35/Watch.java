package Lab7AndrusiakKI35;

public class Watch extends ShuttleObject {
    private String type;

    public Watch(String nameObj, int valueObj, String type) {
        super(nameObj, valueObj);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "name = '" + getNameObj() + '\'' +
                ", value = '" + getValueObj() + '\'' +
                ", type ='" + type + '\'' +
                '}';
    }
}
