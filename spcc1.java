import java.io.*;
import java.util.*;

class spcc1
{
public static void main(String args[])
{
int i=0,j=0;
String filename;
static Vector<Character> specialsymbols;
    static Vector<String> functions;
    static Vector<String> headers;
    static Vector<String> keywords;
    static Vector<Character> operators;
	specialsymbols.add('#');
    specialsymbols.add(';');
    specialsymbols.add('<');
    specialsymbols.add('>');
    specialsymbols.add(',');
    specialsymbols.add('(');
    specialsymbols.add(')');
    specialsymbols.add('{');
    specialsymbols.add('}');
    specialsymbols.add(']');
    specialsymbols.add('[');
	headers.add("stdio.h");
    headers.add("string.h");
    headers.add("math.h");
	keywords.add(auto);
	keywords.add(break);	
	keywords.add(case);	
	keywords.add(char);
keywords.add(const);	
keywords.add(continue);
	keywords.add(default);
	keywords.add(do);
keywords.add(double);	
keywords.add(else);	
	keywords.add(enum);	
keywords.add(extern);
keywords.add(float);
	keywords.add(for);	
	keywords.add(goto);
	keywords.add(if);
keywords.add(int);	
keywords.add(long);	
keywords.add(register);
	keywords.add(return);
keywords.add(short);
	keywords.add(signed);
	keywords.add(sizeof);	
	keywords.add(static);
keywords.add(struct);
	keywords.add(switch);
	keywords.add(typedef);
	keywords.add(union);
keywords.add(unsigned);
	keywords.add(void);	
	keywords.add(volatile);
	keywords.add(while);
	 keywords.add("printf");
        keywords.add("scanf");
        keywords.add("main");

Scanner sc = new Scanner(System.in);
System.out.println("Store the C program in a file and then enter the file name");
filename = sc.nextLine();
System.out.println("The file name you entered is *"+filename+"*");

try{   
        File file = new File(filename);
        FileWriter fw = new FileWriter("file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s,s1;
        while((s=br.readLine())!=null){
            s1=calc(s);
            fw.write(s1+"\n");
            // System.out.println(s);
        }
        fw.close();
        br.close();
    }
	catch(Exception e){}

}
}
