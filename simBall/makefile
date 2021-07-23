CC = javac

compile:
	@echo "compiling..." 
	${CC} src/main/Main.java

run:
	@echo "Execution "
	${CC} src/main/Main.java && java src.main.Main

jarmake:
	@echo "Creating jar"
	jar cvmf manifest.txt simBall.jar ./src/main/*.class ./src/render/*.class


clean:
	@echo "Cleaning *.class files"
	find . -name "*.class" -type f -delete
