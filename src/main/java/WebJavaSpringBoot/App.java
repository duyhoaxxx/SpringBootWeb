package WebJavaSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("> Trước khi IoC Container được khởi tạo");
        ApplicationContext context =SpringApplication.run(App.class, args);
        System.out.println("> Sau khi IoC Container được khởi tạo");

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        // Lấy Bean ra bằng cách
//        Outfit outfit = context.getBean(Outfit.class);
//
//        // In ra để xem thử nó là gì
//        System.out.println("Instance: " + outfit);
//        // xài hàm wear()
//        outfit.wear();

        Girl girl = context.getBean(Girl.class);
//
//        System.out.println("WebJavaSpringBoot.Girl Instance: " + girl);
//
//        System.out.println("WebJavaSpringBoot.Girl WebJavaSpringBoot.Outfit: " + girl.outfit);
//
//        girl.outfit.wear();

        System.out.println("> Trước khi IoC Container destroy Girl");
        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
        System.out.println("> Sau khi IoC Container destroy Girl");
    }
}
