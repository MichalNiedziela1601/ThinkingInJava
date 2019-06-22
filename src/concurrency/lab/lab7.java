package concurrency.lab;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.printnb;

class Daemon implements Runnable {
    private Thread[] t = new Thread[10];
    public void run() {
        for(int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            printnb("DaemonSpawn " + i + " started, ");
        }
        for(int i = 0; i < t.length; i++)
            printnb("t["+i+"].isDaemon() = " + t[i].isDaemon() + ", ");
        while(true)
            Thread.yield();
    }
}

class DaemonSpawn implements Runnable {
    public void run() {
        while(true)
            Thread.yield();
    }
}
public class lab7 {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        printnb("d.isDaemon() = " + thread.isDaemon() +", ");
        TimeUnit.SECONDS.sleep(5);
    }
}
