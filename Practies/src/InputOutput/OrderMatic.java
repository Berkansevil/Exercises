package InputOutput;

public class OrderMatic implements Runnable {

    private final Object LOCK=new Object();
    int orderNo;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        increaseOrder();
        synchronized (LOCK){

        }

    }
    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println(Thread.currentThread() + "Order No :" + getOrderNo());
    }

    public OrderMatic() {
        this.orderNo=0;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
