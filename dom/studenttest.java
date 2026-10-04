interface student{
    void grade();
    void attendance();

}
class pg implements student{
    public void grade(){
        System.out.println("Grade is A");
    }
    public void attendance(){
        System.out.println("Attendance is 90%");
    }
}
class ug implements student{
    public void grade(){
        System.out.println("Grade is B");
    }
    public void attendance(){
        System.out.println("Attendance is 85%");
    }}
    public class studenttest{
        public static void main(String[] args){
            pg s1=new pg();
            ug s2=new ug();
            s1.grade();
            s1.attendance();
            s2.grade();
            s2.attendance();
        }

    }