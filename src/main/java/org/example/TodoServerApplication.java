package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoServerApplication {
    // 컨트롤 쉬프트 알 => 실행
    public static void main(String[] args) {
        SpringApplication.run(TodoServerApplication.class, args);
    }
}
