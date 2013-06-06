# Aerogear SimplePush Server
This project is a Java implementation of the server side that follows the [SimplePush Protocol](https://wiki.mozilla.org/WebAPI/SimplePush/Protocol)

It consists of the following modules:  

* [protocol](https://github.com/danbev/aerogear-simplepush-server/tree/master/protocol)  
The SimplePush Server Protocol.

* [server-api](https://github.com/danbev/aerogear-simplepush-server/tree/master/server-api)  
An API for the SimplePush Server

* [server-core](https://github.com/danbev/aerogear-simplepush-server/tree/master/server-core)  
An implementation of the server-api.

* [server-netty](https://github.com/danbev/aerogear-simplepush-server/tree/master/server-netty)  
The SimplePush Server implementation that uses Netty.

* [server-vertx](https://github.com/danbev/aerogear-simplepush-server/tree/master/server-vertx)  
The SimplePush Server implementation that uses vert.x.

* [wildfly-module](https://github.com/danbev/aerogear-simplepush-server/tree/master/wildfly-module)  
A WildFly/AS7 module for the SimplePush Server.

Please refer to the above modules documentation for more information.

## Troubleshooting

If the tests are failing with ``OutOfMemoryException`` on your machine, you need to increase number of processes per user limit.
This can be done via:

    ulimit -u 8196
