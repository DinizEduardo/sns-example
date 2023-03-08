package br.com.example.sns.producer.sns;

import com.amazonaws.services.sns.AmazonSNS;
import org.springframework.stereotype.Component;

@Component
public class SnsExample {

    private final AmazonSNS snsClient;

    public SnsExample(AmazonSNS snsClient) {
        this.snsClient = snsClient;
    }

    public void publish(final String message) {
        snsClient.publish("arn:aws:sns:sa-east-1:000000000000:topic-exemplo", message);
    }
}
