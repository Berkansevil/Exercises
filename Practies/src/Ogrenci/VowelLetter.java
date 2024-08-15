package Ogrenci;

public class VowelLetter {
    public static void main(String[] args) {
        String message="Merhaba Hosgeldiniz";
        String vowels="aeıiouüö";
        String str="";
        for (int i = 0; i < message.length(); i++) {
          String s=str.substring(i,i+1);
            for (int j = 0; j < vowels.length(); j++) {
                if(s.equals(vowels.substring(j,j+1))){
                    s="";
                }
                str=message+s;
            }
        }
    }
}
