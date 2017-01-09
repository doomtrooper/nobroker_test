package com.razor.myprogressbar.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kuliza-265 on 8/1/17.
 */

public class Photo {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imagesMap")
    @Expose
    private ImagesMap imagesMap;
    @SerializedName("displayPic")
    @Expose
    private Boolean displayPic;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImagesMap getImagesMap() {
        return imagesMap;
    }

    public void setImagesMap(ImagesMap imagesMap) {
        this.imagesMap = imagesMap;
    }

    public Boolean getDisplayPic() {
        return displayPic;
    }

    public void setDisplayPic(Boolean displayPic) {
        this.displayPic = displayPic;
    }

    @Override
    public String toString() {
        return "Photo{" +
            "title='" + title + '\'' +
            ", name='" + name + '\'' +
            ", imagesMap=" + imagesMap +
            ", displayPic=" + displayPic +
            '}';
    }
}
