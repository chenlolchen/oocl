package com.oocl;

import java.util.Scanner;

public class Sorter {
    public void selectSort(int[] as) {
        for (int i = 0; i < as.length - 1; i++) {
            for (int j = i + 1; j < as.length; j++) {
                if (as[i] > as[j]) {
                    int temp = as[i];
                    as[i] = as[j];
                    as[j] = temp;
                }
            }
        }
    }

    public void bubbleSort(int[] as){
        for(int i = 0; i < as.length - 1; i++){
            for(int j = 0; j < as.length - 1 - i; j++){
                if(as[j] > as[j+1]){
                    int temp = as[j];
                    as[j] = as[j+1];
                    as[j+1] = temp;
                }
            }
        }
    }

    public int binarySearch(int target, int[] list){
        int count = 0;
        int left = 0;
        int right = list.length - 1;

        while (left <= right){
            count++;
            int mid = (right + left) / 2;
            if(target == list[mid]){
                System.out.println("计算了" + count + "次");
                return list[mid];
            }else if(target > list[mid]){
                left = mid + 1;
            }else if (target < list[mid]){
                right = mid - 1;
            }else {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int as[] = {6, 2, 9, 12, 3, 4, 8, 7};
        sorter.bubbleSort(as);
        for(int a : as){
            System.out.println(a);
        }
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("please input a target number:");
            int target = Integer.parseInt(scanner.nextLine());
            System.out.println(" == " + target);
            int result = sorter.binarySearch(target,as);
            if(result != -1){
                System.out.println("found: " + target);
            }else {
                System.out.println("not found");
            }
        }
    }
}
