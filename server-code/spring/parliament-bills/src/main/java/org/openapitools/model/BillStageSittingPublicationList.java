package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Publication;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillStageSittingPublicationList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillStageSittingPublicationList {

  @Valid
  private JsonNullable<List<@Valid Publication>> publications = JsonNullable.<List<@Valid Publication>>undefined();

  private Integer sittingId;

  public BillStageSittingPublicationList publications(List<@Valid Publication> publications) {
    this.publications = JsonNullable.of(publications);
    return this;
  }

  public BillStageSittingPublicationList addPublicationsItem(Publication publicationsItem) {
    if (this.publications == null || !this.publications.isPresent()) {
      this.publications = JsonNullable.of(new ArrayList<>());
    }
    this.publications.get().add(publicationsItem);
    return this;
  }

  /**
   * Get publications
   * @return publications
  */
  @Valid 
  @Schema(name = "publications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publications")
  public JsonNullable<List<@Valid Publication>> getPublications() {
    return publications;
  }

  public void setPublications(JsonNullable<List<@Valid Publication>> publications) {
    this.publications = publications;
  }

  public BillStageSittingPublicationList sittingId(Integer sittingId) {
    this.sittingId = sittingId;
    return this;
  }

  /**
   * Get sittingId
   * @return sittingId
  */
  
  @Schema(name = "sittingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sittingId")
  public Integer getSittingId() {
    return sittingId;
  }

  public void setSittingId(Integer sittingId) {
    this.sittingId = sittingId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillStageSittingPublicationList billStageSittingPublicationList = (BillStageSittingPublicationList) o;
    return equalsNullable(this.publications, billStageSittingPublicationList.publications) &&
        Objects.equals(this.sittingId, billStageSittingPublicationList.sittingId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(publications), sittingId);
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
    sb.append("class BillStageSittingPublicationList {\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    sittingId: ").append(toIndentedString(sittingId)).append("\n");
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

