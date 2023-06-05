package model;

public class person {
    int yearold;

    String name;
    public void ten(){
        System.out.println("my name:"+name);
    }
    public person(String name,int yearold){
        this.yearold= yearold;
        this.name= name;
    }

    public static void main(String[] args) {
        person people= new person("le van minh",3);

        person people2= new person("nguyen ngoc binh",3);

        for(int i=1;i<1001;i++){
            System.out.println( i+" " +people.name +" xin loi "+people2.name +" nhieu lam");
        }
    }
}
