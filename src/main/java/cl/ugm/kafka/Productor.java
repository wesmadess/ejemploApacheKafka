package cl.ugm.kafka;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class Productor {

    public static void main(String[] args) throws Exception {
        Producer productor = CreadorProductor.crearProductor();
        for (int i = 0; i < 10; i++){
            ProducerRecord<Long, String> record = new ProducerRecord<>(Configuracion.TOPIC_NAME,
                    "Mensaje "+i);
            RecordMetadata metadata = (RecordMetadata)productor.send(record).get();
            System.out.println("offset "+metadata.offset()+ " topic "+ metadata.topic()+
                    " timestamp "+metadata.timestamp());
        }
    }
}
