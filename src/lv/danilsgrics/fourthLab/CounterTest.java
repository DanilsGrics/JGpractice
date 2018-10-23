package lv.danilsgrics.fourthLab;

public class CounterTest {

    public static void main(String[] args) {

        Counter counter = new Counter();

        counter.print();

        counter.increment();
        counter.print();

        counter.setStep(3);
        counter.print();

        counter.increment();
        counter.print();

        counter.setStep(2);
        counter.print();

        counter.decrement();
        counter.print();

        counter.clear(); //Only the way how to make value == 0
        counter.print();

        counter.setValue(120);
        counter.print();

        counter.setValue(0);//But user can't do it!
        counter.print();
    }
}
