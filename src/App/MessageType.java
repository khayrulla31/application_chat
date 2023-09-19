
package App;


public enum MessageType {
    TEXT(1),EMOJI(2),FILE(3);
    int value;
    
    public int getValue(){
    return value;
    }
    private MessageType(int value){
    this.value=value;
    }
    
//    public static MessageType toMessageType(){
//        if (true) {
//            
//        }
//    }
}
