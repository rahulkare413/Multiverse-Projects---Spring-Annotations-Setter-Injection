package DependencyInjection1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. FRONT END DEVELOPMENT ");
        System.out.println("2. BACKEND DEVELOPMENT ");
        System.out.println("ENTER YOUR CHOICE ");
        int ch = sc.nextInt();

        Development development = null;
        if (ch==1){
            development=context.getBean("frontEndDevelopment",FrontEndDevelopment.class);
        } else if (ch==2) {
           development= context.getBean("backEnd", BackEnd.class);
        }else{
            System.out.println("INVALID CHOICE ");
        }
        if (development!=null){
            development.getCourseData();
            development.getSubjectInformation();
        }
    }
}
