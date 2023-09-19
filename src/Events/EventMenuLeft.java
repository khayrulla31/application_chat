
package Events;

import java.util.List;
import Model.Model_user_account;


public interface EventMenuLeft {
    
    public void newUser(List<Model_user_account> users);
    
    public void userConnect(int userId);
    
    public void userDisconnect(int userId);
}
