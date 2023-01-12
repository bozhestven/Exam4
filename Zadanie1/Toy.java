package Exam4.Zadanie1;

public class Toy {
    private String name;
    private int сost;

    private String id;

    public Toy(String name, int сost, String id) {
        this.name = name;
        this.сost = сost;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getСost() {
        return сost;
    }

    public void setСost(int сost) {
        this.сost = сost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Имя " +
                "Игрушки = " + name + '\'' +
                ", Стоимость = " + сost +
                ", id = " + id + '\'' +
                '.';
    }
}
