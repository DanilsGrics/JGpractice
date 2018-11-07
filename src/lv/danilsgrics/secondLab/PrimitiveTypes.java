package lv.danilsgrics.secondLab;

public class PrimitiveTypes {

    //Int primitives
    byte iByte;
    short iShort;
    int iInteger;
    long iLong;

    //Float primitives
    float iFloat;
    double iDouble;

    //Symbolic
    char iChar;

    //Logical
    boolean iBoolean;

    void printDefaultVariableValues() {
        System.out.println("Integer:");
        System.out.println("byte = " + iByte);
        System.out.println("short = " + iShort);
        System.out.println("integer = " + iInteger);
        System.out.println("long = " + iLong + "\n");

        System.out.println("Floats:");
        System.out.println("float = " + iFloat);
        System.out.println("double = " + iDouble + "\n");

        System.out.println("Characters:");
        System.out.println("char = " + iChar);

        System.out.println("Logical:");
        System.out.println("boolean = " + iBoolean);
    }
}
