package src.main;

public class Main {

    public static void main(String[] args){
        Parsers.setContents(FileHandler.readFile("src/src/main/test.txt", ".txt"));
        Parsers.initTokenizer();
        System.out.println(Parsers.getNext());
        System.out.println(Parsers.getNext());
        System.out.println(Parsers.getNext());
        System.out.println(Parsers.getNext());
        System.out.println(Parsers.getNext());


    }
}
