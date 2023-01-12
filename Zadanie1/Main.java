package Exam4.Zadanie1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Toy> toyMap = new HashMap<>();
        fillMap(toyMap);
        System.out.println("Используем keySet():");
        MapIteration.printByKeySet(toyMap);
        System.out.println("Используем values():");
        MapIteration.printByValues(toyMap);
        System.out.println("Используем entrySet():");
        MapIteration.printByEntrySet(toyMap);
    }

    public static void fillMap(Map<String, Toy> toyMap) {
        toyMap.put("Монстер трак", new Toy("Монстер трак", 250, "id-1"));
        toyMap.put("Мишка Тедди", new Toy("Мишка Тедди", 1250, "id-2"));
        toyMap.put("Пулемёт", new Toy("Пулемёт", 700,"id-3"));
        toyMap.put("Энгри бёрдс", new Toy("Энгри бёрдс", 1000,"id4"));
    }
}
