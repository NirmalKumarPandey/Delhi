package Network;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance
{
    private static final String BASE_URL="http://thepartymantra.com/api/";
    private static Retrofit retrofit = null;

    public static MyApi getService() {
        if(retrofit==null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getOkHttpClient())
                    .build();
        }
        return retrofit.create(MyApi.class);
    }


    private static OkHttpClient getOkHttpClient() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Interceptor requestInterceptor =new Interceptor() {
            @NotNull
            @Override
            public Response intercept(@NotNull Chain chain) throws IOException
            {
                Request originalRequest=chain.request();
                originalRequest=originalRequest.newBuilder().addHeader("token","nirmal").build();
                Response originalResponse=chain.proceed(originalRequest);
              /*  if(originalResponse.code()== HttpStatus.SC_UNAUTHORIZED)
                {
                    //Token has been expire User has to be re-login

                }*/
                return originalResponse;
            }
        };
        builder.interceptors().add(httpLoggingInterceptor);
        builder.addInterceptor(requestInterceptor);
        builder.readTimeout(45, TimeUnit.SECONDS);
        builder.connectTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30,TimeUnit.SECONDS);
        builder.callTimeout(60,TimeUnit.SECONDS);
        return builder.build();
    }
// Rough work of the Company Work.......................................
    //...................................................................................

  /*  private static OkHttpClient getOkHttpClient()
    {

        Interceptor interceptor=new Interceptor() {
            @NotNull
            @Override
            public Response intercept(@NotNull Chain chain) throws IOException
            {

                Request originalRequest=chain.request();
                originalRequest=originalRequest.newBuilder()
                        .addHeader("Content-Type","application/json")
                        .addHeader("HeaderKeyId","")
                        .build();
                return chain.proceed(originalRequest);
            }
        };

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Interceptor requestInterceptor =new Interceptor() {
            @NotNull
            @Override
            public Response intercept(@NotNull Chain chain) throws IOException
            {
                Request originalRequest=chain.request();
                originalRequest=originalRequest.newBuilder().addHeader("token","nirmal").build();
                Response originalResponse=chain.proceed(originalRequest);
              *//*  if(originalResponse.code()== HttpStatus.SC_UNAUTHORIZED)
                {
                    //Token has been expire User has to be re-login

                }*//*
                return originalResponse;
            }
        };
        builder.interceptors().add(httpLoggingInterceptor);
        builder.addInterceptor(requestInterceptor);
        builder.addInterceptor(interceptor);
        builder.readTimeout(45, TimeUnit.SECONDS);
        builder.connectTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30,TimeUnit.SECONDS);
        builder.callTimeout(60,TimeUnit.SECONDS);
        return builder.build();
    }
*/
}
