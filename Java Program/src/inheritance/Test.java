package inheritance;

import javax.xml.transform.stream.StreamSource;


class One extends Thread {

    @Override
    public void run() {

        for(int i=0 ; i<=5 ; i++){
            System.out.println("thread one is runniong" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("one is intrepted");
                throw new RuntimeException(e);

            }
        }


    }
}


class Two extends Thread {

    @Override
    public void run() {

        for(int i= 0 ;i<=5 ; i++){
            System.out.println("number twop thread" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("second thread interpeted");
                throw new RuntimeException(e);
            }
        }
    }
}


public class Test {

    public static void main(String[] args) throws InterruptedException {

      One one = new One();
      Two two = new Two();


      one.start();

     // Thread.sleep(1000);

      one.join();

        System.out.println(Thread.currentThread().getState());
      two.start();

        System.out.println(Thread.currentThread());
    }

}
