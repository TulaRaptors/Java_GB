package HW2.Ex1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Parameters {
    public Map<String, String> Parameters() {

        Map<String, String> requestParameters = new LinkedHashMap<>();
        requestParameters.put("name", "Ivanov");
        requestParameters.put("country", "Russia");
        requestParameters.put("city", "Moscow");
        requestParameters.put("age", null);

        return requestParameters;
    }
}