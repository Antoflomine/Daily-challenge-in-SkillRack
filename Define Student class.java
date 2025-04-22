class Student{
    private String name;
    private int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public void addExtraMarks(int ex){
        this.marks+=ex;
        if(marks>100){
            this.marks=100;
        }
    }
    @Override
    public String toString(){
        return name+":"+marks;
    }
}
