package parser;
import java_cup.runtime.*;

%%

%cup
%line
%column
%unicode
%class Lexer
%caseless
%ignorecase

%{
	Symbol newSym(int tokenId) 
	{
    	return new Symbol(tokenId, yyline, yycolumn);
	}

	Symbol newSym(int tokenId, Object value) 
	{
    	return new Symbol(tokenId, yyline, yycolumn, value);
	}


%}

letter          = [A-Za-z]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
other_id_char   = [_]
identifier      = {letter}({alphanumeric}|{other_id_char})*
integer         = {digit}+
scientificnotation = {integer}\.{integer} "E" ("-")? {integer}
real            =  {integer}\.{integer}

char            = "'" [^']* ~"'" | "#" {digit}+
leftbrace       = \{
rightbrace      = \}
leftparentheses = \(
rightparentheses = \)
star = \*
nonrightbrace   = [^}]
comment_body    = {nonrightbrace}*
comment         = {leftbrace}{comment_body}{rightbrace}
comment2_body = [^*]
blockcomment = {leftparentheses}{star}{comment2_body}{star}{rightparentheses} | {leftparentheses}{star}+ {comment2_body}* {star}+ {rightparentheses}
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

sequencecomment = "//" {InputCharacter}* {LineTerminator}*

whitespace      = [ \n\t|\r|\n|\r\n|\t\f]

%%

{comment}       { /* For this stand-alone lexer, print out comments. */ }
{sequencecomment}       { /* Ignore sequence comments. */ }
{blockcomment}       { /* ignore comment blocks */ }

"and"             { return newSym(sym.AND,yytext()); }
"array"           { return newSym(sym.ARRAY,yytext()); }
"begin"           { return newSym(sym.BEGIN,yytext()); }
"else"            { return newSym(sym.ELSE,yytext()); }
"end"             { return newSym(sym.END,yytext()); }
"if"              { return newSym(sym.IF,yytext()); }
"of"              { return newSym(sym.OF,yytext()); }
"or"              { return newSym(sym.OR,yytext()); }
"program"         { return newSym(sym.PROGRAM,yytext()); }
"procedure"       { return newSym(sym.PROCEDURE,yytext()); }
"then"            { return newSym(sym.THEN,yytext()); }
"type"            { return newSym(sym.TYPE,yytext()); }
"var"             { return newSym(sym.VAR,yytext()); }
"boolean"         { return newSym (sym.BOOLEAN,yytext()); }
"byte"            { return newSym (sym.BYTE,yytext()); }
"case"            { return newSym (sym.CASE,yytext()); }
"char"            { return newSym (sym.CHAR,yytext()); }
"const"           { return newSym (sym.CONST,yytext()); }
"div"             { return newSym (sym.DIV,yytext()); }
"do"              { return newSym (sym.DO,yytext()); }
"downto"          { return newSym (sym.DOWNTO,yytext()); }
"false"           { return newSym (sym.FALSE,yytext()); }
"file"            { return newSym (sym.FILE,yytext()); }
"for"             { return newSym (sym.FOR,yytext()); }
"forward"         { return newSym (sym.FORWARD,yytext()); }
"function"        { return newSym (sym.FUNCTION,yytext()); }
"goto"            { return newSym (sym.GOTO,yytext()); }
"in"              { return newSym (sym.IN,yytext()); }
"inline"          { return newSym (sym.INLINE,yytext()); }
"int"             { return newSym (sym.INT,yytext()); }
"label"           { return newSym (sym.LABEL,yytext()); }
"longint"          { return newSym (sym.LONGINT,yytext()); }
"mod"             { return newSym (sym.MOD,yytext()); }
"nil"             { return newSym (sym.NIL,yytext()); }
"not"             { return newSym (sym.NOT,yytext()); }
"packed"          { return newSym (sym.PACKED,yytext()); }
"read"            { return newSym (sym.READ ,yytext()); }
"real"            { return newSym (sym.REAL ,yytext()); }
"record"          { return newSym (sym.RECORD ,yytext()); }
"repeat"          { return newSym (sym.REPEAT,yytext()); }
"set"             { return newSym (sym.SET ,yytext()); }
"shortint"        { return newSym (sym.SHORTINT ,yytext()); }
"string"          { return newSym (sym.STRING,yytext()); }
"to"              { return newSym (sym.TO ,yytext()); }
"true"            { return newSym (sym.TRUE,yytext()); }
"until"           { return newSym (sym.UNTIL ,yytext()); }
"while"           { return newSym (sym.WHILE ,yytext()); }
"write"           { return newSym (sym.WRITE ,yytext()); }
"xor"             { return newSym (sym.XOR ,yytext()); }
"*"             { return newSym(sym.OPERADOR_ARITMETICO_MULTIPLICACION,yytext()); }
"+"             { return newSym(sym.OPERADOR_ARITMETICO_SUMA,yytext()); }
"-"             { return newSym(sym.OPERADOR_ARITMETICO_RESTA,yytext()); }
"/"             { return newSym(sym.OPERADOR_ARITMETICO_DIVISION,yytext()); }
";"             { return newSym(sym.OPERADOR_OTRO_PUNTO_Y_COMA,yytext()); }
","             { return newSym(sym.OPERADOR_OTRO_COMA,yytext()); }
"("             { return newSym(sym.OPERADOR_PARENTESIS_ABRE,yytext()); }
")"             { return newSym(sym.OPERADOR_PARENTESIS_CIERRA,yytext()); }
"["             { return newSym(sym.OPERADOR_PARENTESIS_CUADRADO_ABRE,yytext()); }
"]"             { return newSym(sym.OPERADOR_PARENTESIS_CUADRADO_CIERRA,yytext()); }
"="             { return newSym(sym.OPERADOR_ARITMETICO_IGUAL,yytext()); }
"<"             { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MENOR,yytext()); }
">"             { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MAYOR,yytext()); }
"<="            { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MENOR_IGUAL_EQ,yytext()); }
">="            { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MAYOR_IGUAL,yytext()); }
"++"            { return newSym(sym.OPERADOR_ARITMETICO_INCREMENTAR,yytext()); }
"--"            { return newSym(sym.OPERADOR_ARITMETICO_DECREMENTAR,yytext()); }
":"             { return newSym(sym.OPERADOR_OTRO_DOS_PUNTOS,yytext()); }
":="            { return newSym(sym.OPERADOR_OTRO_ASSIGNMENT,yytext()); }
"."             { return newSym(sym.OPERADOR_MIEMBRO_PUNTERO,yytext()); }
"<>"             { return newSym(sym.OPERADOR_COMPARACION_DIFERENTE,yytext()); }
"+="             { return newSym(sym.OPERADOR_ARITMETICO_INCREMENTAR_IGUAL,yytext()); }
"-="             { return newSym(sym.OPERADOR_ARITMETICO_DECREMENTAR_IGUAL,yytext()); }
"*="             { return newSym(sym.OPERADOR_ARITMETICO_MULTIPLICAR_IGUAL,yytext()); }
"/="             { return newSym(sym.OPERADOR_ARITMETICO_DIVIDIR_IGUAL,yytext()); }
">>"             { return newSym(sym.OPERADOR_ASIGNAR_DERECHA,yytext()); }
"<<"             { return newSym(sym.OPERADOR_ASIGNAR_IZQUIERDA,yytext()); }
"<<="             { return newSym(sym.OPERADOR_ASIGNAR_IZQUIERDA_IGUAL,yytext()); }
">>="             { return newSym(sym.OPERADOR_ASIGNAR_DERECHA_IGUAL,yytext()); }

{identifier}    { return newSym(sym.IDENTIFICADOR,yytext()); }
{real}          { return newSym (sym.NUMERO_FLOTANTE,yytext());}
{integer}       { return newSym(sym.NUMERO_ENTERO,yytext()); }
{scientificnotation} { return newSym(sym.NUMERO_FLOTANTE_CIENTIFICO,yytext()); }
{char}          { return newSym(sym.CARACTER,yytext()); }

{whitespace}    { /* Ignore whitespace. */ }
.               { return newSym(sym.ERROR,yytext());}