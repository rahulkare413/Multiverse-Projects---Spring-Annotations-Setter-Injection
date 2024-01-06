package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Chess implements Game{
    @Override
    public void getGameType() {
        System.out.println("INDOOR GAME ");
    }

    @Override
    public void getGameInformation() {

        System.out.println("AT A TIME TWO PLAYERS CAN BE PLAY ");
        System.out.println("NATIONAL COMPETITION ");
    }
}
