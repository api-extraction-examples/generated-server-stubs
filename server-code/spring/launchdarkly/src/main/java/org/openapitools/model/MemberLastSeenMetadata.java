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
 * MemberLastSeenMetadata
 */

@JsonTypeName("Member__lastSeenMetadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class MemberLastSeenMetadata {

  private String tokenId;

  public MemberLastSeenMetadata tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * If the last time this member accessed LaunchDarkly was using the REST API, this value will be set to the ID of the personal access token used.
   * @return tokenId
  */
  
  @Schema(name = "tokenId", example = "5fd2a1ee05600316d5cb3e96", description = "If the last time this member accessed LaunchDarkly was using the REST API, this value will be set to the ID of the personal access token used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenId")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberLastSeenMetadata memberLastSeenMetadata = (MemberLastSeenMetadata) o;
    return Objects.equals(this.tokenId, memberLastSeenMetadata.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberLastSeenMetadata {\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

