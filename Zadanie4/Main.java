package Exam4.Zadanie4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Cat("Муиза", 0.7);
        Pet pet2 = new Dog("Юстус", 5.8);
        Pet pet3 = new Parrot("Дося", 1.2);



        HashMap<String, Pet> hashMap = new HashMap();
        hashMap.put(pet1.name, pet1);
        hashMap.put(pet2.name, pet2);
        hashMap.put(pet3.name, pet3);
        Pet.infoKeyList(hashMap);
    }
}
