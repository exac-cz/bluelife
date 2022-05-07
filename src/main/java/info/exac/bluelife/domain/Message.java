package info.exac.bluelife.domain;

public class Message {



    private String content;


    private Message() {
        // For JSON deserialization
    }


    public Message(String content) {
        this.content = content;
    }



    public String getContent() {
        return content;
    }



    public void setContent(String content) {
        this.content = content;
    }


}
