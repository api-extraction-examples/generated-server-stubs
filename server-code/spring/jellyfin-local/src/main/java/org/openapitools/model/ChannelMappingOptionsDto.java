package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NameIdPair;
import org.openapitools.model.NameValuePair;
import org.openapitools.model.TunerChannelMapping;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Channel mapping options dto.
 */

@Schema(name = "ChannelMappingOptionsDto", description = "Channel mapping options dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ChannelMappingOptionsDto {

  @Valid
  private JsonNullable<List<@Valid NameValuePair>> mappings = JsonNullable.<List<@Valid NameValuePair>>undefined();

  @Valid
  private JsonNullable<List<@Valid NameIdPair>> providerChannels = JsonNullable.<List<@Valid NameIdPair>>undefined();

  private JsonNullable<String> providerName = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid TunerChannelMapping>> tunerChannels = JsonNullable.<List<@Valid TunerChannelMapping>>undefined();

  public ChannelMappingOptionsDto mappings(List<@Valid NameValuePair> mappings) {
    this.mappings = JsonNullable.of(mappings);
    return this;
  }

  public ChannelMappingOptionsDto addMappingsItem(NameValuePair mappingsItem) {
    if (this.mappings == null || !this.mappings.isPresent()) {
      this.mappings = JsonNullable.of(new ArrayList<>());
    }
    this.mappings.get().add(mappingsItem);
    return this;
  }

  /**
   * Gets or sets list of mappings.
   * @return mappings
  */
  @Valid 
  @Schema(name = "Mappings", description = "Gets or sets list of mappings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mappings")
  public JsonNullable<List<@Valid NameValuePair>> getMappings() {
    return mappings;
  }

  public void setMappings(JsonNullable<List<@Valid NameValuePair>> mappings) {
    this.mappings = mappings;
  }

  public ChannelMappingOptionsDto providerChannels(List<@Valid NameIdPair> providerChannels) {
    this.providerChannels = JsonNullable.of(providerChannels);
    return this;
  }

  public ChannelMappingOptionsDto addProviderChannelsItem(NameIdPair providerChannelsItem) {
    if (this.providerChannels == null || !this.providerChannels.isPresent()) {
      this.providerChannels = JsonNullable.of(new ArrayList<>());
    }
    this.providerChannels.get().add(providerChannelsItem);
    return this;
  }

  /**
   * Gets or sets list of provider channels.
   * @return providerChannels
  */
  @Valid 
  @Schema(name = "ProviderChannels", description = "Gets or sets list of provider channels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderChannels")
  public JsonNullable<List<@Valid NameIdPair>> getProviderChannels() {
    return providerChannels;
  }

  public void setProviderChannels(JsonNullable<List<@Valid NameIdPair>> providerChannels) {
    this.providerChannels = providerChannels;
  }

  public ChannelMappingOptionsDto providerName(String providerName) {
    this.providerName = JsonNullable.of(providerName);
    return this;
  }

  /**
   * Gets or sets provider name.
   * @return providerName
  */
  
  @Schema(name = "ProviderName", description = "Gets or sets provider name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderName")
  public JsonNullable<String> getProviderName() {
    return providerName;
  }

  public void setProviderName(JsonNullable<String> providerName) {
    this.providerName = providerName;
  }

  public ChannelMappingOptionsDto tunerChannels(List<@Valid TunerChannelMapping> tunerChannels) {
    this.tunerChannels = JsonNullable.of(tunerChannels);
    return this;
  }

  public ChannelMappingOptionsDto addTunerChannelsItem(TunerChannelMapping tunerChannelsItem) {
    if (this.tunerChannels == null || !this.tunerChannels.isPresent()) {
      this.tunerChannels = JsonNullable.of(new ArrayList<>());
    }
    this.tunerChannels.get().add(tunerChannelsItem);
    return this;
  }

  /**
   * Gets or sets list of tuner channels.
   * @return tunerChannels
  */
  @Valid 
  @Schema(name = "TunerChannels", description = "Gets or sets list of tuner channels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TunerChannels")
  public JsonNullable<List<@Valid TunerChannelMapping>> getTunerChannels() {
    return tunerChannels;
  }

  public void setTunerChannels(JsonNullable<List<@Valid TunerChannelMapping>> tunerChannels) {
    this.tunerChannels = tunerChannels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelMappingOptionsDto channelMappingOptionsDto = (ChannelMappingOptionsDto) o;
    return equalsNullable(this.mappings, channelMappingOptionsDto.mappings) &&
        equalsNullable(this.providerChannels, channelMappingOptionsDto.providerChannels) &&
        equalsNullable(this.providerName, channelMappingOptionsDto.providerName) &&
        equalsNullable(this.tunerChannels, channelMappingOptionsDto.tunerChannels);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(mappings), hashCodeNullable(providerChannels), hashCodeNullable(providerName), hashCodeNullable(tunerChannels));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelMappingOptionsDto {\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    providerChannels: ").append(toIndentedString(providerChannels)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    tunerChannels: ").append(toIndentedString(tunerChannels)).append("\n");
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

