package top.dumbzarro.flyticket.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"top.dumbzarro.flyticket.mbg.mapper","top.dumbzarro.flyticket.dao"})
public class MyBatisConfig {
}

