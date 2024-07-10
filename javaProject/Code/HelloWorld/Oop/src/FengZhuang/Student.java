package FengZhuang;

public class Student {
    private String name;
    private double score;
//    void printMessage(){
//        System.out.println(this.name+"的成绩是："+this.score);
//    }
    public Student(){}

//    public Student(String name, double score) {
//        this.name = name;
//        this.score = score;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
