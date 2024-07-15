package ArrayMediums;

import java.util.Arrays;

public class BestTime2BuyandSellStock {
    public static void main(String[] args) {


        int[] prices = {7, 1, 5, 3, 6, 4};
        int min = prices[0];
        int minIndex = 0;
        int maxIndex = 0;
        int max = prices[0];
        int profit=0;
        //To Find number of Days in the array
        System.out.println("Total Days in the Array : " + prices.length);
        //To find the Minimum and Maximum Price stock on the day
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
            if (prices[i] > max) {
                max = prices[i];
                maxIndex = i;
            }


        }
        System.out.println("The Price of the Stock Minimum on :" + min);
        System.out.println("Maximum :" + max);
        System.out.println("Minimum Index is :" + minIndex + " Maximum Index is :" + maxIndex);

        int temp[] = new int[prices.length];
        int count = minIndex;

        if (minIndex!= prices.length-1) {
            if (maxIndex < minIndex) {
                //get the array from min index to new array
                for (int i = 0; i < temp.length - minIndex; i++) {
                    temp[i] = prices[count];
                    count++;
                }
                Arrays.sort(temp);
                max = temp[temp.length - 1];
                //maxIndex= temp.length-1;


            }
            maxIndex = indexFinder(prices, max);
            System.out.println("max is :" + max);


            System.out.println("Buy the stock on Minimum Day :" + prices[minIndex]);
            System.out.println("Sell the stock on Maximum Day :" + prices[maxIndex]);



        }else {
            profit=0;
        }
        profit=prices[maxIndex]-prices[minIndex];
        //return profit;
    }

    private static int indexFinder(int[] prices, int max) {
        for (int i=0;i<prices.length;i++){
            if(prices[i]==max)
                return i;
        }
        return -1;
    }
}
