%{
%}

%%
"<"[^>]*> {fprintf(yyout, "%s\n", yytext);}
. ;
\n ;
%%

int yywrap(){
	return 1;
}

int main(){
	extern FILE *yyout;
	yyout = fopen("Tags.txt","w");
	yylex();
	
	return 0;
}
