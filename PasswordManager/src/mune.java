import java.util.Scanner;

public class mune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("============================");
            System.out.println("    ��ӭʹ���������ϵͳ");
            System.out.println("============================");
            System.out.println("         ��ѡ�������");
            System.out.println("1.����");
            System.out.println("2.����");
            System.out.println("3.�ж�����ǿ��");
            System.out.println("4.��������");
            System.out.println("5.�˳�");
            System.out.print("������ѡ����ţ�");
            String key = sc.next();
            if (key.equals("1")) {
                System.out.println("============================");
                System.out.println("    ��ӭʹ���������ϵͳ");
                System.out.println("============================");
                String s = "";

                System.out.print("������Ҫ���ܵ��������룺");
                s = sc.next();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    int num = (int) c;
                    if (!(num >= 48 && num <= 57) && !(num >= 65 && num <= 90) && !(num >= 97 && num <= 122)) {
                        System.out.println("��������뺬�����ַ����������������룺");
                    }
                }
                System.out.println("���ܺ�Ľ���ǣ�" + PasswordManager.encryption(s));
            } else if (key.equals("2")) {
                System.out.println("============================");
                System.out.println("    ��ӭʹ���������ϵͳ");
                System.out.println("============================");
                System.out.print("��������Ҫ���ܵ����룺");
                String s = sc.next();
                System.out.println("���ܺ�������ǣ�" + PasswordManager.decrypt(s));
            } else if (key.equals("3")) {
                System.out.println("============================");
                System.out.println("    ��ӭʹ���������ϵͳ");
                System.out.println("============================");
                System.out.print("��������Ҫ�ж�����ǿ�ȵ����룺");
                String s = sc.next();
                System.out.println("�������ǿ���ǣ�" + judge.judge(s));
            } else if (key.equals("4")) {
                System.out.println("============================");
                System.out.println("    ��ӭʹ���������ϵͳ");
                System.out.println("============================");
                System.out.print("������һ�����ڻ����8�����ֱ�ʾ���볤��:");
                int num = sc.nextInt();
                System.out.println("���ɵ������ǣ�" + creat.creat(num));

            } else if (key.equals("5")) {
                break;
            } else if (!key.equals("1") || !key.equals("2") || !key.equals("3") || !key.equals("4") || !key.equals("5")) {
                System.out.println("�����ѡ���������������:");
            }
        }
    }
}