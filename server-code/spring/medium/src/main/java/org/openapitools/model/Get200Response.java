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
 * Get200Response
 */

@JsonTypeName("__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class Get200Response {

  private String developer;

  private String documentation;

  private String email;

  private String linkedin;

  private String name;

  private String twitter;

  private String website;

  public Get200Response developer(String developer) {
    this.developer = developer;
    return this;
  }

  /**
   * Full name of the API's developer
   * @return developer
  */
  
  @Schema(name = "developer", example = "Nishu Jain", description = "Full name of the API's developer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("developer")
  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public Get200Response documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Link to the Medium API's documentation
   * @return documentation
  */
  
  @Schema(name = "documentation", example = "https://docs.mediumapi.com", description = "Link to the Medium API's documentation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentation")
  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public Get200Response email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email ID of the developer
   * @return email
  */
  
  @Schema(name = "email", example = "nishu@mediumapi.com", description = "Email ID of the developer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Get200Response linkedin(String linkedin) {
    this.linkedin = linkedin;
    return this;
  }

  /**
   * LinkedIn Page URL
   * @return linkedin
  */
  
  @Schema(name = "linkedin", example = "https://www.linkedin.com/company/medium-api", description = "LinkedIn Page URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedin")
  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }

  public Get200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of the API
   * @return name
  */
  
  @Schema(name = "name", example = "Medium API", description = "Full name of the API", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Get200Response twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  /**
   * Twitter Profile URL
   * @return twitter
  */
  
  @Schema(name = "twitter", example = "https://twitter.com/medium_api", description = "Twitter Profile URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitter")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public Get200Response website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Link to the Medium API's website
   * @return website
  */
  
  @Schema(name = "website", example = "https://mediumapi.com", description = "Link to the Medium API's website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Get200Response get200Response = (Get200Response) o;
    return Objects.equals(this.developer, get200Response.developer) &&
        Objects.equals(this.documentation, get200Response.documentation) &&
        Objects.equals(this.email, get200Response.email) &&
        Objects.equals(this.linkedin, get200Response.linkedin) &&
        Objects.equals(this.name, get200Response.name) &&
        Objects.equals(this.twitter, get200Response.twitter) &&
        Objects.equals(this.website, get200Response.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(developer, documentation, email, linkedin, name, twitter, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get200Response {\n");
    sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

