%{
	int count = 0;
%}

op [+-*/]
letter [a-zA-Z]
digitt [0-9]
id {letter}*|({letter}{digitt})+
notid ({digitt}+{letter}*)+

%%
[\t\n]+
("int")|("float")|("char")|("case")|("default")|("if")|("for")|("printf")|("scanf") {printf("%s is a keyword\n\n", yytext);}
{id} {printf("%s is an identifier\n\n", yytext); count++;}
{notid} {printf("%s is not an identifier\n\n", yytext);}
%%

int yywrap(){
	return 1;
}

int main(){

	yylex();
	
	printf("Total Identifiers: %d\n", count);
	
	return 0;
}
