class animal{
    void sound(){
    System.out.println("dog barks");}
}
class cat extends animal{
    void sound2(){
    System.out.println("adjad");}
}
public class a{
    public static void main(String args[]){
        cat c1=new cat();
        c1.sound();
        c1.sound2();


    }
}