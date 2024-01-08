package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Gets or sets the blurhashes for the image tags.  Maps image type to dictionary mapping image tag to blurhash value.
 */

@Schema(name = "BaseItemDto_ImageBlurHashes", description = "Gets or sets the blurhashes for the image tags.  Maps image type to dictionary mapping image tag to blurhash value.")
@JsonTypeName("BaseItemDto_ImageBlurHashes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class BaseItemDtoImageBlurHashes {

  @Valid
  private Map<String, String> art = new HashMap<>();

  @Valid
  private Map<String, String> backdrop = new HashMap<>();

  @Valid
  private Map<String, String> banner = new HashMap<>();

  @Valid
  private Map<String, String> box = new HashMap<>();

  @Valid
  private Map<String, String> boxRear = new HashMap<>();

  @Valid
  private Map<String, String> chapter = new HashMap<>();

  @Valid
  private Map<String, String> disc = new HashMap<>();

  @Valid
  private Map<String, String> logo = new HashMap<>();

  @Valid
  private Map<String, String> menu = new HashMap<>();

  @Valid
  private Map<String, String> primary = new HashMap<>();

  @Valid
  private Map<String, String> profile = new HashMap<>();

  @Valid
  private Map<String, String> screenshot = new HashMap<>();

  @Valid
  private Map<String, String> thumb = new HashMap<>();

  public BaseItemDtoImageBlurHashes art(Map<String, String> art) {
    this.art = art;
    return this;
  }

  public BaseItemDtoImageBlurHashes putArtItem(String key, String artItem) {
    if (this.art == null) {
      this.art = new HashMap<>();
    }
    this.art.put(key, artItem);
    return this;
  }

  /**
   * Get art
   * @return art
  */
  
  @Schema(name = "Art", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Art")
  public Map<String, String> getArt() {
    return art;
  }

  public void setArt(Map<String, String> art) {
    this.art = art;
  }

  public BaseItemDtoImageBlurHashes backdrop(Map<String, String> backdrop) {
    this.backdrop = backdrop;
    return this;
  }

  public BaseItemDtoImageBlurHashes putBackdropItem(String key, String backdropItem) {
    if (this.backdrop == null) {
      this.backdrop = new HashMap<>();
    }
    this.backdrop.put(key, backdropItem);
    return this;
  }

  /**
   * Get backdrop
   * @return backdrop
  */
  
  @Schema(name = "Backdrop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Backdrop")
  public Map<String, String> getBackdrop() {
    return backdrop;
  }

  public void setBackdrop(Map<String, String> backdrop) {
    this.backdrop = backdrop;
  }

  public BaseItemDtoImageBlurHashes banner(Map<String, String> banner) {
    this.banner = banner;
    return this;
  }

  public BaseItemDtoImageBlurHashes putBannerItem(String key, String bannerItem) {
    if (this.banner == null) {
      this.banner = new HashMap<>();
    }
    this.banner.put(key, bannerItem);
    return this;
  }

  /**
   * Get banner
   * @return banner
  */
  
  @Schema(name = "Banner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Banner")
  public Map<String, String> getBanner() {
    return banner;
  }

  public void setBanner(Map<String, String> banner) {
    this.banner = banner;
  }

  public BaseItemDtoImageBlurHashes box(Map<String, String> box) {
    this.box = box;
    return this;
  }

  public BaseItemDtoImageBlurHashes putBoxItem(String key, String boxItem) {
    if (this.box == null) {
      this.box = new HashMap<>();
    }
    this.box.put(key, boxItem);
    return this;
  }

  /**
   * Get box
   * @return box
  */
  
  @Schema(name = "Box", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Box")
  public Map<String, String> getBox() {
    return box;
  }

  public void setBox(Map<String, String> box) {
    this.box = box;
  }

  public BaseItemDtoImageBlurHashes boxRear(Map<String, String> boxRear) {
    this.boxRear = boxRear;
    return this;
  }

  public BaseItemDtoImageBlurHashes putBoxRearItem(String key, String boxRearItem) {
    if (this.boxRear == null) {
      this.boxRear = new HashMap<>();
    }
    this.boxRear.put(key, boxRearItem);
    return this;
  }

  /**
   * Get boxRear
   * @return boxRear
  */
  
  @Schema(name = "BoxRear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BoxRear")
  public Map<String, String> getBoxRear() {
    return boxRear;
  }

  public void setBoxRear(Map<String, String> boxRear) {
    this.boxRear = boxRear;
  }

  public BaseItemDtoImageBlurHashes chapter(Map<String, String> chapter) {
    this.chapter = chapter;
    return this;
  }

  public BaseItemDtoImageBlurHashes putChapterItem(String key, String chapterItem) {
    if (this.chapter == null) {
      this.chapter = new HashMap<>();
    }
    this.chapter.put(key, chapterItem);
    return this;
  }

  /**
   * Get chapter
   * @return chapter
  */
  
  @Schema(name = "Chapter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Chapter")
  public Map<String, String> getChapter() {
    return chapter;
  }

  public void setChapter(Map<String, String> chapter) {
    this.chapter = chapter;
  }

  public BaseItemDtoImageBlurHashes disc(Map<String, String> disc) {
    this.disc = disc;
    return this;
  }

  public BaseItemDtoImageBlurHashes putDiscItem(String key, String discItem) {
    if (this.disc == null) {
      this.disc = new HashMap<>();
    }
    this.disc.put(key, discItem);
    return this;
  }

  /**
   * Get disc
   * @return disc
  */
  
  @Schema(name = "Disc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Disc")
  public Map<String, String> getDisc() {
    return disc;
  }

  public void setDisc(Map<String, String> disc) {
    this.disc = disc;
  }

  public BaseItemDtoImageBlurHashes logo(Map<String, String> logo) {
    this.logo = logo;
    return this;
  }

  public BaseItemDtoImageBlurHashes putLogoItem(String key, String logoItem) {
    if (this.logo == null) {
      this.logo = new HashMap<>();
    }
    this.logo.put(key, logoItem);
    return this;
  }

  /**
   * Get logo
   * @return logo
  */
  
  @Schema(name = "Logo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Logo")
  public Map<String, String> getLogo() {
    return logo;
  }

  public void setLogo(Map<String, String> logo) {
    this.logo = logo;
  }

  public BaseItemDtoImageBlurHashes menu(Map<String, String> menu) {
    this.menu = menu;
    return this;
  }

  public BaseItemDtoImageBlurHashes putMenuItem(String key, String menuItem) {
    if (this.menu == null) {
      this.menu = new HashMap<>();
    }
    this.menu.put(key, menuItem);
    return this;
  }

  /**
   * Get menu
   * @return menu
  */
  
  @Schema(name = "Menu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Menu")
  public Map<String, String> getMenu() {
    return menu;
  }

  public void setMenu(Map<String, String> menu) {
    this.menu = menu;
  }

  public BaseItemDtoImageBlurHashes primary(Map<String, String> primary) {
    this.primary = primary;
    return this;
  }

  public BaseItemDtoImageBlurHashes putPrimaryItem(String key, String primaryItem) {
    if (this.primary == null) {
      this.primary = new HashMap<>();
    }
    this.primary.put(key, primaryItem);
    return this;
  }

  /**
   * Get primary
   * @return primary
  */
  
  @Schema(name = "Primary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Primary")
  public Map<String, String> getPrimary() {
    return primary;
  }

  public void setPrimary(Map<String, String> primary) {
    this.primary = primary;
  }

  public BaseItemDtoImageBlurHashes profile(Map<String, String> profile) {
    this.profile = profile;
    return this;
  }

  public BaseItemDtoImageBlurHashes putProfileItem(String key, String profileItem) {
    if (this.profile == null) {
      this.profile = new HashMap<>();
    }
    this.profile.put(key, profileItem);
    return this;
  }

  /**
   * Get profile
   * @return profile
  */
  
  @Schema(name = "Profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Profile")
  public Map<String, String> getProfile() {
    return profile;
  }

  public void setProfile(Map<String, String> profile) {
    this.profile = profile;
  }

  public BaseItemDtoImageBlurHashes screenshot(Map<String, String> screenshot) {
    this.screenshot = screenshot;
    return this;
  }

  public BaseItemDtoImageBlurHashes putScreenshotItem(String key, String screenshotItem) {
    if (this.screenshot == null) {
      this.screenshot = new HashMap<>();
    }
    this.screenshot.put(key, screenshotItem);
    return this;
  }

  /**
   * Get screenshot
   * @return screenshot
  */
  
  @Schema(name = "Screenshot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Screenshot")
  public Map<String, String> getScreenshot() {
    return screenshot;
  }

  public void setScreenshot(Map<String, String> screenshot) {
    this.screenshot = screenshot;
  }

  public BaseItemDtoImageBlurHashes thumb(Map<String, String> thumb) {
    this.thumb = thumb;
    return this;
  }

  public BaseItemDtoImageBlurHashes putThumbItem(String key, String thumbItem) {
    if (this.thumb == null) {
      this.thumb = new HashMap<>();
    }
    this.thumb.put(key, thumbItem);
    return this;
  }

  /**
   * Get thumb
   * @return thumb
  */
  
  @Schema(name = "Thumb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Thumb")
  public Map<String, String> getThumb() {
    return thumb;
  }

  public void setThumb(Map<String, String> thumb) {
    this.thumb = thumb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseItemDtoImageBlurHashes baseItemDtoImageBlurHashes = (BaseItemDtoImageBlurHashes) o;
    return Objects.equals(this.art, baseItemDtoImageBlurHashes.art) &&
        Objects.equals(this.backdrop, baseItemDtoImageBlurHashes.backdrop) &&
        Objects.equals(this.banner, baseItemDtoImageBlurHashes.banner) &&
        Objects.equals(this.box, baseItemDtoImageBlurHashes.box) &&
        Objects.equals(this.boxRear, baseItemDtoImageBlurHashes.boxRear) &&
        Objects.equals(this.chapter, baseItemDtoImageBlurHashes.chapter) &&
        Objects.equals(this.disc, baseItemDtoImageBlurHashes.disc) &&
        Objects.equals(this.logo, baseItemDtoImageBlurHashes.logo) &&
        Objects.equals(this.menu, baseItemDtoImageBlurHashes.menu) &&
        Objects.equals(this.primary, baseItemDtoImageBlurHashes.primary) &&
        Objects.equals(this.profile, baseItemDtoImageBlurHashes.profile) &&
        Objects.equals(this.screenshot, baseItemDtoImageBlurHashes.screenshot) &&
        Objects.equals(this.thumb, baseItemDtoImageBlurHashes.thumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(art, backdrop, banner, box, boxRear, chapter, disc, logo, menu, primary, profile, screenshot, thumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseItemDtoImageBlurHashes {\n");
    sb.append("    art: ").append(toIndentedString(art)).append("\n");
    sb.append("    backdrop: ").append(toIndentedString(backdrop)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    box: ").append(toIndentedString(box)).append("\n");
    sb.append("    boxRear: ").append(toIndentedString(boxRear)).append("\n");
    sb.append("    chapter: ").append(toIndentedString(chapter)).append("\n");
    sb.append("    disc: ").append(toIndentedString(disc)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
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

