grammar Mu0;

LDA: 'LDA';
STO: 'STO';
ADD: 'ADD';
SUB: 'SUB';
JMP: 'JMP';
JGE: 'JGE';
JNE: 'JNE';
STP: 'STP';

PRINT: 'PRINT'; //non standard IO operator

MEM: 'mem';

fragment DIGIT : '0'..'9';
NUMBER : DIGIT+;

PLUS     : '+' ;
MINUS    : '-' ;
TIMES    : '*' ;
DIVIDE   : '/' ;

fragment LOWER : 'a'..'z';
fragment UPPER : 'A'..'Z';
LABEL : (UPPER | LOWER)+;
LABLEVAR : '[' (UPPER | LOWER)+ ']';

WS : ( '\t' | ' ')+ -> skip ;
NL : ('\n' | '\r' | '\u000C') -> skip;
//Parser Rules

expr
   : expr TIMES expr
   | expr DIVIDE expr
   | expr PLUS expr
   | expr MINUS expr
   | LABLEVAR
   | NUMBER ;

instruction
    : (LABEL ':')? LDA expr
    | (LABEL ':')? STO expr
    | (LABEL ':')? ADD expr
    | (LABEL ':')? SUB expr
    | (LABEL ':')? JMP expr
    | (LABEL ':')? JGE expr
    | (LABEL ':')? JNE expr
    | (LABEL ':')? STP
    | (LABEL ':')? PRINT expr //IO
    | MEM LABEL ':' '{' (NUMBER ',')* NUMBER '}';

program : instruction+;