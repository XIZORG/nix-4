#!/bin/bash

javac -sourcepath ./src -d build/classes src/com.home/Main.java
mkdir build/jar
jar cfm build/jar/HelloWorld.jar MANIFEST.MF -C build/classes/ .
java -jar build/jar/HelloWorld.jar
