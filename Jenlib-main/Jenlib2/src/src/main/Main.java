package src.main;

import src.main.DataTypes.DataStorage;
import src.main.DataTypes.LanguageType;

import java.io.File;

public class Main {

    public static void main(String[] args){
        Init.init("hybrid", "Jenlib2\\src\\src\\main\\test", ".txt");
        while (Parsers.hasNext()){
            System.out.println(Parsers.getNext());
        }
    }
}
