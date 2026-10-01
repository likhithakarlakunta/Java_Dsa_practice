package Strings;

public class LongWordInasentence {
    public static void main(String[] args) {

        String str = "I love programming in Java";

        String[] words = str.split(" ");

        String longestWord = "";

        for(String word : words) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}