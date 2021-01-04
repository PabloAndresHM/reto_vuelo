package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.StepsOnPage;

public class Answer implements Question<Boolean> {
    int question;

    public Answer(int question) {
        this.question = question;
    }

    public static Object toThe(int numOfCharacters) { return new Answer(numOfCharacters);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result=Boolean.FALSE;
        String search ="ejemplo";
        int position=0;
        String textIn= Text.of(StepsOnPage.TEXT_TO_EXPLORE).viewedBy(actor).asString();
        String textInTwo = textIn.replaceAll("[-+.^:,]","");
        String[] ChainTextIn= textInTwo.split("\n");
        String[] ChainTextInSecond= ChainTextIn[0].split(" ");
        for (int i = 0; i <ChainTextInSecond.length ; i++) {
            if(ChainTextInSecond[i].equals(search)){position=i; break;}

        }
        if (ChainTextInSecond[position+1].length()==question){
            result=Boolean.TRUE;
        }
        return result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
