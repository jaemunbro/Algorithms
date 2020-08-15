package HeadFirst;

public class testThreads2 {

    public static void main(String [] args){

        ThreadFirst TF = new ThreadFirst();
        ThreadSecond TS = new ThreadSecond();

        Thread thread_01 = new Thread(TF);
        Thread thread_02 = new Thread(TS);

        thread_01.run();
        thread_02.run();
    }
}

class AccumTest {

    private static AccumTest at = new AccumTest();

    private int counter = 0;
    private AccumTest() { }

    public static AccumTest getAccumTest() {
        return at;
    }

    public void addCounterTest(int addnum) {
        counter += addnum;
    }

    public int getCounterTest() {
        return counter;
    }

}

class ThreadFirst extends Thread {
    AccumTest at = AccumTest.getAccumTest();

    public void run(){
        for(int x = 0; x < 98 ; x++) {

            at.addCounterTest(1000);

        }

        System.out.println("ThreadOne" + at.getCounterTest());
    }

}


class ThreadSecond extends Thread {
    AccumTest at = AccumTest.getAccumTest();

    public void run(){
        for(int x = 0; x < 99 ; x++) {

            at.addCounterTest(1);

        }

        System.out.println("ThreadTwo" + at.getCounterTest());
    }

}


