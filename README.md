#Welcome to Service based app using Java and Spring!
============
This app holds three separate project: A service, a implementation of the service, and the web app using the service as the dependency.

document structure
-------------

-- Simple-SOA-Example

-------- Simple-SOA-Example\ IRandom Service 

    ---------------- a java service (interface) that is exposed to the outside
    
-------- Simple-SOA-Example\RandomImpl

    ---------------- the implementation of the service
    
-------- Simple-SOA-Example\RandomService WebApp

    ---------------- a simple spring mvc web app that makes use of spring DI to inject 
    
    ---------------- the implementation to the appropriate class in this case IRandom.
    

## implementation walkthrough

This app makes use of a service oriented architecture (SOA) where the end points are not REST endpoints but rather use plain java interfaces. 
There is something else in the pipeline that i will be working on that will take use of HTTP protocol in paticullary Jersey which is the implementation of the JAX-RS.
