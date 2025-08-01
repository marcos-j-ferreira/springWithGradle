
#!/bin/bash

set -e

curl https://start.spring.io/starter.zip   -d dependencies=web,devtools   -d type=gradle-project   -d language=java   -d name=springwithgradle   -d groupId=com.marcos   -d artifactId=springwithgradle   -d packageName=com.marcos.springwithgradle   -d javaVersion=17   -o springwithgradle.zip

unzip springwithgradle.zip
cd springwithgradle

