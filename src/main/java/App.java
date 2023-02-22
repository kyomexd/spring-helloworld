import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld anotherBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat anotherCatBean = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == anotherBean);
        System.out.println(catBean == anotherCatBean);
    }
}