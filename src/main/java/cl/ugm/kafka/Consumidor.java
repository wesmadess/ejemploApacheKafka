package cl.ugm.kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;

public class Consumidor {
    public static void main(String[] args) throws Exception  {
        Consumer<Long, String> consumidor = CreadorConsumirdor.crearConsumidor();
        int intentos = 0;

        while(true){
            ConsumerRecords<Long,String> consumidorRecord = consumidor.poll(1000);
            if (consumidorRecord.count() == 0) {
                intentos++;
                if (intentos > 20)
                    break;
                else
                    continue;
            }
            else {
                consumidorRecord.forEach(record->{
                    System.out.println(record.key());
                    System.out.println(record.value());
                    System.out.println(record.offset());
                    System.out.println(record.partition());
                    System.out.println(record.timestamp());

                });
            }

        }

    }

}
