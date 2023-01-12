package Exam4.Zadanie4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pet {
    String name;
    double age;

    public Pet(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public static void infoKeyList(HashMap<String, Pet> hashMap) {
        Iterator var1 = hashMap.entrySet().iterator();

        while (var1.hasNext()) {
            Map.Entry<String, Pet> map = (Map.Entry) var1.next();
            System.out.println((String) map.getKey());
        }
    }
}
