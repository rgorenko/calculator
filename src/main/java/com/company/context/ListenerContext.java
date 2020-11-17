package com.company.context;

import com.company.input.AbstractInputSource;
import com.company.service.InputHandlerService;
import com.company.service.InputListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("default")
public class ListenerContext {

    @Bean
    InputListener inputListener(AbstractInputSource inputSource,
                                InputHandlerService inputHandlerService) {
        return new InputListener(inputSource, inputHandlerService, true);
    }
}
