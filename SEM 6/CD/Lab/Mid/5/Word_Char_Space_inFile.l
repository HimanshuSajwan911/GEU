%{
	int lines=0, words=0, spaces=0, total=0;
%}

%%
\n { lines++; total++;}
[a-zA-Z.]+ {words++; total++;}
" " {spaces++; total++;}
%%

int yywrap(){
	return 1;
}

int main(){

	extern FILE *yyin;
	yyin = fopen("Input.txt","r");
	yylex();
	printf("Lines : %d\nWords : %d\nSpaces: %d\nTotal : %d\n", lines, words, spaces, total);
	
	return 0;
}
