package com.blb.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: Mr.Xue
 * @Description:
 * @Date: Created in 15:27 2019/12/25
 */
@Configuration
public class jdbcConfig2 {
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getdatasource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;

    }
}
