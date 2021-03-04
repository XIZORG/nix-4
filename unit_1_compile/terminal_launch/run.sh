#!/bin/bash

javac -sourcepath ./src -d build/classes -cp ./libs/lanterna-3.0.4.jar:./libs/commons-lang3-3.11.jar src/com.home/another_classes/Third.java src/com.home/another_classes/Second.java  src/com.home/Main.java
mkdir build/jar
jar cfm build/jar/HelloWorld.jar MANIFEST.MF -C build/classes/ .
java -jar build/jar/HelloWorld.jar
