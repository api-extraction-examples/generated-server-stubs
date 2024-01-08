package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Used to control the data that gets attached to DtoBaseItems.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum ItemFields {
  
  AIRTIME("AirTime"),
  
  CANDELETE("CanDelete"),
  
  CANDOWNLOAD("CanDownload"),
  
  CHANNELINFO("ChannelInfo"),
  
  CHAPTERS("Chapters"),
  
  CHILDCOUNT("ChildCount"),
  
  CUMULATIVERUNTIMETICKS("CumulativeRunTimeTicks"),
  
  CUSTOMRATING("CustomRating"),
  
  DATECREATED("DateCreated"),
  
  DATELASTMEDIAADDED("DateLastMediaAdded"),
  
  DISPLAYPREFERENCESID("DisplayPreferencesId"),
  
  ETAG("Etag"),
  
  EXTERNALURLS("ExternalUrls"),
  
  GENRES("Genres"),
  
  HOMEPAGEURL("HomePageUrl"),
  
  ITEMCOUNTS("ItemCounts"),
  
  MEDIASOURCECOUNT("MediaSourceCount"),
  
  MEDIASOURCES("MediaSources"),
  
  ORIGINALTITLE("OriginalTitle"),
  
  OVERVIEW("Overview"),
  
  PARENTID("ParentId"),
  
  PATH("Path"),
  
  PEOPLE("People"),
  
  PLAYACCESS("PlayAccess"),
  
  PRODUCTIONLOCATIONS("ProductionLocations"),
  
  PROVIDERIDS("ProviderIds"),
  
  PRIMARYIMAGEASPECTRATIO("PrimaryImageAspectRatio"),
  
  RECURSIVEITEMCOUNT("RecursiveItemCount"),
  
  SETTINGS("Settings"),
  
  SCREENSHOTIMAGETAGS("ScreenshotImageTags"),
  
  SERIESPRIMARYIMAGE("SeriesPrimaryImage"),
  
  SERIESSTUDIO("SeriesStudio"),
  
  SORTNAME("SortName"),
  
  SPECIALEPISODENUMBERS("SpecialEpisodeNumbers"),
  
  STUDIOS("Studios"),
  
  BASICSYNCINFO("BasicSyncInfo"),
  
  SYNCINFO("SyncInfo"),
  
  TAGLINES("Taglines"),
  
  TAGS("Tags"),
  
  REMOTETRAILERS("RemoteTrailers"),
  
  MEDIASTREAMS("MediaStreams"),
  
  SEASONUSERDATA("SeasonUserData"),
  
  SERVICENAME("ServiceName"),
  
  THEMESONGIDS("ThemeSongIds"),
  
  THEMEVIDEOIDS("ThemeVideoIds"),
  
  EXTERNALETAG("ExternalEtag"),
  
  PRESENTATIONUNIQUEKEY("PresentationUniqueKey"),
  
  INHERITEDPARENTALRATINGVALUE("InheritedParentalRatingValue"),
  
  EXTERNALSERIESID("ExternalSeriesId"),
  
  SERIESPRESENTATIONUNIQUEKEY("SeriesPresentationUniqueKey"),
  
  DATELASTREFRESHED("DateLastRefreshed"),
  
  DATELASTSAVED("DateLastSaved"),
  
  REFRESHSTATE("RefreshState"),
  
  CHANNELIMAGE("ChannelImage"),
  
  ENABLEMEDIASOURCEDISPLAY("EnableMediaSourceDisplay"),
  
  WIDTH("Width"),
  
  HEIGHT("Height"),
  
  EXTRAIDS("ExtraIds"),
  
  LOCALTRAILERCOUNT("LocalTrailerCount"),
  
  ISHD("IsHD"),
  
  SPECIALFEATURECOUNT("SpecialFeatureCount");

  private String value;

  ItemFields(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ItemFields fromValue(String value) {
    for (ItemFields b : ItemFields.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

