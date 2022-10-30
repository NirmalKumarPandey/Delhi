
package MyModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Event {

    @SerializedName("avgreviews")
    private List<Object> mAvgreviews;
    @SerializedName("away")
    private Long mAway;
    @SerializedName("creator_id")
    private Long mCreatorId;
    @SerializedName("custom_package_details")
    private String mCustomPackageDetails;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("enddate")
    private String mEnddate;
    @SerializedName("header_image")
    private String mHeaderImage;
    @SerializedName("id")
    private Long mId;
    @SerializedName("lang")
    private String mLang;
    @SerializedName("lat")
    private String mLat;
    @SerializedName("per_person_text")
    private String mPerPersonText;
    @SerializedName("priority")
    private Long mPriority;
    @SerializedName("small_image")
    private String mSmallImage;
    @SerializedName("startdate")
    private String mStartdate;
    @SerializedName("time_to_start")
    private String mTimeToStart;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("tnc")
    private String mTnc;
    @SerializedName("venue_adderss")
    private String mVenueAdderss;
    @SerializedName("venue_name")
    private String mVenueName;

    public List<Object> getAvgreviews() {
        return mAvgreviews;
    }

    public void setAvgreviews(List<Object> avgreviews) {
        mAvgreviews = avgreviews;
    }

    public Long getAway() {
        return mAway;
    }

    public void setAway(Long away) {
        mAway = away;
    }

    public Long getCreatorId() {
        return mCreatorId;
    }

    public void setCreatorId(Long creatorId) {
        mCreatorId = creatorId;
    }

    public String getCustomPackageDetails() {
        return mCustomPackageDetails;
    }

    public void setCustomPackageDetails(String customPackageDetails) {
        mCustomPackageDetails = customPackageDetails;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getEnddate() {
        return mEnddate;
    }

    public void setEnddate(String enddate) {
        mEnddate = enddate;
    }

    public String getHeaderImage() {
        return mHeaderImage;
    }

    public void setHeaderImage(String headerImage) {
        mHeaderImage = headerImage;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public String getLat() {
        return mLat;
    }

    public void setLat(String lat) {
        mLat = lat;
    }

    public String getPerPersonText() {
        return mPerPersonText;
    }

    public void setPerPersonText(String perPersonText) {
        mPerPersonText = perPersonText;
    }

    public Long getPriority() {
        return mPriority;
    }

    public void setPriority(Long priority) {
        mPriority = priority;
    }

    public String getSmallImage() {
        return mSmallImage;
    }

    public void setSmallImage(String smallImage) {
        mSmallImage = smallImage;
    }

    public String getStartdate() {
        return mStartdate;
    }

    public void setStartdate(String startdate) {
        mStartdate = startdate;
    }

    public String getTimeToStart() {
        return mTimeToStart;
    }

    public void setTimeToStart(String timeToStart) {
        mTimeToStart = timeToStart;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTnc() {
        return mTnc;
    }

    public void setTnc(String tnc) {
        mTnc = tnc;
    }

    public String getVenueAdderss() {
        return mVenueAdderss;
    }

    public void setVenueAdderss(String venueAdderss) {
        mVenueAdderss = venueAdderss;
    }

    public String getVenueName() {
        return mVenueName;
    }

    public void setVenueName(String venueName) {
        mVenueName = venueName;
    }

}
