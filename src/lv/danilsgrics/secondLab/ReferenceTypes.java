package lv.danilsgrics.secondLab;

public class ReferenceTypes {

    //Int primitives
    Byte iByte;
    Short iShort;
    Integer iInteger;
    Long iLong;

    //Float primitives
    Float iFloat;
    Double iDouble;

    //Symbolic
    Character iChar;

    //Logical
    Boolean iBoolean;

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
