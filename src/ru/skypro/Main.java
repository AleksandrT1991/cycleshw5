package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // ������� 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            }
            System.out.print("\n");
        int j = 10;
        while (j >= 1) {
            System.out.print(j-- + " ");
            }

        // ������� 2
            System.out.print("\n");
        for (int i = 1; i < +31; i=i+7){
            System.out.println("������� �������," + i + "-� �����, ���������� ����� �����");
            }

        // ������� 3
        for (int i = 0; i<=2100; i = i+79)
        if (i >= 1850 || i ==2100) {
            System.out.println("������ �������� � " + i + "����");
            }
        }
    }
