package lab2;

import java.math.BigInteger;

public class ProgrammingProject_2_6
{

    public static void main(String[] args)
    {
        BigInteger bignumber = new BigInteger("12345678987654321");
        System.out.println("Original: "+bignumber);

        BigInteger square = bignumber.multiply(bignumber);
        System.out.println("Square: "+square);

        BigInteger fourthpower = square.multiply(square);
        System.out.println("Fourth power: "+fourthpower);

        BigInteger eighthpower = fourthpower.multiply(fourthpower);
        System.out.println("Eighth power: "+eighthpower);

        //i think this is a bit silly because you can just... use a float or a "var"

    }
}
