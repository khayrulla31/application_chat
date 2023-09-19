
package Model;


public class Model_message {

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
   
    public Model_message(boolean action, String message) {
        this.action = action;
        this.message = message;
    }
     public Model_message() {
    }
    
    private boolean action;
    private String message;
}
