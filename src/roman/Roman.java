package roman;

import java.util.Iterator;

/**
 * Created by legeek on 14/02/14.
 */
public class Roman {
    public Roman(){}

    public int decode(String str) throws Exception {
        int total = 0;
        int oldValue = 0, currentValue = 0;

        for(int i = 0; i < str.length(); ++i){
            currentValue = valueSymbole(str.charAt(i));
            if(oldValue < currentValue){
                total = total - oldValue + (currentValue - oldValue);
            }
            else{
                total += currentValue;
            }

            oldValue = currentValue;
        }

        return total;
    }

    private int valueSymbole(Character symbole) throws Exception {
        switch (symbole){
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                throw new Exception("The letter '" + symbole + "' not exists");

        }
    }
}
