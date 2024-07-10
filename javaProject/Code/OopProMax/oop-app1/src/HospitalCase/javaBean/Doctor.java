package HospitalCase.javaBean;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor {
    private String doctorId;
    private String name;
    private String departmentName;//科室名称
    private String gender;
    private  int age;
    private String specialty;//专长。主治方向
    private LocalDate joinDate;//入职时间
    private ArrayList<Schedule> schedules = new ArrayList<Schedule>();

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                ", joinDate=" + joinDate +
                ", schedules=" + schedules +
                '}';
    }
}
