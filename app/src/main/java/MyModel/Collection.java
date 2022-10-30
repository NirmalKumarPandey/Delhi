
package MyModel;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Collection {

    @SerializedName("about")
    private String mAbout;
    @SerializedName("cover_image")
    private String mCoverImage;
    @SerializedName("id")
    private Long mId;
    @SerializedName("istop")
    private Long mIstop;
    @SerializedName("name")
    private String mName;
    @SerializedName("small_image")
    private String mSmallImage;
    @SerializedName("type")
    private String mType;

    public String getAbout() {
        return mAbout;
    }

    public void setAbout(String about) {
        mAbout = about;
    }

    public String getCoverImage() {
        return mCoverImage;
    }

    public void setCoverImage(String coverImage) {
        mCoverImage = coverImage;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getIstop() {
        return mIstop;
    }

    public void setIstop(Long istop) {
        mIstop = istop;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSmallImage() {
        return mSmallImage;
    }

    public void setSmallImage(String smallImage) {
        mSmallImage = smallImage;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
