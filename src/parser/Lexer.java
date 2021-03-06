/* The following code was generated by JFlex 1.4.3 on 03/06/13 10:12 PM */

package parser;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 03/06/13 10:12 PM from the specification file
 * <tt>C:/Users/Walter/Documents/NetBeansProjects/Parser/src/parser/pascalSaito.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\20\1\16\1\0\1\20\1\16\22\0\1\20\2\0\1\10"+
    "\3\0\1\7\1\13\1\14\1\15\1\47\1\51\1\6\1\4\1\17"+
    "\12\2\1\57\1\50\1\55\1\54\1\56\2\0\1\21\1\26\1\37"+
    "\1\23\1\5\1\33\1\27\1\42\1\30\1\1\1\45\1\31\1\36"+
    "\1\22\1\34\1\35\1\1\1\24\1\32\1\41\1\40\1\43\1\44"+
    "\1\46\1\25\1\1\1\52\1\0\1\53\1\0\1\3\1\0\1\21"+
    "\1\26\1\37\1\23\1\5\1\33\1\27\1\42\1\30\1\1\1\45"+
    "\1\31\1\36\1\22\1\34\1\35\1\1\1\24\1\32\1\41\1\40"+
    "\1\43\1\44\1\46\1\25\1\1\1\11\1\20\1\12\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\2\1\5\3\1"+
    "\1\6\1\7\1\10\1\11\1\12\23\2\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\0"+
    "\2\2\1\24\1\25\1\0\2\26\1\0\1\27\1\0"+
    "\1\30\1\31\1\32\5\2\1\33\5\2\1\34\1\35"+
    "\11\2\1\36\1\37\11\2\1\40\5\2\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\2\2\0\1\31\1\53\1\2\1\54\1\55\1\56"+
    "\11\2\1\57\2\2\1\60\4\2\1\61\3\2\1\62"+
    "\7\2\1\63\2\2\1\64\1\65\1\66\1\0\1\67"+
    "\1\0\1\70\2\2\1\71\1\72\3\2\1\73\1\2"+
    "\1\74\6\2\1\75\5\2\1\76\1\2\1\77\1\2"+
    "\1\100\1\101\1\102\2\2\1\103\1\0\1\70\1\104"+
    "\3\2\1\105\2\2\1\106\3\2\1\107\5\2\1\110"+
    "\1\111\1\112\1\113\1\114\1\115\1\116\1\2\1\117"+
    "\1\2\1\120\3\2\1\121\2\2\1\122\1\123\1\2"+
    "\1\124\1\2\1\125\1\2\1\126\1\127\1\2\1\130";

  private static int [] zzUnpackAction() {
    int [] result = new int[233];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\60\0\300\0\360\0\u0120"+
    "\0\u0150\0\u0180\0\u01b0\0\60\0\u01e0\0\60\0\u0210\0\u0240"+
    "\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0"+
    "\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540"+
    "\0\u0570\0\u05a0\0\u05d0\0\60\0\60\0\60\0\60\0\60"+
    "\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0\0\60\0\60"+
    "\0\u0120\0\60\0\u0150\0\u0180\0\60\0\u0720\0\60\0\u0750"+
    "\0\60\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0"+
    "\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\140\0\u09c0\0\u09f0"+
    "\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\140"+
    "\0\140\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0cf0\0\140\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0"+
    "\0\60\0\60\0\60\0\u0e10\0\60\0\60\0\u0e40\0\60"+
    "\0\u0e70\0\140\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\140\0\u0f60"+
    "\0\140\0\140\0\140\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050"+
    "\0\u1080\0\u10b0\0\u10e0\0\u1110\0\140\0\u1140\0\u1170\0\140"+
    "\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260\0\u1290\0\u12c0\0\u12f0"+
    "\0\140\0\u1320\0\u1350\0\u1380\0\u13b0\0\u13e0\0\u1410\0\u1440"+
    "\0\140\0\u1470\0\u14a0\0\140\0\60\0\60\0\u14d0\0\140"+
    "\0\u1500\0\u0ed0\0\u1530\0\u1560\0\140\0\140\0\u1590\0\u15c0"+
    "\0\u15f0\0\140\0\u1620\0\140\0\u1650\0\u1680\0\u16b0\0\u16e0"+
    "\0\u1710\0\u1740\0\140\0\u1770\0\u17a0\0\u17d0\0\u1800\0\u1830"+
    "\0\140\0\u1860\0\140\0\u1890\0\140\0\140\0\140\0\u18c0"+
    "\0\u18f0\0\u1920\0\u1920\0\60\0\140\0\u1950\0\u1980\0\u19b0"+
    "\0\140\0\u19e0\0\u1a10\0\140\0\u1a40\0\u1a70\0\u1aa0\0\140"+
    "\0\u1ad0\0\u1b00\0\u1b30\0\u1b60\0\u1b90\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\140\0\u1bc0\0\140\0\u1bf0\0\140"+
    "\0\u1c20\0\u1c50\0\u1c80\0\140\0\u1cb0\0\u1ce0\0\140\0\140"+
    "\0\u1d10\0\140\0\u1d40\0\140\0\u1d70\0\140\0\140\0\u1da0"+
    "\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[233];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\2\1\13\1\14\1\15\1\16\1\17"+
    "\1\16\1\20\1\21\1\22\1\23\1\3\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\3\1\40\1\41\1\3\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\61\0\3\3\1\0\1\3\13\0\26\3\13\0\1\4"+
    "\1\0\1\54\54\0\3\3\1\0\1\3\13\0\1\3"+
    "\1\55\6\3\1\56\15\3\17\0\1\57\45\0\1\60"+
    "\3\0\7\61\1\62\50\61\2\0\1\63\55\0\12\64"+
    "\1\65\45\64\15\0\1\66\116\0\1\67\22\0\1\70"+
    "\34\0\1\71\4\0\3\3\1\0\1\3\13\0\1\3"+
    "\1\72\1\3\1\73\22\3\12\0\3\3\1\0\1\3"+
    "\13\0\7\3\1\74\3\3\1\75\12\3\12\0\3\3"+
    "\1\0\1\3\13\0\7\3\1\76\3\3\1\77\12\3"+
    "\12\0\3\3\1\0\1\100\13\0\26\3\12\0\3\3"+
    "\1\0\1\101\13\0\4\3\1\102\6\3\1\103\12\3"+
    "\12\0\3\3\1\0\1\3\13\0\13\3\1\104\12\3"+
    "\12\0\3\3\1\0\1\3\13\0\1\3\1\105\10\3"+
    "\1\106\13\3\12\0\3\3\1\0\1\3\13\0\1\107"+
    "\12\3\1\110\12\3\12\0\3\3\1\0\1\111\13\0"+
    "\20\3\1\112\1\113\4\3\12\0\3\3\1\0\1\3"+
    "\13\0\1\114\6\3\1\115\3\3\1\116\3\3\1\117"+
    "\6\3\12\0\3\3\1\0\1\3\13\0\3\3\1\120"+
    "\6\3\1\121\13\3\12\0\3\3\1\0\1\3\13\0"+
    "\1\122\2\3\1\123\22\3\12\0\3\3\1\0\1\3"+
    "\13\0\13\3\1\124\12\3\12\0\3\3\1\0\1\3"+
    "\13\0\1\125\12\3\1\126\5\3\1\127\4\3\12\0"+
    "\3\3\1\0\1\3\13\0\1\3\1\130\24\3\12\0"+
    "\3\3\1\0\1\3\13\0\3\3\1\131\1\132\6\3"+
    "\1\133\5\3\1\134\4\3\12\0\3\3\1\0\1\3"+
    "\13\0\1\135\25\3\12\0\3\3\1\0\1\3\13\0"+
    "\3\3\1\136\15\3\1\137\4\3\12\0\3\3\1\0"+
    "\1\3\13\0\13\3\1\140\12\3\60\0\1\141\4\0"+
    "\1\142\57\0\1\143\1\144\1\145\55\0\1\146\1\0"+
    "\1\147\55\0\1\150\5\0\1\151\56\0\3\3\1\0"+
    "\1\3\13\0\2\3\1\152\23\3\12\0\3\3\1\0"+
    "\1\3\13\0\11\3\1\153\14\3\11\0\15\154\1\155"+
    "\42\154\16\70\1\156\41\70\1\0\3\3\1\0\1\3"+
    "\13\0\2\3\1\157\23\3\12\0\3\3\1\0\1\3"+
    "\13\0\3\3\1\160\22\3\12\0\3\3\1\0\1\3"+
    "\13\0\10\3\1\161\15\3\12\0\3\3\1\0\1\3"+
    "\13\0\20\3\1\162\5\3\12\0\3\3\1\0\1\3"+
    "\13\0\22\3\1\163\3\3\12\0\3\3\1\0\1\3"+
    "\13\0\23\3\1\164\2\3\12\0\3\3\1\0\1\3"+
    "\13\0\1\165\13\3\1\166\1\3\1\167\7\3\12\0"+
    "\3\3\1\0\1\3\13\0\6\3\1\170\17\3\12\0"+
    "\3\3\1\0\1\3\13\0\20\3\1\171\5\3\12\0"+
    "\3\3\1\0\1\3\13\0\13\3\1\172\12\3\12\0"+
    "\3\3\1\0\1\3\13\0\20\3\1\173\5\3\12\0"+
    "\3\3\1\0\1\3\13\0\10\3\1\174\7\3\1\175"+
    "\5\3\12\0\3\3\1\0\1\3\13\0\5\3\1\176"+
    "\20\3\12\0\3\3\1\0\1\3\13\0\1\3\1\177"+
    "\24\3\12\0\3\3\1\0\1\3\13\0\20\3\1\200"+
    "\5\3\12\0\3\3\1\0\1\3\13\0\3\3\1\201"+
    "\22\3\12\0\3\3\1\0\1\3\13\0\13\3\1\202"+
    "\12\3\12\0\3\3\1\0\1\3\13\0\10\3\1\203"+
    "\15\3\12\0\3\3\1\0\1\3\13\0\10\3\1\204"+
    "\15\3\12\0\3\3\1\0\1\3\13\0\3\3\1\205"+
    "\22\3\12\0\3\3\1\0\1\3\13\0\1\3\1\206"+
    "\24\3\12\0\3\3\1\0\1\3\13\0\16\3\1\207"+
    "\7\3\12\0\3\3\1\0\1\3\13\0\13\3\1\210"+
    "\12\3\12\0\3\3\1\0\1\3\13\0\2\3\1\211"+
    "\23\3\12\0\3\3\1\0\1\3\13\0\11\3\1\212"+
    "\14\3\12\0\3\3\1\0\1\3\13\0\1\3\1\213"+
    "\24\3\12\0\3\3\1\0\1\3\13\0\1\214\25\3"+
    "\12\0\3\3\1\0\1\3\13\0\20\3\1\215\5\3"+
    "\12\0\3\3\1\0\1\3\13\0\17\3\1\216\6\3"+
    "\12\0\3\3\1\0\1\3\13\0\14\3\1\217\11\3"+
    "\12\0\3\3\1\0\1\220\13\0\26\3\12\0\3\3"+
    "\1\0\1\3\13\0\3\3\1\221\22\3\12\0\3\3"+
    "\1\0\1\3\13\0\7\3\1\222\16\3\12\0\3\3"+
    "\1\0\1\3\13\0\7\3\1\223\16\3\12\0\3\3"+
    "\1\0\1\3\13\0\3\3\1\224\22\3\65\0\1\225"+
    "\57\0\1\226\5\0\1\151\2\0\1\227\53\0\3\3"+
    "\1\0\1\230\13\0\26\3\11\0\15\154\1\231\56\154"+
    "\1\232\1\155\42\154\16\0\1\156\42\0\3\3\1\0"+
    "\1\3\13\0\1\233\25\3\12\0\3\3\1\0\1\3"+
    "\13\0\1\3\1\234\24\3\12\0\3\3\1\0\1\3"+
    "\13\0\2\3\1\235\5\3\1\236\15\3\12\0\3\3"+
    "\1\0\1\237\13\0\26\3\12\0\3\3\1\0\1\3"+
    "\13\0\13\3\1\240\12\3\12\0\3\3\1\0\1\3"+
    "\13\0\7\3\1\241\16\3\12\0\3\3\1\0\1\242"+
    "\13\0\26\3\12\0\3\3\1\0\1\3\13\0\10\3"+
    "\1\243\15\3\12\0\3\3\1\0\1\3\13\0\13\3"+
    "\1\244\12\3\12\0\3\3\1\0\1\3\13\0\7\3"+
    "\1\245\16\3\12\0\3\3\1\0\1\246\13\0\26\3"+
    "\12\0\3\3\1\0\1\3\13\0\6\3\1\247\17\3"+
    "\12\0\3\3\1\0\1\3\13\0\7\3\1\250\16\3"+
    "\12\0\3\3\1\0\1\3\13\0\3\3\1\251\22\3"+
    "\12\0\3\3\1\0\1\3\13\0\11\3\1\252\14\3"+
    "\12\0\3\3\1\0\1\253\13\0\26\3\12\0\3\3"+
    "\1\0\1\3\13\0\23\3\1\254\2\3\12\0\3\3"+
    "\1\0\1\3\13\0\16\3\1\255\7\3\12\0\3\3"+
    "\1\0\1\3\13\0\24\3\1\256\1\3\12\0\3\3"+
    "\1\0\1\3\13\0\6\3\1\257\7\3\1\260\7\3"+
    "\12\0\3\3\1\0\1\261\13\0\26\3\12\0\3\3"+
    "\1\0\1\3\13\0\11\3\1\262\14\3\12\0\3\3"+
    "\1\0\1\3\13\0\3\3\1\263\22\3\12\0\3\3"+
    "\1\0\1\3\13\0\7\3\1\264\16\3\12\0\3\3"+
    "\1\0\1\265\13\0\26\3\12\0\3\3\1\0\1\266"+
    "\13\0\26\3\12\0\3\3\1\0\1\3\13\0\1\3"+
    "\1\267\24\3\12\0\3\3\1\0\1\3\13\0\20\3"+
    "\1\270\5\3\12\0\3\3\1\0\1\3\13\0\10\3"+
    "\1\271\15\3\13\0\1\272\3\0\1\273\65\0\1\274"+
    "\1\231\43\0\3\3\1\0\1\3\13\0\4\3\1\275"+
    "\21\3\12\0\3\3\1\0\1\3\13\0\20\3\1\276"+
    "\5\3\12\0\3\3\1\0\1\3\13\0\1\277\25\3"+
    "\12\0\3\3\1\0\1\3\13\0\3\3\1\300\22\3"+
    "\12\0\3\3\1\0\1\3\13\0\1\3\1\301\24\3"+
    "\12\0\3\3\1\0\1\302\13\0\26\3\12\0\3\3"+
    "\1\0\1\3\13\0\1\3\1\303\24\3\12\0\3\3"+
    "\1\0\1\3\13\0\10\3\1\304\15\3\12\0\3\3"+
    "\1\0\1\3\13\0\7\3\1\305\16\3\12\0\3\3"+
    "\1\0\1\3\13\0\1\3\1\306\24\3\12\0\3\3"+
    "\1\0\1\3\13\0\20\3\1\307\5\3\12\0\3\3"+
    "\1\0\1\310\13\0\26\3\12\0\3\3\1\0\1\3"+
    "\13\0\1\311\25\3\12\0\3\3\1\0\1\3\13\0"+
    "\20\3\1\312\5\3\12\0\3\3\1\0\1\313\13\0"+
    "\26\3\12\0\3\3\1\0\1\3\13\0\3\3\1\314"+
    "\22\3\12\0\3\3\1\0\1\315\13\0\26\3\12\0"+
    "\3\3\1\0\1\3\13\0\20\3\1\316\5\3\12\0"+
    "\3\3\1\0\1\3\13\0\10\3\1\317\15\3\12\0"+
    "\3\3\1\0\1\320\13\0\26\3\12\0\3\3\1\0"+
    "\1\321\13\0\26\3\13\0\1\272\56\0\3\3\1\0"+
    "\1\3\13\0\13\3\1\322\12\3\12\0\3\3\1\0"+
    "\1\3\13\0\20\3\1\323\5\3\12\0\3\3\1\0"+
    "\1\3\13\0\2\3\1\324\23\3\12\0\3\3\1\0"+
    "\1\3\13\0\1\325\25\3\12\0\3\3\1\0\1\326"+
    "\13\0\26\3\12\0\3\3\1\0\1\3\13\0\1\3"+
    "\1\327\24\3\12\0\3\3\1\0\1\3\13\0\6\3"+
    "\1\330\17\3\12\0\3\3\1\0\1\3\13\0\7\3"+
    "\1\331\16\3\12\0\3\3\1\0\1\3\13\0\3\3"+
    "\1\332\22\3\12\0\3\3\1\0\1\3\13\0\7\3"+
    "\1\333\16\3\12\0\3\3\1\0\1\3\13\0\2\3"+
    "\1\334\23\3\12\0\3\3\1\0\1\3\13\0\1\335"+
    "\25\3\12\0\3\3\1\0\1\3\13\0\2\3\1\336"+
    "\23\3\12\0\3\3\1\0\1\3\13\0\1\3\1\337"+
    "\24\3\12\0\3\3\1\0\1\3\13\0\20\3\1\340"+
    "\5\3\12\0\3\3\1\0\1\3\13\0\1\3\1\341"+
    "\24\3\12\0\3\3\1\0\1\3\13\0\2\3\1\342"+
    "\23\3\12\0\3\3\1\0\1\3\13\0\13\3\1\343"+
    "\12\3\12\0\3\3\1\0\1\3\13\0\15\3\1\344"+
    "\10\3\12\0\3\3\1\0\1\3\13\0\17\3\1\345"+
    "\6\3\12\0\3\3\1\0\1\3\13\0\20\3\1\346"+
    "\5\3\12\0\3\3\1\0\1\3\13\0\1\3\1\347"+
    "\24\3\12\0\3\3\1\0\1\3\13\0\3\3\1\350"+
    "\22\3\12\0\3\3\1\0\1\351\13\0\26\3\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7632];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\6\1\1\11\1\1\1\11"+
    "\25\1\5\11\3\1\1\0\2\1\2\11\1\0\1\11"+
    "\1\1\1\0\1\11\1\0\1\11\1\1\1\11\47\1"+
    "\3\11\1\1\2\11\1\1\1\11\3\1\2\0\47\1"+
    "\2\11\1\0\1\1\1\0\41\1\1\0\1\11\55\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[233];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	Symbol newSym(int tokenId) 
	{
    	return new Symbol(tokenId, yyline, yycolumn);
	}

	Symbol newSym(int tokenId, Object value) 
	{
    	return new Symbol(tokenId, yyline, yycolumn, value);
	}




  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { return newSym(sym.OPERADOR_PARENTESIS_CUADRADO_CIERRA,yytext());
          }
        case 89: break;
        case 50: 
          { return newSym (sym.MOD,yytext());
          }
        case 90: break;
        case 6: 
          { return newSym(sym.OPERADOR_PARENTESIS_ABRE,yytext());
          }
        case 91: break;
        case 43: 
          { return newSym(sym.AND,yytext());
          }
        case 92: break;
        case 2: 
          { return newSym(sym.IDENTIFICADOR,yytext());
          }
        case 93: break;
        case 22: 
          { return newSym(sym.CARACTER,yytext());
          }
        case 94: break;
        case 17: 
          { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MENOR,yytext());
          }
        case 95: break;
        case 78: 
          { return newSym (sym.RECORD ,yytext());
          }
        case 96: break;
        case 70: 
          { return newSym (sym.LABEL,yytext());
          }
        case 97: break;
        case 79: 
          { return newSym (sym.INLINE,yytext());
          }
        case 98: break;
        case 47: 
          { return newSym (sym.INT,yytext());
          }
        case 99: break;
        case 80: 
          { return newSym (sym.STRING,yytext());
          }
        case 100: break;
        case 37: 
          { return newSym(sym.OPERADOR_COMPARACION_DIFERENTE,yytext());
          }
        case 101: break;
        case 30: 
          { return newSym(sym.OR,yytext());
          }
        case 102: break;
        case 62: 
          { return newSym (sym.CASE,yytext());
          }
        case 103: break;
        case 26: 
          { return newSym(sym.OPERADOR_ARITMETICO_DIVIDIR_IGUAL,yytext());
          }
        case 104: break;
        case 48: 
          { return newSym (sym.SET ,yytext());
          }
        case 105: break;
        case 52: 
          { return newSym (sym.XOR ,yytext());
          }
        case 106: break;
        case 32: 
          { return newSym (sym.TO ,yytext());
          }
        case 107: break;
        case 18: 
          { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MAYOR,yytext());
          }
        case 108: break;
        case 21: 
          { return newSym(sym.OPERADOR_ARITMETICO_DECREMENTAR_IGUAL,yytext());
          }
        case 109: break;
        case 77: 
          { return newSym (sym.REPEAT,yytext());
          }
        case 110: break;
        case 69: 
          { return newSym(sym.BEGIN,yytext());
          }
        case 111: break;
        case 75: 
          { return newSym (sym.WHILE ,yytext());
          }
        case 112: break;
        case 54: 
          { return newSym(sym.OPERADOR_ASIGNAR_DERECHA_IGUAL,yytext());
          }
        case 113: break;
        case 74: 
          { return newSym (sym.WRITE ,yytext());
          }
        case 114: break;
        case 36: 
          { return newSym(sym.OPERADOR_ASIGNAR_IZQUIERDA,yytext());
          }
        case 115: break;
        case 44: 
          { return newSym (sym.NIL,yytext());
          }
        case 116: break;
        case 81: 
          { return newSym (sym.PACKED,yytext());
          }
        case 117: break;
        case 51: 
          { return newSym(sym.VAR,yytext());
          }
        case 118: break;
        case 85: 
          { return newSym(sym.PROGRAM,yytext());
          }
        case 119: break;
        case 31: 
          { return newSym(sym.OF,yytext());
          }
        case 120: break;
        case 41: 
          { return newSym (sym.NUMERO_FLOTANTE,yytext());
          }
        case 121: break;
        case 66: 
          { return newSym(sym.THEN,yytext());
          }
        case 122: break;
        case 72: 
          { return newSym (sym.CONST,yytext());
          }
        case 123: break;
        case 7: 
          { return newSym(sym.OPERADOR_PARENTESIS_CIERRA,yytext());
          }
        case 124: break;
        case 35: 
          { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MENOR_IGUAL_EQ,yytext());
          }
        case 125: break;
        case 24: 
          { return newSym(sym.OPERADOR_ARITMETICO_MULTIPLICAR_IGUAL,yytext());
          }
        case 126: break;
        case 76: 
          { return newSym (sym.DOWNTO,yytext());
          }
        case 127: break;
        case 68: 
          { return newSym(sym.ARRAY,yytext());
          }
        case 128: break;
        case 39: 
          { return newSym(sym.OPERADOR_ASIGNAR_DERECHA,yytext());
          }
        case 129: break;
        case 19: 
          { return newSym(sym.OPERADOR_OTRO_DOS_PUNTOS,yytext());
          }
        case 130: break;
        case 42: 
          { return newSym(sym.END,yytext());
          }
        case 131: break;
        case 56: 
          { /* ignore comment blocks */
          }
        case 132: break;
        case 61: 
          { return newSym (sym.FILE,yytext());
          }
        case 133: break;
        case 3: 
          { return newSym(sym.NUMERO_ENTERO,yytext());
          }
        case 134: break;
        case 40: 
          { return newSym(sym.OPERADOR_OTRO_ASSIGNMENT,yytext());
          }
        case 135: break;
        case 86: 
          { return newSym (sym.SHORTINT ,yytext());
          }
        case 136: break;
        case 57: 
          { return newSym (sym.READ ,yytext());
          }
        case 137: break;
        case 46: 
          { return newSym (sym.DIV,yytext());
          }
        case 138: break;
        case 34: 
          { return newSym(sym.OPERADOR_ARITMETICO_INCREMENTAR_IGUAL,yytext());
          }
        case 139: break;
        case 71: 
          { return newSym (sym.FALSE,yytext());
          }
        case 140: break;
        case 12: 
          { return newSym(sym.OPERADOR_OTRO_PUNTO_Y_COMA,yytext());
          }
        case 141: break;
        case 87: 
          { return newSym (sym.FUNCTION,yytext());
          }
        case 142: break;
        case 28: 
          { return newSym (sym.IN,yytext());
          }
        case 143: break;
        case 60: 
          { return newSym (sym.GOTO,yytext());
          }
        case 144: break;
        case 63: 
          { return newSym (sym.CHAR,yytext());
          }
        case 145: break;
        case 49: 
          { return newSym (sym.FOR,yytext());
          }
        case 146: break;
        case 67: 
          { return newSym(sym.NUMERO_FLOTANTE_CIENTIFICO,yytext());
          }
        case 147: break;
        case 25: 
          { /* Ignore sequence comments. */
          }
        case 148: break;
        case 55: 
          { return newSym(sym.ELSE,yytext());
          }
        case 149: break;
        case 16: 
          { return newSym(sym.OPERADOR_ARITMETICO_IGUAL,yytext());
          }
        case 150: break;
        case 33: 
          { return newSym(sym.OPERADOR_ARITMETICO_INCREMENTAR,yytext());
          }
        case 151: break;
        case 64: 
          { return newSym (sym.TRUE,yytext());
          }
        case 152: break;
        case 5: 
          { return newSym(sym.OPERADOR_ARITMETICO_RESTA,yytext());
          }
        case 153: break;
        case 45: 
          { return newSym (sym.NOT,yytext());
          }
        case 154: break;
        case 82: 
          { return newSym (sym.BOOLEAN,yytext());
          }
        case 155: break;
        case 53: 
          { return newSym(sym.OPERADOR_ASIGNAR_IZQUIERDA_IGUAL,yytext());
          }
        case 156: break;
        case 27: 
          { return newSym (sym.DO,yytext());
          }
        case 157: break;
        case 13: 
          { return newSym(sym.OPERADOR_OTRO_COMA,yytext());
          }
        case 158: break;
        case 10: 
          { return newSym(sym.OPERADOR_ARITMETICO_DIVISION,yytext());
          }
        case 159: break;
        case 73: 
          { return newSym (sym.UNTIL ,yytext());
          }
        case 160: break;
        case 65: 
          { return newSym(sym.TYPE,yytext());
          }
        case 161: break;
        case 11: 
          { return newSym(sym.OPERADOR_ARITMETICO_SUMA,yytext());
          }
        case 162: break;
        case 58: 
          { return newSym (sym.REAL ,yytext());
          }
        case 163: break;
        case 84: 
          { return newSym (sym.FORWARD,yytext());
          }
        case 164: break;
        case 4: 
          { return newSym(sym.OPERADOR_MIEMBRO_PUNTERO,yytext());
          }
        case 165: break;
        case 59: 
          { return newSym (sym.BYTE,yytext());
          }
        case 166: break;
        case 23: 
          { /* For this stand-alone lexer, print out comments. */
          }
        case 167: break;
        case 88: 
          { return newSym(sym.PROCEDURE,yytext());
          }
        case 168: break;
        case 29: 
          { return newSym(sym.IF,yytext());
          }
        case 169: break;
        case 14: 
          { return newSym(sym.OPERADOR_PARENTESIS_CUADRADO_ABRE,yytext());
          }
        case 170: break;
        case 20: 
          { return newSym(sym.OPERADOR_ARITMETICO_DECREMENTAR,yytext());
          }
        case 171: break;
        case 83: 
          { return newSym (sym.LONGINT,yytext());
          }
        case 172: break;
        case 38: 
          { return newSym(sym.OPERADOR_COMPARACION_Y_RELACION_MAYOR_IGUAL,yytext());
          }
        case 173: break;
        case 9: 
          { /* Ignore whitespace. */
          }
        case 174: break;
        case 1: 
          { return newSym(sym.ERROR,yytext());
          }
        case 175: break;
        case 8: 
          { return newSym(sym.OPERADOR_ARITMETICO_MULTIPLICACION,yytext());
          }
        case 176: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
