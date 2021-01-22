- Proyecto que envia datos a un Productor de Apache Kafka y posteriormente los lee desde un Consumidor.

- Primero es necesario descargar Apache Kafka, luego ejecutar ZooKeeper y Kafka.

- Después hay que crear un nuevo Tópico.
  
- En el siguiente link está la documentación oficial que explica los primeros pasos: https://kafka.apache.org/quickstart

- Finalmente hay que ejecutar el archivo Productor y luego Consumidor.

Comandos

- Iniciar ZooKeeper: <code>C:\kafka_2.12-2.1.0>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties</code>

- Iniciar Kafka: <code>C:\kafka_2.12-2.1.0>.\bin\windows\kafka-server-start.bat .\config\server.properties</code>

- Crear Tópico: <code>C:\kafka_2.12-2.1.0>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic solicitud</code>