package com.alexis.main;

import java.util.Arrays;
import java.util.ArrayList;

public class Main
{
  private static ArrayList<Integer>ejemplares = new ArrayList<>();

  private static int sockMerchant(int n, int[] ar)
  {
    Arrays.sort(ar);
        int contadorEjemplares = 1;

        for (int x = 0; x < n-1; x++)
        {
            if (ar[x] == ar[x+1])
            {
                contadorEjemplares++;
            }
            else
            {
                ejemplares.add(contadorEjemplares);
                contadorEjemplares = 1;
            }
        } ejemplares.add(contadorEjemplares);

        int enlaces = 0;

        for (int x : ejemplares)
        {
            for (int y = x; y > 0; y--)
            {
                if (y%2 == 0)
                {
                    enlaces++;
                }
            }
        }

        return enlaces;
  }

  public static void main(String[] args)
  {

    int n = 10;
    int[] ar = new int[n];

    ar[0] = 1;
    ar[1] = 1;
    ar[2] = 3;
    ar[3] = 1;
    ar[4] = 2;
    ar[5] = 1;
    ar[6] = 3;
    ar[7] = 3;
    ar[8] = 3;
    ar[9] = 3;

    System.out.println(sockMerchant(n,ar));
  }
}
