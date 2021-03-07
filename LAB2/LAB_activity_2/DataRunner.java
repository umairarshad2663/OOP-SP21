/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_activity_2;

/**
 *
 * @author BOSS
 */
public class DataRunner {
    public static void main(String[] args)
{
Data date1, date2;
date1 = new Data();
 date1.month = "December";
date1.day = 19;
date1.year = 2001;
System.out.println("date1:");
date1.displayDate();
date2 = new Data();
date2.month = "august";
date2.day = 29;
date2.year = 2003;
System.out.println("date2:");
date2.displayDate();
}

    
}
