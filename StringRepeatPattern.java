    private int[] pageReadCount;
    public Book(int totalPages){
        pageReadCount=new int[totalPage+1];
    }
    public void Read(int from,int to){
        for(int i=from;i<=to;i++){
            pageReadCount[i]++;
        }
    }
    
    
    public void printMostOftenReadPages(){
        int max=0;
        for(int i=1;i<pageReadCount.length;i++){
            if(pageReadCount[i]>max){
                max=pageReadCount[i];
            }
        }
        for(int i=1;i<pageReadCount.length;i++){
            if(pageReadCount[i]==max){
                System.out.print("Most often read pages: "+i+" ");
            }
        }
    }
