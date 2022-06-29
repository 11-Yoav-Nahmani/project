public class Fragment {

    private int _nNumerator;
    private int _nDenominator;

    public Fragment(int _nNumerator, int _nDenominator) {
        this._nDenominator = _nDenominator;
        this._nNumerator = _nNumerator;
    }

    public int get_nDenominator() {
        return _nDenominator;
    }

    public int get_nNumerator() {
        return _nNumerator;
    }

    public void set_nDenominator(int _nDenominator) {
        this._nDenominator = _nDenominator;
    }

    public void set_nNumerator(int _nNumerator) {
        this._nNumerator = _nNumerator;
    }

    public void Print() {
        if (this._nDenominator > 1) {
            System.out.println(this._nNumerator + "/" + this._nDenominator);
        } else if (this._nDenominator == 1) {
            System.out.println(this._nNumerator);
        }

    }
}
   /** public Fragment Add(Fragment frgOther) {

    }
    /**
     * Handles the subtraction of two fragments
     * @param frgOther - The other fragment to sub
     * @return - The value of the subtraction

    OOP - שמור - ביה&quot;ס למקצועות המחשב
    מדור תוב&quot;ל

    - שמור - מחשבון שברים 2 מתוך 4


    public Fragment Sub(Fragment frgOther) {}

     * Handles the multiplication of two fragments
     * @param frgOther - The other fragment to mul
     * @return - The value of the multiplication

    public Fragment Mult(Fragment frgOther) {}
    /**
     * Handles the division of two fragments
     * @param frgOther - The other fragment to div
     * @return - The value of the division
    public Fragment Div(Fragment frgOther) {}

     * Cut down the fragment as much as possible

    private void CutDown(){}
} **/