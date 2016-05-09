#!/bin/sh

clear
echo --------------------------------------------------------------------
echo Starting text-lookup-rest using $SPRING_PROFILE profile
echo --------------------------------------------------------------------
cd text-lookup-rest && mvn spring-boot:run