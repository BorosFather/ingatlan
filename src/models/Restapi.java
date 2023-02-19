package models;

public class Restapi {

    public Restapi() {
    }

    public String getPropertys()
    {
        HttpClient http = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;
        String res = http.get(urlStr);
        return res;
    }
    
}