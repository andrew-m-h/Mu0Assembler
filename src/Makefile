ANTLR4=java -Xmx500M -cp antlr-4.5-complete.jar org.antlr.v4.Tool

all: Mu0.g4
	$(ANTLR4) Mu0.g4

clean:
	rm *.tokens
	rm Mu0*.java
