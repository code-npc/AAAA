package FengZhuang;

public class StudentOp {
    Student st;
    public StudentOp(Student st){
        this.st = st;
    }
    void printMessage(){
        System.out.println(st.getName()+"的成绩是："+st.getScore());
    }
}
