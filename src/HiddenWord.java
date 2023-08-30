public class HiddenWord {
    //properties
    
    public String hiddenWord;

    public String guess;

    //constructor
    public HiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord.toUpperCase();
        System.out.println("The length of the hidden word is "+ hiddenWord.length());

    }

    //methods

    public String getHiddenWord(){
        return hiddenWord;

    }

    public String getHint(String guess){
        this.guess = guess;
        String hint = "";
        for(int i = 0; i<guess.length();i++){
            if(Character.isLowerCase(guess.charAt(i))){
                throw new IllegalArgumentException("Your guess ( " +guess+ " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
            }

        }
        if(guess.length()>hiddenWord.length() || guess.length()<hiddenWord.length()){
            throw new IllegalArgumentException("Your guess ( "+ guess +" ) has "+guess.length()+ " characters. The hidden word has 9 characters. Your guess must be a word with 9 characters!");
        }

        for(int i = 0; i<hiddenWord.length(); i++){
            String letter = "" + guess.charAt(i);
            if(hiddenWord.charAt(i)==guess.charAt(i)){
                hint = hint + hiddenWord.charAt(i);
            }
            else if(hiddenWord.contains(letter)){
                hint = hint + "+";

            }
            else{
                hint = hint + "*";

            }

        }

        return hint;



    }

}
