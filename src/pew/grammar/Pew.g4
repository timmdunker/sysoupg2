grammar Pew;

program
: code
| EOF
;

code
: statement code
| statement
| EOF
;

statement
: declaration
| assignment
| print
| loop
;

declaration
: 'var' ID
;

assignment
: ID '=' expression
;

loop
: 'loop' expression 'times' code 'end'
;

print
: 'print' expression
;

expression
: atomicExpression
| addExpression
;

atomicExpression
: ID
| INT
;

addExpression
: atomicExpression '+' expression
;

ID:	('a'..'z')+ ;
INT:	('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;