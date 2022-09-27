package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Primitive Datatypes, bytes = 8 bits,  short = 16 bits,  Int = 32 bits,  Long = 64 bits That's how much memory they can store

        int myValue = 10000;  //en værdi jeg har givet til myValue variablen
        System.out.println("My Value = " + myValue);

        int myMinIntValue = Integer.MIN_VALUE;       //her finder jeg udaf hvor meget minimum og maximum værdien på mine int Variabler er og printer dem så ud
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));  //streng som printer variable. på busted max value tester vi hvad der sker når vi tilføjer +1 til højeste værdi som hedder "Overflow". 
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); //Her gør vi det samme som max value, men vi tilføjer istedet -1 og får det vi kalder "Underflow".

        int myMaxIntTest = 2_147_483_647;   //her har vi max værdien for hvor det antal tal som int kan gemme i memory og vi tester det ved at lave værdien højer, for at se om det giver en fejl.

        byte myMinByteValue = Byte.MIN_VALUE;           //her har vi byte værdien som har en meget mindre nummer end primitive datatypen int, hvor her ligger den mellem -128 til 127
        byte myMaxByteValue = Byte.MAX_VALUE;           // vi gør det samme på byte som med int datatypen
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;          
        Short myMaxShortValue = Short.MAX_VALUE;        
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;       // add L so the program knows it's not an integer cause number is too large, it needs L so it knows it's Long
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); //vi skal bruge casting sombetyder at man convertere et nummer fra en type til en anden, så vi fortæller java den skal konvertere fra int til byte "(byte)

        short myNewShortValue = (short) (myMinShortValue / 2);          //samme concept bliver brugt her,vi bruger casting, men den her gang ville vi have den til at se på myMinShortvalue som en short = (short)

    }
}
