package gao.internfinder.backend.payload.reponse;

public class MessageRespone {

    private String message;

    public MessageRespone(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
