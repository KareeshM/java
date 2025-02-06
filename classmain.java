class ToUpperCaseExample{
public static void main(String args[]){
String s1="hellojava";
char [] ch=s1.toCharArray();
for(int i=0;i<ch.length;i++){
if(ch[i]>='a' && ch[i]<='z'){
ch[i]=(char)(ch[i]-32);
}
}
System.out.println(ch);
}
}