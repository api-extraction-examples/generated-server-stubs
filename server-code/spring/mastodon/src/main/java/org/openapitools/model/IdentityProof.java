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
 * Represents a proof from an external identity provider.
 */

@Schema(name = "IdentityProof", description = "Represents a proof from an external identity provider.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class IdentityProof {

  private String profileUrl;

  private String proofUrl;

  private String provider;

  private String providerUsername;

  private String updatedAt;

  public IdentityProof profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

  /**
   * The account owner's profile URL on the identity provider.
   * @return profileUrl
  */
  
  @Schema(name = "profile_url", description = "The account owner's profile URL on the identity provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile_url")
  public String getProfileUrl() {
    return profileUrl;
  }

  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }

  public IdentityProof proofUrl(String proofUrl) {
    this.proofUrl = proofUrl;
    return this;
  }

  /**
   * A link to a statement of identity proof, hosted by the identity provider.
   * @return proofUrl
  */
  
  @Schema(name = "proof_url", description = "A link to a statement of identity proof, hosted by the identity provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proof_url")
  public String getProofUrl() {
    return proofUrl;
  }

  public void setProofUrl(String proofUrl) {
    this.proofUrl = proofUrl;
  }

  public IdentityProof provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * The name of the identity provider.
   * @return provider
  */
  
  @Schema(name = "provider", description = "The name of the identity provider.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public IdentityProof providerUsername(String providerUsername) {
    this.providerUsername = providerUsername;
    return this;
  }

  /**
   * The account owner's username on the identity provider's service.
   * @return providerUsername
  */
  
  @Schema(name = "provider_username", description = "The account owner's username on the identity provider's service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider_username")
  public String getProviderUsername() {
    return providerUsername;
  }

  public void setProviderUsername(String providerUsername) {
    this.providerUsername = providerUsername;
  }

  public IdentityProof updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the identity proof was last updated. ISO 8601 Datetime.
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", description = "When the identity proof was last updated. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProof identityProof = (IdentityProof) o;
    return Objects.equals(this.profileUrl, identityProof.profileUrl) &&
        Objects.equals(this.proofUrl, identityProof.proofUrl) &&
        Objects.equals(this.provider, identityProof.provider) &&
        Objects.equals(this.providerUsername, identityProof.providerUsername) &&
        Objects.equals(this.updatedAt, identityProof.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileUrl, proofUrl, provider, providerUsername, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProof {\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    proofUrl: ").append(toIndentedString(proofUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerUsername: ").append(toIndentedString(providerUsername)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

