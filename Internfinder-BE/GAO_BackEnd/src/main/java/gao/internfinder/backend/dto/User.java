package gao.internfinder.backend.dto;

public class User {
    private String firstName;
    private String lastName;
    private String dayOfBirth;
    private String phone;
    private String email;
    private String gender;
    private String objective;
    private String avatar;
    private String address;
    private String overView;
    private String quoctich;
    private String quocgia;
    private String honnhan;
    private byte[] image;
    private String idtemplate;
    //private List<education> educations;

    public User() {
    }

    public User(String firstName, String lastName, String dayOfBirth, String phone, String email, String gender, String objective, String avatar, String address, String overView, String quoctich, String quocgia, String honnhan, byte[] image, String idtemplate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.objective = objective;
        this.avatar = avatar;
        this.address = address;
        this.overView = overView;
        this.quoctich = quoctich;
        this.quocgia = quocgia;
        this.honnhan = honnhan;
        this.image = image;
        this.idtemplate = idtemplate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOverView() {
        return overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getIdtemplate() {
        return idtemplate;
    }

    public void setIdtemplate(String idtemplate) {
        this.idtemplate = idtemplate;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getHonnhan() {
        return honnhan;
    }

    public void setHonnhan(String honnhan) {
        this.honnhan = honnhan;
    }
}
