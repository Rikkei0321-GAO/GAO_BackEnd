package gao.internfinder.backend.dto;

public class KinhNghiem {
    private String contact;
    private String dayStart;
    private String dayEnd;

    public KinhNghiem() {
    }

    public KinhNghiem(String contact, String dayStart, String dayEnd) {
        this.contact = contact;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }
}
