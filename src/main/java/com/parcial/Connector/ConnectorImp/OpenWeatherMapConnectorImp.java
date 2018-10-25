package com.parcial.Connector.ConnectorImp;

        import com.parcial.Connector.Connector;
        import org.springframework.stereotype.Service;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.OutputStream;
        import java.net.HttpURLConnection;
        import java.net.ProtocolException;
        import java.net.URL;
@Service
public class OpenWeatherMapConnectorImp implements Connector{

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=fd9cb111c04c45ed4d57e4ee304aab6c";

    @Override
    public  StringBuffer getWeatherByCity(String city) throws IOException {

        URL url = new URL(String.format(GET_URL,city));
        return consult(url);

}
    private StringBuffer consult(URL url) throws IOException{
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        StringBuffer response = new StringBuffer();
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;


            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return response;
    }

}


