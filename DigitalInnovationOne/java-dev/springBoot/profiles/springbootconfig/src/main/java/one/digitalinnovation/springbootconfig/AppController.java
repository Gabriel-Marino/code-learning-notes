package one.digitalinnovation.springbootconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Value;

@RestController
public class AppController
{
    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage()
    {
        return appMessage;
    }
}