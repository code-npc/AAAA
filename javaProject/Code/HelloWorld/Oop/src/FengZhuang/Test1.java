package FengZhuang;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");
        s.setScore(244);
        System.out.println(s.getName());
        StudentOp st = new StudentOp(s);
        st.printMessage();
    }
}
