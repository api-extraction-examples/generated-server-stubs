package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.LogoObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostAspspsOKBodyAspspsItems
 */

@JsonTypeName("postAspspsOKBodyAspspsItems")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostAspspsOKBodyAspspsItems {

  /**
   * Gets or Sets aspspServices
   */
  public enum AspspServicesEnum {
    AIS("AIS"),
    
    PIS("PIS"),
    
    COF("COF");

    private String value;

    AspspServicesEnum(String value) {
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
    public static AspspServicesEnum fromValue(String value) {
      for (AspspServicesEnum b : AspspServicesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<AspspServicesEnum> aspspServices;

  @Valid
  private Map<String, Boolean> capabilities = new HashMap<>();

  private String country;

  private String id;

  private LogoObject logo;

  private String name;

  private String profile;

  public PostAspspsOKBodyAspspsItems aspspServices(List<AspspServicesEnum> aspspServices) {
    this.aspspServices = aspspServices;
    return this;
  }

  public PostAspspsOKBodyAspspsItems addAspspServicesItem(AspspServicesEnum aspspServicesItem) {
    if (this.aspspServices == null) {
      this.aspspServices = new ArrayList<>();
    }
    this.aspspServices.add(aspspServicesItem);
    return this;
  }

  /**
   * Provided services, AIS - account information, PIS - payment initiation
   * @return aspspServices
  */
  
  @Schema(name = "aspspServices", example = "[AIS, PIS, COF]", description = "Provided services, AIS - account information, PIS - payment initiation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aspspServices")
  public List<AspspServicesEnum> getAspspServices() {
    return aspspServices;
  }

  public void setAspspServices(List<AspspServicesEnum> aspspServices) {
    this.aspspServices = aspspServices;
  }

  public PostAspspsOKBodyAspspsItems capabilities(Map<String, Boolean> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public PostAspspsOKBodyAspspsItems putCapabilitiesItem(String key, Boolean capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

  /**
   * Capabilities related to api profile assigned to ASPSP
   * @return capabilities
  */
  
  @Schema(name = "capabilities", example = "{delete_ais_consent=true, obtain_ais_consent=true, retrieve_accounts=true}", description = "Capabilities related to api profile assigned to ASPSP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capabilities")
  public Map<String, Boolean> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Map<String, Boolean> capabilities) {
    this.capabilities = capabilities;
  }

  public PostAspspsOKBodyAspspsItems country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code
   * @return country
  */
  
  @Schema(name = "country", example = "UK", description = "Country code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PostAspspsOKBodyAspspsItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identification of the ASPSP
   * @return id
  */
  
  @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426655440000", description = "Identification of the ASPSP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostAspspsOKBodyAspspsItems logo(LogoObject logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
  */
  @Valid 
  @Schema(name = "logo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logo")
  public LogoObject getLogo() {
    return logo;
  }

  public void setLogo(LogoObject logo) {
    this.logo = logo;
  }

  public PostAspspsOKBodyAspspsItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the ASPSP
   * @return name
  */
  
  @Schema(name = "name", example = "Wood bank", description = "Name of the ASPSP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostAspspsOKBodyAspspsItems profile(String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * ASPSP profile
   * @return profile
  */
  
  @Schema(name = "profile", example = "CMA9", description = "ASPSP profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAspspsOKBodyAspspsItems postAspspsOKBodyAspspsItems = (PostAspspsOKBodyAspspsItems) o;
    return Objects.equals(this.aspspServices, postAspspsOKBodyAspspsItems.aspspServices) &&
        Objects.equals(this.capabilities, postAspspsOKBodyAspspsItems.capabilities) &&
        Objects.equals(this.country, postAspspsOKBodyAspspsItems.country) &&
        Objects.equals(this.id, postAspspsOKBodyAspspsItems.id) &&
        Objects.equals(this.logo, postAspspsOKBodyAspspsItems.logo) &&
        Objects.equals(this.name, postAspspsOKBodyAspspsItems.name) &&
        Objects.equals(this.profile, postAspspsOKBodyAspspsItems.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspspServices, capabilities, country, id, logo, name, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAspspsOKBodyAspspsItems {\n");
    sb.append("    aspspServices: ").append(toIndentedString(aspspServices)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

