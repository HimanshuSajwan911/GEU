%{
	int ch = 0, bl = 0, ln = 0, tb = 0;
%}

%%
[\n] {ln++;}
[\t] {tb++;}
[" "] {bl++;}
. {ch++;}
%%

int yywrap(){
	return 1;
}
int main(){

	yylex();
	printf("\nLines: %d\n", ln);
	printf("Tab Space: %d\n", tb);
	printf("Blank Space: %d\n", bl);
	printf("Characters: %d\n", ch);
	
	return 0;

}
