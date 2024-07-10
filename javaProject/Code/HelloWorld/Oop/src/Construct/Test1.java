package Construct;

public class Test1 {
    public static void main(String[] args) {
        Student st = new Student("小笑",235);
        Student st2 = new Student();
        st2.score = 2567;
        st.printScore();
        st2.printScore();
    }
}
