package datastructure.middle.math;

/**
 * @Author: smallming
 * @Date: 2021/10/19 10:21 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class C {
    //方法1
//#include<stdio.h>
//    int main() {
//        int num;
//        scanf("%d", & num);
//        if (num > 0 && num <= 9) {
//            printf("1位数\n");
//            printf("%d\n", num % 10);
//
//        } else if (num >= 10 && num < 100) {
//            printf("2位数\n");
//            printf("%d\t%d", num / 10, num % 10 % 10); //正序
//            printf("%d\t%d", num % 10, num / 10); //逆序
//
//        } else if (num >= 100 && num < 1000) {
//            printf("3位数\n");
//            printf("%d\t%d\t%d\n", num / 100, num % 100 / 10, num % 100 % 10); //正序
//            printf("%d\t%d\t%d\n", num % 10, num / 10 % 10, num / 100);//逆序
//        } else if (num >= 1000 && num < 10000) {
//            printf("4位数\n");
//            printf("%d\t%d\t%d\t%d\n", num / 1000, num % 10000 / 100, num % 1000 % 100 / 10, num % 1000 % 100 % 10);//正序
//            printf("%d\t%d\t%d\t%d\n", num % 10, num / 10 % 10, num / 100 % 10, num / 1000);//逆序
//        } else {
//            printf("五位数\n");
//            printf("%d\t%d\t%d\t%d\t%d\n", num / 10000, num % 10000 / 1000, num % 10000 % 1000 / 100, num % 10000 % 1000 % 100 / 10, num % 10000 % 1000 % 100 % 10);//正序
//            printf("%d\t%d\t%d\t%d\t%d\n", num % 10, num / 10 % 10, num / 100 % 10, num / 1000 % 10, num / 10000);//逆序
//        }
//    }
}