%{
%}

%%
\/\/.* ;
\/\*(.*\n)*.*\*\/ ;
%%

int yywrap(){
	return 1;
}

int main(){

	extern FILE *yyout;
	yyout = fopen("comment.txt","w");
	yylex();
	
	return 0;
}

