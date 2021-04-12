package gao.internfinder.backend.payload.response;

public class MessageResponse {
    /**
     *Kieu Trang made it
     */
    private String message;
    /**
   *Kieu Trang
     */
    public MessageResponse(String message) {
        this.message = message;
    }
    /**
   *Kieu Trang
     */
    public String getMessage() {
        return message;
    }
    /**
   *Kieu Trang
     */
    public void setMessage(String message) {
        this.message = message;
    }
}