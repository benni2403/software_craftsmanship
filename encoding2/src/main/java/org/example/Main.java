package org.example;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4};
        data = encode(data);
        for (int datum:data)
        {
            System.out.println(datum);
        }
    }

    public static int[] encode(int[] data) {

        int numberOfSequences = 1;
        int lastNumber = data[0];

        //counts how many different sequences there are in the data-array
        for (int datum : data) {
            if (datum == lastNumber) {
                continue;
            } else {
                numberOfSequences++;
                lastNumber = datum;
            }
        }

        //we want an array that contains the value of each sequence and the number of occurrences
        int[] result = new int[numberOfSequences * 2];


        int resultArrayCurrentLength = 0;
        int numberOfOccurences = 0; //Wie oft kommt der Wert hintereinander vor
        lastNumber = data[0];

        for (int datum:data) {
            if (datum == lastNumber) {
                numberOfOccurences++;
            } else {
                if (numberOfOccurences != 0) {
                    result[resultArrayCurrentLength] = lastNumber;
                    result[resultArrayCurrentLength + 1] = numberOfOccurences;
                    resultArrayCurrentLength += 2;
                }

                lastNumber = datum;
                numberOfOccurences = 1;
            }
        }
        result[resultArrayCurrentLength] = lastNumber;
        result[resultArrayCurrentLength + 1] = numberOfOccurences;
        return result;
    }
}

