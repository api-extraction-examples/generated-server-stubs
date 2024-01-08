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
 * DeployedBranch
 */

@JsonTypeName("deployedBranch")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class DeployedBranch {

  private String deployId;

  private String id;

  private String name;

  private String slug;

  private String sslUrl;

  private String url;

  public DeployedBranch deployId(String deployId) {
    this.deployId = deployId;
    return this;
  }

  /**
   * Get deployId
   * @return deployId
  */
  
  @Schema(name = "deploy_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploy_id")
  public String getDeployId() {
    return deployId;
  }

  public void setDeployId(String deployId) {
    this.deployId = deployId;
  }

  public DeployedBranch id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeployedBranch name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeployedBranch slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  
  @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public DeployedBranch sslUrl(String sslUrl) {
    this.sslUrl = sslUrl;
    return this;
  }

  /**
   * Get sslUrl
   * @return sslUrl
  */
  
  @Schema(name = "ssl_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssl_url")
  public String getSslUrl() {
    return sslUrl;
  }

  public void setSslUrl(String sslUrl) {
    this.sslUrl = sslUrl;
  }

  public DeployedBranch url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployedBranch deployedBranch = (DeployedBranch) o;
    return Objects.equals(this.deployId, deployedBranch.deployId) &&
        Objects.equals(this.id, deployedBranch.id) &&
        Objects.equals(this.name, deployedBranch.name) &&
        Objects.equals(this.slug, deployedBranch.slug) &&
        Objects.equals(this.sslUrl, deployedBranch.sslUrl) &&
        Objects.equals(this.url, deployedBranch.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployId, id, name, slug, sslUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployedBranch {\n");
    sb.append("    deployId: ").append(toIndentedString(deployId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    sslUrl: ").append(toIndentedString(sslUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

