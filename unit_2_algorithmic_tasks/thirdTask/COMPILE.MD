### Run compile ###
`$ javac -sourcepath ./src -d build/classes src/com.home/Main.java`
### To jar file ###
`$ jar cfm build/jar/HelloWorld.jar MANIFEST.MF -C build/classes/ .`
### Run jar ###
`$ java -jar build/jar/HelloWorld.jar`
### Run clean ###
`$ rm -rf build`