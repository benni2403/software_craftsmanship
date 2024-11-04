package org.example;

public class RomanNumerals {
    public static String intToRoman(int number)
    {
        StringBuilder output = new StringBuilder();
        if(10 <= number && number <= 13)
        {
            output.append("X");
            for (int i = 10; i <= number; i++)
            {
                output.append("I");
            }
        }
        if(number == 9)
        {
            output.append("IX");
        }
        if(5 <= number && number <= 8)
        {
            output.append("V");
            for (int i = 6; i <= number; i++)
            {
                output.append("I");
            }
        }
        if(number == 4)
        {
            output.append("IV");
        }
        if(number < 4)
        {
            for (int i = 1; i <= number; i++)
            {
                output.append("I");
            }
        }

        return output.toString();
    }
}
