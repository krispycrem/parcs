all: run

clean:
	rm -f out/Inference.jar out/Compute.jar

out/Inference.jar: out/project2.jar ../src/Inference.java
	@javac -cp out/project2.jar src/Inference.java
	@jar cf out/Inference.jar -C src Inference.class -C src
	@rm -f src/Inference.class

out/Compute.jar: out/project2.jar ../src/Compute.java
	@javac -cp out/project2.jar src/Compute.java
	@jar cf out/Compute.jar -C src Compute.class -C src
	@rm -f src/Compute.class

build: out/Inference.jar out/Compute.jar

run: out/Inference.jar out/Compute.jar
	@cd out && java -cp 'project2.jar:Inference.jar' Inference
