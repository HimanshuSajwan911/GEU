%{
	#include<stdio.h>
	#include<stdlib.h>
%}
%s A B C D E F G DEAD
%%

<INITIAL>b BEGIN INITIAL;
<INITIAL>a BEGIN A;
<INITIAL>[^ab\n] BEGIN DEAD;
<INITIAL>\n BEGIN INITIAL; {fprintf(yyout,"Not Accepted\n");}
<A>b BEGIN F;
<A>a BEGIN B;
<A>[^ab\n] BEGIN DEAD;
<A>\n BEGIN INITIAL; {fprintf(yyout,"Not Accepted\n");}
<B>b BEGIN D;
<B>a BEGIN C;
<B>[^ab\n] BEGIN DEAD;
<B>\n BEGIN INITIAL; {fprintf(yyout,"Not Accepted\n");}
<C>b BEGIN D;
<C>a BEGIN C;
<C>[^ab\n] BEGIN DEAD;
<C>\n BEGIN INITIAL; {fprintf(yyout,"Accepted\n");}
<D>b BEGIN G;
<D>a BEGIN E;
<D>[^ab\n] BEGIN DEAD;
<D>\n BEGIN INITIAL; {fprintf(yyout,"Accepted\n");}
<E>b BEGIN F;
<E>a BEGIN B;
<E>[^ab\n] BEGIN DEAD;
<E>\n BEGIN INITIAL; {fprintf(yyout,"Accepted\n");}
<F>b BEGIN G;
<F>a BEGIN E;
<F>[^ab\n] BEGIN DEAD;
<F>\n BEGIN INITIAL; {fprintf(yyout,"Not Accepted\n");}
<G>b BEGIN INITIAL;
<G>a BEGIN A;
<G>[^ab\n] BEGIN DEAD;
<G>\n BEGIN INITIAL; {fprintf(yyout,"Accepted\n");}
<DEAD>[^\n] BEGIN DEAD;
<DEAD>\n BEGIN INITIAL; {fprintf(yyout,"Invalid\n");}
%%

int yywrap(){
	return 1;
}
int main(){
	
	yylex();
	return 0;
}

