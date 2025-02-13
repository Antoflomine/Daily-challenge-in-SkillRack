class Node implements Pair{
        public long getHCF(int a,int b){
            int ans=(a>b)?a:b;
            while(true){
                if(ans % a==0 && ans%b==0){
                    break;
                }
                ans++;
            }
            long hcf=(a*b)/ans;
            return hcf;
        }
        public boolean areCoPrime(int a,int b){
            return getHCF(a,b)==1;
        }
}
    
