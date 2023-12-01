package br.com.kualit.algorithms;

public class TwoPointers {

    public String invertString(String str) {
        char[] wordInArray = str.toCharArray();
        int point1 = 0;
        int point2 = wordInArray.length - 1;

        while(point1 < point2) {
            char temp = wordInArray[point1];
            wordInArray[point1] = wordInArray[point2];
            wordInArray[point2] = temp;
            point1++;
            point2--;
        }

        return new String(wordInArray);
    }

    public boolean isPalindrome(String str) {
        int point1 = 0;
        int point2 = str.length() -1;
        boolean isEqual = false;

        while(point1 < point2) {
            if(str.charAt(point1) == str.charAt(point2))
                isEqual = true;
            else
                return false;
            point1++;
            point2--;
        }
        return isEqual;
    }
}
