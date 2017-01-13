/*
 * Made by SilverHat Labs 
 * 
 * Version Log from Dec 2016 
 * The Project got its current face during the Apr-May 2016.
 * 
 * The Calculator is focused on making Calculations easy like other calculators but is unique in its various functions like handling Fractions and Matrices.
 * As of yet Programmed by Akhand Yaduvanshi during the free time and not for any profit purposes
 * 
 * The interface of the calculator is under construction is being updated regularly.
 * GUI is not expected anytime soon.
*/

import CalcBase.*;
import ShortHand.*;

public class Operations    
{
    public static void main(String args[]) throws java.io.IOException
    {
        u.l(2);
        System.out.println("_______________________________CalcNextGen v7.6.0________________________________");//IDK
        System.out.println("Choose the operation");
        u.pln("Equation Operations->");
        u.plnt("1-Basic[Decimal] Equations");
        u.plnt("2-Matrice Equations");
        u.plnt("3-Fractional Operations");
        u.plnt("4-Binary Equations");
        u.l();
        u.pln("Other Menus->");
        u.plnt("5-Percentage");
        u.plnt("6-Exponential and Logarithms");
        u.plnt("8-Trignometrical Conversions");
        u.l();
        u.pln("Other Options->");
        u.plnt("A-Solve an equation");
        u.plnt("B-Solve Quadratic Equations");
        u.plnt("C-Try QMaker[Beta]");
        u.plnt("D-Find LCM or HCF");
      //  u.plnt("E-Try TimeCalc[Beta]");
        u.l();
        u.pln("v- Version Log");
        u.l();
        System.out.println("0-Terminate");
        char opt = u.iBc();//Concluded-Never change this to int again
        switch(opt)
        {
            case '1':
            case '2':
            case '3':
            u.pln("********************************CalcNextGen-Equate[2.0]*****************************");
        }
        switch (opt)
        {
            case '1':             
            Equate.main();
            break;

            case '2':
            Matrice.main();
            break;
            
            case '3':
            CalcBase.Fraction.main();
            break;

            case '4':
            Binary.main();
            break;

            case '5':
            Percent.main();
            break;

            case '6':
            Power.main();
            break;

            case '8':
            Trig.main();
            break;

            case 'a':
            case 'A':
            Equation.main();
            break;
            
            case 'b':
            case 'B':
            Quad.main();
            break;

            case 'c':
            case 'C':
            QMaker.Run.main();
            break;

            case 'd':
            case 'D':
            u.pln((u.iSi("What to Find?"+"\n"+"1 - LCM"+"\n"+"2 - HCF"))==1 ? ""+(Find.LCM(u.iSi("Enter Numbers"),u.iSi())) : ""+(Find.HCF(u.iSi("Enter Numbers"),u.iSi())));
            break;

            case 'e':
            case 'E':
            TimeCalc.Date.takeIn("Enter Date");
            break;
            
            case 'v':
            case 'V':
            fileDat.ReadLog log=new  fileDat.ReadLog();
            log.main();
            break;
            
            case 0:
            break;

            default:
            u.pln("Sorry your choice could not be processed please try again");

            
        }
        System.out.println("Enter 0 for Main menu / Press 1 to Terminate");
        if(u.iSi()==1)exit();
        else Operations.main(null);
    }
    public static void exit()
    {
        u.pln("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\f");
        System.out.println("Made with <3 by Akhand Yaduvanshi(SiLvErHAt Labs)");
        u.plnt("akhandsnet.blogspot.com");
      //To write the output to a txt file Enter 
        System.exit(0);
    }
}