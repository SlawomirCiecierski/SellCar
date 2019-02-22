import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        //deklaracja mapy
        Map<String, Double> eq_prices = new HashMap<>();
        eq_prices.put ("Tapicerka skórzana", 7000.);
        eq_prices.put ("klimatyzacja dwustrefowa", 26550.);
        eq_prices.put ("Automatyczna skrzynia biegów", 10000.);
        eq_prices.put ("Lakier", 3000.);
        System.out.println(eq_prices);
        System.out.println("czy coś kosztuje 7000"+ eq_prices.values().contains(7000));
        //iterowanie po mapie
        for (Map.Entry<String, Double> eq: eq_prices.entrySet()){
            System.out.println(eq.getKey()+" "+eq.getValue());
        }

//dopisać z gita
    }
}
