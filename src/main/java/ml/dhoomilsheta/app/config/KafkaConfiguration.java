package ml.dhoomilsheta.app.config;

public class KafkaConfiguration {
    public static final String SERVERS = "bigdata-1:9092, bigdata-2:9092, bigdata-3:9092";
    public static final String TOPIC = "bigdata-tweets";
    public static final long SLEEP_TIMER = 1000;
}
