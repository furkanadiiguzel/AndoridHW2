package com.furkanadiguzel.hw2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsSys {
    private static ArrayList<Students> studentsItems;

    public static void prepareData(){
        studentsItems = new ArrayList<Company>();
        Collections.addAll(studentsItems,
                new Student("Furkan","21901609",R.drawable.apple),
                new Student("Ali","21901409",R.drawable.facebook),
                new Student("Mehmet","21901699",R.drawable.google),
                new Student("Ayse","21902609",R.drawable.huawei),
                new Student("Ceren","21901509",R.drawable.ibm),
                new Student("Ahmet","21901789",R.drawable.microsoft),
                new Student("Kaan","21901259",R.drawable.samsung),
                new Student("Cakır","21802920  ",R.drawable.sennheiser),
                new Student("Polat","21704723",R.drawable.sony),
                new Student("Duran","22003218",R.drawable.xiaomi)
        );
    }
    public static ArrayList<Students> getEvenItems(){
        ArrayList<Students> tempEven = new ArrayList();
        for(int i=0; i<companyItems.size(); i++)
            if(i%2 == 0)
                tempEven.add(companyItems.get(i));
        return  tempEven;
    }
    public static ArrayList<Students> getOddItems(){
        ArrayList<Students> tempEven = new ArrayList();
        for(int i=0; i<studentsItems.size(); i++)
            if(i%2 != 0)
                tempEven.add(studentsItems.get(i));
        return  tempEven;
    }

    public static ArrayList<Students> getStudentItems() {
        return studentsItems;
    }
}

}
