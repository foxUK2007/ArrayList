package Transport;


import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    Queue<T> queueTransport = new LinkedList<>();

    public void addTransport(T transport) {
        if (transport.getClass() == Bus.class) {
            System.out.println("Автобусы не нуждаются в техобслуживании");
        } else {
            queueTransport.offer(transport);
        }
    }

    public void maintenance () {
        T trans = queueTransport.poll();
        if (trans != null) {
            System.out.println("Производится обслуживание " + trans.getBrand() + trans.getModel());
            maintenance();
        }

    }

}
