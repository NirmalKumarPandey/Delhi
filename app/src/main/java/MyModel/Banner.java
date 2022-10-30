
package MyModel;


import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Banner {

    @SerializedName("entity_id")
    private Long mEntityId;
    @SerializedName("entity_type")
    private String mEntityType;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("isactive")
    private Long mIsactive;
    @SerializedName("placeholder")
    private Long mPlaceholder;
    @SerializedName("priority")
    private Long mPriority;

    public Long getEntityId() {
        return mEntityId;
    }

    public void setEntityId(Long entityId) {
        mEntityId = entityId;
    }

    public String getEntityType() {
        return mEntityType;
    }

    public void setEntityType(String entityType) {
        mEntityType = entityType;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public Long getIsactive() {
        return mIsactive;
    }

    public void setIsactive(Long isactive) {
        mIsactive = isactive;
    }

    public Long getPlaceholder() {
        return mPlaceholder;
    }

    public void setPlaceholder(Long placeholder) {
        mPlaceholder = placeholder;
    }

    public Long getPriority() {
        return mPriority;
    }

    public void setPriority(Long priority) {
        mPriority = priority;
    }

}
