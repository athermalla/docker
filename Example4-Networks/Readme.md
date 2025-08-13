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
* 

    @GetMapping("/")
    public String greet() {
    return "hello this is running from Docker";
        }

    @GetMapping("/getStudents")
    public List<Student> getStudents() {

        return sr.findAll();


    }