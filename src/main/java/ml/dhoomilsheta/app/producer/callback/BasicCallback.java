package ml.dhoomilsheta.app.producer.callback;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class BasicCallback implements Callback {
    @Override
    public void onCompletion(RecordMetadata metadata, Exception exception) {
        if (exception == null) {
            System.out.printf("Message with offset %d acknowledged by partition %d\n",
                    metadata.offset(), metadata.partition());
        } else {
            System.out.println(exception.getMessage());
        }
    }
}
