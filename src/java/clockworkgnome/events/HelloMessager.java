package clockworkgnome.events;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

@Named("messenger")
@Stateless
public class HelloMessager {
    
    @Inject
    Event<HelloEvent> events;
    
    public void hello() {
        events.fire(new HelloEvent("from bean " + System.currentTimeMillis()));
    }
}
