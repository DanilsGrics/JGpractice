package lv.danilsgrics.secondLab;

public class DogTest {

    public static void main(String[] args) {

        Dog myDog = new Dog("Vasek");

        System.out.println("My dog's name is " + myDog.getName());

        myDog.setName("Bobik");

        System.out.println("My dog's new name " + myDog.getName());
        myDog.voice();
    }
}
