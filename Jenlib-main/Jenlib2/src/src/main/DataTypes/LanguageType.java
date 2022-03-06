package src.main.DataTypes;

public class LanguageType {

    public static boolean stackBased = false;
    public static boolean variableBased = false;
    public static boolean hybridLang = false;

    public static void setType(String type){
        switch(type){
            case "stackBased":
                stackBased = true;
                variableBased = false;
                hybridLang = false;
                break;
            case "variableBased":
                variableBased = true;
                stackBased = false;
                hybridLang = false;
            case "hybrid":
                hybridLang = true;
                stackBased = true;
                variableBased = true;
        }
    }
}
