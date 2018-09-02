# samples

GIT regular commands :
git clone <repo-name>
git add . 
git commit -m "<comment>"
git push origin master 

DOCKER regular commands :
docker images
docker ps -a

docker run <image-Id>
docker container stop <container-name>

docker rm <container-id>
docker rmi <image-id>

docker-compose up 
Note:- Use docker-compose.yml file if there are multiple services in action or you wanted to automate the process. 
Note:- to create image with script , create Dockerfile and with neccessary info and then 
from docker-machine run following comment with tag 
ex:- docker build -t /tulasiprasd/ubuntu:v1 .
