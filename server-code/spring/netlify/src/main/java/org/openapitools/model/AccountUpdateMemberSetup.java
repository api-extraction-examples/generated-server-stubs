package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountUpdateMemberSetup
 */

@JsonTypeName("accountUpdateMemberSetup")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AccountUpdateMemberSetup {

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    OWNER("Owner"),
    
    COLLABORATOR("Collaborator"),
    
    CONTROLLER("Controller");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoleEnum role;

  /**
   * Gets or Sets siteAccess
   */
  public enum SiteAccessEnum {
    ALL("all"),
    
    NONE("none"),
    
    SELECTED("selected");

    private String value;

    SiteAccessEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SiteAccessEnum fromValue(String value) {
      for (SiteAccessEnum b : SiteAccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SiteAccessEnum siteAccess;

  @Valid
  private List<String> siteIds;

  public AccountUpdateMemberSetup role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public AccountUpdateMemberSetup siteAccess(SiteAccessEnum siteAccess) {
    this.siteAccess = siteAccess;
    return this;
  }

  /**
   * Get siteAccess
   * @return siteAccess
  */
  
  @Schema(name = "site_access", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_access")
  public SiteAccessEnum getSiteAccess() {
    return siteAccess;
  }

  public void setSiteAccess(SiteAccessEnum siteAccess) {
    this.siteAccess = siteAccess;
  }

  public AccountUpdateMemberSetup siteIds(List<String> siteIds) {
    this.siteIds = siteIds;
    return this;
  }

  public AccountUpdateMemberSetup addSiteIdsItem(String siteIdsItem) {
    if (this.siteIds == null) {
      this.siteIds = new ArrayList<>();
    }
    this.siteIds.add(siteIdsItem);
    return this;
  }

  /**
   * Get siteIds
   * @return siteIds
  */
  
  @Schema(name = "site_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_ids")
  public List<String> getSiteIds() {
    return siteIds;
  }

  public void setSiteIds(List<String> siteIds) {
    this.siteIds = siteIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateMemberSetup accountUpdateMemberSetup = (AccountUpdateMemberSetup) o;
    return Objects.equals(this.role, accountUpdateMemberSetup.role) &&
        Objects.equals(this.siteAccess, accountUpdateMemberSetup.siteAccess) &&
        Objects.equals(this.siteIds, accountUpdateMemberSetup.siteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, siteAccess, siteIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateMemberSetup {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    siteAccess: ").append(toIndentedString(siteAccess)).append("\n");
    sb.append("    siteIds: ").append(toIndentedString(siteIds)).append("\n");
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

