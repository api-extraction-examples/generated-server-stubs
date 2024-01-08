package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionUpdateRequestDataAttributes
 */

@JsonTypeName("AppStoreVersionUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionUpdateRequestDataAttributes {

  private String copyright;

  private Boolean downloadable;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime earliestReleaseDate;

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

  public AppStoreVersionUpdateRequestDataAttributes copyright(String copyright) {
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

  public AppStoreVersionUpdateRequestDataAttributes downloadable(Boolean downloadable) {
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

  public AppStoreVersionUpdateRequestDataAttributes earliestReleaseDate(OffsetDateTime earliestReleaseDate) {
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

  public AppStoreVersionUpdateRequestDataAttributes releaseType(ReleaseTypeEnum releaseType) {
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

  public AppStoreVersionUpdateRequestDataAttributes usesIdfa(Boolean usesIdfa) {
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

  public AppStoreVersionUpdateRequestDataAttributes versionString(String versionString) {
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
    AppStoreVersionUpdateRequestDataAttributes appStoreVersionUpdateRequestDataAttributes = (AppStoreVersionUpdateRequestDataAttributes) o;
    return Objects.equals(this.copyright, appStoreVersionUpdateRequestDataAttributes.copyright) &&
        Objects.equals(this.downloadable, appStoreVersionUpdateRequestDataAttributes.downloadable) &&
        Objects.equals(this.earliestReleaseDate, appStoreVersionUpdateRequestDataAttributes.earliestReleaseDate) &&
        Objects.equals(this.releaseType, appStoreVersionUpdateRequestDataAttributes.releaseType) &&
        Objects.equals(this.usesIdfa, appStoreVersionUpdateRequestDataAttributes.usesIdfa) &&
        Objects.equals(this.versionString, appStoreVersionUpdateRequestDataAttributes.versionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyright, downloadable, earliestReleaseDate, releaseType, usesIdfa, versionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionUpdateRequestDataAttributes {\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    earliestReleaseDate: ").append(toIndentedString(earliestReleaseDate)).append("\n");
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

