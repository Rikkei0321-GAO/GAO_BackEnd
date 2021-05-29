package gao.internfinder.backend.dto;

public class HocTap {
    private String school;
    private String dayStart;
    private String dayEnd;

    public HocTap(String school, String dayStart, String dayEnd) {
        this.school = school;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public HocTap() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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
