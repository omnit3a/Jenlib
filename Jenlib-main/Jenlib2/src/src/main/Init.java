package src.main;

import src.main.DataTypes.DataStorage;
import src.main.DataTypes.LanguageType;

public class Init {

    public static void init(String type, String filePath, String extension){
        Parsers.setContents(FileHandler.readFile(filePath, extension));
        Parsers.initTokenizer();
        LanguageType.setType(type);
        DataStorage.initStacks();
        DataStorage.initVars();

    }
}
