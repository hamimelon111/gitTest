import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������������룺");
        String password = sc.next();
        System.out.println(judge(password));
    }

    //�ж�����ǿ��
    public static String judge(String s) {
        String t = "";
        boolean number = false;
        boolean zimu = false;
        boolean ZIMU = false;
        if (s.length() < 8) {
            t = "������ǿ��Ϊ��";
        }
        if (s.length() >= 8) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                //String str = ("" + c);
                int num = (int)c;
                if (num >= 48 && num <= 57) {
                    number = true;
                } else if ((num >= 65 && num <= 90)) {
                    ZIMU = true;
                } else if (num >= 97 && num <= 122) {
                    zimu = true;
                }
            }
            if ((number && (!zimu) && (!ZIMU))
                    || (zimu && (!number) && (!ZIMU))
                    || (ZIMU && (!number) && (!zimu))) {
                t = "������ǿ��Ϊ��";

            } else if ((number && zimu&&(!ZIMU)) || (number && ZIMU&&(!zimu))) {
                t = "������ǿ��Ϊ��";
            } else if (number && zimu && ZIMU) {
                t = "������ǿ��Ϊǿ";
            }
        }

        return t;
    }
}