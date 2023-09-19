
package Events;
import Model.Model_send_message;
import Model.Model_recieve_message;

public interface ChatEvent {
    
    public void sendMessage(Model_send_message data);
    
    public void receiveMessage(Model_recieve_message data);
    
}
