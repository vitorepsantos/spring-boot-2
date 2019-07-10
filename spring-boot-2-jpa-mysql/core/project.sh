#!/usr/bin/env bash

# build dev env
if  [[ "$1" == "-b" ]]; then
    mvn clean install
fi

# run dev env
if  [[ "$1" == "-r" ]]; then
    mvn spring-boot:run
fi