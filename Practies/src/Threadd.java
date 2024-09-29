public class Threadd implements Runnable {
    private String name;
    private int id ;
    boolean isRun=true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Threadd(String name , int id) {
        this.name = name;
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println(this.name + "çalıştı");
       while(isRun){
           for (int i = 0; i < 100; i++) {
               try {
                   Thread.sleep(1000L * this.id);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println(i);
           }
       }
    }
    public void stop(){
        isRun=false;
    }
}
