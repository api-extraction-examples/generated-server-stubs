package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.House;
import org.openapitools.model.PublicationDocument;
import org.openapitools.model.PublicationLink;
import org.openapitools.model.PublicationType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillPublication
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillPublication {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime displayDate;

  @Valid
  private JsonNullable<List<@Valid PublicationDocument>> files = JsonNullable.<List<@Valid PublicationDocument>>undefined();

  private House house;

  private Integer id;

  @Valid
  private JsonNullable<List<@Valid PublicationLink>> links = JsonNullable.<List<@Valid PublicationLink>>undefined();

  private PublicationType publicationType;

  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public BillPublication displayDate(OffsetDateTime displayDate) {
    this.displayDate = displayDate;
    return this;
  }

  /**
   * Get displayDate
   * @return displayDate
  */
  @Valid 
  @Schema(name = "displayDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayDate")
  public OffsetDateTime getDisplayDate() {
    return displayDate;
  }

  public void setDisplayDate(OffsetDateTime displayDate) {
    this.displayDate = displayDate;
  }

  public BillPublication files(List<@Valid PublicationDocument> files) {
    this.files = JsonNullable.of(files);
    return this;
  }

  public BillPublication addFilesItem(PublicationDocument filesItem) {
    if (this.files == null || !this.files.isPresent()) {
      this.files = JsonNullable.of(new ArrayList<>());
    }
    this.files.get().add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
  */
  @Valid 
  @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public JsonNullable<List<@Valid PublicationDocument>> getFiles() {
    return files;
  }

  public void setFiles(JsonNullable<List<@Valid PublicationDocument>> files) {
    this.files = files;
  }

  public BillPublication house(House house) {
    this.house = house;
    return this;
  }

  /**
   * Get house
   * @return house
  */
  @Valid 
  @Schema(name = "house", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("house")
  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public BillPublication id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BillPublication links(List<@Valid PublicationLink> links) {
    this.links = JsonNullable.of(links);
    return this;
  }

  public BillPublication addLinksItem(PublicationLink linksItem) {
    if (this.links == null || !this.links.isPresent()) {
      this.links = JsonNullable.of(new ArrayList<>());
    }
    this.links.get().add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public JsonNullable<List<@Valid PublicationLink>> getLinks() {
    return links;
  }

  public void setLinks(JsonNullable<List<@Valid PublicationLink>> links) {
    this.links = links;
  }

  public BillPublication publicationType(PublicationType publicationType) {
    this.publicationType = publicationType;
    return this;
  }

  /**
   * Get publicationType
   * @return publicationType
  */
  @Valid 
  @Schema(name = "publicationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicationType")
  public PublicationType getPublicationType() {
    return publicationType;
  }

  public void setPublicationType(PublicationType publicationType) {
    this.publicationType = publicationType;
  }

  public BillPublication title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillPublication billPublication = (BillPublication) o;
    return Objects.equals(this.displayDate, billPublication.displayDate) &&
        equalsNullable(this.files, billPublication.files) &&
        Objects.equals(this.house, billPublication.house) &&
        Objects.equals(this.id, billPublication.id) &&
        equalsNullable(this.links, billPublication.links) &&
        Objects.equals(this.publicationType, billPublication.publicationType) &&
        equalsNullable(this.title, billPublication.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayDate, hashCodeNullable(files), house, id, hashCodeNullable(links), publicationType, hashCodeNullable(title));
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
    sb.append("class BillPublication {\n");
    sb.append("    displayDate: ").append(toIndentedString(displayDate)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    publicationType: ").append(toIndentedString(publicationType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

