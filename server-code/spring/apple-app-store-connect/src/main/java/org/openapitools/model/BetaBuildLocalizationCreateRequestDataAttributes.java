package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaBuildLocalizationCreateRequestDataAttributes
 */

@JsonTypeName("BetaBuildLocalizationCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaBuildLocalizationCreateRequestDataAttributes {

  private String locale;

  private String whatsNew;

  public BetaBuildLocalizationCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BetaBuildLocalizationCreateRequestDataAttributes(String locale) {
    this.locale = locale;
  }

  public BetaBuildLocalizationCreateRequestDataAttributes locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  @NotNull 
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public BetaBuildLocalizationCreateRequestDataAttributes whatsNew(String whatsNew) {
    this.whatsNew = whatsNew;
    return this;
  }

  /**
   * Get whatsNew
   * @return whatsNew
  */
  
  @Schema(name = "whatsNew", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("whatsNew")
  public String getWhatsNew() {
    return whatsNew;
  }

  public void setWhatsNew(String whatsNew) {
    this.whatsNew = whatsNew;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaBuildLocalizationCreateRequestDataAttributes betaBuildLocalizationCreateRequestDataAttributes = (BetaBuildLocalizationCreateRequestDataAttributes) o;
    return Objects.equals(this.locale, betaBuildLocalizationCreateRequestDataAttributes.locale) &&
        Objects.equals(this.whatsNew, betaBuildLocalizationCreateRequestDataAttributes.whatsNew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, whatsNew);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaBuildLocalizationCreateRequestDataAttributes {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    whatsNew: ").append(toIndentedString(whatsNew)).append("\n");
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

