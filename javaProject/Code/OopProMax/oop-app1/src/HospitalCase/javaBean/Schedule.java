package HospitalCase.javaBean;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 排班情况类
 */
public class Schedule {
    private LocalDate today;
    private boolean morning;//记录上午是否看诊，是否排班
    private LocalTime mstart;
    private LocalTime mend;
    private int mTotalNumber;//看诊人数
    private int mAppointNumber;//预约人数


    private boolean afternoon;//记录下午是否看诊，是否排班
    private LocalTime astart;
    private LocalTime aend;
    private int aTotalNumber;//看诊人数
    private int aAppointNumber;//预约人数


    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalTime getMstart() {
        return mstart;
    }

    public void setMstart(LocalTime mstart) {
        this.mstart = mstart;
    }

    public LocalTime getMend() {
        return mend;
    }

    public void setMend(LocalTime mend) {
        this.mend = mend;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getAstart() {
        return astart;
    }

    public void setAstart(LocalTime astart) {
        this.astart = astart;
    }

    public LocalTime getAend() {
        return aend;
    }

    public void setAend(LocalTime aend) {
        this.aend = aend;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "today=" + today +
                ", morning=" + morning +
                ", mstart=" + mstart +
                ", mend=" + mend +
                ", mTotalNumber=" + mTotalNumber +
                ", mAppointNumber=" + mAppointNumber +
                ", afternoon=" + afternoon +
                ", astart=" + astart +
                ", aend=" + aend +
                ", aTotalNumber=" + aTotalNumber +
                ", aAppointNumber=" + aAppointNumber +
                '}';
    }
}
