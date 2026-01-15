class Person{
    private String name;
    private int weight;
    private double height;
    public Person(String name,int weight,double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }
    public double getBodyMassIndex(){
        return weight/(height*height);
    }
    @Override
    public String toString(){
        DecimalFormat df=new DecimalFormat("0.00");
        return "Name: "+name+"\n"+"Weight: "+weight+" kg"+"\n"+"Height: "+df.format(height)+" m";
    }
}
