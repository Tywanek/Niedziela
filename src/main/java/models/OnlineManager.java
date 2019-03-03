package models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Film;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineManager {

    private static String getResponse(String urlQueryString) throws Exception {
        URL url = new URL(urlQueryString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.addRequestProperty("User-Agent", "Mozilla/4.76");
        connection.connect();
        InputStream inStream = connection.getInputStream();
        return new Scanner(inStream, "UTF-8").useDelimiter("\\Z").next();
    }

    private static List<Film> getPOJO(String rawJSON) {
        Gson gson = new Gson();
        List<Film> listafilmow = (ArrayList<Film>) gson.fromJson(rawJSON, new TypeToken<ArrayList<Film>>() {
        }.getType());
        return listafilmow;
    }

    public static List<Film> getMovieList() throws Exception {
        return getPOJO(getResponse("https://raw.githubusercontent.com/mstora/Filmy-Strumienie/master/filmy.json"));
    }
}
