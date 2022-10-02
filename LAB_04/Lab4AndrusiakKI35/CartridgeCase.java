package Lab4AndrusiakKI35;

public class CartridgeCase {
    private String shape;
    private int creationTime;

    public CartridgeCase(String shape, int creationTime) {
        this.shape = shape;
        this.creationTime = creationTime;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }
}
