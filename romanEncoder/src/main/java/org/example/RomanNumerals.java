package org.example;

public class RomanNumerals {
    public static String intToRoman(int number)
    {
        if(number == 0)
        {
            return "";
        }
        if(number > 99)
        {
            return "Zu groß";
        }
        StringBuilder output = new StringBuilder();

        int einer = number % 10;
        int zehner = (number - einer)/10;

        if(einer == 9)
        {
            output.append("IX");
        }
        if(5 <= einer && einer <= 8)
        {
            output.append("V");
            for (int i = 6; i <= einer; i++)
            {
                output.append("I");
            }
        }
        if(einer == 4)
        {
            output.append("IV");
        }
        if(einer < 4)
        {
            for (int i = 1; i <= einer; i++)
            {
                output.append("I");
            }
        }

        return output.toString();
    }
}
