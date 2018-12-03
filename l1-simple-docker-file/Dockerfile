# Comment starts with #

FROM ubuntu:latest
MAINTAINER sangdn	"sang_example_email@gmail.com"
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
WORKDIR /home
ADD HelloWorld.java /home/HelloWorld.java
RUN javac HelloWorld.java
CMD java HelloWorld



