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
 * MusicExportPreferences
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicExportPreferences {

  private String accessExpiresAt;

  private String accessToken;

  private Boolean addPlusExport;

  private String authorizationCode;

  private String lastExport;

  private String legacyState;

  private String partnerId;

  private String refreshToken;

  private Boolean terms;

  private String vendor;

  public MusicExportPreferences() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicExportPreferences(String accessExpiresAt, String accessToken, Boolean addPlusExport, String authorizationCode, String lastExport, String legacyState, String partnerId, String refreshToken, Boolean terms, String vendor) {
    this.accessExpiresAt = accessExpiresAt;
    this.accessToken = accessToken;
    this.addPlusExport = addPlusExport;
    this.authorizationCode = authorizationCode;
    this.lastExport = lastExport;
    this.legacyState = legacyState;
    this.partnerId = partnerId;
    this.refreshToken = refreshToken;
    this.terms = terms;
    this.vendor = vendor;
  }

  public MusicExportPreferences accessExpiresAt(String accessExpiresAt) {
    this.accessExpiresAt = accessExpiresAt;
    return this;
  }

  /**
   * Get accessExpiresAt
   * @return accessExpiresAt
  */
  @NotNull 
  @Schema(name = "access_expires_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access_expires_at")
  public String getAccessExpiresAt() {
    return accessExpiresAt;
  }

  public void setAccessExpiresAt(String accessExpiresAt) {
    this.accessExpiresAt = accessExpiresAt;
  }

  public MusicExportPreferences accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  */
  @NotNull 
  @Schema(name = "access_token", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public MusicExportPreferences addPlusExport(Boolean addPlusExport) {
    this.addPlusExport = addPlusExport;
    return this;
  }

  /**
   * Get addPlusExport
   * @return addPlusExport
  */
  @NotNull 
  @Schema(name = "add_plus_export", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("add_plus_export")
  public Boolean getAddPlusExport() {
    return addPlusExport;
  }

  public void setAddPlusExport(Boolean addPlusExport) {
    this.addPlusExport = addPlusExport;
  }

  public MusicExportPreferences authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  /**
   * Get authorizationCode
   * @return authorizationCode
  */
  @NotNull 
  @Schema(name = "authorization_code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("authorization_code")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public MusicExportPreferences lastExport(String lastExport) {
    this.lastExport = lastExport;
    return this;
  }

  /**
   * Get lastExport
   * @return lastExport
  */
  @NotNull 
  @Schema(name = "last_export", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_export")
  public String getLastExport() {
    return lastExport;
  }

  public void setLastExport(String lastExport) {
    this.lastExport = lastExport;
  }

  public MusicExportPreferences legacyState(String legacyState) {
    this.legacyState = legacyState;
    return this;
  }

  /**
   * Get legacyState
   * @return legacyState
  */
  @NotNull 
  @Schema(name = "legacy_state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legacy_state")
  public String getLegacyState() {
    return legacyState;
  }

  public void setLegacyState(String legacyState) {
    this.legacyState = legacyState;
  }

  public MusicExportPreferences partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Get partnerId
   * @return partnerId
  */
  @NotNull 
  @Schema(name = "partner_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public MusicExportPreferences refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
  */
  @NotNull 
  @Schema(name = "refresh_token", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public MusicExportPreferences terms(Boolean terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Get terms
   * @return terms
  */
  @NotNull 
  @Schema(name = "terms", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("terms")
  public Boolean getTerms() {
    return terms;
  }

  public void setTerms(Boolean terms) {
    this.terms = terms;
  }

  public MusicExportPreferences vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Get vendor
   * @return vendor
  */
  @NotNull 
  @Schema(name = "vendor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicExportPreferences musicExportPreferences = (MusicExportPreferences) o;
    return Objects.equals(this.accessExpiresAt, musicExportPreferences.accessExpiresAt) &&
        Objects.equals(this.accessToken, musicExportPreferences.accessToken) &&
        Objects.equals(this.addPlusExport, musicExportPreferences.addPlusExport) &&
        Objects.equals(this.authorizationCode, musicExportPreferences.authorizationCode) &&
        Objects.equals(this.lastExport, musicExportPreferences.lastExport) &&
        Objects.equals(this.legacyState, musicExportPreferences.legacyState) &&
        Objects.equals(this.partnerId, musicExportPreferences.partnerId) &&
        Objects.equals(this.refreshToken, musicExportPreferences.refreshToken) &&
        Objects.equals(this.terms, musicExportPreferences.terms) &&
        Objects.equals(this.vendor, musicExportPreferences.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpiresAt, accessToken, addPlusExport, authorizationCode, lastExport, legacyState, partnerId, refreshToken, terms, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicExportPreferences {\n");
    sb.append("    accessExpiresAt: ").append(toIndentedString(accessExpiresAt)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    addPlusExport: ").append(toIndentedString(addPlusExport)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    lastExport: ").append(toIndentedString(lastExport)).append("\n");
    sb.append("    legacyState: ").append(toIndentedString(legacyState)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

