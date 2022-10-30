package MyModel;

import Network.MyApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance
{

    private static final String BASE_URL="http://thepartymantra.com/api/";
    public static Retrofit retrofit=null;
    public static MyApi getService()
    {
        if(retrofit==null)
        {
             retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                     .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(MyApi.class);
    }

}
