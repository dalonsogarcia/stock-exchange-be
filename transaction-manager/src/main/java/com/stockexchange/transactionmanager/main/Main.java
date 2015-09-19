package com.stockexchange.transactionmanager.main;

import com.stockexchange.transactionmanager.config.AppConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by David Alonso Garcia on 19/09/2015.
 */
@SpringBootApplication
@RabbitListener(queues ="")
public class Main {

    public void main (String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Main mainClass = context.getBean(Main.class);
        mainClass.run();
    }

    private void run() {

    }

}
