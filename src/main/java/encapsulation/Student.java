package encapsulation;

public class Student {
    private String group;
    private String fio;
    private String startDate;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFIO() {
        return fio;
    }

    public void setFIO(String fio) {
        this.fio = fio;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
