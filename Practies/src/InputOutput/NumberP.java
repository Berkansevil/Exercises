package InputOutput;

import java.util.ArrayList;
import java.util.List;

public  class NumberP implements Runnable{
    List<Integer> number ;

    public NumberP(){
        this.number=new ArrayList<>();
    }
    @Override
    public void run() {
        for (int sayı:number){
            if(sayı%2 ==0){

            }
        }
    }

}
