package lesson10;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpClientDemo {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://google.com/mail")
                .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.body().string());
        System.out.println(response.code());
    }
}
