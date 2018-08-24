package pl.krix.springplayground.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.krix.springplayground.domain.SomeBean;

/**
 * Created by krix on 24.08.2018.
 */

@Configuration
@EnableConfigurationProperties
public class BeanConfiguration {

    @Autowired
    private AppConfig appConfig;

    @Bean
    public SomeBean someBean(){
        return new SomeBean(appConfig.getSomeValue());
    }
}
