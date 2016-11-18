package thread;

/**
 * synchronized方式实现阻塞数组队列
 * 存在并发问题
 * Created by cuipengfei on 16-11-17.
 */
public class ArrayCustomQueue {

    private final Object[] item = new Object[3];
    private int putIndex, takeIndex, count;

    private Object notFull = new Object();
    private Object notEmpty = new Object();


    public void put(Object object) throws Exception {
        synchronized (notFull) {
            while (item.length == count) {
                notFull.wait();
            }
        }
        item[putIndex] = object;
        if (++putIndex == item.length) {
            putIndex = 0;
        }
        count++;
        synchronized (notEmpty) {
            notEmpty.notify();
        }
    }

    public Object take() throws Exception {
        synchronized (notEmpty) {
            while (count == 0) {
                notEmpty.wait();
            }
        }
        Object obj = item[takeIndex];
        if (++takeIndex == item.length) {
            takeIndex = 0;
        }
        count--;
        synchronized (notFull) {
            notFull.notify();
        }
        return obj;
    }
}
