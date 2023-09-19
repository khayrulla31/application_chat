
package Model;

import org.json.JSONException;
import org.json.JSONObject;


public class Model_recieve_message{

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Model_recieve_message(Object json) {
        JSONObject obj=(JSONObject)json;
        try {
            fromUserId=obj.getInt("fromUserId");
            text=obj.getString("text");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Model_recieve_message(int fromUserId,String text) {
        this.fromUserId = fromUserId;
        this.text = text;
    }
    
    
    private int fromUserId;
    private String text;
    
    public JSONObject toJsonObject(){
        try {
            JSONObject json=new JSONObject();
            json.put("fromUserId",fromUserId );
            json.put("text", text);
            return json;
        } catch (JSONException e) {
            return null;
        }       
    }
}
