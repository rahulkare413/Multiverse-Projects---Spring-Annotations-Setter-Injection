package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component
public class VideoGame implements Game{

    @Override
    public void getGameType() {
        System.out.println("INDOOR GAME ");
    }

    @Override
    public void getGameInformation() {
        System.out.println("GAME NAME IS :- SUPER MARIO😎");
        System.out.println("SINGLE PLAYER CAN ALSO PLAY VIDEO GAME ");

    }
}
