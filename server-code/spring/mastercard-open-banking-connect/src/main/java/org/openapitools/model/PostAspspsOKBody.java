package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PostAspspsOKBodyAspspsItems;
import org.openapitools.model.PostAspspsOKBodyOriginalRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostAspspsOKBody
 */

@JsonTypeName("postAspspsOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostAspspsOKBody {

  @Valid
  private List<@Valid PostAspspsOKBodyAspspsItems> aspsps;

  private PostAspspsOKBodyOriginalRequestInfo originalRequestInfo;

  public PostAspspsOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostAspspsOKBody(PostAspspsOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostAspspsOKBody aspsps(List<@Valid PostAspspsOKBodyAspspsItems> aspsps) {
    this.aspsps = aspsps;
    return this;
  }

  public PostAspspsOKBody addAspspsItem(PostAspspsOKBodyAspspsItems aspspsItem) {
    if (this.aspsps == null) {
      this.aspsps = new ArrayList<>();
    }
    this.aspsps.add(aspspsItem);
    return this;
  }

  /**
   * Get aspsps
   * @return aspsps
  */
  @Valid 
  @Schema(name = "aspsps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aspsps")
  public List<@Valid PostAspspsOKBodyAspspsItems> getAspsps() {
    return aspsps;
  }

  public void setAspsps(List<@Valid PostAspspsOKBodyAspspsItems> aspsps) {
    this.aspsps = aspsps;
  }

  public PostAspspsOKBody originalRequestInfo(PostAspspsOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
    return this;
  }

  /**
   * Get originalRequestInfo
   * @return originalRequestInfo
  */
  @NotNull @Valid 
  @Schema(name = "originalRequestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("originalRequestInfo")
  public PostAspspsOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostAspspsOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAspspsOKBody postAspspsOKBody = (PostAspspsOKBody) o;
    return Objects.equals(this.aspsps, postAspspsOKBody.aspsps) &&
        Objects.equals(this.originalRequestInfo, postAspspsOKBody.originalRequestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspsps, originalRequestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAspspsOKBody {\n");
    sb.append("    aspsps: ").append(toIndentedString(aspsps)).append("\n");
    sb.append("    originalRequestInfo: ").append(toIndentedString(originalRequestInfo)).append("\n");
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

