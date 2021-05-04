package gao.internfinder.backend.dto;

public class ApplyResponseMessage {
    private String message;

    public ApplyResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
