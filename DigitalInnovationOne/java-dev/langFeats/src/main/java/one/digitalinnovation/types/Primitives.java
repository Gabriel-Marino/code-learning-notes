package langFeats.src.main.java.one.digitalinnovation.types;

public class Primitives
{
    // it's impossible to assign null to a primitive type and primitive types have default values;

    boolean bool;   //  01 bits, true or false;
    char c;         //  16 bits, basically any unicode character that fits;

    // Integers numbers;
    byte b;         //  08 bits, from -2^7 to (2^7)-1;
    short s;        //  16 bits, from -2^15 to (2^15)-1;
    int i;          //  32 bits, from -2^31 to (2^31)-1;
    long l;         //  64 bits, from -2^63 to (2^63)-1;

    // Real numbers;
    float f;        //  32 bits, from -2^(-149) to (2-2^(-23))2^127;
    double d;       //  64 bits, from -2^(-1074) to (2-2^(-52))2^1023;

    public static void main(String[] args)
    {
        System.out.println("Acess the file to Primitives.java to read more about Java Primitives types.");
    }
}