all: run

clean:
	rm -f out/Solver.jar out/Inference.jar

out/Solver.jar: out/parcs.jar src/Solver.java
	@javac -cp out/parcs.jar src/Solver.java
	@jar cf out/Solver.jar -C src Solver.class
	@rm -f src/Solver.class

out/Inference.jar: out/parcs.jar src/Inference.java
	@javac -cp out/parcs.jar src/Inference.java
	@jar cf out/Inference.jar -C src Inference.class
	@rm -f src/Inference.class

build: out/Solver.jar out/Inference.jar

run: out/Solver.jar out/Inference.jar
	@cd out && java -cp 'parcs.jar:Solver.jar' Solver