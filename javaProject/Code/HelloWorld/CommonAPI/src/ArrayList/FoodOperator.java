package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodlist = new ArrayList<>();

/**
 * 上架菜品
 */

    public void addFoods(){
        Scanner scanner = new Scanner(System.in);
        Food food = new Food();
        System.out.println("请输入菜品名称：");
        String name = scanner.next();
        System.out.println("请输入菜品价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入菜品描述：");
        String desc = scanner.next();

        food.setName(name);
        food.setPrice(price);
        food.setDesc(desc);

        foodlist.add(food);
        System.out.println("上架成功！");
        System.out.println("_____________________");
    }

    /**
     * 展示所有菜品
     */
        public void showAllFoods(){
            if (foodlist.size()==0){
                System.out.println("还没有商品可以展示，先去上架商品吧~~");
                return;
            }
            for (int i = 0; i < foodlist.size(); i++) {
                Food food = foodlist.get(i);
                System.out.println("名称："+food.getName());
                System.out.println("价格："+food.getPrice());
                System.out.println("名称："+food.getDesc());
                System.out.println("----------------");
            }
        }

    /**
     * 模拟展示器
     */
    public void start(){
        while (true) {
            System.out.println("选择功能：");
            System.out.println("1.上架菜品");
            System.out.println("2.展示所有菜品");
            System.out.println("3.退出系统");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.next();
            switch (num){
                case "1":
                    addFoods();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("你输入的数据不合法！");
                    break;
            }
        }

    }
}
