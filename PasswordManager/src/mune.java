import java.util.Scanner;

public class mune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("============================");
            System.out.println("    欢迎使用密码管理系统");
            System.out.println("============================");
            System.out.println("         请选择操作：");
            System.out.println("1.加密");
            System.out.println("2.解密");
            System.out.println("3.判断密码强度");
            System.out.println("4.密码生成");
            System.out.println("5.退出");
            System.out.print("请输入选项序号：");
            String key = sc.next();
            if (key.equals("1")) {
                System.out.println("============================");
                System.out.println("    欢迎使用密码管理系统");
                System.out.println("============================");
                String s = "";

                System.out.print("请输入要加密的数字密码：");
                s = sc.next();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    int num = (int) c;
                    if (!(num >= 48 && num <= 57) && !(num >= 65 && num <= 90) && !(num >= 97 && num <= 122)) {
                        System.out.println("输入的密码含其他字符，请重新输入密码：");
                    }
                }
                System.out.println("加密后的结果是：" + PasswordManager.encryption(s));
            } else if (key.equals("2")) {
                System.out.println("============================");
                System.out.println("    欢迎使用密码管理系统");
                System.out.println("============================");
                System.out.print("请输入需要解密的密码：");
                String s = sc.next();
                System.out.println("解密后的密码是：" + PasswordManager.decrypt(s));
            } else if (key.equals("3")) {
                System.out.println("============================");
                System.out.println("    欢迎使用密码管理系统");
                System.out.println("============================");
                System.out.print("请输入需要判断密码强度的密码：");
                String s = sc.next();
                System.out.println("该密码的强度是：" + judge.judge(s));
            } else if (key.equals("4")) {
                System.out.println("============================");
                System.out.println("    欢迎使用密码管理系统");
                System.out.println("============================");
                System.out.print("请输入一个大于或等于8的数字表示密码长度:");
                int num = sc.nextInt();
                System.out.println("生成的密码是：" + creat.creat(num));

            } else if (key.equals("5")) {
                break;
            } else if (!key.equals("1") || !key.equals("2") || !key.equals("3") || !key.equals("4") || !key.equals("5")) {
                System.out.println("输入的选项错误，请重新输入:");
            }
        }
    }
}
