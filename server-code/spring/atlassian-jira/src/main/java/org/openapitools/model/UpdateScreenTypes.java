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

@Schema(name = "UpdateScreenTypes", description = "The IDs of the screens for the screen types of the screen scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UpdateScreenTypes {

  private String create;

  private String _default;

  private String edit;

  private String view;

  public UpdateScreenTypes create(String create) {
    this.create = create;
    return this;
  }

  /**
   * The ID of the create screen. To remove the screen association, pass a null.
   * @return create
  */
  
  @Schema(name = "create", description = "The ID of the create screen. To remove the screen association, pass a null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public UpdateScreenTypes _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * The ID of the default screen. When specified, must include a screen ID as a default screen is required.
   * @return _default
  */
  
  @Schema(name = "default", description = "The ID of the default screen. When specified, must include a screen ID as a default screen is required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public UpdateScreenTypes edit(String edit) {
    this.edit = edit;
    return this;
  }

  /**
   * The ID of the edit screen. To remove the screen association, pass a null.
   * @return edit
  */
  
  @Schema(name = "edit", description = "The ID of the edit screen. To remove the screen association, pass a null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("edit")
  public String getEdit() {
    return edit;
  }

  public void setEdit(String edit) {
    this.edit = edit;
  }

  public UpdateScreenTypes view(String view) {
    this.view = view;
    return this;
  }

  /**
   * The ID of the view screen. To remove the screen association, pass a null.
   * @return view
  */
  
  @Schema(name = "view", description = "The ID of the view screen. To remove the screen association, pass a null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view")
  public String getView() {
    return view;
  }

  public void setView(String view) {
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
    UpdateScreenTypes updateScreenTypes = (UpdateScreenTypes) o;
    return Objects.equals(this.create, updateScreenTypes.create) &&
        Objects.equals(this._default, updateScreenTypes._default) &&
        Objects.equals(this.edit, updateScreenTypes.edit) &&
        Objects.equals(this.view, updateScreenTypes.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, _default, edit, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScreenTypes {\n");
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

