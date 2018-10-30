package lv.danilsgrics.fifthLab;

public class OddNumberTable {

    public static void main(String[] args) {

        int from = 1;
        int to = 50;
        int i;

        System.out.println("FOR loop demo:");
        for (i = from; i <= to; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        i = from;

        System.out.println("\nDO-WHILE demo:");
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        } while (i <= to);

        i = from;

        System.out.println("\nWHILE demo:");
        while (i <= to) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
