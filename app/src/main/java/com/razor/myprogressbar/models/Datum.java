package com.razor.myprogressbar.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kuliza-265 on 8/1/17.
 */

public class Datum {
    @SerializedName("shortlistedByLoggedInUser")
    @Expose
    private Boolean shortlistedByLoggedInUser;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("leaseType")
    @Expose
    private String leaseType;
    @SerializedName("floor")
    @Expose
    private long floor;
    @SerializedName("totalFloor")
    @Expose
    private long totalFloor;
    @SerializedName("propertySize")
    @Expose
    private long propertySize;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("propertyAge")
    @Expose
    private long propertyAge;
    @SerializedName("accurateLocation")
    @Expose
    private Boolean accurateLocation;
    @SerializedName("pinCode")
    @Expose
    private long pinCode;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("negotiable")
    @Expose
    private Boolean negotiable;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("society")
    @Expose
    private String society;
    @SerializedName("propertyType")
    @Expose
    private String propertyType;
    @SerializedName("bathroom")
    @Expose
    private long bathroom;
    @SerializedName("cupBoard")
    @Expose
    private long cupBoard;
    @SerializedName("parking")
    @Expose
    private String parking;
    @SerializedName("inactiveReason")
    @Expose
    private Object inactiveReason;
    @SerializedName("swimmingPool")
    @Expose
    private Boolean swimmingPool;
    @SerializedName("gym")
    @Expose
    private Boolean gym;
    @SerializedName("furnishing")
    @Expose
    private String furnishing;
    @SerializedName("lift")
    @Expose
    private Boolean lift;
    @SerializedName("propertyCode")
    @Expose
    private String propertyCode;
    @SerializedName("amenities")
    @Expose
    private Object amenities;
    @SerializedName("availableFrom")
    @Expose
    private long availableFrom;
    @SerializedName("creationDate")
    @Expose
    private long creationDate;
    @SerializedName("lastUpdateDate")
    @Expose
    private long lastUpdateDate;
    @SerializedName("activationDate")
    @Expose
    private long activationDate;
    @SerializedName("facing")
    @Expose
    private String facing;
    @SerializedName("localityId")
    @Expose
    private String localityId;
    @SerializedName("nbLocality")
    @Expose
    private String nbLocality;
    @SerializedName("managed")
    @Expose
    private Object managed;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("score")
    @Expose
    private Object score;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("amenitiesMap")
    @Expose
    private AmenitiesMap amenitiesMap;
    @SerializedName("powerBackup")
    @Expose
    private Object powerBackup;
    @SerializedName("waterSupply")
    @Expose
    private String waterSupply;
    @SerializedName("rent")
    @Expose
    private long rent;
    @SerializedName("deposit")
    @Expose
    private long deposit;
    @SerializedName("sharedAccomodation")
    @Expose
    private Boolean sharedAccomodation;
    @SerializedName("accomodationType")
    @Expose
    private Object accomodationType;
    @SerializedName("balconies")
    @Expose
    private Object balconies;
    @SerializedName("buildingType")
    @Expose
    private String buildingType;
    @SerializedName("forLease")
    @Expose
    private Object forLease;
    @SerializedName("typeDesc")
    @Expose
    private String typeDesc;
    @SerializedName("detailUrl")
    @Expose
    private String detailUrl;
    @SerializedName("propertyTitle")
    @Expose
    private String propertyTitle;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tenantTypeDesc")
    @Expose
    private String tenantTypeDesc;
    @SerializedName("loanAvailable")
    @Expose
    private Boolean loanAvailable;
    @SerializedName("accomodationTypeDesc")
    @Expose
    private String accomodationTypeDesc;
    @SerializedName("furnishingDesc")
    @Expose
    private String furnishingDesc;
    @SerializedName("dateOnly")
    @Expose
    private long dateOnly;
    @SerializedName("secondaryTitle")
    @Expose
    private String secondaryTitle;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("adminEvent")
    @Expose
    private String adminEvent;
    @SerializedName("photoAvailable")
    @Expose
    private Boolean photoAvailable;
    @SerializedName("facingDesc")
    @Expose
    private String facingDesc;
    @SerializedName("parkingDesc")
    @Expose
    private String parkingDesc;

    public Boolean getShortlistedByLoggedInUser() {
        return shortlistedByLoggedInUser;
    }

    public void setShortlistedByLoggedInUser(Boolean shortlistedByLoggedInUser) {
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    public long getFloor() {
        return floor;
    }

    public void setFloor(long floor) {
        this.floor = floor;
    }

    public long getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(long totalFloor) {
        this.totalFloor = totalFloor;
    }

    public long getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(long propertySize) {
        this.propertySize = propertySize;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public long getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(long propertyAge) {
        this.propertyAge = propertyAge;
    }

    public Boolean getAccurateLocation() {
        return accurateLocation;
    }

    public void setAccurateLocation(Boolean accurateLocation) {
        this.accurateLocation = accurateLocation;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getNegotiable() {
        return negotiable;
    }

    public void setNegotiable(Boolean negotiable) {
        this.negotiable = negotiable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public long getBathroom() {
        return bathroom;
    }

    public void setBathroom(long bathroom) {
        this.bathroom = bathroom;
    }

    public long getCupBoard() {
        return cupBoard;
    }

    public void setCupBoard(long cupBoard) {
        this.cupBoard = cupBoard;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public Object getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(Object inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public Boolean getGym() {
        return gym;
    }

    public void setGym(Boolean gym) {
        this.gym = gym;
    }

    public String getFurnishing() {
        return furnishing;
    }

    public void setFurnishing(String furnishing) {
        this.furnishing = furnishing;
    }

    public Boolean getLift() {
        return lift;
    }

    public void setLift(Boolean lift) {
        this.lift = lift;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public Object getAmenities() {
        return amenities;
    }

    public void setAmenities(Object amenities) {
        this.amenities = amenities;
    }

    public long getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(long availableFrom) {
        this.availableFrom = availableFrom;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public long getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(long activationDate) {
        this.activationDate = activationDate;
    }

    public String getFacing() {
        return facing;
    }

    public void setFacing(String facing) {
        this.facing = facing;
    }

    public String getLocalityId() {
        return localityId;
    }

    public void setLocalityId(String localityId) {
        this.localityId = localityId;
    }

    public String getNbLocality() {
        return nbLocality;
    }

    public void setNbLocality(String nbLocality) {
        this.nbLocality = nbLocality;
    }

    public Object getManaged() {
        return managed;
    }

    public void setManaged(Object managed) {
        this.managed = managed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public AmenitiesMap getAmenitiesMap() {
        return amenitiesMap;
    }

    public void setAmenitiesMap(AmenitiesMap amenitiesMap) {
        this.amenitiesMap = amenitiesMap;
    }

    public Object getPowerBackup() {
        return powerBackup;
    }

    public void setPowerBackup(Object powerBackup) {
        this.powerBackup = powerBackup;
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(String waterSupply) {
        this.waterSupply = waterSupply;
    }

    public long getRent() {
        return rent;
    }

    public void setRent(long rent) {
        this.rent = rent;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public Boolean getSharedAccomodation() {
        return sharedAccomodation;
    }

    public void setSharedAccomodation(Boolean sharedAccomodation) {
        this.sharedAccomodation = sharedAccomodation;
    }

    public Object getAccomodationType() {
        return accomodationType;
    }

    public void setAccomodationType(Object accomodationType) {
        this.accomodationType = accomodationType;
    }

    public Object getBalconies() {
        return balconies;
    }

    public void setBalconies(Object balconies) {
        this.balconies = balconies;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Object getForLease() {
        return forLease;
    }

    public void setForLease(Object forLease) {
        this.forLease = forLease;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getPropertyTitle() {
        return propertyTitle;
    }

    public void setPropertyTitle(String propertyTitle) {
        this.propertyTitle = propertyTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTenantTypeDesc() {
        return tenantTypeDesc;
    }

    public void setTenantTypeDesc(String tenantTypeDesc) {
        this.tenantTypeDesc = tenantTypeDesc;
    }

    public Boolean getLoanAvailable() {
        return loanAvailable;
    }

    public void setLoanAvailable(Boolean loanAvailable) {
        this.loanAvailable = loanAvailable;
    }

    public String getAccomodationTypeDesc() {
        return accomodationTypeDesc;
    }

    public void setAccomodationTypeDesc(String accomodationTypeDesc) {
        this.accomodationTypeDesc = accomodationTypeDesc;
    }

    public String getFurnishingDesc() {
        return furnishingDesc;
    }

    public void setFurnishingDesc(String furnishingDesc) {
        this.furnishingDesc = furnishingDesc;
    }

    public long getDateOnly() {
        return dateOnly;
    }

    public void setDateOnly(long dateOnly) {
        this.dateOnly = dateOnly;
    }

    public String getSecondaryTitle() {
        return secondaryTitle;
    }

    public void setSecondaryTitle(String secondaryTitle) {
        this.secondaryTitle = secondaryTitle;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getAdminEvent() {
        return adminEvent;
    }

    public void setAdminEvent(String adminEvent) {
        this.adminEvent = adminEvent;
    }

    public Boolean getPhotoAvailable() {
        return photoAvailable;
    }

    public void setPhotoAvailable(Boolean photoAvailable) {
        this.photoAvailable = photoAvailable;
    }

    public String getFacingDesc() {
        return facingDesc;
    }

    public void setFacingDesc(String facingDesc) {
        this.facingDesc = facingDesc;
    }

    public String getParkingDesc() {
        return parkingDesc;
    }

    public void setParkingDesc(String parkingDesc) {
        this.parkingDesc = parkingDesc;
    }

    @Override
    public String toString() {
        return "Datum{" +
            "shortlistedByLoggedInUser=" + shortlistedByLoggedInUser +
            ", id='" + id + '\'' +
            ", shortUrl='" + shortUrl + '\'' +
            ", description='" + description + '\'' +
            ", leaseType='" + leaseType + '\'' +
            ", floor=" + floor +
            ", totalFloor=" + totalFloor +
            ", propertySize=" + propertySize +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", propertyAge=" + propertyAge +
            ", accurateLocation=" + accurateLocation +
            ", pinCode=" + pinCode +
            ", active=" + active +
            ", negotiable=" + negotiable +
            ", type='" + type + '\'' +
            ", city='" + city + '\'' +
            ", locality='" + locality + '\'' +
            ", street='" + street + '\'' +
            ", society='" + society + '\'' +
            ", propertyType='" + propertyType + '\'' +
            ", bathroom=" + bathroom +
            ", cupBoard=" + cupBoard +
            ", parking='" + parking + '\'' +
            ", inactiveReason=" + inactiveReason +
            ", swimmingPool=" + swimmingPool +
            ", gym=" + gym +
            ", furnishing='" + furnishing + '\'' +
            ", lift=" + lift +
            ", propertyCode='" + propertyCode + '\'' +
            ", amenities=" + amenities +
            ", availableFrom=" + availableFrom +
            ", creationDate=" + creationDate +
            ", lastUpdateDate=" + lastUpdateDate +
            ", activationDate=" + activationDate +
            ", facing='" + facing + '\'' +
            ", localityId='" + localityId + '\'' +
            ", nbLocality='" + nbLocality + '\'' +
            ", managed=" + managed +
            ", location='" + location + '\'' +
            ", score=" + score +
            ", ownerId='" + ownerId + '\'' +
            ", amenitiesMap=" + amenitiesMap +
            ", powerBackup=" + powerBackup +
            ", waterSupply='" + waterSupply + '\'' +
            ", rent=" + rent +
            ", deposit=" + deposit +
            ", sharedAccomodation=" + sharedAccomodation +
            ", accomodationType=" + accomodationType +
            ", balconies=" + balconies +
            ", buildingType='" + buildingType + '\'' +
            ", forLease=" + forLease +
            ", typeDesc='" + typeDesc + '\'' +
            ", detailUrl='" + detailUrl + '\'' +
            ", propertyTitle='" + propertyTitle + '\'' +
            ", title='" + title + '\'' +
            ", tenantTypeDesc='" + tenantTypeDesc + '\'' +
            ", loanAvailable=" + loanAvailable +
            ", accomodationTypeDesc='" + accomodationTypeDesc + '\'' +
            ", furnishingDesc='" + furnishingDesc + '\'' +
            ", dateOnly=" + dateOnly +
            ", secondaryTitle='" + secondaryTitle + '\'' +
            ", photos=" + photos +
            ", adminEvent='" + adminEvent + '\'' +
            ", photoAvailable=" + photoAvailable +
            ", facingDesc='" + facingDesc + '\'' +
            ", parkingDesc='" + parkingDesc + '\'' +
            '}';
    }
}
