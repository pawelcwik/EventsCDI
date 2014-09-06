package clockworkgnome.events;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class SimplestTimer {

    
    @Schedule(second="*/1", minute="*",hour="*", persistent=false)
    public void doWork() {
        System.out.println(System.currentTimeMillis());
    }
}
