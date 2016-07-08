#!/bin/bash          
echo Running Servers
cd back
(mvn spring-boot:run)&
cd ..
cd front
npm start  