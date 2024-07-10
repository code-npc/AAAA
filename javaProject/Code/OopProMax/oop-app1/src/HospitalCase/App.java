package HospitalCase;

import HospitalCase.Frame.HospitalManager;

/**
 * 医院管理系统启动处
 */
public class App {
    public static void main(String[] args) {
        HospitalManager s = new HospitalManager();
        s.start();
    }
}
