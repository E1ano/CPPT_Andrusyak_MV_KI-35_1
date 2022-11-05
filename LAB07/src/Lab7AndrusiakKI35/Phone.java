package Lab7AndrusiakKI35;

public class Phone extends ShuttleObject {
    private String model;

    public Phone(String nameObj, int valueObj, String model) {
        super(nameObj, valueObj);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name = '" + getNameObj() + '\'' +
                ", value = '" + getValueObj() + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }
}
