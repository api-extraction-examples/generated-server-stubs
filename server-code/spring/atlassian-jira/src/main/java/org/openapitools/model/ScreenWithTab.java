package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Scope;
import org.openapitools.model.ScreenableTab;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A screen with tab details.
 */

@Schema(name = "ScreenWithTab", description = "A screen with tab details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ScreenWithTab {

  private String description;

  private Long id;

  private String name;

  private Scope scope;

  private ScreenableTab tab;

  public ScreenWithTab description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the screen.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the screen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ScreenWithTab id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the screen.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the screen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ScreenWithTab name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the screen.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the screen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScreenWithTab scope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public ScreenWithTab tab(ScreenableTab tab) {
    this.tab = tab;
    return this;
  }

  /**
   * Get tab
   * @return tab
  */
  @Valid 
  @Schema(name = "tab", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tab")
  public ScreenableTab getTab() {
    return tab;
  }

  public void setTab(ScreenableTab tab) {
    this.tab = tab;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenWithTab screenWithTab = (ScreenWithTab) o;
    return Objects.equals(this.description, screenWithTab.description) &&
        Objects.equals(this.id, screenWithTab.id) &&
        Objects.equals(this.name, screenWithTab.name) &&
        Objects.equals(this.scope, screenWithTab.scope) &&
        Objects.equals(this.tab, screenWithTab.tab);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, scope, tab);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenWithTab {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tab: ").append(toIndentedString(tab)).append("\n");
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

