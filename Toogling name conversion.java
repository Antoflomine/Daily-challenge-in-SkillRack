public static char[] toggleNamingConvention(char[] str) {
    String res="";
    
    for(int i=0;i<str.length;i++){
        if(i!=0 && str[i]>='A' && str[i]<='Z'){
            res+='_';
            res+=Character.toLowerCase(str[i]);
            
            
        }
        else if(str[i]=='_'){
            res+=Character.toUpperCase(str[i+1]);
            i++;
        }
        else{
            res+=str[i];
           
        }
    }
    char[] arr=res.toCharArray();
    return arr;
}
