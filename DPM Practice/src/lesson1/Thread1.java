package lesson1;

/*
 * Created by evanknox on 2015-09-17.
 */
public class Thread1 implements Runnable {

    @Override
    public void run() {
        int count = 1000;

        int current = 0;
        while(current<count){
            current++;
            System.out.println(current);
        }
    }
}
