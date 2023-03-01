package jetBrainsTasks.validation;

public class StringNumberValidator extends CardNumberValidator{
    private static final int VALID_STRING_LENGTH=16;

    @Override
    protected boolean validateCard (String cardNumber){
        if(areStringContentsValid(cardNumber))
            return (next!= null ? next.validateCard(cardNumber):true);
        else
            return  false;
    }
    private boolean areStringContentsValid(String s){
        return ((s!=null)&&(s.length()==VALID_STRING_LENGTH)&&s.matches("[0-9]+"));
    }
}
