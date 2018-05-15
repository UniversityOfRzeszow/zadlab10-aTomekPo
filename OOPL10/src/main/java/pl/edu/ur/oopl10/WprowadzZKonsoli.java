/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author aTomekPo
 */

import java.util.Scanner;
public class WprowadzZKonsoli {
    
    public static void main(String args[])
    {
        WprowadzZKonsoli test = new WprowadzZKonsoli();
        test.wprowadzInt();
    }
    
    Scanner odczyt = new Scanner(System.in);
    public int liczba1;
    public double liczba2;
    public String napis;
    public char znak;

   
    
    public void wprowadzInt()
    {
        try
        {
            liczba1 = odczyt.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("wprowadz liczbe calkowita");
        }
    }
    
    public void wprowadzDouble()
    {
        try
        {
            liczba2 = odczyt.nextDouble();
        }
        catch(Exception e)
        {
            System.out.println("wprowadz liczbe zmiennoprzecinkowa");
        }
    }
    
    public void wprowadzString()
    {
        try
        {
            napis = odczyt.next();
        }
        catch(Exception e)
        {
            System.out.println("wprowadz napis");
        }
    }
    
}