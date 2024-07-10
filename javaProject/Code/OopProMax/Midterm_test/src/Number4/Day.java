package Number4;

import java.time.LocalDate;

public class Day {
    private LocalDate date;
    private boolean flag;//true，表示休息

    public Day() {
    }

    public Day(LocalDate date, boolean flag) {
        this.date = date;
        this.flag = flag;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return
                "date=" + date +
                " [" + (flag?"休息":"工作")+"]";
    }
}
