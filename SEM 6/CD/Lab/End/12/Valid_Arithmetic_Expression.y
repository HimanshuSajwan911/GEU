%{
#include<stdio.h>
int yylex(void);
int yyerror(char* s);
int valid=1;
%}

%token num id op

%%
start : id '=' s ';'
s : id x
| num x
| '-' num x
| '(' s ')' x
;
x : op s
| '-' s
|
;
%%

int yyerror(char *s){
	valid = 0;
	printf("\nInvalid expression!\n");
	return 0;
}

int main(){
	printf("\nEnter the expression:\n");
	yyparse();
	if(valid != 0){
		printf("\nValid expression!\n");
	}
}
