package clockworkgnome.events;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class HelloEventListener {

    public void listenToHello(@Observes HelloEvent helloEvent) {
        System.out.println("Hello event: " + helloEvent.getMessage());
    }
}
