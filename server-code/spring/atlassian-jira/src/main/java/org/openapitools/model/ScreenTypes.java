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
 * The IDs of the screens for the screen types of the screen scheme.
 */

@Schema(name = "ScreenTypes", description = "The IDs of the screens for the screen types of the screen scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ScreenTypes {

  private Long create;

  private Long _default;

  private Long edit;

  private Long view;

  public ScreenTypes create(Long create) {
    this.create = create;
    return this;
  }

  /**
   * The ID of the create screen.
   * @return create
  */
  
  @Schema(name = "create", description = "The ID of the create screen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create")
  public Long getCreate() {
    return create;
  }

  public void setCreate(Long create) {
    this.create = create;
  }

  public ScreenTypes _default(Long _default) {
    this._default = _default;
    return this;
  }

  /**
   * The ID of the default screen. Required when creating a screen scheme.
   * @return _default
  */
  
  @Schema(name = "default", description = "The ID of the default screen. Required when creating a screen scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default")
  public Long getDefault() {
    return _default;
  }

  public void setDefault(Long _default) {
    this._default = _default;
  }

  public ScreenTypes edit(Long edit) {
    this.edit = edit;
    return this;
  }

  /**
   * The ID of the edit screen.
   * @return edit
  */
  
  @Schema(name = "edit", description = "The ID of the edit screen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("edit")
  public Long getEdit() {
    return edit;
  }

  public void setEdit(Long edit) {
    this.edit = edit;
  }

  public ScreenTypes view(Long view) {
    this.view = view;
    return this;
  }

  /**
   * The ID of the view screen.
   * @return view
  */
  
  @Schema(name = "view", description = "The ID of the view screen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view")
  public Long getView() {
    return view;
  }

  public void setView(Long view) {
    this.view = view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenTypes screenTypes = (ScreenTypes) o;
    return Objects.equals(this.create, screenTypes.create) &&
        Objects.equals(this._default, screenTypes._default) &&
        Objects.equals(this.edit, screenTypes.edit) &&
        Objects.equals(this.view, screenTypes.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, _default, edit, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenTypes {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

