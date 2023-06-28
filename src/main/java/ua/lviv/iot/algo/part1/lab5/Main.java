package ua.lviv.iot.algo.part1.lab5;

public class Main {
    public static void main(String[] args) {
        String inputText = "on my opinion best tv is Philips TAT202 t460";
        String replacedText = inputText.replaceAll("\\b[A-Z][a-z]+[\\d]*[\\s]\\b\\b[a-zA-Z]+[\\d]*[\\s]\\b\\b[a-zA-Z0-9]+[0-9]*\\b", "TV_SET");
        System.out.println(replacedText);
    }
}
