
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mth = new MyThread();
        Thread tha = new Thread(mth,"A");
        Thread thb = new Thread(mth,"B");
        Thread thc = new Thread(mth,"C");

        tha.start();
        thb.start();
        thc.start();
    }
}

class MyThread extends Thread{

    int count = 5;

   /* public MyThread(String name){
        super(name);
    }*/

    @Override
    synchronized public void run() {
        //super.run();
        while(count>0){
            count--;
            System.out.println("Mythread "+ this.currentThread().getName()+"....run() 计算count="+count);
        }


    }
}