package pl.krix.springplayground.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by krix on 24.08.2018.
 */
@Component
public class AppConfig {

    @Value("${someBean.someValue}")
    private String someValue;

    public String getSomeValue() {
        return someValue;
    }
}
