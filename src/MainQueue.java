import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        //deklaracja kolejki
        Queue<LocalTime> times=new ArrayDeque<>();
        //dodawanie do kolejki jednokierunkowej
        times.add(LocalTime.of(12,44,3));
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());


        //odczytywanie wszystkich
        System.out.println(times);
        //usuwanie i zwracanie
        System.out.println("Usunięcie najstarszego: "+ times.remove());
        System.out.println(times);


        //kolejka dwukierunkowa
        Deque<String> people=new ArrayDeque<>();
        //dodawanie elementów
        people.addFirst("anna");
        people.addLast("ewa");
        people.addLast("jan");
        people.addFirst("mateusz");
        people.addLast("ola");
        people.addLast("iza");
        people.addFirst("janusz");

//        try{
//        while (people.getLast()!>null){
//            System.out.println((people.removeLast()));
//        }}
//        catch(NoSuchElementException e){
//            System.out.println("Pętla while v2");
//                    }
//        people  PRZEPISAc Z GITA



    }


}
