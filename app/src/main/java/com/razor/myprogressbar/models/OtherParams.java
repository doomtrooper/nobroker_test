package com.razor.myprogressbar.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kuliza-265 on 8/1/17.
 */

public class OtherParams {
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("region_id")
    @Expose
    private String regionId;
    @SerializedName("topPropertyId")
    @Expose
    private Object topPropertyId;
    @SerializedName("searchToken")
    @Expose
    private Object searchToken;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("city")
    @Expose
    private String city;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Object getTopPropertyId() {
        return topPropertyId;
    }

    public void setTopPropertyId(Object topPropertyId) {
        this.topPropertyId = topPropertyId;
    }

    public Object getSearchToken() {
        return searchToken;
    }

    public void setSearchToken(Object searchToken) {
        this.searchToken = searchToken;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "OtherParams{" +
            "count=" + count +
            ", regionId='" + regionId + '\'' +
            ", topPropertyId=" + topPropertyId +
            ", searchToken=" + searchToken +
            ", totalCount=" + totalCount +
            ", city='" + city + '\'' +
            '}';
    }
}
