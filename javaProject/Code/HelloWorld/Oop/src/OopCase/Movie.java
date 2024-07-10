package OopCase;

public class Movie {
    //在这里定义电影的实体类（数据都是私有的，每个数据都是get和set的来的，必须有一个公共的无参构造（默认就有））
    private int id;
    private String name;
    private double price;
    private double score;
    private String  directer;
    private String actor;
    private String info;

    public Movie() {
    }

    public Movie(int id, String name, double price, double score, String directer, String actor, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.directer = directer;
        this.actor = actor;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirecter() {
        return directer;
    }

    public String getInfo() {
        return info;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setDirecter(String directer) {
        this.directer = directer;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
