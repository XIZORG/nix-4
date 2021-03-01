### Run compile ###
`$ javac -sourcepath ./src -d build/classes -cp ./libs/lanterna-3.0.4.jar:./libs/commons-lang3-3.11.jar src/com.home/another_classes/Third.java src/com.home/another_classes/Second.java  src/com.home/Main.java`
### Run program ###
`$ java -cp build/classes/:./libs/lanterna-3.0.4.jar:./libs/commons-lang3-3.11.jar:. com.home.Main`
### To jar file ###
jar cfm build/jar/HelloWorld.jar MANIFEST.MF -C build/classes/ .
### Run jar ###
