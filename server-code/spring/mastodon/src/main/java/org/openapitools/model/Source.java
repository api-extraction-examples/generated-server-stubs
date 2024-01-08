package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Field;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents display or publishing preferences of user&#39;s own account. Returned as an additional entity when verifying and updated credentials, as an attribute of Account.
 */

@Schema(name = "Source", description = "Represents display or publishing preferences of user's own account. Returned as an additional entity when verifying and updated credentials, as an attribute of Account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Source {

  @Valid
  private List<@Valid Field> fields;

  private Integer followRequestsCount;

  private String language;

  private String note;

  /**
   * The default post privacy to be used for new statuses.
   */
  public enum PrivacyEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private"),
    
    DIRECT("direct");

    private String value;

    PrivacyEnum(String value) {
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
    public static PrivacyEnum fromValue(String value) {
      for (PrivacyEnum b : PrivacyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PrivacyEnum privacy;

  private Boolean sensitive;

  public Source fields(List<@Valid Field> fields) {
    this.fields = fields;
    return this;
  }

  public Source addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Metadata about the account.
   * @return fields
  */
  @Valid 
  @Schema(name = "fields", description = "Metadata about the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<@Valid Field> getFields() {
    return fields;
  }

  public void setFields(List<@Valid Field> fields) {
    this.fields = fields;
  }

  public Source followRequestsCount(Integer followRequestsCount) {
    this.followRequestsCount = followRequestsCount;
    return this;
  }

  /**
   * The number of pending follow requests
   * @return followRequestsCount
  */
  
  @Schema(name = "follow_requests_count", description = "The number of pending follow requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follow_requests_count")
  public Integer getFollowRequestsCount() {
    return followRequestsCount;
  }

  public void setFollowRequestsCount(Integer followRequestsCount) {
    this.followRequestsCount = followRequestsCount;
  }

  public Source language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The default posting language for new statuses, ISO 639-1 language two-letter code.
   * @return language
  */
  
  @Schema(name = "language", description = "The default posting language for new statuses, ISO 639-1 language two-letter code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Source note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Profile bio
   * @return note
  */
  
  @Schema(name = "note", description = "Profile bio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Source privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * The default post privacy to be used for new statuses.
   * @return privacy
  */
  
  @Schema(name = "privacy", description = "The default post privacy to be used for new statuses.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacy")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }

  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  public Source sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Whether new statuses should be marked sensitive by default.
   * @return sensitive
  */
  
  @Schema(name = "sensitive", description = "Whether new statuses should be marked sensitive by default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sensitive")
  public Boolean getSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.fields, source.fields) &&
        Objects.equals(this.followRequestsCount, source.followRequestsCount) &&
        Objects.equals(this.language, source.language) &&
        Objects.equals(this.note, source.note) &&
        Objects.equals(this.privacy, source.privacy) &&
        Objects.equals(this.sensitive, source.sensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, followRequestsCount, language, note, privacy, sensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    followRequestsCount: ").append(toIndentedString(followRequestsCount)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
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

