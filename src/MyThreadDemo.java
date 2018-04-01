
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mth = new MyThread();
        Thread tha = new Thread(mth,"A");
        Thread thb = new Thread(mth,"B");
        Thread thc = new Thread(mth,"C");
        Thread thd = new Thread(mth,"D");
        Thread the = new Thread(mth,"E");

        thb.start();
        tha.start();
        thc.start();
        thd.start();
        the.start();
        //mth.start();
    }
}

class MyThread extends Thread{

    private int count = 5;

    /*public MyThread(String name){
        super(name);
        this.setName(name);
    }*/

    @Override
    synchronized public void run() {
        super.run();
        count--;
        /*while(count>0){
            count--;
            System.out.println("Mythread "+ this.currentThread().getName()+"....run() 计算count="+count);
        }*/
        System.out.println("Mythread "+ this.currentThread().getName()+"....run() 计算count="+count);



    }
}