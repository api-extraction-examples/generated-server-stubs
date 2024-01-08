package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AttachmentResponseAllOfParent;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AttachmentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class AttachmentResponse {

  private String gid;

  private String resourceType;

  private String name;

  private String resourceSubtype;

  private Boolean connectedToApp;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private JsonNullable<URI> downloadUrl = JsonNullable.<URI>undefined();

  private String host;

  private AttachmentResponseAllOfParent parent;

  private JsonNullable<URI> permanentUrl = JsonNullable.<URI>undefined();

  private Integer size;

  private JsonNullable<URI> viewUrl = JsonNullable.<URI>undefined();

  public AttachmentResponse gid(String gid) {
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

  public AttachmentResponse resourceType(String resourceType) {
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

  public AttachmentResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the file.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, example = "Screenshot.png", description = "The name of the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentResponse resourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", example = "dropbox", description = "The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public AttachmentResponse connectedToApp(Boolean connectedToApp) {
    this.connectedToApp = connectedToApp;
    return this;
  }

  /**
   * Whether the attachment is connected to the app making the request for the purposes of showing an app components widget. Only present when the `resource_subtype` is `external` or `gdrive`.
   * @return connectedToApp
  */
  
  @Schema(name = "connected_to_app", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the attachment is connected to the app making the request for the purposes of showing an app components widget. Only present when the `resource_subtype` is `external` or `gdrive`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_to_app")
  public Boolean getConnectedToApp() {
    return connectedToApp;
  }

  public void setConnectedToApp(Boolean connectedToApp) {
    this.connectedToApp = connectedToApp;
  }

  public AttachmentResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AttachmentResponse downloadUrl(URI downloadUrl) {
    this.downloadUrl = JsonNullable.of(downloadUrl);
    return this;
  }

  /**
   * The URL containing the content of the attachment. *Note:* May be null if the attachment is hosted by [Box](https://www.box.com/) and will be null if the attachment is a Video Message hosted by [Vimeo](https://vimeo.com/). If present, this URL may only be valid for two minutes from the time of retrieval. You should avoid persisting this URL somewhere and just refresh it on demand to ensure you do not keep stale URLs.
   * @return downloadUrl
  */
  @Valid 
  @Schema(name = "download_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://s3.amazonaws.com/assets/123/Screenshot.png", description = "The URL containing the content of the attachment. *Note:* May be null if the attachment is hosted by [Box](https://www.box.com/) and will be null if the attachment is a Video Message hosted by [Vimeo](https://vimeo.com/). If present, this URL may only be valid for two minutes from the time of retrieval. You should avoid persisting this URL somewhere and just refresh it on demand to ensure you do not keep stale URLs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download_url")
  public JsonNullable<URI> getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(JsonNullable<URI> downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public AttachmentResponse host(String host) {
    this.host = host;
    return this;
  }

  /**
   * The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `box`, and `vimeo`.
   * @return host
  */
  
  @Schema(name = "host", accessMode = Schema.AccessMode.READ_ONLY, example = "dropbox", description = "The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `box`, and `vimeo`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public AttachmentResponse parent(AttachmentResponseAllOfParent parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public AttachmentResponseAllOfParent getParent() {
    return parent;
  }

  public void setParent(AttachmentResponseAllOfParent parent) {
    this.parent = parent;
  }

  public AttachmentResponse permanentUrl(URI permanentUrl) {
    this.permanentUrl = JsonNullable.of(permanentUrl);
    return this;
  }

  /**
   * 
   * @return permanentUrl
  */
  @Valid 
  @Schema(name = "permanent_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://s3.amazonaws.com/assets/123/Screenshot.png", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permanent_url")
  public JsonNullable<URI> getPermanentUrl() {
    return permanentUrl;
  }

  public void setPermanentUrl(JsonNullable<URI> permanentUrl) {
    this.permanentUrl = permanentUrl;
  }

  public AttachmentResponse size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the attachment in bytes. Only present when the `resource_subtype` is `asana`.
   * @return size
  */
  
  @Schema(name = "size", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "The size of the attachment in bytes. Only present when the `resource_subtype` is `asana`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public AttachmentResponse viewUrl(URI viewUrl) {
    this.viewUrl = JsonNullable.of(viewUrl);
    return this;
  }

  /**
   * The URL where the attachment can be viewed, which may be friendlier to users in a browser than just directing them to a raw file. May be null if no view URL exists for the service.
   * @return viewUrl
  */
  @Valid 
  @Schema(name = "view_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://www.dropbox.com/s/123/Screenshot.png", description = "The URL where the attachment can be viewed, which may be friendlier to users in a browser than just directing them to a raw file. May be null if no view URL exists for the service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_url")
  public JsonNullable<URI> getViewUrl() {
    return viewUrl;
  }

  public void setViewUrl(JsonNullable<URI> viewUrl) {
    this.viewUrl = viewUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentResponse attachmentResponse = (AttachmentResponse) o;
    return Objects.equals(this.gid, attachmentResponse.gid) &&
        Objects.equals(this.resourceType, attachmentResponse.resourceType) &&
        Objects.equals(this.name, attachmentResponse.name) &&
        Objects.equals(this.resourceSubtype, attachmentResponse.resourceSubtype) &&
        Objects.equals(this.connectedToApp, attachmentResponse.connectedToApp) &&
        Objects.equals(this.createdAt, attachmentResponse.createdAt) &&
        equalsNullable(this.downloadUrl, attachmentResponse.downloadUrl) &&
        Objects.equals(this.host, attachmentResponse.host) &&
        Objects.equals(this.parent, attachmentResponse.parent) &&
        equalsNullable(this.permanentUrl, attachmentResponse.permanentUrl) &&
        Objects.equals(this.size, attachmentResponse.size) &&
        equalsNullable(this.viewUrl, attachmentResponse.viewUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, resourceSubtype, connectedToApp, createdAt, hashCodeNullable(downloadUrl), host, parent, hashCodeNullable(permanentUrl), size, hashCodeNullable(viewUrl));
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
    sb.append("class AttachmentResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    connectedToApp: ").append(toIndentedString(connectedToApp)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    permanentUrl: ").append(toIndentedString(permanentUrl)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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

