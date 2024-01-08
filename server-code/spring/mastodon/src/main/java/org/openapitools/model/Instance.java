package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Account;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents the software instance of Mastodon running on this domain.
 */

@Schema(name = "Instance", description = "Represents the software instance of Mastodon running on this domain.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Instance {

  private Boolean approvalRequired;

  private Account contactAccount;

  private String description;

  private String email;

  private Boolean invitesEnabled;

  @Valid
  private List<String> languages = new ArrayList<>();

  private Boolean registrations;

  private String shortDescription;

  private Object stats;

  private JsonNullable<String> thumbnail = JsonNullable.<String>undefined();

  private String title;

  private String uri;

  private Object urls;

  private String version;

  public Instance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Instance(Boolean approvalRequired, String description, String email, Boolean invitesEnabled, List<String> languages, Boolean registrations, String shortDescription, Object stats, String title, String uri, Object urls, String version) {
    this.approvalRequired = approvalRequired;
    this.description = description;
    this.email = email;
    this.invitesEnabled = invitesEnabled;
    this.languages = languages;
    this.registrations = registrations;
    this.shortDescription = shortDescription;
    this.stats = stats;
    this.title = title;
    this.uri = uri;
    this.urls = urls;
    this.version = version;
  }

  public Instance approvalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
    return this;
  }

  /**
   * Whether registrations require moderator approval.
   * @return approvalRequired
  */
  @NotNull 
  @Schema(name = "approval_required", description = "Whether registrations require moderator approval.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("approval_required")
  public Boolean getApprovalRequired() {
    return approvalRequired;
  }

  public void setApprovalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
  }

  public Instance contactAccount(Account contactAccount) {
    this.contactAccount = contactAccount;
    return this;
  }

  /**
   * Get contactAccount
   * @return contactAccount
  */
  @Valid 
  @Schema(name = "contact_account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact_account")
  public Account getContactAccount() {
    return contactAccount;
  }

  public void setContactAccount(Account contactAccount) {
    this.contactAccount = contactAccount;
  }

  public Instance description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Admin-defined description of the Mastodon site.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Admin-defined description of the Mastodon site.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Instance email(String email) {
    this.email = email;
    return this;
  }

  /**
   * An email that may be contacted for any inquiries.
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "An email that may be contacted for any inquiries.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Instance invitesEnabled(Boolean invitesEnabled) {
    this.invitesEnabled = invitesEnabled;
    return this;
  }

  /**
   * Whether invites are enabled.
   * @return invitesEnabled
  */
  @NotNull 
  @Schema(name = "invites_enabled", description = "Whether invites are enabled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invites_enabled")
  public Boolean getInvitesEnabled() {
    return invitesEnabled;
  }

  public void setInvitesEnabled(Boolean invitesEnabled) {
    this.invitesEnabled = invitesEnabled;
  }

  public Instance languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public Instance addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * Primary languages of the website and its staff. ISO 639 Part 1-5 language codes.
   * @return languages
  */
  @NotNull 
  @Schema(name = "languages", description = "Primary languages of the website and its staff. ISO 639 Part 1-5 language codes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public Instance registrations(Boolean registrations) {
    this.registrations = registrations;
    return this;
  }

  /**
   * Whether registrations are enabled.
   * @return registrations
  */
  @NotNull 
  @Schema(name = "registrations", description = "Whether registrations are enabled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registrations")
  public Boolean getRegistrations() {
    return registrations;
  }

  public void setRegistrations(Boolean registrations) {
    this.registrations = registrations;
  }

  public Instance shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * A shorter description defined by the admin.
   * @return shortDescription
  */
  @NotNull 
  @Schema(name = "short_description", description = "A shorter description defined by the admin.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("short_description")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Instance stats(Object stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Statistics about how much information the instance contains.
   * @return stats
  */
  @NotNull 
  @Schema(name = "stats", description = "Statistics about how much information the instance contains.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stats")
  public Object getStats() {
    return stats;
  }

  public void setStats(Object stats) {
    this.stats = stats;
  }

  public Instance thumbnail(String thumbnail) {
    this.thumbnail = JsonNullable.of(thumbnail);
    return this;
  }

  /**
   * Banner image for the website.
   * @return thumbnail
  */
  
  @Schema(name = "thumbnail", description = "Banner image for the website.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnail")
  public JsonNullable<String> getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(JsonNullable<String> thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Instance title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the website.
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "The title of the website.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Instance uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The domain name of the instance.
   * @return uri
  */
  @NotNull 
  @Schema(name = "uri", description = "The domain name of the instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Instance urls(Object urls) {
    this.urls = urls;
    return this;
  }

  /**
   * URLs of interest for clients apps.
   * @return urls
  */
  @NotNull 
  @Schema(name = "urls", description = "URLs of interest for clients apps.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("urls")
  public Object getUrls() {
    return urls;
  }

  public void setUrls(Object urls) {
    this.urls = urls;
  }

  public Instance version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of Mastodon installed on the instance.
   * @return version
  */
  @NotNull 
  @Schema(name = "version", description = "The version of Mastodon installed on the instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.approvalRequired, instance.approvalRequired) &&
        Objects.equals(this.contactAccount, instance.contactAccount) &&
        Objects.equals(this.description, instance.description) &&
        Objects.equals(this.email, instance.email) &&
        Objects.equals(this.invitesEnabled, instance.invitesEnabled) &&
        Objects.equals(this.languages, instance.languages) &&
        Objects.equals(this.registrations, instance.registrations) &&
        Objects.equals(this.shortDescription, instance.shortDescription) &&
        Objects.equals(this.stats, instance.stats) &&
        equalsNullable(this.thumbnail, instance.thumbnail) &&
        Objects.equals(this.title, instance.title) &&
        Objects.equals(this.uri, instance.uri) &&
        Objects.equals(this.urls, instance.urls) &&
        Objects.equals(this.version, instance.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalRequired, contactAccount, description, email, invitesEnabled, languages, registrations, shortDescription, stats, hashCodeNullable(thumbnail), title, uri, urls, version);
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
    sb.append("class Instance {\n");
    sb.append("    approvalRequired: ").append(toIndentedString(approvalRequired)).append("\n");
    sb.append("    contactAccount: ").append(toIndentedString(contactAccount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    invitesEnabled: ").append(toIndentedString(invitesEnabled)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

