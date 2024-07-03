# JavaDockerTemplate

This is a Java Docker Template.  
The java user in the container is bound on uid and gid of a local machine user.  
It's to specified in `.env` file.  
Also, this directory bind to volumes.  

Base Images:

- <https://hub.docker.com/_/openjdk>

## How to use

```sh
cp .env.sample .env
# Specify your environments
vi .env
docker-compose build
docker-compose up -d
docker-compose exec java sh
./java.sh part1/Array.java
cd part2
../java.sh Polymorphism.java
./java.sh part3/StreamAPI.java
docker-compose down
```
