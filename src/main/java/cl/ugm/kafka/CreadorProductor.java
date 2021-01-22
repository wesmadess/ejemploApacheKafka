package cl.ugm.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class CreadorProductor {
    public static Producer<Long, String> crearProductor(){
        Properties props= new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, Configuracion.KAFKA_BROKERS);
        props.put(ProducerConfig.CLIENT_ID_CONFIG, Configuracion.CLIENT_ID);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return new KafkaProducer<Long, String>(props);

    }
}
