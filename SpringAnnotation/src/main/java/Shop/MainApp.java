package Shop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1.");
//        System.out.println("2.");
//        System.out.println("ENTER YOUR CHOICE ");

        Shop s1 = context.getBean("bigBasket",BigBasket.class);
        Shop s2 = context.getBean("bigBasket",BigBasket.class);
        System.out.println(s1==s2);
        s1.getProductInformation();
        s1.getShopInformation();

     ElectronicShop e1 = context.getBean("electronicShop",ElectronicShop.class);
        ElectronicShop e2  = context.getBean("electronicShop",ElectronicShop.class);
        System.out.println(e1==e2);
        e1.getProductInformation();
        e1.getShopInformation();
    }
}
