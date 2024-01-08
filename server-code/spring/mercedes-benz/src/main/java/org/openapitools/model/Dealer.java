package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.Address;
import org.openapitools.model.BrandCode;
import org.openapitools.model.CommunicationChannels;
import org.openapitools.model.Function;
import org.openapitools.model.FunctionOpeningHours;
import org.openapitools.model.GeoCoordinates;
import org.openapitools.model.RegionRepresentation;
import org.openapitools.model.SelfLink;
import org.openapitools.model.TheDistance;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * the representation of an dealer
 */

@Schema(name = "Dealer", description = "the representation of an dealer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class Dealer {

  private SelfLink links;

  private Address address;

  @Valid
  private List<@Valid BrandCode> brandCodes;

  private CommunicationChannels communication;

  private String dealerId;

  private TheDistance distance;

  @Valid
  private Set<@Valid Function> functions;

  private GeoCoordinates geoCoordinates;

  private String legalName;

  private String nameAddition;

  @Valid
  private Set<@Valid FunctionOpeningHours> openingHours;

  private RegionRepresentation region;

  public Dealer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Dealer(SelfLink links, String dealerId, String legalName) {
    this.links = links;
    this.dealerId = dealerId;
    this.legalName = legalName;
  }

  public Dealer links(SelfLink links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @NotNull @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("_links")
  public SelfLink getLinks() {
    return links;
  }

  public void setLinks(SelfLink links) {
    this.links = links;
  }

  public Dealer address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Dealer brandCodes(List<@Valid BrandCode> brandCodes) {
    this.brandCodes = brandCodes;
    return this;
  }

  public Dealer addBrandCodesItem(BrandCode brandCodesItem) {
    if (this.brandCodes == null) {
      this.brandCodes = new ArrayList<>();
    }
    this.brandCodes.add(brandCodesItem);
    return this;
  }

  /**
   * network brand codes of the dealer, dealer numbers
   * @return brandCodes
  */
  @Valid 
  @Schema(name = "brandCodes", description = "network brand codes of the dealer, dealer numbers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brandCodes")
  public List<@Valid BrandCode> getBrandCodes() {
    return brandCodes;
  }

  public void setBrandCodes(List<@Valid BrandCode> brandCodes) {
    this.brandCodes = brandCodes;
  }

  public Dealer communication(CommunicationChannels communication) {
    this.communication = communication;
    return this;
  }

  /**
   * Get communication
   * @return communication
  */
  @Valid 
  @Schema(name = "communication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("communication")
  public CommunicationChannels getCommunication() {
    return communication;
  }

  public void setCommunication(CommunicationChannels communication) {
    this.communication = communication;
  }

  public Dealer dealerId(String dealerId) {
    this.dealerId = dealerId;
    return this;
  }

  /**
   * GSSN unique ID, main identifier
   * @return dealerId
  */
  @NotNull 
  @Schema(name = "dealerId", description = "GSSN unique ID, main identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dealerId")
  public String getDealerId() {
    return dealerId;
  }

  public void setDealerId(String dealerId) {
    this.dealerId = dealerId;
  }

  public Dealer distance(TheDistance distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  */
  @Valid 
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public TheDistance getDistance() {
    return distance;
  }

  public void setDistance(TheDistance distance) {
    this.distance = distance;
  }

  public Dealer functions(Set<@Valid Function> functions) {
    this.functions = functions;
    return this;
  }

  public Dealer addFunctionsItem(Function functionsItem) {
    if (this.functions == null) {
      this.functions = new LinkedHashSet<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

  /**
   * list of functions for the dealer
   * @return functions
  */
  @Valid 
  @Schema(name = "functions", description = "list of functions for the dealer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functions")
  public Set<@Valid Function> getFunctions() {
    return functions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setFunctions(Set<@Valid Function> functions) {
    this.functions = functions;
  }

  public Dealer geoCoordinates(GeoCoordinates geoCoordinates) {
    this.geoCoordinates = geoCoordinates;
    return this;
  }

  /**
   * Get geoCoordinates
   * @return geoCoordinates
  */
  @Valid 
  @Schema(name = "geoCoordinates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geoCoordinates")
  public GeoCoordinates getGeoCoordinates() {
    return geoCoordinates;
  }

  public void setGeoCoordinates(GeoCoordinates geoCoordinates) {
    this.geoCoordinates = geoCoordinates;
  }

  public Dealer legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * legal name of the company
   * @return legalName
  */
  @NotNull 
  @Schema(name = "legalName", description = "legal name of the company", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legalName")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public Dealer nameAddition(String nameAddition) {
    this.nameAddition = nameAddition;
    return this;
  }

  /**
   * name addition, country specific use
   * @return nameAddition
  */
  
  @Schema(name = "nameAddition", description = "name addition, country specific use", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameAddition")
  public String getNameAddition() {
    return nameAddition;
  }

  public void setNameAddition(String nameAddition) {
    this.nameAddition = nameAddition;
  }

  public Dealer openingHours(Set<@Valid FunctionOpeningHours> openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  public Dealer addOpeningHoursItem(FunctionOpeningHours openingHoursItem) {
    if (this.openingHours == null) {
      this.openingHours = new LinkedHashSet<>();
    }
    this.openingHours.add(openingHoursItem);
    return this;
  }

  /**
   * List of opening hours for each customer relevant function for each day 
   * @return openingHours
  */
  @Valid 
  @Schema(name = "openingHours", description = "List of opening hours for each customer relevant function for each day ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openingHours")
  public Set<@Valid FunctionOpeningHours> getOpeningHours() {
    return openingHours;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOpeningHours(Set<@Valid FunctionOpeningHours> openingHours) {
    this.openingHours = openingHours;
  }

  public Dealer region(RegionRepresentation region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  @Valid 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public RegionRepresentation getRegion() {
    return region;
  }

  public void setRegion(RegionRepresentation region) {
    this.region = region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dealer dealer = (Dealer) o;
    return Objects.equals(this.links, dealer.links) &&
        Objects.equals(this.address, dealer.address) &&
        Objects.equals(this.brandCodes, dealer.brandCodes) &&
        Objects.equals(this.communication, dealer.communication) &&
        Objects.equals(this.dealerId, dealer.dealerId) &&
        Objects.equals(this.distance, dealer.distance) &&
        Objects.equals(this.functions, dealer.functions) &&
        Objects.equals(this.geoCoordinates, dealer.geoCoordinates) &&
        Objects.equals(this.legalName, dealer.legalName) &&
        Objects.equals(this.nameAddition, dealer.nameAddition) &&
        Objects.equals(this.openingHours, dealer.openingHours) &&
        Objects.equals(this.region, dealer.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, address, brandCodes, communication, dealerId, distance, functions, geoCoordinates, legalName, nameAddition, openingHours, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dealer {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    brandCodes: ").append(toIndentedString(brandCodes)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    dealerId: ").append(toIndentedString(dealerId)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    geoCoordinates: ").append(toIndentedString(geoCoordinates)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    nameAddition: ").append(toIndentedString(nameAddition)).append("\n");
    sb.append("    openingHours: ").append(toIndentedString(openingHours)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

