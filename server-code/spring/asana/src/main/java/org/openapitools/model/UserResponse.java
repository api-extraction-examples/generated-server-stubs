package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserBaseResponseAllOfPhoto;
import org.openapitools.model.WorkspaceCompact;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class UserResponse {

  private String gid;

  private String resourceType;

  private String name;

  private String email;

  private JsonNullable<UserBaseResponseAllOfPhoto> photo = JsonNullable.<UserBaseResponseAllOfPhoto>undefined();

  @Valid
  private List<@Valid WorkspaceCompact> workspaces;

  public UserResponse gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public UserResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public UserResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * *Read-only except when same user as requester*. The user’s name.
   * @return name
  */
  
  @Schema(name = "name", example = "Greg Sanchez", description = "*Read-only except when same user as requester*. The user’s name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's email address.
   * @return email
  */
  @javax.validation.constraints.Email 
  @Schema(name = "email", accessMode = Schema.AccessMode.READ_ONLY, example = "gsanchez@example.com", description = "The user's email address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResponse photo(UserBaseResponseAllOfPhoto photo) {
    this.photo = JsonNullable.of(photo);
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @Valid 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photo")
  public JsonNullable<UserBaseResponseAllOfPhoto> getPhoto() {
    return photo;
  }

  public void setPhoto(JsonNullable<UserBaseResponseAllOfPhoto> photo) {
    this.photo = photo;
  }

  public UserResponse workspaces(List<@Valid WorkspaceCompact> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  public UserResponse addWorkspacesItem(WorkspaceCompact workspacesItem) {
    if (this.workspaces == null) {
      this.workspaces = new ArrayList<>();
    }
    this.workspaces.add(workspacesItem);
    return this;
  }

  /**
   * Workspaces and organizations this user may access. Note\\: The API will only return workspaces and organizations that also contain the authenticated user.
   * @return workspaces
  */
  @Valid 
  @Schema(name = "workspaces", accessMode = Schema.AccessMode.READ_ONLY, description = "Workspaces and organizations this user may access. Note\\: The API will only return workspaces and organizations that also contain the authenticated user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspaces")
  public List<@Valid WorkspaceCompact> getWorkspaces() {
    return workspaces;
  }

  public void setWorkspaces(List<@Valid WorkspaceCompact> workspaces) {
    this.workspaces = workspaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.gid, userResponse.gid) &&
        Objects.equals(this.resourceType, userResponse.resourceType) &&
        Objects.equals(this.name, userResponse.name) &&
        Objects.equals(this.email, userResponse.email) &&
        equalsNullable(this.photo, userResponse.photo) &&
        Objects.equals(this.workspaces, userResponse.workspaces);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, email, hashCodeNullable(photo), workspaces);
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
    sb.append("class UserResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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

