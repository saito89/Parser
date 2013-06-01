package parser;
import static analizlexico.Token.*;
import analizlexico.Token;
import java_cup.runtime.Symbol;

%%
%class Lexer
%type Token
%line
%unicode
%column
%cup
%type java_cup.runtime.Symbol


Letra=[a-zA-Z_]
LetraHexadecimal=[a-fA-F]
Digito=[0-9]
DigitoOctal=[0-7]
WHITE=[ \t\r\n]
%{
public String lexeme;
public int lineaCodigo;
private Symbol symbol(int type) 
{
    return new Symbol(type, yyline, yycolumn);
}
private Symbol symbol(int type, Object value) 
{
    return new Symbol(type, yyline, yycolumn, value);
}
%}
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]
/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent = ( [^*] | \*+ [^/*] )*
String = \"([^\\\"]|\\.)*\"
%%
{WHITE} {/* ignore */}
"//".* {/* ignore */}
"/*" .* ({WHITE}) .* "*/" {lexeme=yytext(); return symbol(sym.BLOQUE_COMENTARIO,new String("BLOQUE_COMENTARIO"));}
/* Palabras Reservadas */
"auto" {lineaCodigo = yyline; return symbol(sym.Auto,new String("AUTO"));}
"break" {lineaCodigo = yyline; return symbol(sym.Break,new String("BREAK"));}
"case" {lineaCodigo = yyline; return symbol(sym.Case,new String("CASE"));}
"char" {lineaCodigo = yyline; return symbol(sym.Char,new String("CHAR"));}
"const" {lineaCodigo = yyline; return symbol(sym.Const,new String("CONST"));}
"continue" {lineaCodigo = yyline; return symbol(sym.Continue,new String("CONTINUE"));}
"default" {lineaCodigo = yyline;return symbol(sym.Default,new String("DEFAULT"));}
"do" {lineaCodigo = yyline; return symbol(sym.Do,new String("DO"));}
"double" {lineaCodigo = yyline; return symbol(sym.Double,new String("DOUBLE"));}
"else" {lineaCodigo = yyline; return symbol(sym.Else,new String("ELSE"));}
"enum" {lineaCodigo = yyline; return symbol(sym.Enum,new String("ENUM"));}
"extern" {lineaCodigo = yyline; return symbol(sym.Extern,new String("EXTERN"));}
"float" {lineaCodigo = yyline; return symbol(sym.Float,new String("FLOAT"));}
"for" {lineaCodigo = yyline; return symbol(sym.For,new String("FOR"));}
"goto" {lineaCodigo = yyline; return symbol(sym.Goto,new String("GOTO"));}
"if" {lineaCodigo = yyline; return symbol(sym.If,new String("IF"));}
"int" {lineaCodigo = yyline; return symbol(sym.Int,new String("INT"));}
"long" {lineaCodigo = yyline; return symbol(sym.Long,new String("LONG"));}
"register" {lineaCodigo = yyline; return symbol(sym.Register,new String("REGISTER"));}
"return" {lineaCodigo = yyline; return symbol(sym.Return,new String("RETURN"));}
"short" {lineaCodigo = yyline; return symbol(sym.Short,new String("SHORT"));}
"signed" {lineaCodigo = yyline; return symbol(sym.Signed,new String("SIGNED"));}
"sizeof" {lineaCodigo = yyline; return symbol(sym.Sizeof,new String("SIZEOF"));}
"static" {lineaCodigo = yyline; return symbol(sym.Static,new String("STATIC"));}
"string" {lineaCodigo = yyline; return symbol(sym.ReservadaString,new String("RESERVADASTRING"));}
"struct" {lineaCodigo = yyline; return symbol(sym.Struct,new String("STRUCT"));}
"switch" {lineaCodigo = yyline; return symbol(sym.Switch,new String("SWITCH"));}
"typedef" {lineaCodigo = yyline; return symbol(sym.Typedef,new String("TYPEDEF"));}
"union" {lineaCodigo = yyline; return symbol(sym.Union,new String("UNION"));}
"unsigned" {lineaCodigo = yyline; return symbol(sym.Unsigned,new String("UNSIGNED"));}
"void" {lineaCodigo = yyline; return symbol(sym.Void,new String("VOID"));}
"volatile" {lineaCodigo = yyline; return symbol(sym.Volatile,new String("VOLATILE"));}
"while" {lineaCodigo = yyline; return symbol(sym.While,new String("WHILE"));}
/* Palabras Reservadas */
/* Operadores */
"++" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ARITMETICO_INCREMENTO,new String("OPERADOR_ARITMETICO_INCREMENTO"));}
"--" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ARITMETICO_DECREMENTO,new String("OPERADOR_ARITMETICO_DECREMENTO"));}
"=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ARITMETICO_IGUAL,new String("OPERADOR_ARITMETICO_IGUAL"));}
"+" {lineaCodigo = yyline; return symbol(sym.PLUS,new String("PLUS"));}
"-" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ARITMETICO_RESTA,new String("OPERADOR_ARITMETICO_RESTA"));}
"*" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ARITMETICO_MULTIPLICACION,new String("OPERADOR_ARITMETICO_MULTIPLICACION"));}
"/" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ARITMETICO_DIVISION,new String("OPERADOR_ARITMETICO_DIVISION"));}
"%" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ARITMETICO_MODULO,new String("OPERADOR_ARTMETICO_MODULO"));}
"==" {lineaCodigo = yyline; return symbol(sym.OPERADOR_COMPARACION_Y_RELACION_IGUAL,new String("OPERADOR_COMPARACION_Y_RELACION_IGUAL"));}
"<=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_COMPARACION_Y_RELACION_MAYOR_IGUAL,new String("OPERADOR_COMPARACION_Y_RELACION_IGUAL"));}
"<" {lineaCodigo = yyline; return symbol(sym.OPERADOR_COMPARACION_Y_RELACION_MAYOR,new String("OPERADOR_COMPARACION_Y_RELACION_MAYOR"));}
">=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_COMPARACION_Y_RELACION_MENOR_IGUAL,new String("OPERACION_COMPARACION_Y_RELACION_MENOR_IGUAL"));}
">" {lineaCodigo = yyline; return symbol(sym.OPERADOR_COMPARACION_Y_RELACION_MENOR,new String("OPERADOR_COMPARACION_Y_RELACION_MENOR"));}
"!=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_COMPARACION_Y_RELACION_DIFERENTE,new String("OPERADOR_COMPARACION_Y_RELACION_DIFERENTE"));}
"||" {lineaCodigo = yyline; return symbol(sym.OPERADOR_LOGICO_OR,new String("OPERADOR_LOGICO_OR"));}
"&&" {lineaCodigo = yyline; return symbol(sym.OPERADOR_LOGICO_AND,new String("OPERADOR_LOGICO_AND"));}
"!" {lineaCodigo = yyline; return symbol(sym.OPERADOR_LOGICO_NOT,new String("OPERADOR_LOGICO_NOT"));}
"&" {lineaCodigo = yyline; return symbol(sym.OPERADOR_BITWISE_AND_BINARIO,new String("OPERADOR_BITWISE_AND_BINARIO"));}
"^" {lineaCodigo = yyline; return symbol(sym.OPERADOR_BITWISE_XOR_BINARIO,new String("OPERADOR_BITWISE_XOR_BINARIO"));}
"|" {lineaCodigo = yyline; return symbol(sym.OPERADOR_BITWISE_OR_BINARIO,new String("OPERADOR_BITWISE_OR_BINARIO"));}
">>" {lineaCodigo = yyline; return symbol(sym.OPERADOR_BITWISE_DESPLAZAMIENTO_DERECHA,new String("OPERADOR_BITWISE_DESPLAZAMIENTO_DERECHA"));}
"<<" {lineaCodigo = yyline; return symbol(sym.OPERADOR_BITWISE_DESPLAZAMIENTO_IZQUIERDA,new String("OPERADOR_BITWEISE_DESPLAZAMIENTO_IZQUIERDA"));}
"~" {lineaCodigo = yyline; return symbol(sym.OPERADOR_BITWISE_COMPLEMENTO_A_UNO,new String("OPERADOR_BITWISE_COMPLEMENTO_A_UNO"));} 
"+=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_SUMA,new String("Operador_ASIGNACION_CON_SUMA"));}
"-=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_RESTA,new String("OPERADOR_ASIGNACION_CON_RESTA"));}
"*=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_MULTIPLICACION,new String("OPERADOR_ASIGNACION_CON_MULTIPLICACION"));}
"/=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_DIVISION,new String("OPERADOR_ASIGNACION_CON_DIVISION"));}
"%=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_MODULO,new String("OPERADOR_ASIGNACION_CON_MODULO"));}
"&=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_AND_BINARIO,new String("OPERADOR_ASIGNACION_CON_AND_BINARIO"));}
"^=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_XOR_BINARIO,new String("OPERADOR_ASIGNACION_CON_XOR_BINARIO"));}
"|=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_OR_BINARIO,new String("OPERADOR_ASIGNACION_CON_OR_BINARIO"));}
"<<=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_DESPLAZAMIENTO_IZQUIERDA,new String("OPERADOR_ASIGNACION_CON_DESPLAZAMIENTO_IZQUIERDA"));}
">>=" {lineaCodigo = yyline; return symbol(sym.OPERADOR_ASIGNACION_CON_DESPLAZAMIENTO_DERECHA,new String("OPERADOR_ASIGNACION_CON_DESPLAZIMIENTO_DERECHA"));}
"(" {lineaCodigo = yyline; return symbol(sym.OPERADOR_PARENTESIS_ABRE,new String("OPERADOR_PARENTESIS_ABRE"));}
")" {lineaCodigo = yyline; return symbol(sym.OPERADOR_PARENTESIS_CIERRA,new String("OPERADOR_PARENTESIS_CIERRA"));}
"[" {lineaCodigo = yyline; return symbol(sym.OPERADOR_PARENTESIS_CUADRADO_ABRE,new String("OPERADOR_PARENTESIS_CUADRADO_ABRE"));}
"]" {lineaCodigo = yyline; return symbol(sym.OPERADOR_PARENTESIS_CUADRADO_CIERRA,new String("OPERADOR_PARENTESIS_CUADRADO_CIERRA"));}
"{" {lineaCodigo = yyline; return symbol(sym.OPERADOR_LLAVE_ABRE,new String("OPERADOR_LLAVE_ABRE"));}
"}" {lineaCodigo = yyline; return symbol(sym.OPERADOR_LLAVE_CIERRA,new String("OPERADOR_LLAVE_CIERRA"));}
"," {lineaCodigo = yyline; return symbol(sym.OPERADOR_OTRO_COMA,new String("OPERADOR_OTRO_COMA"));}
";" {lineaCodigo = yyline; return symbol(sym.OPERADOR_OTRO_PUNTO_Y_COMA,new String("OPERADOR_OTRA_PUNTO_Y_COMA"));}
"?" {lineaCodigo = yyline; return symbol(sym.OPERADOR_OTRO_PREGUNTA,new String("OPERADOR_OTRO_PREGUNTA"));}
":" {lineaCodigo = yyline; return symbol(sym.OPERADOR_OTRO_DOS_PUNTOS,new String("OPERADOR_OTRO_DOS_PUNTOS"));}
"." {lineaCodigo = yyline; return symbol(sym.OPERADOR_MIEMBRO_PUNTERO,new String("OPERADOR_MIEMBRO_PUNTERO"));}
"->" {lineaCodigo = yyline; return symbol(sym.OPERADOR_MIEMBRO_PUNTERO_FLECHA,new String("OPERADOR_MIEMBRO_PUNTERO_FLECHA"));}
"'" {lineaCodigo = yyline; return symbol(sym.COMILLA_SIMPLE,new String("COMILLA_SIMPLE"));}
/* Operadores */
/*{Letra} {return symbol(sym.letra,new String("OPERADOR_PARENTESIS_"));}*/
{String} {lexeme=yytext(); lineaCodigo = yyline; return symbol(sym.STRING,new String("STRING"));}
{Comment} { /* ignore */ }
{WhiteSpace} { /* ignore */ }
"0"{DigitoOctal}+ {lexeme=yytext(); lineaCodigo = yyline; return symbol(sym.NUMERO_OCTAL,new String("NUMERO_OCTAL"));}
{Letra}({Letra}|{Digito})* {lexeme=yytext(); return symbol(sym.IDENTIFICADOR,new String("IDENTIFICADOR"));}
"\"" ({Letra} | {Digito})* "\"" {lexeme=yytext(); lineaCodigo = yyline; return symbol(sym.STRING,new String("STRING"));}
[-+]?{Digito}+ {lexeme=yytext(); return symbol(sym.NUMERO_ENTERO,new String("NUMERO_ENTERO"));}
"'" ({Letra} | {Digito})* "'" {lexeme=yytext(); lineaCodigo = yyline; return symbol(sym.CARACTER,new String("CARACTER"));}
[-+]?{Digito}+ "." ({Digito} | {Digito})+ {lexeme=yytext(); lineaCodigo = yyline; return symbol(sym.NUMERO_FLOTANTE,new String("NUMERO_FLOTANTE"));}
"0""x"({LetraHexadecimal} | {Digito})+ ({LetraHexadecimal} | {Digito})* {lexeme=yytext(); lineaCodigo = yyline; return symbol(sym.NUMERO_HEXADECIMAL,new String("NUMERO_HEXADECIMAL"));}
. {return symbol(sym.ERROR, new String("ERROR"));}