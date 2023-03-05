package HW2.Ex1;

import java.util.Map;

public class StringBuilder {
    Parameters p = new Parameters();

    public String StringBuilder(String startRequest) {
        Map<String, String> requestParameters = p.Parameters();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(startRequest);
        for (Map.Entry<String, String> entry : requestParameters.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null)
                continue;
            sb.append(entry.getKey() + " = " + '"' + entry.getValue() + '"' + " and ");
        }
        if (sb.length() > 5)
            sb.delete(sb.length() - 5, sb.length());
        sb.append(";");

        return sb.toString();
    }
}
