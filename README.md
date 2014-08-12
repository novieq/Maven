Maven
=====

This repository contains code written while reading Maven by example

	*Run the code : mvn exec:java -Dexec.mainClass=com.novieq.learning.Main
	*mvn exec:java -Dexec.mainClass=com.novieq.learning.Main -Dexec.args="70112"
	*mvn help:describe -Dplugin=exec -Dfull
	*mvn test
	*mvn test -Dmaven.test.failure.ignore=true
	*mvn install -Dmaven.test.skip=true
	*mvn install assembly:assembly #After adding the maven assembly plugin
	*java -cp Maven-1.0-jar-with-dependencies.jar com.novieq.learning.Main 10002
