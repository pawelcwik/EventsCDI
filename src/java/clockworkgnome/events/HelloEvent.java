package clockworkgnome.events;

public class HelloEvent {
    
    private String message;
    
    public HelloEvent(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }

}
