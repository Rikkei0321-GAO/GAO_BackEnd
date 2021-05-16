package gao.internfinder.backend.dto;

public class DataCVDTO {


    private int _id;
    private String _firstName;
    private String _lastName;
    private String _dayOfBirth;
    private String _phone;
    private String _email;
    private String _gender;
    private String _objective;
    private String _avatar;
    private String _address;
    private String _quoctich;
    private String _quocgia;
    private String _honnhan;


    public DataCVDTO(int _id, String _firstName, String _lastName, String _dayOfBirth, String _phone, String _email, String _gender, String _objective, String _avatar, String _address, String _quoctich, String _quocgia, String _honnhan) {
        this._id = _id;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._dayOfBirth = _dayOfBirth;
        this._phone = _phone;
        this._email = _email;
        this._gender = _gender;
        this._objective = _objective;
        this._avatar = _avatar;
        this._address = _address;
        this._quoctich = _quoctich;
        this._quocgia = _quocgia;
        this._honnhan = _honnhan;
    }

    public DataCVDTO() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_dayOfBirth() {
        return _dayOfBirth;
    }

    public void set_dayOfBirth(String _dayOfBirth) {
        this._dayOfBirth = _dayOfBirth;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_gender() {
        return _gender;
    }

    public void set_gender(String _gender) {
        this._gender = _gender;
    }

    public String get_objective() {
        return _objective;
    }

    public void set_objective(String _objective) {
        this._objective = _objective;
    }

    public String get_avatar() {
        return _avatar;
    }

    public void set_avatar(String _avatar) {
        this._avatar = _avatar;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public String get_quoctich() {
        return _quoctich;
    }

    public void set_quoctich(String _quoctich) {
        this._quoctich = _quoctich;
    }

    public String get_quocgia() {
        return _quocgia;
    }

    public void set_quocgia(String _quocgia) {
        this._quocgia = _quocgia;
    }

    public String get_honnhan() {
        return _honnhan;
    }

    public void set_honnhan(String _honnhan) {
        this._honnhan = _honnhan;
    }
}
