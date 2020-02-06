# Distributed-Tracing-system
Zipkin is a distributed tracing system. It helps gather timing data needed to troubleshoot latency problems in service architectures. Features include both the collection and lookup of this data.


#Zipkinserver folder
Zipkinserver contains source to run zipkin server locally.

Port?
Port: 9411

How to run Server?
gradlew bootRun

How to access Zipkin UI in browser
http://localhost:9411


#serviceC
ServiceC exposed Rest API

Port?
Port: 8097

How to run Server?
gradlew bootRun

API URL
http://localhost:8097/messages


#serviceB
ServiceB exposed Rest API

Port?
Port: 8096

How to run Server?
gradlew bootRun

API URL
http://localhost:8096/messages


#serviceA
ServiceA exposed Rest API

Port?
Port: 8097

How to run Server?
gradlew bootRun

API URL
http://localhost:8095/messages


Once each service is up and running, try to find trace using zipkin UI