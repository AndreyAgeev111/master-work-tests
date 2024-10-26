# Stress tests for software testing ground for testing an architectural pattern for fault-tolerant message processing within the framework of interaction with message brokers

A project based on Scala and Gatling to simulate a multi-user session

## Scenarios

This test simulated a scenario in which a user creates a product and immediately reserves it. `HTTP` methods like `POST api/v1/products` and `POST api/v1/products/{id}/reserve` were used for this purpose.

## Examples of results

With the specified parameters in the `simulation.conf` configuration file, the following picture was obtained in `Grafana`:


![grafana board example](res/grafana.png)

That is, messages were successfully processed and erroneous ones were put into the dead-letter queue, but when the number of messages in the dead-letter queue exceeded the number specified earlier, the processing of new erroneous messages went into infinite repetition, and the queue stopped replenishing.

## Run test
To run the test, run the following command:
```bash
sbt "Gatling / testOnly com.example.demo.CreateAndReserveProduct"
``` 