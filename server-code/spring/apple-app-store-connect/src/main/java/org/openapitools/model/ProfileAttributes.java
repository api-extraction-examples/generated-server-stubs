package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.BundleIdPlatform;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProfileAttributes
 */

@JsonTypeName("Profile_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class ProfileAttributes {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  private String name;

  private BundleIdPlatform platform;

  private String profileContent;

  /**
   * Gets or Sets profileState
   */
  public enum ProfileStateEnum {
    ACTIVE("ACTIVE"),
    
    INVALID("INVALID");

    private String value;

    ProfileStateEnum(String value) {
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
    public static ProfileStateEnum fromValue(String value) {
      for (ProfileStateEnum b : ProfileStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProfileStateEnum profileState;

  /**
   * Gets or Sets profileType
   */
  public enum ProfileTypeEnum {
    IOS_APP_DEVELOPMENT("IOS_APP_DEVELOPMENT"),
    
    IOS_APP_STORE("IOS_APP_STORE"),
    
    IOS_APP_ADHOC("IOS_APP_ADHOC"),
    
    IOS_APP_INHOUSE("IOS_APP_INHOUSE"),
    
    MAC_APP_DEVELOPMENT("MAC_APP_DEVELOPMENT"),
    
    MAC_APP_STORE("MAC_APP_STORE"),
    
    MAC_APP_DIRECT("MAC_APP_DIRECT"),
    
    TVOS_APP_DEVELOPMENT("TVOS_APP_DEVELOPMENT"),
    
    TVOS_APP_STORE("TVOS_APP_STORE"),
    
    TVOS_APP_ADHOC("TVOS_APP_ADHOC"),
    
    TVOS_APP_INHOUSE("TVOS_APP_INHOUSE"),
    
    MAC_CATALYST_APP_DEVELOPMENT("MAC_CATALYST_APP_DEVELOPMENT"),
    
    MAC_CATALYST_APP_STORE("MAC_CATALYST_APP_STORE"),
    
    MAC_CATALYST_APP_DIRECT("MAC_CATALYST_APP_DIRECT");

    private String value;

    ProfileTypeEnum(String value) {
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
    public static ProfileTypeEnum fromValue(String value) {
      for (ProfileTypeEnum b : ProfileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProfileTypeEnum profileType;

  private String uuid;

  public ProfileAttributes createdDate(OffsetDateTime createdDate) {
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

  public ProfileAttributes expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  */
  @Valid 
  @Schema(name = "expirationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ProfileAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfileAttributes platform(BundleIdPlatform platform) {
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
  public BundleIdPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(BundleIdPlatform platform) {
    this.platform = platform;
  }

  public ProfileAttributes profileContent(String profileContent) {
    this.profileContent = profileContent;
    return this;
  }

  /**
   * Get profileContent
   * @return profileContent
  */
  
  @Schema(name = "profileContent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileContent")
  public String getProfileContent() {
    return profileContent;
  }

  public void setProfileContent(String profileContent) {
    this.profileContent = profileContent;
  }

  public ProfileAttributes profileState(ProfileStateEnum profileState) {
    this.profileState = profileState;
    return this;
  }

  /**
   * Get profileState
   * @return profileState
  */
  
  @Schema(name = "profileState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileState")
  public ProfileStateEnum getProfileState() {
    return profileState;
  }

  public void setProfileState(ProfileStateEnum profileState) {
    this.profileState = profileState;
  }

  public ProfileAttributes profileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
    return this;
  }

  /**
   * Get profileType
   * @return profileType
  */
  
  @Schema(name = "profileType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileType")
  public ProfileTypeEnum getProfileType() {
    return profileType;
  }

  public void setProfileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }

  public ProfileAttributes uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  
  @Schema(name = "uuid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileAttributes profileAttributes = (ProfileAttributes) o;
    return Objects.equals(this.createdDate, profileAttributes.createdDate) &&
        Objects.equals(this.expirationDate, profileAttributes.expirationDate) &&
        Objects.equals(this.name, profileAttributes.name) &&
        Objects.equals(this.platform, profileAttributes.platform) &&
        Objects.equals(this.profileContent, profileAttributes.profileContent) &&
        Objects.equals(this.profileState, profileAttributes.profileState) &&
        Objects.equals(this.profileType, profileAttributes.profileType) &&
        Objects.equals(this.uuid, profileAttributes.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, expirationDate, name, platform, profileContent, profileState, profileType, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileAttributes {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    profileContent: ").append(toIndentedString(profileContent)).append("\n");
    sb.append("    profileState: ").append(toIndentedString(profileState)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

