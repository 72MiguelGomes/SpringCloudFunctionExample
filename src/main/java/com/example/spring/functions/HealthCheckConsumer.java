package com.example.spring.functions;

import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HealthCheckConsumer implements Consumer<HealthCheck> {

    private static final Logger logger = LoggerFactory.getLogger(HealthCheckConsumer.class);

    @Override
    public void accept(HealthCheck data) {
        logger.info("Consume HealthCheck [name={}]", data);
    }
}
