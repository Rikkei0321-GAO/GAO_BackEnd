package gao.internfinder.backend.DTO;

public class Educations {
    public Educations() {
    }

    private String schoolName;
    private String startYear;
    private String endYear;

    public Educations(String schoolName, String startYear, String endYear) {
        this.schoolName = schoolName;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }
}
