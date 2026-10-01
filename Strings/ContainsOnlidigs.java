package Strings;

public class ContainsOnlidigs {
    public static void main(String[] args) {

        String str = "12345";

        boolean isDigit = true;

        for(char ch : str.toCharArray()) {

            if(!Character.isDigit(ch)) {
                isDigit = false;
                break;
            }
        }

        System.out.println(isDigit);
    }
}
