package edu.cscc;

public class BubbleSort {
    public static void sort(String[] list) {
        boolean changed = true;
        do{
            changed = false;
            for(int j = 0; j<= list.length - 2; j++)
                if(list[j].compareTo(list [j + 1]) > 0) {
                    String surname = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = surname;
                    changed = true;
                }
        } while(changed);
    }
}
