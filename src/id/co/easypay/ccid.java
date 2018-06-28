package id.co.easypay;

//import apdu4j.LoggingCardTerminal;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;
import java.util.ArrayList;

/**
 * Created by anton on 28.06.18.
 */

public class ccid {
    public ArrayList<String> getTerminals() {
        System.out.println("Hello, World!");

        TerminalFactory f = TerminalFactory.getDefault();
        try {
            ArrayList<CardTerminal> terms = new ArrayList(f.terminals().list());
            ArrayList<String> termNames = new ArrayList();
            terms.forEach(cardTerminal -> {
                termNames.add(cardTerminal.getName());
            });

//            LoggingCardTerminal reader = LoggingCardTerminal.getInstance(terms.get(0));

            return termNames;
//            System.out.println("ERROR:" + reader.getName());
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
            return new ArrayList<>();
        }
    }
}
