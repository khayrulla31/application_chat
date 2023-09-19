
package Service;

import Events.PublicEvent;
import Model.Model_recieve_message;
import Model.Model_user_account;
import io.socket.client.Socket;
import io.socket.client.IO;
import io.socket.emitter.Emitter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import Model.Model_user_account;

public class Service {
    private static Service instance;
    private Socket client;
    private final int PORT_NUMBER=9999;
    private final String IP="localhost";
    private Model_user_account user;
    
    public static Service getInstance(){
        if (instance==null) {
        instance=new Service();
        }
    return instance;
    }
    
    private Service() { 
    }
    
    public void startServer(){
        try{
            client=IO.socket("http://" + IP + ":" + PORT_NUMBER);
            client.on("list_user", new Emitter.Listener() {
                @Override
                public void call(Object... os) {
               //list user
               List<Model_user_account> users=new ArrayList<>();
                    for (Object o:os) {
                        Model_user_account us=new Model_user_account(o);
                        if (us.getUserId()!=user.getUserId()) {
                            users.add(us);
                        }
                    }
                    PublicEvent.getInstance().getEventMenuLeft().newUser(users);
                }
            });
            client.on("user_status", new Emitter.Listener() {
                @Override
                public void call(Object... os) {
                    int userId=(Integer)os[0];
                    boolean status=(Boolean)os[1];
                    if (status) {
                        //connect
                        PublicEvent.getInstance().getEventMenuLeft().userConnect(userId);
                    }else{
                    //disconnect
                    PublicEvent.getInstance().getEventMenuLeft().userDisconnect(userId);
                    }
                }
            });
            
            client.on("recieve_ms", new Emitter.Listener() {//------------
                @Override
                public void call(Object... os) {
                    Model.Model_recieve_message message=new Model_recieve_message(os[0]);
                    PublicEvent.getInstance().getEventChat().receiveMessage(message);
                }
            });
            
            client.open();
        }catch(URISyntaxException e){
            error(e);
        }
    }
    
   

    public Socket getClient() {
        return client;
    }

    public Model_user_account getUser() {
        return user;
    }

    public void setUser(Model_user_account user) {
        this.user = user;
    }
    
    private void error(Exception e){
        System.out.println(e);
    }
}


