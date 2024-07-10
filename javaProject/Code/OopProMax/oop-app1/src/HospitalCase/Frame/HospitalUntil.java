package HospitalCase.Frame;

import HospitalCase.javaBean.Department;
import HospitalCase.javaBean.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalUntil {
//公用的代码，可以放到这里
Scanner scanner = new Scanner(System.in);

    /**
     *
     * 选择科室的方法
     */
    public Department selectDepartment(ArrayList<Department> departments){
    if (departments.size() == 0){
        return null;
    }
    for (int i = 0; i < departments.size(); i++) {
        String name =  departments.get(i).getName();
        System.out.println(i+1 +". "+ name);
    }
    while (true) {
        System.out.println("请选择：");
        int command = scanner.nextInt();

        if(command < 1 || command > departments.size()){
            System.out.println("输入不合法，重新输入：");
        }else {
            return departments.get(command - 1);
        }
    }
}

/**
 *
 * 选择医生的方法
 */
public Doctor selectDoctor(ArrayList<Doctor> doctors){
    if (doctors.size() == 0){
        return null;
    }
    for (int i = 0; i < doctors.size(); i++) {
        String name =  doctors.get(i).getName();
        System.out.println(i+1 +". "+ name);
    }
    while (true) {
        System.out.println("请选择：");
        int command = scanner.nextInt();

        if(command < 1 || command > doctors.size()){
            System.out.println("输入不合法，重新输入：");
        }else {
            return doctors.get(command - 1);
        }
    }
}


}
