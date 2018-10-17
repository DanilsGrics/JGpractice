package lv.danilsgrics.secondLab;

public class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String setName(String name) {
        this.name = name;
        return name;
    }

    void voice () {
        System.out.println("Woof, Bark, I'm " + name);
    }

}
