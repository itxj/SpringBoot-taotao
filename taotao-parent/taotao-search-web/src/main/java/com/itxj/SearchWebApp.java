package com.itxj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.itxj
 *  @文件名:   SearchWebApp
 *  @创建者:   小吉
 *  @创建时间:  2018/11/13 13:45
 *  @描述：    TODO
 */
//告诉SpringBoot 不要检测数据源  exclude ： 不要包含数据源的配置
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SearchWebApp {

    public static void main(String [] args){
        SpringApplication.run(SearchWebApp.class,args);
    }

}
