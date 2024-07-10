package Construct;

public class Student {
    String name;
    double score;

    public void printScore(){
        System.out.println(this.score);
    }

    public Student(){}//无参构造


//    有参构造
    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }



}
