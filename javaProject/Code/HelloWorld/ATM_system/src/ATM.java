import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class ATM {
    //用来实现对账户的操作和使用，负责ATM系统的所有需求

    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    /**
     * 系统的启动程序
     */
    public void start() {
        while (true) {
            System.out.println("==欢迎进入某某银行ATM系统==");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择你要操作的命令：");
            String command = scanner.next();
            switch (command) {
                case "1":
                    login();
                    break;
                case "2":
                    openAcount();
                    break;
                default:
                    System.out.println("输入的指令不合法，请重新输入：");
            }
        }
    }

    /**
     * 开户功能的实现
     * 卡号为系统自动生成的9为数字组成
     * 性别，要求只能是男或女，不能有其他
     * 密码长度只能为6位数字组成
     */
    private void openAcount() {
        Account account = new Account();
        System.out.println("请输入你的基本信息：");
        System.out.println("姓名：");

        account.setName(scanner.next());

        while (true) {
            System.out.println("性别：");
            String sex = scanner.next();
            if (sex.equals("男") || sex.equals("女")) {
                account.setSex(sex);
                break;
            } else {
                System.out.println("输入不合法，重新输入：");
            }
        }
        /*
         * */
        while (true) {
            System.out.println("密码：");
            String password = scanner.next();
            if (password.length() == 6) {
                account.setPassWord(password);
                break;
            } else {
                System.out.println("密码不合法，请重新输入：");
            }
        }
        System.out.println("每日限额：");
        account.setLimt(scanner.nextDouble());
        /*
         * 在这里生成一个九位数字的卡号
         * */
        Random random = new Random();
        byte[] tem = new byte[9];//用于存放产生的数字
        for (int i = 0; i < 9; i++) {
            tem[i] = (byte) (random.nextInt(10) + 48);
        }
        String id = new String(tem);
        account.setCarId(id);
        System.out.println("恭喜您！" + account.getName() + "您的账户创建成功！您的卡号为：" + id + "请牢记！！");
        accounts.add(account);
//        System.out.println(account.getSex());
//        System.out.println(accounts.get(0).getCarId());
//        System.out.println(account.getName());
        System.out.println("_______________________________________");
    }


    /**
     * 用户登录功能的实现
     * 对比通过用户的id和密码后，即可进入个人系统页面
     */

    private void login() {
        if (accounts.size()==0){
            System.out.println("当前系统没有用户，请先开户~");
            start();
        }
        //判断系统中是否有这个卡号
        boolean id_flag = true;
        while (id_flag) {
            System.out.println("卡号：");
            String uId = scanner.next();
            for(int i = 0; i < accounts.size(); i++) {
//                if (accounts.get(i).getCarId()==uId){//易错********。字符串的内容比较不是这样的
                if (accounts.get(i).getCarId().equals(uId)) {
                    id_flag = false;
                    //卡号正确，进行密码验证
                    while (true) {
                        System.out.println("密码：");
                        String pass = scanner.next();
                        if (pass.equals(accounts.get(i).getPassWord())) {
                            //密码匹配成功
                            System.out.println("登录成功！");
                            accountStart(accounts.get(i));
                            break;
                        } else {
                            System.out.println("你输入的密码不正确，请重新输入：");
                        }
                    }//密码 while
                }
            }//遍历比较卡号的for循环
            if (id_flag) {
                System.out.println("你输入的卡号不存在！！！请重新输入：");
            }
        }//最外层的while
    }

    /**
     * 个人账户系统页面展示
     * 操作页展示，查询账户，退出账户
     */
    private void accountStart(Account account) {
        System.out.println("欢迎" + account.getName() + "进入系统！");
        while (true) {
            System.out.println(account.getName() + "的==个人操作页面==");
            System.out.println("1.查询账户");
            System.out.println("2.退出账户");
            System.out.println("3.修改密码");
            System.out.println("4.存款");
            System.out.println("5.取款");
            System.out.println("6.转账");
            System.out.println("7.注销账户");
            System.out.println("请选择你需要的操作：");
            String commond = scanner.next();
            switch (commond) {
                case "1":
                    //查询账户
                    searchAccount(account);
                    break;
                case "2":
                    //退出账户
                    exitAccount();
                    break;
                case "3":
                    //修改密码
                    modifyPassWord(account);
                    break;
                case "4":
                    //存款
                    putCash(account);
                    break;
                case "5":
                    //取款
                    getCash(account);
                    break;
                case "6":
                    //转账
                    transCash(account);
                    break;
                case "7":
                    //注销账户
                    cancelAccount(account);
                    break;
                default:
                    System.out.println("你输入的指令不合法，请重新输入：");
            }
        }
    }

    /**
     * 查询账户功能
     * 点击后展示用户的余额和限额，并展示存款，取款，转账等功能入口
     */
    private void searchAccount(Account account) {
        while (true) {
            System.out.println(account.getName() + "的==查询页面==");
            System.out.println("余额：" + account.getMoney());
            System.out.println("每次限额：" + account.getLimt());
            System.out.println("1.取款");
            System.out.println("2.存款");
            System.out.println("3.转账");
            System.out.println("4.返回");
            System.out.println("选择你需要的操作：");
            String command = scanner.next();
            switch (command) {
                case "1":
                    //取款
                    getCash(account);
                    break;
                case "2":
                    //存款
                    putCash(account);
                    break;
                case "3":
                    //转账
                    transCash(account);
                    break;
                case "4":
                    //转账
                    exit(account);
                    break;
                default:
                    System.out.println("您输入的指令不合法，请重新输入：");
            }
        }
    }

    /**
     * 返回，从查询页面返回到个人操作界面
     */
    private void exit(Account account) {
        accountStart(account);
    }

    /**
     * \
     * 退出账户
     * 跳转到首页
     */
    private void exitAccount() {
        System.out.println("感谢您的使用！");
        start();
    }

    /**
     * 修改密码
     */
    private void modifyPassWord(Account account) {
        while (true) {
            System.out.println("新密码：");
            String password = scanner.next();
            if (password.length() == 6) {
                while (true) {
                    System.out.println("请再次确认密码：");
                    String password2 = scanner.next();
                    if (password.equals(password2) && password2.length() == 6) {
                        account.setPassWord(password);
                        break;
                    } else {
                        System.out.println("两次输入的密码不同，请检查后重新输入：");
                    }
                }
                break;
            } else {
                System.out.println("你输入的密码不合法，请重新输入：");
            }

        }
        System.out.println("密码修改成功！请重新登录。");
        exitAccount();
    }

    /**
     * 存款功能
     */
    private void putCash(Account account) {
        System.out.println("请输入你要存入的金额：");
        double cash = scanner.nextDouble();
        account.setMoney(cash + account.getMoney());//存款，要把原来账户中的钱也加上
        System.out.println("存款成功！你的余额为：" + account.getMoney());
    }

    /**
     * 取款功能
     */
    private void getCash(Account account) {
        if (account.getMoney() > 0) {
            while (true) {
                System.out.println("请输入你要取的金额：");
                double cash = scanner.nextDouble();
                if (cash > account.getMoney()) {
                    System.out.println("余额不足，请重新输入：");
                } else if (cash > account.getLimt()) {
                    System.out.println("超过了每次的限额，重新输入：");
                } else {
                    account.setMoney(account.getMoney() - cash);
                    System.out.println("取款成功，你的余额为：" + account.getMoney());
                    break;
                }
            }
        } else {//余额小于0的
            System.out.println("你的余额不足，请先去打工存钱吧~");
        }
//        accountStart(account);
    }

    /**
     * 转账功能
     * 系统中至少要存在两个或两个以上的用户才可以
     */
    private void transCash(Account account) {
        if (accounts.size() < 2) {
            System.out.println("系统中账户数量不足两个，无法转账。");
        } else {
            while (true) {
                System.out.println("请输入对方的卡号：");
                String pId = scanner.next();
                if (pId.length() != 9) {
                    System.out.println("你输入的卡号不合法，请重新输入：");
                } else if (pId == account.getCarId()) {
                    System.out.println("不能给自己转账！！！");
                } else {
                    //卡号合法，进行卡号比对，从系统中找对应的账户对象
                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).getCarId().equals(pId)) {
                            //卡号对应的账户找到后，进行身份信息确认
                            compare(accounts.get(i), account);
                            break;
                        } else {
                            System.out.println("你输入的卡号不存在，请检查后重新输入：");
                            break;//跳出的是for循环，进去while循环中继续接受录入
                        }
                    }//for循环，从系统中查找比对卡号
                    break;//转账成功
                }
            }
        }

    }

    /**
     * 一个功能函数，transCash()使用了
     *
     * @param account1
     * @param account2
     */
    private void compare(Account account1, Account account2) {
        //account1为被转入账户，account2为
        while (true) {
            System.out.println("转账账户名字： " + account1.getName().replace(account1.getName().charAt(1), '*'));
            System.out.println("请补全姓名：");
            String a = scanner.next();
            String b = new String(String.valueOf(account1.getName().charAt(1)));
            if (a.equals(b)) {
                //名字比对成功,可以转账了
                System.out.println("请输入你要转入的金额：");
                double cash = scanner.nextDouble();
                if (cash > account2.getMoney()) {
                    System.out.println("余额不足！！！");
                } else {
                    account2.setMoney(account2.getMoney() - cash);//原账户减掉金额
                    account1.setMoney(account1.getMoney() + cash);//转入账户
                    System.out.println("恭喜你，转账成功！你的余额为：" + account2.getMoney());
                }
                break;
            } else {//名字比对成功，转账成功，或余额不足
                System.out.println("名字比对失败！");

            }//名字比对失败
        }//名字比对，while循环

    }

    /**
     * 注销账户
     */
    private void cancelAccount(Account account) {
        while (true) {
            if (account.getMoney() != 0) {
                System.out.println("你的账户还有余额，请先清空再来吧！");
                break;
            } else {
                System.out.println("您确认要注销账户吗？    Y/N");
                String yn = "YN";
                String foo = scanner.next();
                if (foo.equalsIgnoreCase(String.valueOf(yn.charAt(0)))) {
                    //如果选择了y或Y
                    accounts.remove(account);
                    start();
                    break;
                } else if (foo.equalsIgnoreCase(String.valueOf(yn.charAt(1)))) {
                    //选择了n或N
                    accountStart(account);
                    break;
                } else {
                    System.out.println("无效字符！请重新输入：");
                }
            }
        }

    }
}
