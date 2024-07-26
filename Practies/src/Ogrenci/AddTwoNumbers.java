package Ogrenci;

public class AddTwoNumbers {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static    boolean isPalindrome(String text){
        if(text.isEmpty()){
            return true;
        }
        int start=0;
        int last=text.length()-1;
        while(start<=last){
            char curFirst=text.charAt(start);
            char curLast=text.charAt(last);
            if(!Character.isLetterOrDigit(curFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(curLast)){
                last--;
            }
            else{
                if (Character.toLowerCase(curFirst) !=Character.toLowerCase(curLast)){
                    return  false;
                }
            }
            start++;
            last--;
        }
        return true;
    }

}
