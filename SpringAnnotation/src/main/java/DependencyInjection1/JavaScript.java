package DependencyInjection1;

import org.springframework.stereotype.Component;

@Component
public class JavaScript implements  Subject{

    @Override
    public void getSubjectData() {
        System.out.println("JAVA SCRIPT ");
        System.out.println("REACT ");
        System.out.println("REACT NATIVE ");
    }
}
