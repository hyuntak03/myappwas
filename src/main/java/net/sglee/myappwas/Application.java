package net.sglee.myappwas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "net.sglee.myappwas",
        "net.sglee.myappwas.controller"})
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(Application.class,args);
    }
}
