## Learning working with Volumnes

This is node js app for demonstrating working with Volumes

1. `docker build -t feedback_node:v1 . `Based on the Dockerfile we build the image
2. `docker run -p 9000:80 -d --name feedback_app --rm feedback_node:v1`  Run container and remove it on stopping it

EndPoints:
   1. http://localhost:9000  : tile=> filename , stores a file named {filename}.txt with data we give  in feedback folder.
   2. http://localhost:9000/feedback/{filename}.txt , retrieves text from inside file from feedback folder.

### Problem
Basically we store all the these files on contianer(linux) file sys, which when containers are stopped and removed, those files are lost,
We are basically unable to persist the Data. 
### Solution : Volumes

Volumes :

        Volumes are folders on our host machine hard drive which are mounted ("made available", "mapped") into containers.
        Volumes persist if the containers are shutdown.
        Containers can read and write from volumes.
    
        Volumes are 2 types: 
        1. Anonymous : Tightly linked to a container, deletes on container delete.
        2. Named : isnt linked to any specfic container, can be linked and delinked.

` docker run -d -p 9000:80 --rm --name feedback_app -v feedback:/app/feedback feedback_node:v1`
` docker volume ls`

    Now you just start piling up a bunch of unused anonymous volumes - you can clear them via docker volume rm VOL_NAME or docker volume prune

## Bind Mounts

`docker run -d -p 9000:80 --rm --name feedback_app -v feedback:/app/feedback -v "F:\CODE\docker\Example3-Volumes:/app" feedback_node:v1`