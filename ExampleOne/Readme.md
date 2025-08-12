# Get familarity with Docker

### Reference Documentation
This app has 3 containers
* Java corretto + Springboot app
* PostgreSql
* PGadmin for postgreSql, uncomment in docker-compose file to enable it

### build the java code in any IDE at root folder, 
`mvn clean install` , after the jar is created.
`docker-compose up`
#### There are two endpoints i can try after app successfully launches, port: 8081 , http://localhost:8081/

    @GetMapping("/")
    public String greet() {
    return "hello this is running from Docker";
        }

    @GetMapping("/getStudents")
    public List<Student> getStudents() {

        return sr.findAll();


    }