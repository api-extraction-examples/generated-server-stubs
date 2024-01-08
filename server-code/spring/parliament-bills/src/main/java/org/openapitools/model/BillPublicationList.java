package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillPublication;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillPublicationList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillPublicationList {

  private Integer billId;

  @Valid
  private JsonNullable<List<@Valid BillPublication>> publications = JsonNullable.<List<@Valid BillPublication>>undefined();

  public BillPublicationList billId(Integer billId) {
    this.billId = billId;
    return this;
  }

  /**
   * Get billId
   * @return billId
  */
  
  @Schema(name = "billId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billId")
  public Integer getBillId() {
    return billId;
  }

  public void setBillId(Integer billId) {
    this.billId = billId;
  }

  public BillPublicationList publications(List<@Valid BillPublication> publications) {
    this.publications = JsonNullable.of(publications);
    return this;
  }

  public BillPublicationList addPublicationsItem(BillPublication publicationsItem) {
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
  public JsonNullable<List<@Valid BillPublication>> getPublications() {
    return publications;
  }

  public void setPublications(JsonNullable<List<@Valid BillPublication>> publications) {
    this.publications = publications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillPublicationList billPublicationList = (BillPublicationList) o;
    return Objects.equals(this.billId, billPublicationList.billId) &&
        equalsNullable(this.publications, billPublicationList.publications);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billId, hashCodeNullable(publications));
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
    sb.append("class BillPublicationList {\n");
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
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

