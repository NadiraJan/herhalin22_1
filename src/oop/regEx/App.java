package oop.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("nadira", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher("Read nadira");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");
        }else {
            System.out.println("Match not found");
        }
    }
}
