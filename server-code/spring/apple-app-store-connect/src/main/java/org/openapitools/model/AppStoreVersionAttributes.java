package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.AppStoreVersionState;
import org.openapitools.model.Platform;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionAttributes
 */

@JsonTypeName("AppStoreVersion_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionAttributes {

  private AppStoreVersionState appStoreState;

  private String copyright;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Boolean downloadable;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime earliestReleaseDate;

  private Platform platform;

  /**
   * Gets or Sets releaseType
   */
  public enum ReleaseTypeEnum {
    MANUAL("MANUAL"),
    
    AFTER_APPROVAL("AFTER_APPROVAL"),
    
    SCHEDULED("SCHEDULED");

    private String value;

    ReleaseTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReleaseTypeEnum fromValue(String value) {
      for (ReleaseTypeEnum b : ReleaseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReleaseTypeEnum releaseType;

  private Boolean usesIdfa;

  private String versionString;

  public AppStoreVersionAttributes appStoreState(AppStoreVersionState appStoreState) {
    this.appStoreState = appStoreState;
    return this;
  }

  /**
   * Get appStoreState
   * @return appStoreState
  */
  @Valid 
  @Schema(name = "appStoreState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appStoreState")
  public AppStoreVersionState getAppStoreState() {
    return appStoreState;
  }

  public void setAppStoreState(AppStoreVersionState appStoreState) {
    this.appStoreState = appStoreState;
  }

  public AppStoreVersionAttributes copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * Get copyright
   * @return copyright
  */
  
  @Schema(name = "copyright", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("copyright")
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public AppStoreVersionAttributes createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public AppStoreVersionAttributes downloadable(Boolean downloadable) {
    this.downloadable = downloadable;
    return this;
  }

  /**
   * Get downloadable
   * @return downloadable
  */
  
  @Schema(name = "downloadable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloadable")
  public Boolean getDownloadable() {
    return downloadable;
  }

  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

  public AppStoreVersionAttributes earliestReleaseDate(OffsetDateTime earliestReleaseDate) {
    this.earliestReleaseDate = earliestReleaseDate;
    return this;
  }

  /**
   * Get earliestReleaseDate
   * @return earliestReleaseDate
  */
  @Valid 
  @Schema(name = "earliestReleaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestReleaseDate")
  public OffsetDateTime getEarliestReleaseDate() {
    return earliestReleaseDate;
  }

  public void setEarliestReleaseDate(OffsetDateTime earliestReleaseDate) {
    this.earliestReleaseDate = earliestReleaseDate;
  }

  public AppStoreVersionAttributes platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public AppStoreVersionAttributes releaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
    return this;
  }

  /**
   * Get releaseType
   * @return releaseType
  */
  
  @Schema(name = "releaseType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseType")
  public ReleaseTypeEnum getReleaseType() {
    return releaseType;
  }

  public void setReleaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
  }

  public AppStoreVersionAttributes usesIdfa(Boolean usesIdfa) {
    this.usesIdfa = usesIdfa;
    return this;
  }

  /**
   * Get usesIdfa
   * @return usesIdfa
  */
  
  @Schema(name = "usesIdfa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usesIdfa")
  public Boolean getUsesIdfa() {
    return usesIdfa;
  }

  public void setUsesIdfa(Boolean usesIdfa) {
    this.usesIdfa = usesIdfa;
  }

  public AppStoreVersionAttributes versionString(String versionString) {
    this.versionString = versionString;
    return this;
  }

  /**
   * Get versionString
   * @return versionString
  */
  
  @Schema(name = "versionString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionString")
  public String getVersionString() {
    return versionString;
  }

  public void setVersionString(String versionString) {
    this.versionString = versionString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionAttributes appStoreVersionAttributes = (AppStoreVersionAttributes) o;
    return Objects.equals(this.appStoreState, appStoreVersionAttributes.appStoreState) &&
        Objects.equals(this.copyright, appStoreVersionAttributes.copyright) &&
        Objects.equals(this.createdDate, appStoreVersionAttributes.createdDate) &&
        Objects.equals(this.downloadable, appStoreVersionAttributes.downloadable) &&
        Objects.equals(this.earliestReleaseDate, appStoreVersionAttributes.earliestReleaseDate) &&
        Objects.equals(this.platform, appStoreVersionAttributes.platform) &&
        Objects.equals(this.releaseType, appStoreVersionAttributes.releaseType) &&
        Objects.equals(this.usesIdfa, appStoreVersionAttributes.usesIdfa) &&
        Objects.equals(this.versionString, appStoreVersionAttributes.versionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStoreState, copyright, createdDate, downloadable, earliestReleaseDate, platform, releaseType, usesIdfa, versionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionAttributes {\n");
    sb.append("    appStoreState: ").append(toIndentedString(appStoreState)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    earliestReleaseDate: ").append(toIndentedString(earliestReleaseDate)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    usesIdfa: ").append(toIndentedString(usesIdfa)).append("\n");
    sb.append("    versionString: ").append(toIndentedString(versionString)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

