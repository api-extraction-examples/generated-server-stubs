package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ServiceInstance
 */

@JsonTypeName("serviceInstance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class ServiceInstance {

  private String authUrl;

  private Object config;

  private String createdAt;

  private Object env;

  private Object externalAttributes;

  private String id;

  private String serviceName;

  private String servicePath;

  private String serviceSlug;

  @Valid
  private List<Object> snippets;

  private String updatedAt;

  private String url;

  public ServiceInstance authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

  /**
   * Get authUrl
   * @return authUrl
  */
  
  @Schema(name = "auth_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auth_url")
  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  public ServiceInstance config(Object config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  
  @Schema(name = "config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("config")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public ServiceInstance createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ServiceInstance env(Object env) {
    this.env = env;
    return this;
  }

  /**
   * Get env
   * @return env
  */
  
  @Schema(name = "env", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public Object getEnv() {
    return env;
  }

  public void setEnv(Object env) {
    this.env = env;
  }

  public ServiceInstance externalAttributes(Object externalAttributes) {
    this.externalAttributes = externalAttributes;
    return this;
  }

  /**
   * Get externalAttributes
   * @return externalAttributes
  */
  
  @Schema(name = "external_attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_attributes")
  public Object getExternalAttributes() {
    return externalAttributes;
  }

  public void setExternalAttributes(Object externalAttributes) {
    this.externalAttributes = externalAttributes;
  }

  public ServiceInstance id(String id) {
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

  public ServiceInstance serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  
  @Schema(name = "service_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_name")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public ServiceInstance servicePath(String servicePath) {
    this.servicePath = servicePath;
    return this;
  }

  /**
   * Get servicePath
   * @return servicePath
  */
  
  @Schema(name = "service_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_path")
  public String getServicePath() {
    return servicePath;
  }

  public void setServicePath(String servicePath) {
    this.servicePath = servicePath;
  }

  public ServiceInstance serviceSlug(String serviceSlug) {
    this.serviceSlug = serviceSlug;
    return this;
  }

  /**
   * Get serviceSlug
   * @return serviceSlug
  */
  
  @Schema(name = "service_slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_slug")
  public String getServiceSlug() {
    return serviceSlug;
  }

  public void setServiceSlug(String serviceSlug) {
    this.serviceSlug = serviceSlug;
  }

  public ServiceInstance snippets(List<Object> snippets) {
    this.snippets = snippets;
    return this;
  }

  public ServiceInstance addSnippetsItem(Object snippetsItem) {
    if (this.snippets == null) {
      this.snippets = new ArrayList<>();
    }
    this.snippets.add(snippetsItem);
    return this;
  }

  /**
   * Get snippets
   * @return snippets
  */
  
  @Schema(name = "snippets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snippets")
  public List<Object> getSnippets() {
    return snippets;
  }

  public void setSnippets(List<Object> snippets) {
    this.snippets = snippets;
  }

  public ServiceInstance updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ServiceInstance url(String url) {
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
    ServiceInstance serviceInstance = (ServiceInstance) o;
    return Objects.equals(this.authUrl, serviceInstance.authUrl) &&
        Objects.equals(this.config, serviceInstance.config) &&
        Objects.equals(this.createdAt, serviceInstance.createdAt) &&
        Objects.equals(this.env, serviceInstance.env) &&
        Objects.equals(this.externalAttributes, serviceInstance.externalAttributes) &&
        Objects.equals(this.id, serviceInstance.id) &&
        Objects.equals(this.serviceName, serviceInstance.serviceName) &&
        Objects.equals(this.servicePath, serviceInstance.servicePath) &&
        Objects.equals(this.serviceSlug, serviceInstance.serviceSlug) &&
        Objects.equals(this.snippets, serviceInstance.snippets) &&
        Objects.equals(this.updatedAt, serviceInstance.updatedAt) &&
        Objects.equals(this.url, serviceInstance.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authUrl, config, createdAt, env, externalAttributes, id, serviceName, servicePath, serviceSlug, snippets, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstance {\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    externalAttributes: ").append(toIndentedString(externalAttributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePath: ").append(toIndentedString(servicePath)).append("\n");
    sb.append("    serviceSlug: ").append(toIndentedString(serviceSlug)).append("\n");
    sb.append("    snippets: ").append(toIndentedString(snippets)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

