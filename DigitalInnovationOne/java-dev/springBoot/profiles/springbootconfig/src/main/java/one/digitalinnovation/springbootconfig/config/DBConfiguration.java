package one.digitalinnovation.springbootconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration
{
    private String driverClassName;
    private String url;
    private String username;
    private String passsword;

    @Profile("dev")
    @Bean
    public String testDBConnection()
    {
        System.out.printf("DB Connection for Development - H2 %n");
        System.out.printf("%s %n", driverClassName);
        System.out.printf("%s %n", url);
        return "DB Connection to H2_TEST - Test instace";
    }

    @Profile("prod")
    @Bean
    public String productionDBConnection()
    {
        System.out.printf("DB Connection for Production - MYSQL %n");
        System.out.printf("%s %n", driverClassName);
        System.out.printf("%s %n", url);
        return "DB Connection to MYSQL_PROD - Production instace";
    }
}