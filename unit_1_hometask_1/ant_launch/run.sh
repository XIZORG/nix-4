#!/bin/bash

export PLATFORM_HOME
PLATFORM_HOME=$(pwd)
export ANT_OPTS="-Xmx2g -Dfile.encoding=UTF-8"
export ANT_HOME="$PLATFORM_HOME/apache-ant"
chmod +x "$ANT_HOME/bin/ant"
chmod +x "$PLATFORM_HOME/license.sh"
case "$PATH" in
    *$ANT_HOME/bin:*) ;;
    *) export PATH=$ANT_HOME/bin:$PATH ;;
esac

ant -version
echo "ant home: ${ANT_HOME}"
echo "ant opts: ${ANT_OPTS}"

ant compile
ant jar
ant run
