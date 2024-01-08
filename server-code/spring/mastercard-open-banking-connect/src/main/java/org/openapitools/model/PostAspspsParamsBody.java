package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdditionalDataField;
import org.openapitools.model.PostAspspsParamsBodyRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostAspspsParamsBody
 */

@JsonTypeName("postAspspsParamsBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostAspspsParamsBody {

  private String country;

  private String id;

  private String name;

  private PostAspspsParamsBodyRequestInfo requestInfo;

  @Valid
  private List<@Valid AdditionalDataField> returnAdditionalData;

  public PostAspspsParamsBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostAspspsParamsBody(PostAspspsParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public PostAspspsParamsBody country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Filter by country code (ISO 3166 Alpha 2), exact match pattern
   * @return country
  */
  @Pattern(regexp = "^[A-Z]{2}$") 
  @Schema(name = "country", example = "GB", description = "Filter by country code (ISO 3166 Alpha 2), exact match pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PostAspspsParamsBody id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Filter by internal id of ASPSP, exact match pattern
   * @return id
  */
  @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") 
  @Schema(name = "id", example = "", description = "Filter by internal id of ASPSP, exact match pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostAspspsParamsBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Filter by name of ASPSP, contains pattern
   * @return name
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "name", example = "", description = "Filter by name of ASPSP, contains pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostAspspsParamsBody requestInfo(PostAspspsParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

  /**
   * Get requestInfo
   * @return requestInfo
  */
  @NotNull @Valid 
  @Schema(name = "requestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestInfo")
  public PostAspspsParamsBodyRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(PostAspspsParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public PostAspspsParamsBody returnAdditionalData(List<@Valid AdditionalDataField> returnAdditionalData) {
    this.returnAdditionalData = returnAdditionalData;
    return this;
  }

  public PostAspspsParamsBody addReturnAdditionalDataItem(AdditionalDataField returnAdditionalDataItem) {
    if (this.returnAdditionalData == null) {
      this.returnAdditionalData = new ArrayList<>();
    }
    this.returnAdditionalData.add(returnAdditionalDataItem);
    return this;
  }

  /**
   * Specifies what additional fields for ASPSP object should be included in response
   * @return returnAdditionalData
  */
  @Valid 
  @Schema(name = "returnAdditionalData", description = "Specifies what additional fields for ASPSP object should be included in response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnAdditionalData")
  public List<@Valid AdditionalDataField> getReturnAdditionalData() {
    return returnAdditionalData;
  }

  public void setReturnAdditionalData(List<@Valid AdditionalDataField> returnAdditionalData) {
    this.returnAdditionalData = returnAdditionalData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAspspsParamsBody postAspspsParamsBody = (PostAspspsParamsBody) o;
    return Objects.equals(this.country, postAspspsParamsBody.country) &&
        Objects.equals(this.id, postAspspsParamsBody.id) &&
        Objects.equals(this.name, postAspspsParamsBody.name) &&
        Objects.equals(this.requestInfo, postAspspsParamsBody.requestInfo) &&
        Objects.equals(this.returnAdditionalData, postAspspsParamsBody.returnAdditionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, id, name, requestInfo, returnAdditionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAspspsParamsBody {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    returnAdditionalData: ").append(toIndentedString(returnAdditionalData)).append("\n");
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

