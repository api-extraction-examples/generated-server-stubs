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
 * Contains the response to a successful &lt;a&gt;UpdateSAMLProvider&lt;/a&gt; request. 
 */

@Schema(name = "UpdateSAMLProviderResponse", description = "Contains the response to a successful <a>UpdateSAMLProvider</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateSAMLProviderResponse {

  private String saMLProviderArn;

  public UpdateSAMLProviderResponse saMLProviderArn(String saMLProviderArn) {
    this.saMLProviderArn = saMLProviderArn;
    return this;
  }

  /**
   * Get saMLProviderArn
   * @return saMLProviderArn
  */
  
  @Schema(name = "SAMLProviderArn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SAMLProviderArn")
  public String getSaMLProviderArn() {
    return saMLProviderArn;
  }

  public void setSaMLProviderArn(String saMLProviderArn) {
    this.saMLProviderArn = saMLProviderArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSAMLProviderResponse updateSAMLProviderResponse = (UpdateSAMLProviderResponse) o;
    return Objects.equals(this.saMLProviderArn, updateSAMLProviderResponse.saMLProviderArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLProviderArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSAMLProviderResponse {\n");
    sb.append("    saMLProviderArn: ").append(toIndentedString(saMLProviderArn)).append("\n");
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

