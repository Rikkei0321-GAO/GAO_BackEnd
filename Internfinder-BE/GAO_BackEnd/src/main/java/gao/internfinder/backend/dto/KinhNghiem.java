package gao.internfinder.backend.dto;

public class KinhNghiem {
    private String name;
    private String dayStart;
    private String dayEnd;

    public KinhNghiem(String tieuDe, String dayStart, String dayEnd) {
        this.name = tieuDe;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public KinhNghiem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
