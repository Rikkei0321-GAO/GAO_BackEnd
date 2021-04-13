package gao.internfinder.backend.payload.reponse;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Integer id;
    private String userName;

    public JwtResponse(){}

    public JwtResponse(String token, String type, Integer id, String userName) {
        this.token = token;
        this.type = type;
        this.id = id;
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
