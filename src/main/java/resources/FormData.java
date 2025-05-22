package resources;

import org.apache.commons.collections4.map.HashedMap;

import java.util.HashMap;

public class FormData {

    public static HashMap<String,String> getFormData(){
        HashMap<String,String>formdata=new HashMap<>();
        formdata.put("username","student");
        formdata.put("password","Password123");
        return formdata;
    }
}
