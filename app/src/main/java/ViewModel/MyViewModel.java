package ViewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import java.util.List;

import MyModel.Nirmal;
import MyModel.Other;
import Network.MyApi;
import Network.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MyViewModel extends ViewModel
{
    public MutableLiveData<List<Other>> mutableLiveData;
    public LiveData<List<Other>> getAllUser()
    {
        if(mutableLiveData==null) {
            mutableLiveData = new MutableLiveData<>();
            MyApi myApi = RetrofitInstance.getService();
            Call<Nirmal> call = myApi.getAllUser();
            call.enqueue(new Callback<Nirmal>() {
                @Override
                public void onResponse(Call<Nirmal> call, Response<Nirmal> response) {
                    if (response.isSuccessful())
                    {
                        Thread thread=new Thread(new Runnable() {
                            @Override
                            public void run()
                            {
                                Log.d("nir","Success.....");
                                Nirmal nirmal=response.body();
                                List<Other> otherList= nirmal.getOthers();

                                for(int i=0;i<otherList.size();i++)
                                {
                                    Log.d("nir","Success....."+i+"User Data"+otherList.get(i).getName());
                                }
                                mutableLiveData.postValue(otherList);


                            }
                        });
                        thread.start();

                          /* Log.d("nir","Success.....");
                           Nirmal nirmal=response.body();
                          List<Other> otherList= nirmal.getOthers();

                           for(int i=0;i<otherList.size();i++)
                           {
                               Log.d("nir","Success....."+i+"User Data"+otherList.get(i).getName());
                           }
                           mutableLiveData.setValue(otherList);
*/
                    }
                    else
                    {
                        Log.d("nir","Fail.....");
                    }
                }

                @Override
                public void onFailure(Call<Nirmal> call, Throwable t)
                {
                    Log.d("nir","failure.....");
                }
            });
        }
        return mutableLiveData;
    }
}
