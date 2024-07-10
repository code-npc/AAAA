public class Account {
    //用来保存账户的基本信息，包括：卡号，姓名，性别，密码，余额，每次取现额度等。
    private String carId;
    private String name;
    private String sex;
    private String passWord;
    private double money;
    private double limt;

    public Account() {
    }

    public Account(String carId, String name, String  sex, String passWord, double money, double limt) {
        this.carId = carId;
        this.name = name;
        this.sex = sex;
        this.passWord = passWord;
        this.money = money;
        this.limt = limt;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getName() {

        return name=="男"?name+"先生":name+"女士";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String  sex) {
        this.sex = sex;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimt() {
        return limt;
    }

    public void setLimt(double limt) {
        this.limt = limt;
    }
}
