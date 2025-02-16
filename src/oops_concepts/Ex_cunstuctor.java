package oops_concepts;



public class Ex_cunstuctor {
    public static void main(String[] args){
        Baby b1 = new Baby();
    }

}

class Baby{
    String Baby_name;


    Baby(){
        System.out.println("I am default constructors  and call me when object is created");
    }
    //Instance initialization block
    {
        System.out.println("Call Data base before working");
    }
}
