package src.main;

import java.util.StringTokenizer;

public class Parsers {

    private static String contents;

    private static StringTokenizer st;

    public static void initTokenizer(){
        st = new StringTokenizer(contents);
    }

    public static String getNext(){
        try {
            return st.nextToken();
        } catch (Exception e){
            return "StringTokenizer not initialized ; call initTokenizer";
        }
    }

    public static boolean hasNext(){
        try {
            return st.hasMoreTokens();
        } catch (Exception e){
            return false;
        }
    }

    public static void setContents(String contains){
        contents = contains;
    }
}
