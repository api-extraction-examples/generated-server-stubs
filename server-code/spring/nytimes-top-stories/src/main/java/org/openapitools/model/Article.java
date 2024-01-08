package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ArticleMultimediaInner;
import org.openapitools.model.ArticleRelatedUrlsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Article
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:48.532857-04:00[America/Lower_Princes]")
public class Article {

  private String _abstract;

  private String byline;

  private String createdDate;

  @Valid
  private List<String> desFacet;

  @Valid
  private List<String> geoFacet;

  private String itemType;

  private String kicker;

  private String materialTypeFacet;

  @Valid
  private List<@Valid ArticleMultimediaInner> multimedia;

  @Valid
  private List<String> orgFacet;

  @Valid
  private List<String> perFacet;

  private String publishedDate;

  @Valid
  private List<@Valid ArticleRelatedUrlsInner> relatedUrls;

  private String section;

  private String shortUrl;

  private String subsection;

  private String thumbnailStandard;

  private String title;

  private String updatedDate;

  private String url;

  public Article _abstract(String _abstract) {
    this._abstract = _abstract;
    return this;
  }

  /**
   * Get _abstract
   * @return _abstract
  */
  
  @Schema(name = "abstract", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("abstract")
  public String getAbstract() {
    return _abstract;
  }

  public void setAbstract(String _abstract) {
    this._abstract = _abstract;
  }

  public Article byline(String byline) {
    this.byline = byline;
    return this;
  }

  /**
   * Get byline
   * @return byline
  */
  
  @Schema(name = "byline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("byline")
  public String getByline() {
    return byline;
  }

  public void setByline(String byline) {
    this.byline = byline;
  }

  public Article createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  
  @Schema(name = "created_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public Article desFacet(List<String> desFacet) {
    this.desFacet = desFacet;
    return this;
  }

  public Article addDesFacetItem(String desFacetItem) {
    if (this.desFacet == null) {
      this.desFacet = new ArrayList<>();
    }
    this.desFacet.add(desFacetItem);
    return this;
  }

  /**
   * Get desFacet
   * @return desFacet
  */
  
  @Schema(name = "des_facet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("des_facet")
  public List<String> getDesFacet() {
    return desFacet;
  }

  public void setDesFacet(List<String> desFacet) {
    this.desFacet = desFacet;
  }

  public Article geoFacet(List<String> geoFacet) {
    this.geoFacet = geoFacet;
    return this;
  }

  public Article addGeoFacetItem(String geoFacetItem) {
    if (this.geoFacet == null) {
      this.geoFacet = new ArrayList<>();
    }
    this.geoFacet.add(geoFacetItem);
    return this;
  }

  /**
   * Get geoFacet
   * @return geoFacet
  */
  
  @Schema(name = "geo_facet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geo_facet")
  public List<String> getGeoFacet() {
    return geoFacet;
  }

  public void setGeoFacet(List<String> geoFacet) {
    this.geoFacet = geoFacet;
  }

  public Article itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Get itemType
   * @return itemType
  */
  
  @Schema(name = "item_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public Article kicker(String kicker) {
    this.kicker = kicker;
    return this;
  }

  /**
   * Get kicker
   * @return kicker
  */
  
  @Schema(name = "kicker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kicker")
  public String getKicker() {
    return kicker;
  }

  public void setKicker(String kicker) {
    this.kicker = kicker;
  }

  public Article materialTypeFacet(String materialTypeFacet) {
    this.materialTypeFacet = materialTypeFacet;
    return this;
  }

  /**
   * Get materialTypeFacet
   * @return materialTypeFacet
  */
  
  @Schema(name = "material_type_facet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("material_type_facet")
  public String getMaterialTypeFacet() {
    return materialTypeFacet;
  }

  public void setMaterialTypeFacet(String materialTypeFacet) {
    this.materialTypeFacet = materialTypeFacet;
  }

  public Article multimedia(List<@Valid ArticleMultimediaInner> multimedia) {
    this.multimedia = multimedia;
    return this;
  }

  public Article addMultimediaItem(ArticleMultimediaInner multimediaItem) {
    if (this.multimedia == null) {
      this.multimedia = new ArrayList<>();
    }
    this.multimedia.add(multimediaItem);
    return this;
  }

  /**
   * Get multimedia
   * @return multimedia
  */
  @Valid 
  @Schema(name = "multimedia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("multimedia")
  public List<@Valid ArticleMultimediaInner> getMultimedia() {
    return multimedia;
  }

  public void setMultimedia(List<@Valid ArticleMultimediaInner> multimedia) {
    this.multimedia = multimedia;
  }

  public Article orgFacet(List<String> orgFacet) {
    this.orgFacet = orgFacet;
    return this;
  }

  public Article addOrgFacetItem(String orgFacetItem) {
    if (this.orgFacet == null) {
      this.orgFacet = new ArrayList<>();
    }
    this.orgFacet.add(orgFacetItem);
    return this;
  }

  /**
   * Get orgFacet
   * @return orgFacet
  */
  
  @Schema(name = "org_facet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org_facet")
  public List<String> getOrgFacet() {
    return orgFacet;
  }

  public void setOrgFacet(List<String> orgFacet) {
    this.orgFacet = orgFacet;
  }

  public Article perFacet(List<String> perFacet) {
    this.perFacet = perFacet;
    return this;
  }

  public Article addPerFacetItem(String perFacetItem) {
    if (this.perFacet == null) {
      this.perFacet = new ArrayList<>();
    }
    this.perFacet.add(perFacetItem);
    return this;
  }

  /**
   * Get perFacet
   * @return perFacet
  */
  
  @Schema(name = "per_facet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("per_facet")
  public List<String> getPerFacet() {
    return perFacet;
  }

  public void setPerFacet(List<String> perFacet) {
    this.perFacet = perFacet;
  }

  public Article publishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }

  /**
   * Get publishedDate
   * @return publishedDate
  */
  
  @Schema(name = "published_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("published_date")
  public String getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
  }

  public Article relatedUrls(List<@Valid ArticleRelatedUrlsInner> relatedUrls) {
    this.relatedUrls = relatedUrls;
    return this;
  }

  public Article addRelatedUrlsItem(ArticleRelatedUrlsInner relatedUrlsItem) {
    if (this.relatedUrls == null) {
      this.relatedUrls = new ArrayList<>();
    }
    this.relatedUrls.add(relatedUrlsItem);
    return this;
  }

  /**
   * Get relatedUrls
   * @return relatedUrls
  */
  @Valid 
  @Schema(name = "related_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related_urls")
  public List<@Valid ArticleRelatedUrlsInner> getRelatedUrls() {
    return relatedUrls;
  }

  public void setRelatedUrls(List<@Valid ArticleRelatedUrlsInner> relatedUrls) {
    this.relatedUrls = relatedUrls;
  }

  public Article section(String section) {
    this.section = section;
    return this;
  }

  /**
   * Get section
   * @return section
  */
  
  @Schema(name = "section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("section")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public Article shortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
    return this;
  }

  /**
   * Get shortUrl
   * @return shortUrl
  */
  
  @Schema(name = "short_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("short_url")
  public String getShortUrl() {
    return shortUrl;
  }

  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  public Article subsection(String subsection) {
    this.subsection = subsection;
    return this;
  }

  /**
   * Get subsection
   * @return subsection
  */
  
  @Schema(name = "subsection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsection")
  public String getSubsection() {
    return subsection;
  }

  public void setSubsection(String subsection) {
    this.subsection = subsection;
  }

  public Article thumbnailStandard(String thumbnailStandard) {
    this.thumbnailStandard = thumbnailStandard;
    return this;
  }

  /**
   * Get thumbnailStandard
   * @return thumbnailStandard
  */
  
  @Schema(name = "thumbnail_standard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnail_standard")
  public String getThumbnailStandard() {
    return thumbnailStandard;
  }

  public void setThumbnailStandard(String thumbnailStandard) {
    this.thumbnailStandard = thumbnailStandard;
  }

  public Article title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Article updatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  */
  
  @Schema(name = "updated_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_date")
  public String getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Article url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this._abstract, article._abstract) &&
        Objects.equals(this.byline, article.byline) &&
        Objects.equals(this.createdDate, article.createdDate) &&
        Objects.equals(this.desFacet, article.desFacet) &&
        Objects.equals(this.geoFacet, article.geoFacet) &&
        Objects.equals(this.itemType, article.itemType) &&
        Objects.equals(this.kicker, article.kicker) &&
        Objects.equals(this.materialTypeFacet, article.materialTypeFacet) &&
        Objects.equals(this.multimedia, article.multimedia) &&
        Objects.equals(this.orgFacet, article.orgFacet) &&
        Objects.equals(this.perFacet, article.perFacet) &&
        Objects.equals(this.publishedDate, article.publishedDate) &&
        Objects.equals(this.relatedUrls, article.relatedUrls) &&
        Objects.equals(this.section, article.section) &&
        Objects.equals(this.shortUrl, article.shortUrl) &&
        Objects.equals(this.subsection, article.subsection) &&
        Objects.equals(this.thumbnailStandard, article.thumbnailStandard) &&
        Objects.equals(this.title, article.title) &&
        Objects.equals(this.updatedDate, article.updatedDate) &&
        Objects.equals(this.url, article.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_abstract, byline, createdDate, desFacet, geoFacet, itemType, kicker, materialTypeFacet, multimedia, orgFacet, perFacet, publishedDate, relatedUrls, section, shortUrl, subsection, thumbnailStandard, title, updatedDate, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    byline: ").append(toIndentedString(byline)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    desFacet: ").append(toIndentedString(desFacet)).append("\n");
    sb.append("    geoFacet: ").append(toIndentedString(geoFacet)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    kicker: ").append(toIndentedString(kicker)).append("\n");
    sb.append("    materialTypeFacet: ").append(toIndentedString(materialTypeFacet)).append("\n");
    sb.append("    multimedia: ").append(toIndentedString(multimedia)).append("\n");
    sb.append("    orgFacet: ").append(toIndentedString(orgFacet)).append("\n");
    sb.append("    perFacet: ").append(toIndentedString(perFacet)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    relatedUrls: ").append(toIndentedString(relatedUrls)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    shortUrl: ").append(toIndentedString(shortUrl)).append("\n");
    sb.append("    subsection: ").append(toIndentedString(subsection)).append("\n");
    sb.append("    thumbnailStandard: ").append(toIndentedString(thumbnailStandard)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

