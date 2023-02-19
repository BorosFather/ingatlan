/*
* File: Restapi.java
* Author: Boros Zoltán
* Copyright: 2023, BorosFather
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/BorosFather
* Licenc: GNU GPL
*/
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