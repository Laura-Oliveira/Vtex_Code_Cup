package vtexcodecup;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Main 
{

    public static void main(String[] args) 
    {
        int randomNumberLottery = 0, randomNumberRange = 0, randomNumber = 0;
        int gainPriceA = 0, gainPriceB = 0, gainPriceC = 0;
        int resultIrreductibleFraction = 0;
        Scanner inputNumberRange = new Scanner(in);
        Scanner inputNumberLottery = new Scanner(in);
        Scanner inputgainPriceA = new Scanner(in);
        Scanner inputGainPriceB = new Scanner(in);
        Scanner inputGainPriceC = new Scanner(in);
                
        ConMaster masterObject = new ConMaster();
        
        randomNumberRange = inputNumberRange.nextInt();
        randomNumber = masterObject.randomNumber(randomNumberRange);
        
        gainPriceA = inputgainPriceA.nextInt();
        gainPriceB = inputGainPriceB.nextInt();
        gainPriceC = inputGainPriceC.nextInt();
        
        masterObject.lotteryGainMoney(randomNumberLottery, gainPriceA, gainPriceB, gainPriceC);
    }
    
}
