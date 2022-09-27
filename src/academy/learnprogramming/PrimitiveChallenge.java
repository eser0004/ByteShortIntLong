package academy.learnprogramming;

public class PrimitiveChallenge {

    public static void main(String[] args) {

        /* Integer Minimum Value = -2147483648
        Integer Maximum Value = 2147483647
        Busted MAX value = -2147483648
        Busted MIN value = 2147483647
        Byte Minimum Value = -128
        Byte Maximum Value = 127
        Short Minimum Value = -32768
        Short Maximum Value = 32767
        Long Minimum Value = -9223372036854775808
        Long Maximum Value = 9223372036854775807 */

        byte byteValue = 10;
        short shortValue = 20;
        int intvalue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intvalue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000+ 10 *
                (byteValue + shortValue + intvalue));



    }

}
