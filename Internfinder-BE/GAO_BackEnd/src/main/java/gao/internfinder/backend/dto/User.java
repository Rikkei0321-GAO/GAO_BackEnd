package gao.internfinder.backend.dto;

import java.util.List;

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
    private String quocGia;
    private String honNhan;
    private byte[] image;
    private String idtemplate;
    private List<String> skills;
    private List<String> thanhTichs;
    private String kinhNghiems;
    private String hocTap;
    //private List<education> educations;

    public User() {
    }

    public User(String firstName, String lastName, String dayOfBirth, String phone, String email, String gender, String objective, String avatar, String address, String overView, String quoctich, String quocGia, String honNhan, byte[] image, String idtemplate, List<String> skills, List<String> thanhTichs, String kinhNghiems, String hocTap) {
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
        this.quocGia = quocGia;
        this.honNhan = honNhan;
        this.image = image;
        this.idtemplate = idtemplate;
        this.skills = skills;
        this.thanhTichs = thanhTichs;
        this.kinhNghiems = kinhNghiems;
        this.hocTap = hocTap;
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

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getHonNhan() {
        return honNhan;
    }

    public void setHonNhan(String honNhan) {
        this.honNhan = honNhan;
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

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getThanhTichs() {
        return thanhTichs;
    }

    public void setThanhTichs(List<String> thanhTichs) {
        this.thanhTichs = thanhTichs;
    }

    public String getKinhNghiems() {
        return kinhNghiems;
    }

    public void setKinhNghiems(String kinhNghiems) {
        this.kinhNghiems = kinhNghiems;
    }

    public String getHocTap() {
        return hocTap;
    }

    public void setHocTap(String hocTap) {
        this.hocTap = hocTap;
    }
}
