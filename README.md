# Spring Boot Project demo Eureka Server / Zuul Proxy Gateway / Spring Cloud Config / Admin Server

Goal of this project is to demonstrate how to implement a full architecture which contain a `gateway (Zuul Proxy)` which interact with an `Eureka Server` an call different services instances (`Product Service`).
Also, there is an `Admin Server` which allow to monitor status and various informations (health, env variables, heap usage etc...). This Admin Server provide a UI interface.
In addition, all the configuration for each services are externalize in the `Spring Cloud Server`.
