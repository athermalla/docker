# Get familarity with Docker Network


This app demonstrates how we can connect between:
* docker to www
* docker to Host Machine
* docker to docker


For each case i have build 3 endpoints

* docker to www

        http://localhost:8081/getUsers
        internally this endpoint communicated to https://dummyjson.com/users/1
        and json is returned, demonstrating successfull connect btw docker to www
        docker to www comes out of the box, we dont need any special configuration for this.
  * docker to Host Machine
  
            To demonstrate this i will try to start the same app in docker container and localhost
            and will call the local host app from docker container app
            http://localhost:8081/greetLocalHost 8081 is docker app port which internally calls our 

             @GetMapping("/")
            public String greet() {
            return "hello this is running from Docker";
            }
            app hosted on Hostmachine

            but instead of using **localhost** in docker contianer we have to use **host.docker.internal**
  
* docker to docker 
            we can take the Example1 as our example
        
  
        

  