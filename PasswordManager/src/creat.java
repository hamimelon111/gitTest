import java.util.Random;
import java.util.Scanner;

public class creat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入密码长度:");
        int length=sc.nextInt();
        System.out.println(creat(length));
    }
    public static String creat(int length){
        //用来存放密码
        String s="";
        //随机生成数字
        Random r=new Random();
        //保证至少有一个大写字母和一个小写字母
        //长度7
        //数字：5
        //大写：
        int num1=r.nextInt(length-2)+1;
        for (int i=0;i<num1;i++){
            int number1=r.nextInt(9);
            s=s+(""+number1);
        }
        //随机生成大写字母，除去数字，和至少保证有一位小写字母
        int num2= r.nextInt(length-num1-1)+1;
        for (int i=0;i<num2;i++){
            s=s+Bigword();
        }

        //随机生成小写字母
        int num3=length-num1-num2;
        for (int i=0;i<num3;i++){
            s=s+Smallword();
        }
        return s;
    }
    //生成一个大写字母
    public static String Bigword() {
        Random r=new Random();
        int num = r.nextInt(26);
        String[] str={"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
        String s=str[num];
        return s;
    }
    //生成一个小写字母
    public static String Smallword() {
        Random r=new Random();
        int num = r.nextInt(26);
        String[] str={"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        String s=str[num];
        return s;
    }
}
