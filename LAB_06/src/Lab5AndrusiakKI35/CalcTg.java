package Lab5AndrusiakKI35;

public class CalcTg {

    public double calc(double x) throws CalcException {
        double rad;
        double res;
        rad = x * Math.PI / 180;

        try {
            res = (1.0 / Math.tan(2 * rad));
            // Якщо результат не є числом, то генеруємо виключення
            if (res==Double.NaN || res==Double.NEGATIVE_INFINITY || res==Double.POSITIVE_INFINITY || x==45 || x== -45) // при PI/4 - вийде нескінченність
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            // створимо виключення вищого рівня з поясненням причини // виникнення помилки
            if (rad==Math.PI/4.0 || rad==-Math.PI/4.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return res;
    }
}