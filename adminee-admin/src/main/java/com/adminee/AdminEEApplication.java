package com.adminee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * @author gavin
 */

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AdminEEApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminEEApplication.class,args);
        System.out.println("系统启动成功");
    }
}
