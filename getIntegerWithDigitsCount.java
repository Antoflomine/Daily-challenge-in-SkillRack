private static long getIntegerWithDigitsCount(int N) {
            String str=String.valueOf(N);
            char a=str.charAt(0);
            int c=0;
            StringBuilder b=new StringBuilder();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==a){
                    c++;
                }
                else{
                    b.append(c).append(a);
                    a=str.charAt(i);
                    c=1;
                }
                
            }
            b.append(c).append(a);
            long m=Long.parseLong(b.toString());
            return m;
            
}
