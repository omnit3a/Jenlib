package src.main.DataTypes;

import java.util.HashMap;
import java.util.Stack;

public class DataStorage {

    private static Stack<Integer> iStack;
    private static Stack<Float> fStack;
    private static Stack<Byte> bStack;
    private static Stack<String> sStack;

    private static HashMap<String,Integer> iVars;
    private static HashMap<String,Float> fVars;
    private static HashMap<String,Byte> bVars;
    private static HashMap<String,String> sVars;

    public static void initStacks(){
        if (LanguageType.stackBased || LanguageType.hybridLang){
            iStack = new Stack<>();
            fStack = new Stack<>();
            bStack = new Stack<>();
            sStack = new Stack<>();
        }
    }
    public static void initVars(){
        if (LanguageType.variableBased || LanguageType.hybridLang){
            iVars = new HashMap<>();
            fVars = new HashMap<>();
            bVars = new HashMap<>();
            sVars = new HashMap<>();
        }
    }

    public static void iPush(int item){
        iStack.push(item);
    }
    public static void fPush(float item){
        fStack.push(item);
    }
    public static void bPush(byte item){
        bStack.push(item);
    }
    public static void sPush(String item){
        sStack.push(item);
    }

    public static int iPop(){
        return iStack.pop();
    }
    public static float fPop(){
        return fStack.pop();
    }
    public static byte bPop(){
        return bStack.pop();
    }
    public static String sPop(){
        return sStack.pop();
    }

    public static void iSave(String key, int value){
        iVars.put(key, value);
    }
    public static void fSave(String key, float value){
        fVars.put(key, value);
    }
    public static void bSave(String key, byte value){
        bVars.put(key, value);
    }
    public static void sSave(String key, String value){
        sVars.put(key, value);
    }

    public static int iGet(String key){
        return iVars.get(key);
    }
    public static float fGet(String key){
        return fVars.get(key);
    }
    public static byte bGet(String key){
        return bVars.get(key);
    }
    public static String sGet(String key){
        return sVars.get(key);
    }
}
