package LeetCode;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String [] strs){
        // club,clap,clove
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        // clap ,clove,club
        char [] first=strs[0].toCharArray(); // clap
        char [] last=strs[strs.length-1].toCharArray(); // clup
        for (int i = 0; i < first.length; i++) {
            if(first[i] !=last[i]){
                break;

            }
        }
        return result.toString();
    }
}
