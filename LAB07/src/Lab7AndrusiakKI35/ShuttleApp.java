package Lab7AndrusiakKI35;

public class ShuttleApp {
    public static void main(String[] args) {
        Shuttle<ShuttleObject> shuttle = new Shuttle<>();

        Phone phone = new Phone("IPhone",8000, "X");
        Wallet wallet = new Wallet("Gucci", 2500, "skin");
        Watch watch = new Watch("Rolex", 4000, "divers");

        shuttle.Add(phone);
        shuttle.Add(wallet);
        shuttle.Add(watch);

        System.out.println("All your objects : ");
        shuttle.printAll();
        System.out.println();

        System.out.println("Max element : " + shuttle.findMaxElement()); // Iphone X - price 8000
        System.out.println("Min element : " + shuttle.findMinElement()); // Wallet - price 2500
        System.out.println();

        System.out.println("Sorting from Max to Min : ");
        shuttle.SortMaxToMin();
        shuttle.printAll();
        System.out.println();

        System.out.println("Sorting from Min to Max : ");
        shuttle.SortMinToMax();
        shuttle.printAll();
        System.out.println();

        System.out.println("You remove " + shuttle.Remove(phone));
        shuttle.printAll();
    }
}
