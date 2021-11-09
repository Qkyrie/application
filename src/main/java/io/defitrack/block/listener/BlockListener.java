package io.defitrack.block.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.defitrack.block.domain.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class BlockListener {

    private static final Logger logger = LoggerFactory.getLogger(BlockListener.class);

    private final ObjectMapper objectMapper;

    public BlockListener(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

 //   @SqsListener(value = "${sqs.auth0}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void process(String message) {
        try {
            final Block block = objectMapper.readValue(message, Block.class);

        } catch (Exception exception) {
            //todo
        }
    }
}
