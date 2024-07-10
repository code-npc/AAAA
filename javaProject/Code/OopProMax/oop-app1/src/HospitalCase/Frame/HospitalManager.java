package HospitalCase.Frame;

import HospitalCase.javaBean.Appointment;
import HospitalCase.javaBean.Department;
import HospitalCase.javaBean.Doctor;
import HospitalCase.javaBean.Schedule;
import com.lc.interfaceDemo.A;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * 医院中各种方式的实现
 */
public class HospitalManager extends HospitalUntil{
    //所有的信息都是从科室中找到，科室中有医生的信息，医生中有排班的信息
    ArrayList<Department> departments = new ArrayList<>();
    //记录所有的预约信息
    ArrayList<Appointment> appointments =new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    /**
     * 启动程序
     */
    public void start(){
        while (true){
            System.out.println("===欢迎进入某某某医院信息管理系统===");
            System.out.println("1.科室管理-添加科室");
            System.out.println("2.科室管理-删除科室");
            System.out.println("3.科室管理-修改科室");
            System.out.println("4.医生管理-录入医生");
            System.out.println("5.医生管理-医生坐诊设置（可设置当天和未来6天坐诊情况）");
            System.out.println("6.医生管理-展示所有医生的坐诊详情");
            System.out.println("7.医生管理-挂号预约");
            System.out.println("8.搜索某个医生当前和未来6天内的病人预约详情（展示每天预约病人的具体信息）");
            System.out.println("请输入你要操作的指令：");
            String command = scanner.next();
            switch (command){
                case "1":
                    //科室管理-添加科室
                    addDepartment();
                    break;
                case "2":
                    //科室管理-删除科室
                    break;
                case "3":
                    //科室管理-修改科室
                    break;
                case "4":
                    //医生管理-录入医生
                    addDoctor();
                    break;
                case "5":
                    //医生管理-医生坐诊设置
                    setDoctorJob();
                    break;
                case "6":
                    //医生管理-展示所有医生的坐诊详情
                    showAllSchedules();
                    break;
                case "7":
                    //医生管理-挂号预约
                    setAppoint();
                    break;
                case "8":
                    //搜索某个医生当前和未来6天内的病人预约详情
                    break;
                default:
                    System.out.println("你输入的指令不存在，请重新输入：");
            }//switch end
        }
    }


    /**
     * 添加科室
     */
    private void addDepartment(){
        System.out.println("============添加科室=============");
        Department department = new Department();
        OUT:
        while (true) {
            System.out.println("请输入科室名称：");
            String departmentName = scanner.next();
            for (int i = 0; i < departments.size(); i++) {
                if (departmentName.equals(departments.get(i).getName())){
                    System.out.println("你输入的科室已存在，请重新输入：");
                    continue OUT;
                }
            }//for
            department.setName(departmentName);
            departments.add(department);
            break ;
        }//while
    }

    /**
     * 录入医生
     */
    private void addDoctor(){

        System.out.println("============录入医生=============");
        Doctor doctor = new Doctor();
        //选择科室

        Department department = selectDepartment(departments);
        if (department == null){
            return;
        }
        doctor.setDepartmentName(department.getName());


        doctor.setDoctorId(UUID.randomUUID().toString());

        System.out.println("医生姓名：");
        doctor.setName(scanner.next());

        System.out.println("性别：");
        doctor.setGender(scanner.next());

        System.out.println("年龄：");
        doctor.setAge(scanner.nextInt());

        System.out.println("主治方向：");
        doctor.setSpecialty(scanner.next());

        System.out.println("入职时间：格式yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(scanner.next());
        doctor.setJoinDate(localDate);

        department.getDoctors().add(doctor);
        System.out.println("录入成功！");
    }

    /**
    * 医生坐珍设置
    */
    private void setDoctorJob(){
        while (true) {
            System.out.println("============设置坐诊时间=============");

            Department department = selectDepartment(departments);
            if(department.getDoctors().size() == 0){
                System.out.println("当前科室还没有医生。");
            }
            //展示所有医生

            Doctor doctor = selectDoctor(department.getDoctors());
            ArrayList<Schedule> schedules = doctor.getSchedules();//当前医生的坐诊时间表集合

            //获取当天的时间对象
            LocalDate ld = LocalDate.now();
            //设置当天以及未来6天的安排
            //只有在当前医生第一次排班的时候是这种情况，后面需要动态的去更新需要排班的次数
            int len = getScheduleTimes(schedules,ld);
            for (int i = 0; i < len; i++) {

                Schedule schedule = new Schedule();
                LocalDate today = ld.plusDays(i+7-len);
                schedule.setToday(today);
                System.out.println("日期："+today);

                System.out.println("上午是否要工作（排班）     y/n");
                String ans = scanner.next();
                //忽略大小写，或者输入其他字段的特殊情况，时间格式的严格控制，后续补充,
                if (ans.equals("y")){
                    schedule.setMorning(true);
                    System.out.println("开始时间HH:mm:ss");
                    String mstime = scanner.next();
                    schedule.setMstart(LocalTime.parse(mstime));
                    System.out.println("结束时间HH:mm:ss");
                    String metime = scanner.next();
                    schedule.setMend(LocalTime.parse(metime));
                    System.out.print("看诊人数：  ");
                    schedule.setmTotalNumber(scanner.nextInt());
                    System.out.println("上午预约人数：  0");
                    //后续完善
                }else if (ans.equals("n")){
                    schedule.setMorning(false);
                }



                System.out.println("下午是否要工作（排班）     y/n");
                String ans1 = scanner.next();
                //忽略大小写，或者输入其他字段的特殊情况，时间格式的严格控制，后续补充,
                if (ans1.equals("y")){
                    schedule.setAfternoon(true);
                    System.out.println("开始时间HH:mm:ss");
                    String astime = scanner.next();
                    schedule.setAstart(LocalTime.parse(astime));
                    System.out.println("结束时间HH:mm:ss");
                    String aetime = scanner.next();
                    schedule.setAend(LocalTime.parse(aetime));
                    System.out.print("看诊人数：  ");
                    schedule.setmTotalNumber(scanner.nextInt());
                    System.out.println("上午预约人数：  0");
                    //后续完善
                }else if (ans1.equals("n")){
                    schedule.setAfternoon(false);
                }


                schedules.add(schedule);
            }//for end
            System.out.println("坐诊时间设置完成。");
            break;

        }//while end
    }

    /**
     *  获取需要排版的天数
     * @param schedules
     * @param localDate
     * @return
     */
    private int getScheduleTimes(ArrayList<Schedule> schedules,LocalDate localDate){
        if (schedules.size()==0){
            return 7;
        }
        for (int i = 0; i < schedules.size(); i++) {
            if(schedules.get(i).getToday().equals(localDate)){
                for (int j = 0; j < i; j++) {
                    schedules.remove(j);
                    j--;
                }
                return i;
            }
        }
        //之前所安排的都已过期
        for (int i = 0; i < schedules.size(); i++) {
            schedules.remove(i);
            i--;
        }
        return 7;
    }


    /**
     * 展示所有医生的坐诊信息
     */
    private void showAllSchedules(){
        System.out.println("============所有医生坐诊信息=============");
        for (int i = 0; i < departments.size(); i++) {//遍历科室集合，找到医生集合
            ArrayList<Doctor> doctors = departments.get(i).getDoctors();

            for (int i1 = 0; i1 < doctors.size(); i1++) {//遍历医生集合，得到坐诊集合
                System.out.println(departments.get(i).getName() + "中的"+doctors.get(i1).getName()+"医生的排班信息如下：");
                ArrayList<Schedule> schedules = doctors.get(i1).getSchedules();
                for (int i2 = 0; i2 < schedules.size(); i2++) {//遍历坐诊集合，得到坐诊对象
                    Schedule schedule = schedules.get(i2);
                    System.out.println("日期："+schedule.getToday());
                    if (schedule.isMorning()){
                        System.out.println("上班时间："+schedule.getMstart());
                        System.out.println("下班时间："+schedule.getMend());
                    }else {
                        System.out.println("上午休息！");
                    }
                    if (schedule.isAfternoon()){
                        System.out.println("上班时间："+schedule.getAstart());
                        System.out.println("下班时间："+schedule.getAend());
                    }else {
                        System.out.println("下午休息！");
                    }
                    System.out.println("------------------------------");
                }
                System.out.println("------------------------------");
            }
            System.out.println("------------------------------");
        }
    }


    /**
     * 设置预约信息
     */
    private void setAppoint(){
        System.out.println("=============预约系统==============");
        Appointment appointment = new Appointment();
        System.out.println("请输入以下信息：");
        System.out.println("姓名：");
        appointment.setUserName(scanner.next());
        System.out.println("性别：");
        appointment.setSex(scanner.next());
        System.out.println("年龄：");
        appointment.setAge(scanner.nextInt());
        System.out.println("电话：");
        appointment.setTel(scanner.next());
        System.out.println("病情描述：");
        appointment.setDesc(scanner.next());
        System.out.println("选择要预约的科室：");
        Department department = selectDepartment(departments);
        appointment.setDepartName(department.getName());
        System.out.println("选择要预约的医生Id（这里简单的用名字）：");
        Doctor doctor = selectDoctor(department.getDoctors());
        appointment.setDoctorId(doctor.getName());

        //预约时间可以做一个判断，判断该医生在这个时间段是否工作，预约是否已经满。。
        System.out.println("预约时间：格式：yyyy-MM-dd HH：mm：ss");
        String ldt = scanner.next();
        appointment.setAppointDateTime(LocalDateTime.parse(ldt));

        appointments.add(appointment);
        System.out.println("设置成功！！");


    }

}//class end
