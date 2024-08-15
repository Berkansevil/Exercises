package Ogrenci;

public class ComparisonArray {

    public static void main(String[] args) {
        int [] mathNotesForA={100,90,80,40,50,60,70,55};
        int [] mathNotesForB={80,70,60,50,70,50,80,55};

        int sum=0;
        double avarage=0;
        for (int i = 0; i < mathNotesForA.length; i++) {
            sum+=mathNotesForA[i];
        }
        avarage=(double) (sum)/(mathNotesForA.length);
        System.out.println(Math.round(avarage));

        int sumB=0;
        double avarageB=0;
        for (int i = 0; i < mathNotesForB.length; i++) {
            sumB+=mathNotesForB[i];
        }
        avarageB=(double) (sumB)/(mathNotesForB.length);
        System.out.println(Math.round(avarageB));

        if(avarageB>avarage){
            System.out.println("B sınıfı daha başarılıdır");
        }else {
            System.out.println("A sınıfı başarılıdır.");
        }
    }


}
