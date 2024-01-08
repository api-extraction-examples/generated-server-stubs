package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.House;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Member
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class Member {

  private House house;

  private JsonNullable<String> memberFrom = JsonNullable.<String>undefined();

  private Integer memberId;

  private JsonNullable<String> memberPage = JsonNullable.<String>undefined();

  private JsonNullable<String> memberPhoto = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> party = JsonNullable.<String>undefined();

  private JsonNullable<String> partyColour = JsonNullable.<String>undefined();

  public Member house(House house) {
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

  public Member memberFrom(String memberFrom) {
    this.memberFrom = JsonNullable.of(memberFrom);
    return this;
  }

  /**
   * Get memberFrom
   * @return memberFrom
  */
  
  @Schema(name = "memberFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberFrom")
  public JsonNullable<String> getMemberFrom() {
    return memberFrom;
  }

  public void setMemberFrom(JsonNullable<String> memberFrom) {
    this.memberFrom = memberFrom;
  }

  public Member memberId(Integer memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
  */
  
  @Schema(name = "memberId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberId")
  public Integer getMemberId() {
    return memberId;
  }

  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }

  public Member memberPage(String memberPage) {
    this.memberPage = JsonNullable.of(memberPage);
    return this;
  }

  /**
   * Get memberPage
   * @return memberPage
  */
  
  @Schema(name = "memberPage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberPage")
  public JsonNullable<String> getMemberPage() {
    return memberPage;
  }

  public void setMemberPage(JsonNullable<String> memberPage) {
    this.memberPage = memberPage;
  }

  public Member memberPhoto(String memberPhoto) {
    this.memberPhoto = JsonNullable.of(memberPhoto);
    return this;
  }

  /**
   * Get memberPhoto
   * @return memberPhoto
  */
  
  @Schema(name = "memberPhoto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberPhoto")
  public JsonNullable<String> getMemberPhoto() {
    return memberPhoto;
  }

  public void setMemberPhoto(JsonNullable<String> memberPhoto) {
    this.memberPhoto = memberPhoto;
  }

  public Member name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public Member party(String party) {
    this.party = JsonNullable.of(party);
    return this;
  }

  /**
   * Get party
   * @return party
  */
  
  @Schema(name = "party", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("party")
  public JsonNullable<String> getParty() {
    return party;
  }

  public void setParty(JsonNullable<String> party) {
    this.party = party;
  }

  public Member partyColour(String partyColour) {
    this.partyColour = JsonNullable.of(partyColour);
    return this;
  }

  /**
   * Get partyColour
   * @return partyColour
  */
  
  @Schema(name = "partyColour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyColour")
  public JsonNullable<String> getPartyColour() {
    return partyColour;
  }

  public void setPartyColour(JsonNullable<String> partyColour) {
    this.partyColour = partyColour;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.house, member.house) &&
        equalsNullable(this.memberFrom, member.memberFrom) &&
        Objects.equals(this.memberId, member.memberId) &&
        equalsNullable(this.memberPage, member.memberPage) &&
        equalsNullable(this.memberPhoto, member.memberPhoto) &&
        equalsNullable(this.name, member.name) &&
        equalsNullable(this.party, member.party) &&
        equalsNullable(this.partyColour, member.partyColour);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(house, hashCodeNullable(memberFrom), memberId, hashCodeNullable(memberPage), hashCodeNullable(memberPhoto), hashCodeNullable(name), hashCodeNullable(party), hashCodeNullable(partyColour));
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
    sb.append("class Member {\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    memberFrom: ").append(toIndentedString(memberFrom)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    memberPage: ").append(toIndentedString(memberPage)).append("\n");
    sb.append("    memberPhoto: ").append(toIndentedString(memberPhoto)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    partyColour: ").append(toIndentedString(partyColour)).append("\n");
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

