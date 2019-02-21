import controller.AutoController;

public class MainAuto {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        ac.addAuto(
                "101010",
                "VW",
                "Passat",
                150000);
        ac.addAuto(
                "121212",
                "VW",
                "Golf",
                80000);
        ac.addAuto(
                "131313",
                "VW",
                "Tiguan",
                120000);
        ac.addEqupment("121212", "A");
        ac.addEqupment("121212", "B");
        ac.getAllAutos();
        ac.deleteOrderedCar("121212");
        ac.getAllAutos();
    }
}