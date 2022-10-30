
package MyModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Nirmal {

    @SerializedName("banners")
    private List<Banner> mBanners;
    @SerializedName("collections")
    private List<Collection> mCollections;
    @SerializedName("nearby")
    private List<Object> mNearby;
    @SerializedName("otherbanners")
    private List<Object> mOtherbanners;
    @SerializedName("others")
    private List<Other> mOthers;

    public List<Banner> getBanners() {
        return mBanners;
    }

    public void setBanners(List<Banner> banners) {
        mBanners = banners;
    }

    public List<Collection> getCollections() {
        return mCollections;
    }

    public void setCollections(List<Collection> collections) {
        mCollections = collections;
    }

    public List<Object> getNearby() {
        return mNearby;
    }

    public void setNearby(List<Object> nearby) {
        mNearby = nearby;
    }

    public List<Object> getOtherbanners() {
        return mOtherbanners;
    }

    public void setOtherbanners(List<Object> otherbanners) {
        mOtherbanners = otherbanners;
    }

    public List<Other> getOthers() {
        return mOthers;
    }

    public void setOthers(List<Other> others) {
        mOthers = others;
    }

}
