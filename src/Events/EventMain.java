
package Events;

import Model.Model_user_account;

public interface EventMain {
    
    public void showLoading(boolean show);
    
    public void initChat();
    
    public void selectUser(Model_user_account user);
    
    public void updateUser(Model_user_account user);
}
