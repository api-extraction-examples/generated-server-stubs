package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Set channel mapping dto.
 */

@Schema(name = "SetChannelMappingDto", description = "Set channel mapping dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SetChannelMappingDto {

  private String providerChannelId;

  private String providerId;

  private String tunerChannelId;

  public SetChannelMappingDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetChannelMappingDto(String providerChannelId, String providerId, String tunerChannelId) {
    this.providerChannelId = providerChannelId;
    this.providerId = providerId;
    this.tunerChannelId = tunerChannelId;
  }

  public SetChannelMappingDto providerChannelId(String providerChannelId) {
    this.providerChannelId = providerChannelId;
    return this;
  }

  /**
   * Gets or sets the provider channel id.
   * @return providerChannelId
  */
  @NotNull 
  @Schema(name = "ProviderChannelId", description = "Gets or sets the provider channel id.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ProviderChannelId")
  public String getProviderChannelId() {
    return providerChannelId;
  }

  public void setProviderChannelId(String providerChannelId) {
    this.providerChannelId = providerChannelId;
  }

  public SetChannelMappingDto providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Gets or sets the provider id.
   * @return providerId
  */
  @NotNull 
  @Schema(name = "ProviderId", description = "Gets or sets the provider id.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ProviderId")
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public SetChannelMappingDto tunerChannelId(String tunerChannelId) {
    this.tunerChannelId = tunerChannelId;
    return this;
  }

  /**
   * Gets or sets the tuner channel id.
   * @return tunerChannelId
  */
  @NotNull 
  @Schema(name = "TunerChannelId", description = "Gets or sets the tuner channel id.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TunerChannelId")
  public String getTunerChannelId() {
    return tunerChannelId;
  }

  public void setTunerChannelId(String tunerChannelId) {
    this.tunerChannelId = tunerChannelId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetChannelMappingDto setChannelMappingDto = (SetChannelMappingDto) o;
    return Objects.equals(this.providerChannelId, setChannelMappingDto.providerChannelId) &&
        Objects.equals(this.providerId, setChannelMappingDto.providerId) &&
        Objects.equals(this.tunerChannelId, setChannelMappingDto.tunerChannelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerChannelId, providerId, tunerChannelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetChannelMappingDto {\n");
    sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    tunerChannelId: ").append(toIndentedString(tunerChannelId)).append("\n");
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

