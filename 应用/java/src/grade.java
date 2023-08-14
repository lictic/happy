public class grade {
    public static void main(String[] args) {
        student("小A",4,426);
        student("小B",4,300);
        student("小C",4,500);
        student("小D",6,400);
        student("小E",6,505);
    }
    public static void student(String a,int b,double c){
        if(b==4)
        {
            if(c>=425)
            {
                System.out.println(a+":"+b+":"+c);
                System.out.println("恭喜你通过英语四级考试");
            }
            else
            {
                System.out.println(a+":"+b+":"+c);
            }
        }
        else if(b==6)
        {
            if(c>=425)
            {
                System.out.println(a+":"+b+":"+c);
                System.out.println("恭喜你通过英语六级考试");
            }
            else
            {
                System.out.println(a+":"+b+":"+c);
            }
        }
    }
}
