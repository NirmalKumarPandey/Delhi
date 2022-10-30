package Network;

import MyModel.Nirmal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

public interface MyApi
{
    @GET("home")
    @Streaming
    Call<Nirmal> getAllUser();
}
