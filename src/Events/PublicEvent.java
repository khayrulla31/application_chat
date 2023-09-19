
package Events;

public class PublicEvent {
    
    private static PublicEvent instance;
    private EventImageView eventImageView;
    private ChatEvent chatEvent;
    private EventLogin eventLogin;
    private EventMain eventMain;
    private EventMenuLeft eventMenuLeft;
    
    
    public static PublicEvent getInstance(){
        if (instance==null) {
            instance=new PublicEvent();
        }
    return instance;
    }
    
    private PublicEvent(){   
    }
    
    public void addEventMain(EventMain event){
    this.eventMain=event;
    }

    public void addEventImageView(EventImageView event){
        this.eventImageView=event;
    } 
    public void addEventChat(ChatEvent event){
        this.chatEvent=event;
    }
    
    public void addEventLogin(EventLogin event){
        this.eventLogin=event;
    }
    public void addEventMenuLeft(EventMenuLeft event){
        this.eventMenuLeft=event;
    }
    public EventMain getEventMain(){
        return eventMain;
    }
    public EventImageView getEventImageView(){
        return eventImageView;
    }
    public ChatEvent getEventChat(){
        return chatEvent;
    }
    public EventLogin getEventLogin(){
        return eventLogin;
    }
    public EventMenuLeft getEventMenuLeft() {
        return eventMenuLeft;
    }
    
    
}
