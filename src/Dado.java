
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;


public class Dado{

    LongAdder n1 = new LongAdder();
    LongAdder n2 = new LongAdder();
    LongAdder n3 = new LongAdder();
    LongAdder n4 = new LongAdder();
    LongAdder n5 = new LongAdder();
    LongAdder n6 = new LongAdder();
    LongAdder[] dado = {n1,n2,n3,n4,n5,n6};
    LongAdder total = new LongAdder();


    protected void suma(int tirada){
        dado[tirada].add(1);
        total.add(1);
    }



}
