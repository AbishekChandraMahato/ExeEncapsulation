public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;
    //constructors:
    public Dog(){

    }
    public Dog(String name,int age,String gender,String race,double weight){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.race=race;
        this.weight=weight;

    }
    public Dog(String gender,String race){
        this("dog",0,gender,race,0.0);


    }
    //Setters and Getters:

    public int getAge(){
        return this.age;
    }
     public void setAge(int age){
        if(age<0 || age>15){
            System.out.println("Illegal age of dog");
        }else{
            this.age=age;
        }
    }

     public double getWeight(){
        return this.weight;
     }
     public void setWeight(double weight){
        if(weight<0){
            System.out.println("Illegal weight input");
        }else{
            this.weight=weight;

        }
    }
    //Class Methods:
     public void displayInfo(){
        StringBuilder sb1=new StringBuilder("The info related to Dog:\n");
        sb1.append("name: "+this.name+"\nage: "+this.age+
                "\ngender: "+this.gender+"\nrace: "+this.race+"\nweight: "+this.weight);


         System.out.println(sb1.toString());
    }

}

