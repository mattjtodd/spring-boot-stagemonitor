#!/usr/bin/env bash

exec docker build -t mattjtodd/spring-boot-stagemonitor:$1 .
