package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Links;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserFlagSetting
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UserFlagSetting {

  private Links links;

  private Boolean value;

  private Boolean setting;

  public UserFlagSetting links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public UserFlagSetting value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * The most important attribute in the response. The _value is the current setting for the user. For a boolean feature toggle, this will be true, false, or null if there is no defined fallthrough value.
   * @return value
  */
  
  @Schema(name = "_value", example = "true", description = "The most important attribute in the response. The _value is the current setting for the user. For a boolean feature toggle, this will be true, false, or null if there is no defined fallthrough value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_value")
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  public UserFlagSetting setting(Boolean setting) {
    this.setting = setting;
    return this;
  }

  /**
   * The setting attribute indicates whether you've explicitly targeted this user to receive a particular variation. For example, if you have explicitly turned off a feature toggle for a user, setting will be false. A setting of null means that you haven't assigned that user to a specific variation.
   * @return setting
  */
  
  @Schema(name = "setting", description = "The setting attribute indicates whether you've explicitly targeted this user to receive a particular variation. For example, if you have explicitly turned off a feature toggle for a user, setting will be false. A setting of null means that you haven't assigned that user to a specific variation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("setting")
  public Boolean getSetting() {
    return setting;
  }

  public void setSetting(Boolean setting) {
    this.setting = setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFlagSetting userFlagSetting = (UserFlagSetting) o;
    return Objects.equals(this.links, userFlagSetting.links) &&
        Objects.equals(this.value, userFlagSetting.value) &&
        Objects.equals(this.setting, userFlagSetting.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, value, setting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFlagSetting {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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

