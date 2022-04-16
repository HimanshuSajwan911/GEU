%{
%}

DIGIT [0-9]

%%
{DIGIT}* {ECHO;printf(" Integer\n");}
{DIGIT}*?\.{DIGIT}* {ECHO;printf(" Float\n");}
%%

int yywrap(){
	return 1;
}

int main(){

	yylex();

	return 0;
}
