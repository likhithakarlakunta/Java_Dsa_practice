package Strings;

public class CharCount {

    public static void main(String[] args) {

        String str = "Java123@Code";

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for(char ch : str.toCharArray()) {

            if(Character.isUpperCase(ch))
                upper++;

            else if(Character.isLowerCase(ch))
                lower++;

            else if(Character.isDigit(ch))
                digit++;

            else
                special++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + special);
    }
}
