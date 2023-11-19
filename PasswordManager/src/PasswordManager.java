import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("��������Ҫ���ܵ��ַ�����");
        String s1 = scanner.next();//ԭʼ�ַ���
        //s2Ϊ���ܺ���ַ���
        String s2 = encryption(s1);
        System.out.println("���ܺ���ַ���Ϊ��"+s2);
        String s3=decrypt(s2);
        System.out.println("���ܺ���ַ���Ϊ:"+s3);

    }

    //���ܷ���
    public static String encryption(String s) {
        //���ַ��������һ���ַ�������,�Ա���ÿһ���ַ���ASCII��
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //�����ÿһ���ַ���ASCII��
            int num = arr[i];
            //��1����ÿ���ַ���ASCII����������ַ����е�λ��(1��ʼ)��ƫ��ֵ3
            num = num + i + 1 + 3;
            //��ASCII��ת���ַ���ʽ
            arr[i] = (char) num;
        }
        //��2�����ַ����ĵ�һλ�����һλ����˳��
        char c1 = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = c1;
        //(3)���ַ������з�ת
        String s2 = new StringBuffer(new String(arr)).reverse().toString();
        return s2;
    }

    //����
    public static String decrypt(String s) {
        char[] arr = new StringBuffer(s).reverse().toString().toCharArray();
        char c1 = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = c1;
        for (int i = 0; i < arr.length; i++) {
            //�����ÿһ���ַ���ASCII��
            int num = arr[i];
            //��1����ÿ���ַ���ASCII����������ַ����е�λ��(1��ʼ)��ƫ��ֵ3
            num = num - i - 1 - 3;
            //��ASCII��ת���ַ���ʽ
            arr[i] = (char) num;

        }
        return new String(arr);
    }


}