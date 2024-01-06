package DependencyInjection1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BackEnd implements Development{

    private Java java;
        @Autowired
        public BackEnd(Java java) {
        this.java = java;
    }

    @Override
    public void getCourseData() {
        System.out.println("TYPE IS BACK END DEVELOPMENT ");
        System.out.println("DURATION IS 6 MONTHS ");
    }

    @Override
    public void getSubjectInformation() {
            java.getSubjectData();
    }
}
