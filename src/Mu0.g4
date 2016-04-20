grammar Mu0;

LDA: 'LDA';
STO: 'STO';
ADD: 'ADD';
SUB: 'SUB';
JMP: 'JMP';
JGE: 'JGE';
JNE: 'JNE';
STP: 'STP';

MEM: 'mem';

fragment DIGIT : '0'..'9';
NUMBER : DIGIT+;

PLUS     : '+' ;
MINUS    : '-' ;

fragment LOWER : 'a'..'z';
fragment UPPER : 'A'..'Z';
LABEL : (UPPER | LOWER)+;
LABLEVAR : '[' (UPPER | LOWER)+ ']';

WS : ( '\t' | ' ')+ -> skip ;
NL : ('\n' | '\r' | '\u000C') -> skip;
//Parser Rules

expr
   : expr PLUS expr
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
    | MEM LABEL ':' '{' (NUMBER ',')* NUMBER '}';

/*
instruction
    : (LABEL ':')? LDA (NUMBER | LABLEVAR)
    | (LABEL ':')? STO (NUMBER | LABLEVAR)
    | (LABEL ':')? ADD (NUMBER | LABLEVAR)
    | (LABEL ':')? SUB (NUMBER | LABLEVAR)
    | (LABEL ':')? JMP (NUMBER | LABLEVAR)
    | (LABEL ':')? JGE (NUMBER | LABLEVAR)
    | (LABEL ':')? JNE (NUMBER | LABLEVAR)
    | (LABEL ':')? STP
    | MEM LABEL ':' '{' (NUMBER ',')* NUMBER '}';
*/
program : instruction+;