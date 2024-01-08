package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProfileCreateRequestDataAttributes
 */

@JsonTypeName("ProfileCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class ProfileCreateRequestDataAttributes {

  private String name;

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

  public ProfileCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileCreateRequestDataAttributes(String name, ProfileTypeEnum profileType) {
    this.name = name;
    this.profileType = profileType;
  }

  public ProfileCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfileCreateRequestDataAttributes profileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
    return this;
  }

  /**
   * Get profileType
   * @return profileType
  */
  @NotNull 
  @Schema(name = "profileType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("profileType")
  public ProfileTypeEnum getProfileType() {
    return profileType;
  }

  public void setProfileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileCreateRequestDataAttributes profileCreateRequestDataAttributes = (ProfileCreateRequestDataAttributes) o;
    return Objects.equals(this.name, profileCreateRequestDataAttributes.name) &&
        Objects.equals(this.profileType, profileCreateRequestDataAttributes.profileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, profileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileCreateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
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

