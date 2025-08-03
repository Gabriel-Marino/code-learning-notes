### with profiles is possible create different configs for different environments

> to create a profile, is just needed to create in the src/main/resources the file "aplication-${profile-name}.properties" and the in the package src/main/java/config make a class with
```java=
@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class CLASSNAME
{
    private String config1;
    private String config2;
    private String config3;
    private String config4;

    @Profile("profile-name-1")
    @Bean
    public String name()
    {
    // code relate to profile
    }

    @Profile("profile-name-2")
    @Bean
    public String name()
    {
    // code relate to profile
    }
}
```
in application.properties
```properties=
debug=true
spring.profile.active=dev
spring.application.name=ProjectName
```
```yml=
debug: true
spring:
    profile:
        active: dev
    application:
        name: ProjectName
```
and then run as usual
inline commands can overwrite configs from application.confiure or application.yml
`@Value` injects environment variable in the project with `@Value("${ENV_VAR_NAME:STD_VAL}")`
