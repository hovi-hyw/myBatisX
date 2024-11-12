package edu.dzkj.cloud.mybatisx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("edu.dzkj.cloud.mybatisx.mapper")
@SpringBootApplication
public class MyBatisXApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisXApplication.class, args);
    }

}
