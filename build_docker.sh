#!/bin/bash

echo "Building java code"
mvn clean package -DskipTests

echo "Removing old docker image"
java_container_id=$(docker ps -aqf "name=^my-test-java$")
echo java_container_id=$java_container_id
docker stop $java_container_id || true
docker rm  $java_container_id || true
docker rmi my-test-java || true

rm -rf docker/target || true
mkdir -p docker/target || true
cp -r target docker/

echo "Building docker image"
cd docker
docker build . -t my-test-java
