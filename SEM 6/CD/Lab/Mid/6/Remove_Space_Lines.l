%{
%}

%%

[\t ]* ;
[\n]+ fprintf(yyout, "\n");
[a-zA-Z.]+ fprintf(yyout, "%s ", yytext);

%%

int yywrap(){
	return 1;
}

int main(){
	extern FILE *yyout;
	yyout = fopen("Store.txt","w");
	yylex();
	
	return 0;
}
