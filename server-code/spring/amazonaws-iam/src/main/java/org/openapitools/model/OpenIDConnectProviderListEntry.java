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
 * Contains the Amazon Resource Name (ARN) for an IAM OpenID Connect provider.
 */

@Schema(name = "OpenIDConnectProviderListEntry", description = "Contains the Amazon Resource Name (ARN) for an IAM OpenID Connect provider.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class OpenIDConnectProviderListEntry {

  private String arn;

  public OpenIDConnectProviderListEntry arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
   * @return arn
  */
  @Size(min = 20, max = 2048) 
  @Schema(name = "Arn", description = "<p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenIDConnectProviderListEntry openIDConnectProviderListEntry = (OpenIDConnectProviderListEntry) o;
    return Objects.equals(this.arn, openIDConnectProviderListEntry.arn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIDConnectProviderListEntry {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
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

