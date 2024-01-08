package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.model.LibraryOptions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Update library options dto.
 */

@Schema(name = "UpdateLibraryOptionsDto", description = "Update library options dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UpdateLibraryOptionsDto {

  private UUID id;

  private LibraryOptions libraryOptions;

  public UpdateLibraryOptionsDto id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the library item id.
   * @return id
  */
  @Valid 
  @Schema(name = "Id", description = "Gets or sets the library item id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UpdateLibraryOptionsDto libraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
    return this;
  }

  /**
   * Get libraryOptions
   * @return libraryOptions
  */
  @Valid 
  @Schema(name = "LibraryOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LibraryOptions")
  public LibraryOptions getLibraryOptions() {
    return libraryOptions;
  }

  public void setLibraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLibraryOptionsDto updateLibraryOptionsDto = (UpdateLibraryOptionsDto) o;
    return Objects.equals(this.id, updateLibraryOptionsDto.id) &&
        Objects.equals(this.libraryOptions, updateLibraryOptionsDto.libraryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, libraryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLibraryOptionsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    libraryOptions: ").append(toIndentedString(libraryOptions)).append("\n");
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

