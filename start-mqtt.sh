#!/bin/zsh
docker run -it -p 1883:1883 -p 9001:9001 -d --name mosquitto eclipse-mosquitto:1.6.12
