package ru.appline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//аннотацией указываем, что этот класс отвечает за запуск спринга
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        //указываем, что нужно запускать: App.class и аргументы
        SpringApplication.run(App.class, args);
    }
}
