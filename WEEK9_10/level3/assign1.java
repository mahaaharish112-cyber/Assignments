import java.util.Scanner;
class assign1{
public static char[] uniqueChars(String s){
char[] temp=new char[s.length()];
int k=0;
for(int i=0;i<s.length();i++){
int flag=0;
for(int j=0;j<k;j++){
if(s.charAt(i)==temp[j]){flag=1;break;}
}
if(flag==0){temp[k]=s.charAt(i);k++;}
}
char[] res=new char[k];
for(int i=0;i<k;i++) res[i]=temp[i];
return res;
}
public static String[][] frequency(String s){
int[] freq=new int[256];
for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
char[] unique=uniqueChars(s);
String[][] result=new String[unique.length][2];
for(int i=0;i<unique.length;i++){
result[i][0]=String.valueOf(unique[i]);
result[i][1]=String.valueOf(freq[unique[i]]);
}
return result;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String text=sc.next();
String[][] res=frequency(text);
for(int i=0;i<res.length;i++){
System.out.println(res[i][0]+" "+res[i][1]);
}
}
}