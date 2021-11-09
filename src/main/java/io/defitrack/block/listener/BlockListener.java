package io.defitrack.block.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class BlockListener {

    private final ObjectMapper objectMapper;

    public BlockListener(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void process(String message) {

    }
}
