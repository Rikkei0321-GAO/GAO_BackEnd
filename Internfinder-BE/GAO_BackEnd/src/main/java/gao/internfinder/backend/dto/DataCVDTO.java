package gao.internfinder.backend.dto;

import java.util.List;

public class DataCVDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String dayOfBirth;
    private String phone;
    private String email;
    private String gender;
    private String objective;
    private String avatar;
    private String address;
    private String quocTich;
    private String quocGia;
    private String honNhan;
    private List<String> skills;
    private List<String> thanhTichs;
    private String kinhNghiems;
    private String hocTap;

    public DataCVDTO() {
    }

    public DataCVDTO(int id, String firstName, String lastName, String dayOfBirth, String phone, String email, String gender, String objective, String avatar, String address, String quocTich, String quocGia, String honNhan, List<String> skills, List<String> thanhTichs, String kinhNghiems, String hocTap) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.objective = objective;
        this.avatar = avatar;
        this.address = address;
        this.quocTich = quocTich;
        this.quocGia = quocGia;
        this.honNhan = honNhan;
        this.skills = skills;
        this.thanhTichs = thanhTichs;
        this.kinhNghiems = kinhNghiems;
        this.hocTap = hocTap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
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
