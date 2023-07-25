package sec2;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarUseApi {

    public void prn(int year, int month) {

        Calendar cal = Calendar.getInstance();

        System.out.printf("\t\t%d년 %d월\n", year, month);
        System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

        cal.set(year, month - 1, 1);

        int start = cal.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < start; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
            System.out.printf("%d\t", i);
            if (start % 7 == 0) {
                System.out.println();
            }
            start++;
        }
    }
}

class CollectionsEx3 {
    //입력한 달의 달력 출력하기

    public static void main(String[] args) {

        //입력한 월의 달력 출력하기
        //만약, 7월의 경우
        /*
        7월

        일  월  화  수  목  금   토
                                1
        2   3   4   5   6   7   8
        9   10  11  12  13  14  15
        16  17  18  19  20  21  22
        23  24  25  26  27  28  29
        30  31
        */
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("년도를 입력하세요 : ");
        int year = sc.nextInt(); //년도
        System.out.println("월을 입력하세요 : ");
        int month = sc.nextInt(); //월

        cal.set(Calendar.YEAR, year); //입력받은 년도로 세팅
        cal.set(Calendar.MONTH, month); //입력받은 월로 세팅

        System.out.println("---------["+month+"월]---------");
        System.out.println("   일      월      화      수      목     금      토");

        cal.set(year,month-1,1); //입력받은 월의 1일로 세팅
        //month는 0이 1월이므로 -1을 해준다

        int end = cal.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일(1:일요일 … 7:토요일)


        for(int i=1; i<=end; i++) {
            if(i==1) {
                for(int j=1; j<dayOfWeek; j++) {
                    System.out.print("    ");
                }
            }
            if(i<10) { //한자릿수일 경우 공백을 추가해서 줄맞추기
                System.out.print(" ");
            }
            System.out.print(" "+i+" ");
            if(dayOfWeek%7==0) { //한줄에 7일씩 출력
                System.out.println();
            }
            dayOfWeek++;
        }
        System.out.println("-----------------------------");

    }
}




