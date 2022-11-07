class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public Student(){

    }
    public Student(int id , String name , int age , String address , int score){
        setId(id);
        setName(name);        
        setAge(age);
        setAddress(address);
        setScore(score);
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setScore(int score){
        if(score < 0){
            this.score = 0;
        } else if(score > 10){
            this.score = 10;
        } else {
            this.score = score;
        }
        
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public int getScore(){
        return this.score;
    }

}