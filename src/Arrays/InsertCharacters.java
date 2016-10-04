Private String getString(String s, Int l) {
if(s.length==0) {
Throw exception
}
if(s=null){
Throw exception
}
Char[] a= s.toArray();
Char[] b = new char[100];
Int i=0; int j=0;
for(i=0:i<l;i++) {
if(a[i]!=’ ‘) {
b[j]=a[i];
j=j+1;
i=i+1;
} else {
b[j]=’%’;
b[j+1]=’2’;
b[j+2]=’0’;
i=i+1;
j=j+3;
}
Return b.toString();
}

