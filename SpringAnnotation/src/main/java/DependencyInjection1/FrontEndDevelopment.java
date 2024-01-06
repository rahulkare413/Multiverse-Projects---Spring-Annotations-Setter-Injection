package DependencyInjection1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrontEndDevelopment implements Development{

    private JavaScript javaScript;
    @Autowired
    public FrontEndDevelopment(JavaScript javaScript) {
        this.javaScript = javaScript;
    }

    @Override
    public void getCourseData() {
        System.out.println("TYPE IS DEVELOPMENT ");
        System.out.println("DURATION IS 6 MONTHS ");
    }

    @Override
    public void getSubjectInformation() {
        javaScript.getSubjectData();

    }
}
