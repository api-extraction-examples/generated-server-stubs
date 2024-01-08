package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LibraryOptions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Add virtual folder dto.
 */

@Schema(name = "AddVirtualFolderDto", description = "Add virtual folder dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class AddVirtualFolderDto {

  private LibraryOptions libraryOptions;

  public AddVirtualFolderDto libraryOptions(LibraryOptions libraryOptions) {
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
    AddVirtualFolderDto addVirtualFolderDto = (AddVirtualFolderDto) o;
    return Objects.equals(this.libraryOptions, addVirtualFolderDto.libraryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddVirtualFolderDto {\n");
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

