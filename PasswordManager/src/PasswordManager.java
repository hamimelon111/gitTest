import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要加密的字符串：");
        String s1 = scanner.next();//原始字符串
        //s2为加密后的字符串
        String s2 = encryption(s1);
        System.out.println("加密后的字符串为："+s2);
        String s3=decrypt(s2);
        System.out.println("解密后的字符串为:"+s3);

    }

    //加密方法
    public static String encryption(String s) {
        //将字符串存放在一个字符数组中,以便获得每一个字符的ASCII码
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //将获得每一个字符的ASCII码
            int num = arr[i];
            //（1）将每个字符的ASCII码加上它在字符串中的位置(1开始)和偏移值3
            num = num + i + 1 + 3;
            //将ASCII码转回字符形式
            arr[i] = (char) num;
        }
        //（2）将字符串的第一位和最后一位调换顺序
        char c1 = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = c1;
        //(3)将字符串进行反转
        String s2 = new StringBuffer(new String(arr)).reverse().toString();
        return s2;
    }

    //解密
    public static String decrypt(String s) {
        char[] arr = new StringBuffer(s).reverse().toString().toCharArray();
        char c1 = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = c1;
        for (int i = 0; i < arr.length; i++) {
            //将获得每一个字符的ASCII码
            int num = arr[i];
            //（1）将每个字符的ASCII码加上它在字符串中的位置(1开始)和偏移值3
            num = num - i - 1 - 3;
            //将ASCII码转回字符形式
            arr[i] = (char) num;

        }
        return new String(arr);
    }


}
