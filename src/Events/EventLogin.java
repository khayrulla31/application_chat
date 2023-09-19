
package Events;
import Model.Model_message;
import Model.Model_register;
import Model.Model_login;


public interface EventLogin {
    public void login(Model_login data);
    public void register(Model_register data, EventMessage message);
    public void goRegister();
    public void goLogin();
    
}
