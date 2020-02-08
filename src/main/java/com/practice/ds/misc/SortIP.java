package com.practice.ds.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortIP
{

    public static String getFormattedIP(String ip)
    {
        String arg[] = new String[4];
        arg = (ip).split("\\.");

        int i=0;
        while(i<=3)
        {
            if(arg[i].length()==1)
            {
                arg[i]="00"+arg[i];
            }
            else if(arg[i].length()==2)
            {
                arg[i]="0"+arg[i];
            }

            i++;
        }

        return arg[0]+arg[1]+arg[2]+arg[3];
    }

    public static ArrayList<Integer> sortedList(Object[] obj,String order)
    {
        if(order.equalsIgnoreCase("Ascending"))
        {
            Arrays.sort(obj, new Comparator() {
                public int compare(Object o1, Object o2) {
                    return ((Map.Entry<Integer, Long>) o1).getValue()
                               .compareTo(((Map.Entry<Integer, Long>) o2).getValue());
                }
            });
        }
        else
        {
            Arrays.sort(obj, new Comparator() {
                public int compare(Object o1, Object o2) {
                    return ((Map.Entry<Integer, Long>) o2).getValue()
                               .compareTo(((Map.Entry<Integer, Long>) o1).getValue());
                }
            });
        }

        int counter=0;
        ArrayList<Integer> key = new ArrayList<Integer>();
        //int key[] = new int[ipRange.size()];

        for (Object e : obj) {
            key.add(((Map.Entry<Integer, Long>) e).getKey());
            //key[counter++]=((Map.Entry<Integer, Long>) e).getKey();

            System.out.println(((Map.Entry<Integer, Long>) e).getKey() + " : " + ((Map.Entry<Integer, Long>) e).getValue());
        }

        return key;
    }

    public static void main(String[] args) 
    {
        Map<Integer,String> ipRange= new TreeMap<Integer,String>();
        Map<Integer,Long> formatedIpRange= new TreeMap<Integer,Long>();

        ipRange.put(1, "10.1.4.100");
        ipRange.put(2, "1.10.400.10");
        ipRange.put(3, "196.0.14.15");
        ipRange.put(4, "196.70.5.1");
        ipRange.put(5, "196.70.7.3");
        ipRange.put(6, "153.70.7.0");

        for(int j=1;j<=ipRange.size();j++)
        {
            formatedIpRange.put(j, Long.parseLong(getFormattedIP(ipRange.get(j))));
        }

        Object[] a = formatedIpRange.entrySet().toArray();

        ArrayList<Integer> key = sortedList(a,"descending");

        System.out.println("ordered list ");

        for (Integer integer : key) 
        {
            System.out.println(ipRange.get(integer));
        }
    }
}

