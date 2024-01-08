package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillStageSittingPublicationList;
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
 * BillStagePublicationList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillStagePublicationList {

  private Integer billStageId;

  @Valid
  private JsonNullable<List<@Valid Publication>> publications = JsonNullable.<List<@Valid Publication>>undefined();

  @Valid
  private JsonNullable<List<@Valid BillStageSittingPublicationList>> sittings = JsonNullable.<List<@Valid BillStageSittingPublicationList>>undefined();

  public BillStagePublicationList billStageId(Integer billStageId) {
    this.billStageId = billStageId;
    return this;
  }

  /**
   * Get billStageId
   * @return billStageId
  */
  
  @Schema(name = "billStageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billStageId")
  public Integer getBillStageId() {
    return billStageId;
  }

  public void setBillStageId(Integer billStageId) {
    this.billStageId = billStageId;
  }

  public BillStagePublicationList publications(List<@Valid Publication> publications) {
    this.publications = JsonNullable.of(publications);
    return this;
  }

  public BillStagePublicationList addPublicationsItem(Publication publicationsItem) {
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

  public BillStagePublicationList sittings(List<@Valid BillStageSittingPublicationList> sittings) {
    this.sittings = JsonNullable.of(sittings);
    return this;
  }

  public BillStagePublicationList addSittingsItem(BillStageSittingPublicationList sittingsItem) {
    if (this.sittings == null || !this.sittings.isPresent()) {
      this.sittings = JsonNullable.of(new ArrayList<>());
    }
    this.sittings.get().add(sittingsItem);
    return this;
  }

  /**
   * Get sittings
   * @return sittings
  */
  @Valid 
  @Schema(name = "sittings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sittings")
  public JsonNullable<List<@Valid BillStageSittingPublicationList>> getSittings() {
    return sittings;
  }

  public void setSittings(JsonNullable<List<@Valid BillStageSittingPublicationList>> sittings) {
    this.sittings = sittings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillStagePublicationList billStagePublicationList = (BillStagePublicationList) o;
    return Objects.equals(this.billStageId, billStagePublicationList.billStageId) &&
        equalsNullable(this.publications, billStagePublicationList.publications) &&
        equalsNullable(this.sittings, billStagePublicationList.sittings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billStageId, hashCodeNullable(publications), hashCodeNullable(sittings));
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
    sb.append("class BillStagePublicationList {\n");
    sb.append("    billStageId: ").append(toIndentedString(billStageId)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    sittings: ").append(toIndentedString(sittings)).append("\n");
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

