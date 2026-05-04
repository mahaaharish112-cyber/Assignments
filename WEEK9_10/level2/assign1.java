import java.util.Scanner;
class assign1{
public static int getLength(String s){
int count=0;
try{
while(true){
s.charAt(count);
count++;
}
}catch(Exception e){
return count;
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String text=sc.next();
int len1=getLength(text);
int len2=text.length();
System.out.println(len1);
System.out.println(len2);
}
}