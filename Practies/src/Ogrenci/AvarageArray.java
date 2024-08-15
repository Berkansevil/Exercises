package Ogrenci;

public class AvarageArray {
    public static void main(String[] args) {
        int [] classNote={80,70,80,70,20,30,50,50,50,60,};
        int sum=0;
        double avarage=0.0;
        int count = 0;
        for (int i = 0; i < classNote.length; i++) {
            sum+=classNote[i];
        }
        avarage= (double) sum / (classNote.length);
        System.out.println(avarage);
        for (int i = 0; i < classNote.length; i++) {
            if(classNote[i]>=avarage){
                count++;
            }
        }
        System.out.println(count+"kadar kişi başarılıdır");
        for (int i = 0; i < classNote.length; i++) {
            System.out.print(classNote[i]+ " ");
            if((i+1) %3==0) System.out.println();
        }
    }
}
