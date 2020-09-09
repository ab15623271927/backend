package com.tourstories.www;
import com.tourstories.www.Model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan(value = "com.tourstories.www.mapper")
@SpringBootApplication()
public class TourstoriesApplication {
	public static void main(String[] args) {
		SpringApplication.run(TourstoriesApplication.class, args);
	}

}
