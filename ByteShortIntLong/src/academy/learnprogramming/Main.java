package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" +myMinByteValue);
        System.out.println("Byte Maximum Value =" +myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" +myMinShortValue);
        System.out.println("Short Maximum Value =" +myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =" +myMinLongValue);
        System.out.println("Long Maximum Value =" +myMaxLongValue);
        long bigLongIntegerValue = 2147483648L;
        System.out.println(bigLongIntegerValue);

        short bigShortValue = 32767;

        int myTotal = (myMaxIntValue/2);
        System.out.println("int myTotal " + myTotal);
        byte myNewByteTotal = (byte) (myMaxByteValue/2);
        System.out.println("int myNewByteTotal " + myNewByteTotal);
        short myNewShortTotal = (short) (myMaxShortValue/2);
        System.out.println("int myNewShortTotal " + myNewShortTotal);

        byte newByteNo = 10;
        short newShortNo = 20;
        int newIntNo = 50;
        long newLongNo = (50000L + 10L * ((newByteNo) + (newShortNo) + (newIntNo)));
        System.out.println("newLongNo = " + newLongNo);
        short shortTotal = (short)
                (1000 + 10 * (newShortNo + newByteNo + newIntNo));
        System.out.println("new shortTotal = " + shortTotal);
    }
}
