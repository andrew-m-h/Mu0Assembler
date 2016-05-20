# Mu0 Assembler

##### By Andrew M. Hall

### Overview
This project has been inspired by the anu course ENGN 3213 and attempts to alleviate the annoyance of
writing hex Mu0 assembly and laying out memory by hand. This assembler has syntax for creating 'labels' and defining 
blocks of memory to be distributed throughout the program by the assembler.

### Syntax
The assembler requires that Mu0 instructions be capitalised. Memory blocks can be defined with the 'mem' keyword along
with an array of data to put there. To get the address of such a mem block, its identifier must be placed in sqare brackets.
e.g.
mem Nums : {1, 2, 3, 4}
LDA [Nums] //load 1 into accumumlator
defines 4 16bit words to be placed at the end of memory, [Nums] then references the first element.

### Design
The parser is done using Antlr4, a brilliant parser generator for which this is a project designed to teach its basic usage.