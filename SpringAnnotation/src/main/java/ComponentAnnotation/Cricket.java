package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component("t20Cricket")
public class Cricket implements Game{

    @Override
    public void getGameType() {
        System.out.println("OUTDOOR GAME ");
    }

    @Override
    public void getGameInformation() {
        System.out.println("T20 SERIES ");
        System.out.println("IPL SEASON ");

    }
}
