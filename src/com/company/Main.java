package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++)
        {
            a[i] = input.nextInt();
        }
        output(a, 0, size);
    }

    static void output(int[] a, int count, int size)
    {
        if (count < size)
        {
            int oldIndex = a[count];
            output(a, count + 1, size);
            System.out.println(oldIndex);
        }
        else
        {

        }
    }


}

