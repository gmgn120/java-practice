package practice2;

public class CoinCase {
	private int Yen500 = 0;
	private int Yen100 = 0;
	private int Yen50 = 0;
    private int Yen10 = 0;
    private int Yen5 = 0;
    private int Yen1 = 0;

    public void AddCoins(int kind, int count) {
    	switch(kind) {
    	case 500:
    		Yen500 += count;
    		break;
    	case 100:
    		Yen100 += count;
    		break;
    	case 50:
    		Yen50 += count;
    		break;
    	case 10:
    		Yen10 += count;
    		break;
    	case 5:
    		Yen5 += count;
    		break;
    	case 1:
    		Yen1 += count;
    		break;
    	}
    }


}

