package com.fraerboll.streamAPI.tasks.solved;

import java.util.ArrayList;
import java.util.List;

public class DeepSeek {
    public static void main(String[] args) {
        String str = "abceba";
        boolean pallindrome = pallindrome(str);
        System.out.println(pallindrome);


    }

    public static boolean pallindrome(String str){
        return str.equalsIgnoreCase(new StringBuilder(str.replaceAll("//W", ""))
                .reverse().toString());
    }
}
