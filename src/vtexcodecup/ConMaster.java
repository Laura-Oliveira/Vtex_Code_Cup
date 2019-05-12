package vtexcodecup;
import java.util.Random;

/**
 *
 * @author Laura
 */
public class ConMaster
{
    
    public int randomNumberLottery;
    public int randomNumberRange;
    public int gainPriceA, gainPriceB, gainPriceC;

    public int getRandomNumberLottery() 
    {
        return randomNumberLottery;
    }

    public void setRandomNumberLottery(int randomNumberLottery) 
    {
        this.randomNumberLottery = randomNumberLottery;
    }

    public int getRandomNumberRange() 
    {
        return randomNumberRange;
    }

    public void setRandomNumberRange(int randomNumberRange) 
    {
        this.randomNumberRange = randomNumberRange;
    }

    public int getGainPriceA() 
    {
        return gainPriceA;
    }

    public void setGainPriceA(int gainPriceA) 
    {
        this.gainPriceA = gainPriceA;
    }

    public int getGainPriceB() 
    {
        return gainPriceB;
    }

    public void setGainPriceB(int gainPriceB) 
    {
        this.gainPriceB = gainPriceB;
    }

    public int getGainPriceC() 
    {
        return gainPriceC;
    }

    public void setGainPriceC(int gainPriceC) 
    {
        this.gainPriceC = gainPriceC;
    }
    
    /* Function that gets the random number in the interval of 1 and the random number desired */
    public int randomNumber(int randonNumberRange)
    {
        int randomNumberResult = 0;
        Random randNumber = new Random();
        
        randomNumberResult = (int) (Math.random()* randonNumberRange + 1);
        return randomNumberResult;
    }
    
    /* Function that calculate the price that the person in the lottery will gain, considering the 
        random numbers inputed
    */
    public void lotteryGainMoney(int randomNumberRange, int gainPriceA, int gainPriceB, int gainPriceC)
    {
        int randomNumber = randomNumber(randomNumberRange);
        int randomNumberLottery = randomNumber(randomNumberRange);
        int totalMoneyEarned = 0;
        int denominatorContPrice = 0;
        int resultIrreductibleFraction = 0;
        
        while(randomNumber != randomNumberLottery)
        {
            if(randomNumber > randomNumberLottery)
            {
                totalMoneyEarned += gainPriceA;
                denominatorContPrice++;
            }
            else if(randomNumber < randomNumberLottery)
            {
                totalMoneyEarned += gainPriceB;
                denominatorContPrice++;
            }
        }
        
        if(randomNumber == randomNumberLottery)
        {
            totalMoneyEarned += gainPriceC;
            irreductibleFraction(totalMoneyEarned, denominatorContPrice);
            
        }
    }
    
    /* Function that calculate the irreductible fraction  */
    public void irreductibleFraction(int numerador, int denominador) 
    {
        int cont = 1;
        while ((numerador % cont == 0) && (denominador % cont == 0)) 
        {
            if(denominador != 0)
            {
                numerador /= cont;
                denominador /= cont;
                cont++;   
            }
            else
            {
                break;
            }
           
        }
        
        System.out.println(numerador + "/" + denominador);
    }
}
