package demoqaMain;

import java.util.HashMap;
import java.util.Objects;

public class DemoQAForm {
    public static HashMap<String, String> getDemoQAFormData(){
        HashMap<String,String>demoqaForm = new HashMap<>();
        demoqaForm.put("FirstName","Shubham");
        demoqaForm.put("LastName","Tirpude");
        demoqaForm.put("Email","shubhamtirpude20@gmail.com");
        demoqaForm.put("Mobile","8698498054");
        demoqaForm.put("DOB","20/08/1994");
        demoqaForm.put("CurrentAddress","Wardha");
        demoqaForm.put("Subjects","Something");
        return demoqaForm;
    }
}
