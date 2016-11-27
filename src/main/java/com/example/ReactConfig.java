package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReactConfig {
        @Bean
        public ReactServer reactServer() {
                return new ReactServer();
        }
}
