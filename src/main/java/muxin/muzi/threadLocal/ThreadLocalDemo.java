package muxin.muzi.threadLocal;

/**
 * @Author: smallming
 * @Date: 2021/12/29 4:01 PM
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class ThreadLocalDemo {

    private static final ThreadLocal<String > threadLocal = ThreadLocal.withInitial(()->Thread.currentThread().getName());

    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            new Thread(()->{
                System.out.println("threadName"+ threadLocal.get());
            },"akm-thread-"+i).start();
        }
    }
}
