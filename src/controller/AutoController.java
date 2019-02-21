package controller;

import model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoController {
    private List<Auto> ordered_autos = new ArrayList<>();

    public void addAuto(String vin_no, String brand, String model, double price_basic){
        Auto a = new Auto(vin_no, brand, model, price_basic);
        ordered_autos.add(a);
        System.out.println("Zamówienie przyjęte! " + a);
    }
    public void addEqupment(String vin, String name){
        // szukam auta po vin
        for(int i = 0; i < ordered_autos.size(); i++){
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                ordered_autos.get(i).setEquipmentOrderByName(name);
            }
        }
    }

    public void getAllAutos(){
        System.out.println("RAPORT ZAMÓWIEŃ:");
        for (Auto auto : ordered_autos) {
            System.out.println(auto);
        }
    }
//HOMEWORK
    public boolean deleteOrderedCar(String vin){

        for (int i=0; i<ordered_autos.size();i++){
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                //sout musi być przed operacją usunięcia
                System.out.println("Zamówienie usunięto =-> " + ordered_autos.get(i));
                //usunięcie
                ordered_autos.remove((ordered_autos.get(i)));
                return true;

            }
        }

        System.out.println("          ---===>Zamówienia nie usunięto. Brak samochodu?<===---");
        return false;
    }
//HOMEWORK
}