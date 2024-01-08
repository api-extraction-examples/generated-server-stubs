/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



// BaseItemDto - This is strictly used as a data transfer object from the api layer.  This holds information about a BaseItem in a format that is convenient for the client.
type BaseItemDto struct {

	// Gets or sets the air days.
	AirDays *[]DayOfWeek `json:"AirDays,omitempty"`

	// Gets or sets the air time.
	AirTime *string `json:"AirTime,omitempty"`

	AirsAfterSeasonNumber *int32 `json:"AirsAfterSeasonNumber,omitempty"`

	AirsBeforeEpisodeNumber *int32 `json:"AirsBeforeEpisodeNumber,omitempty"`

	AirsBeforeSeasonNumber *int32 `json:"AirsBeforeSeasonNumber,omitempty"`

	// Gets or sets the album.
	Album *string `json:"Album,omitempty"`

	// Gets or sets the album artist.
	AlbumArtist *string `json:"AlbumArtist,omitempty"`

	// Gets or sets the album artists.
	AlbumArtists *[]NameGuidPair `json:"AlbumArtists,omitempty"`

	// Gets or sets the album count.
	AlbumCount *int32 `json:"AlbumCount,omitempty"`

	// Gets or sets the album id.
	AlbumId *string `json:"AlbumId,omitempty"`

	// Gets or sets the album image tag.
	AlbumPrimaryImageTag *string `json:"AlbumPrimaryImageTag,omitempty"`

	Altitude *float64 `json:"Altitude,omitempty"`

	Aperture *float64 `json:"Aperture,omitempty"`

	ArtistCount *int32 `json:"ArtistCount,omitempty"`

	// Gets or sets the artist items.
	ArtistItems *[]NameGuidPair `json:"ArtistItems,omitempty"`

	// Gets or sets the artists.
	Artists *[]string `json:"Artists,omitempty"`

	// Gets or sets the aspect ratio.
	AspectRatio *string `json:"AspectRatio,omitempty"`

	Audio ProgramAudio `json:"Audio,omitempty"`

	// Gets or sets the backdrop image tags.
	BackdropImageTags *[]string `json:"BackdropImageTags,omitempty"`

	CameraMake *string `json:"CameraMake,omitempty"`

	CameraModel *string `json:"CameraModel,omitempty"`

	CanDelete *bool `json:"CanDelete,omitempty"`

	CanDownload *bool `json:"CanDownload,omitempty"`

	// Gets or sets the channel identifier.
	ChannelId *string `json:"ChannelId,omitempty"`

	ChannelName *string `json:"ChannelName,omitempty"`

	ChannelNumber *string `json:"ChannelNumber,omitempty"`

	// Gets or sets the channel primary image tag.
	ChannelPrimaryImageTag *string `json:"ChannelPrimaryImageTag,omitempty"`

	ChannelType ChannelType `json:"ChannelType,omitempty"`

	// Gets or sets the chapters.
	Chapters *[]ChapterInfo `json:"Chapters,omitempty"`

	// Gets or sets the child count.
	ChildCount *int32 `json:"ChildCount,omitempty"`

	// Gets or sets the type of the collection.
	CollectionType *string `json:"CollectionType,omitempty"`

	// Gets or sets the community rating.
	CommunityRating *float32 `json:"CommunityRating,omitempty"`

	// Gets or sets the completion percentage.
	CompletionPercentage *float64 `json:"CompletionPercentage,omitempty"`

	Container *string `json:"Container,omitempty"`

	// Gets or sets the critic rating.
	CriticRating *float32 `json:"CriticRating,omitempty"`

	// Gets or sets the cumulative run time ticks.
	CumulativeRunTimeTicks *int64 `json:"CumulativeRunTimeTicks,omitempty"`

	CurrentProgram BaseItemDto `json:"CurrentProgram,omitempty"`

	// Gets or sets the custom rating.
	CustomRating *string `json:"CustomRating,omitempty"`

	// Gets or sets the date created.
	DateCreated *time.Time `json:"DateCreated,omitempty"`

	DateLastMediaAdded *time.Time `json:"DateLastMediaAdded,omitempty"`

	// Gets or sets the display order.
	DisplayOrder *string `json:"DisplayOrder,omitempty"`

	// Gets or sets the display preferences id.
	DisplayPreferencesId *string `json:"DisplayPreferencesId,omitempty"`

	EnableMediaSourceDisplay *bool `json:"EnableMediaSourceDisplay,omitempty"`

	// Gets or sets the end date.
	EndDate *time.Time `json:"EndDate,omitempty"`

	// Gets or sets the episode count.
	EpisodeCount *int32 `json:"EpisodeCount,omitempty"`

	// Gets or sets the episode title.
	EpisodeTitle *string `json:"EpisodeTitle,omitempty"`

	// Gets or sets the etag.
	Etag *string `json:"Etag,omitempty"`

	ExposureTime *float64 `json:"ExposureTime,omitempty"`

	// Gets or sets the external urls.
	ExternalUrls *[]ExternalUrl `json:"ExternalUrls,omitempty"`

	ExtraType *string `json:"ExtraType,omitempty"`

	FocalLength *float64 `json:"FocalLength,omitempty"`

	ForcedSortName *string `json:"ForcedSortName,omitempty"`

	GenreItems *[]NameGuidPair `json:"GenreItems,omitempty"`

	// Gets or sets the genres.
	Genres *[]string `json:"Genres,omitempty"`

	HasSubtitles *bool `json:"HasSubtitles,omitempty"`

	Height *int32 `json:"Height,omitempty"`

	// Gets or sets the id.
	Id string `json:"Id,omitempty"`

	ImageBlurHashes *BaseItemDtoImageBlurHashes `json:"ImageBlurHashes,omitempty"`

	ImageOrientation ImageOrientation `json:"ImageOrientation,omitempty"`

	// Gets or sets the image tags.
	ImageTags *map[string]string `json:"ImageTags,omitempty"`

	// Gets or sets the index number.
	IndexNumber *int32 `json:"IndexNumber,omitempty"`

	// Gets or sets the index number end.
	IndexNumberEnd *int32 `json:"IndexNumberEnd,omitempty"`

	// Gets or sets a value indicating whether this instance is folder.
	IsFolder *bool `json:"IsFolder,omitempty"`

	// Gets or sets a value indicating whether this instance is HD.
	IsHD *bool `json:"IsHD,omitempty"`

	// Gets or sets a value indicating whether this instance is kids.
	IsKids *bool `json:"IsKids,omitempty"`

	// Gets or sets a value indicating whether this instance is live.
	IsLive *bool `json:"IsLive,omitempty"`

	// Gets or sets a value indicating whether this instance is movie.
	IsMovie *bool `json:"IsMovie,omitempty"`

	// Gets or sets a value indicating whether this instance is news.
	IsNews *bool `json:"IsNews,omitempty"`

	// Gets or sets a value indicating whether this instance is place holder.
	IsPlaceHolder *bool `json:"IsPlaceHolder,omitempty"`

	// Gets or sets a value indicating whether this instance is premiere.
	IsPremiere *bool `json:"IsPremiere,omitempty"`

	// Gets or sets a value indicating whether this instance is repeat.
	IsRepeat *bool `json:"IsRepeat,omitempty"`

	// Gets or sets a value indicating whether this instance is series.
	IsSeries *bool `json:"IsSeries,omitempty"`

	// Gets or sets a value indicating whether this instance is sports.
	IsSports *bool `json:"IsSports,omitempty"`

	IsoSpeedRating *int32 `json:"IsoSpeedRating,omitempty"`

	IsoType IsoType `json:"IsoType,omitempty"`

	Latitude *float64 `json:"Latitude,omitempty"`

	// Gets or sets the local trailer count.
	LocalTrailerCount *int32 `json:"LocalTrailerCount,omitempty"`

	LocationType LocationType `json:"LocationType,omitempty"`

	// Gets or sets a value indicating whether [enable internet providers].
	LockData *bool `json:"LockData,omitempty"`

	// Gets or sets the locked fields.
	LockedFields *[]MetadataField `json:"LockedFields,omitempty"`

	Longitude *float64 `json:"Longitude,omitempty"`

	MediaSourceCount *int32 `json:"MediaSourceCount,omitempty"`

	// Gets or sets the media versions.
	MediaSources *[]MediaSourceInfo `json:"MediaSources,omitempty"`

	// Gets or sets the media streams.
	MediaStreams *[]MediaStream `json:"MediaStreams,omitempty"`

	// Gets or sets the type of the media.
	MediaType *string `json:"MediaType,omitempty"`

	// Gets or sets the movie count.
	MovieCount *int32 `json:"MovieCount,omitempty"`

	// Gets or sets the music video count.
	MusicVideoCount *int32 `json:"MusicVideoCount,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the number.
	Number *string `json:"Number,omitempty"`

	// Gets or sets the official rating.
	OfficialRating *string `json:"OfficialRating,omitempty"`

	OriginalTitle *string `json:"OriginalTitle,omitempty"`

	// Gets or sets the overview.
	Overview *string `json:"Overview,omitempty"`

	// Gets or sets the parent art image tag.
	ParentArtImageTag *string `json:"ParentArtImageTag,omitempty"`

	// If the item does not have a art, this will hold the Id of the Parent that has one.
	ParentArtItemId *string `json:"ParentArtItemId,omitempty"`

	// Gets or sets the parent backdrop image tags.
	ParentBackdropImageTags *[]string `json:"ParentBackdropImageTags,omitempty"`

	// If the item does not have any backdrops, this will hold the Id of the Parent that has one.
	ParentBackdropItemId *string `json:"ParentBackdropItemId,omitempty"`

	// Gets or sets the parent id.
	ParentId *string `json:"ParentId,omitempty"`

	// Gets or sets the parent index number.
	ParentIndexNumber *int32 `json:"ParentIndexNumber,omitempty"`

	// Gets or sets the parent logo image tag.
	ParentLogoImageTag *string `json:"ParentLogoImageTag,omitempty"`

	// If the item does not have a logo, this will hold the Id of the Parent that has one.
	ParentLogoItemId *string `json:"ParentLogoItemId,omitempty"`

	// Gets or sets the parent primary image item identifier.
	ParentPrimaryImageItemId *string `json:"ParentPrimaryImageItemId,omitempty"`

	// Gets or sets the parent primary image tag.
	ParentPrimaryImageTag *string `json:"ParentPrimaryImageTag,omitempty"`

	// Gets or sets the parent thumb image tag.
	ParentThumbImageTag *string `json:"ParentThumbImageTag,omitempty"`

	// Gets or sets the parent thumb item id.
	ParentThumbItemId *string `json:"ParentThumbItemId,omitempty"`

	// Gets or sets the part count.
	PartCount *int32 `json:"PartCount,omitempty"`

	// Gets or sets the path.
	Path *string `json:"Path,omitempty"`

	// Gets or sets the people.
	People *[]BaseItemPerson `json:"People,omitempty"`

	PlayAccess PlayAccess `json:"PlayAccess,omitempty"`

	// Gets or sets the playlist item identifier.
	PlaylistItemId *string `json:"PlaylistItemId,omitempty"`

	PreferredMetadataCountryCode *string `json:"PreferredMetadataCountryCode,omitempty"`

	PreferredMetadataLanguage *string `json:"PreferredMetadataLanguage,omitempty"`

	// Gets or sets the premiere date.
	PremiereDate *time.Time `json:"PremiereDate,omitempty"`

	// Gets or sets the primary image aspect ratio, after image enhancements.
	PrimaryImageAspectRatio *float64 `json:"PrimaryImageAspectRatio,omitempty"`

	ProductionLocations *[]string `json:"ProductionLocations,omitempty"`

	// Gets or sets the production year.
	ProductionYear *int32 `json:"ProductionYear,omitempty"`

	ProgramCount *int32 `json:"ProgramCount,omitempty"`

	// Gets or sets the program identifier.
	ProgramId *string `json:"ProgramId,omitempty"`

	// Gets or sets the provider ids.
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`

	// Gets or sets the recursive item count.
	RecursiveItemCount *int32 `json:"RecursiveItemCount,omitempty"`

	// Gets or sets the trailer urls.
	RemoteTrailers *[]MediaUrl `json:"RemoteTrailers,omitempty"`

	// Gets or sets the run time ticks.
	RunTimeTicks *int64 `json:"RunTimeTicks,omitempty"`

	// Gets or sets the screenshot image tags.
	ScreenshotImageTags *[]string `json:"ScreenshotImageTags,omitempty"`

	// Gets or sets the season identifier.
	SeasonId *string `json:"SeasonId,omitempty"`

	// Gets or sets the name of the season.
	SeasonName *string `json:"SeasonName,omitempty"`

	// Gets or sets the series count.
	SeriesCount *int32 `json:"SeriesCount,omitempty"`

	// Gets or sets the series id.
	SeriesId *string `json:"SeriesId,omitempty"`

	// Gets or sets the name of the series.
	SeriesName *string `json:"SeriesName,omitempty"`

	// Gets or sets the series primary image tag.
	SeriesPrimaryImageTag *string `json:"SeriesPrimaryImageTag,omitempty"`

	// Gets or sets the series studio.
	SeriesStudio *string `json:"SeriesStudio,omitempty"`

	// Gets or sets the series thumb image tag.
	SeriesThumbImageTag *string `json:"SeriesThumbImageTag,omitempty"`

	// Gets or sets the series timer identifier.
	SeriesTimerId *string `json:"SeriesTimerId,omitempty"`

	// Gets or sets the server identifier.
	ServerId *string `json:"ServerId,omitempty"`

	ShutterSpeed *float64 `json:"ShutterSpeed,omitempty"`

	Software *string `json:"Software,omitempty"`

	// Gets or sets the song count.
	SongCount *int32 `json:"SongCount,omitempty"`

	// Gets or sets the name of the sort.
	SortName *string `json:"SortName,omitempty"`

	// Gets or sets the type of the source.
	SourceType *string `json:"SourceType,omitempty"`

	// Gets or sets the special feature count.
	SpecialFeatureCount *int32 `json:"SpecialFeatureCount,omitempty"`

	// The start date of the recording, in UTC.
	StartDate *time.Time `json:"StartDate,omitempty"`

	// Gets or sets the status.
	Status *string `json:"Status,omitempty"`

	// Gets or sets the studios.
	Studios *[]NameGuidPair `json:"Studios,omitempty"`

	// Gets or sets a value indicating whether [supports synchronize].
	SupportsSync *bool `json:"SupportsSync,omitempty"`

	// Gets or sets the taglines.
	Taglines *[]string `json:"Taglines,omitempty"`

	// Gets or sets the tags.
	Tags *[]string `json:"Tags,omitempty"`

	// Gets or sets the timer identifier.
	TimerId *string `json:"TimerId,omitempty"`

	// Gets or sets the trailer count.
	TrailerCount *int32 `json:"TrailerCount,omitempty"`

	// Gets or sets the type.
	Type *string `json:"Type,omitempty"`

	UserData UserItemDataDto `json:"UserData,omitempty"`

	Video3DFormat Video3DFormat `json:"Video3DFormat,omitempty"`

	VideoType VideoType `json:"VideoType,omitempty"`

	Width *int32 `json:"Width,omitempty"`
}

// AssertBaseItemDtoRequired checks if the required fields are not zero-ed
func AssertBaseItemDtoRequired(obj BaseItemDto) error {
	if obj.AlbumArtists != nil {
		for _, el := range *obj.AlbumArtists {
			if err := AssertNameGuidPairRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.ArtistItems != nil {
		for _, el := range *obj.ArtistItems {
			if err := AssertNameGuidPairRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.Chapters != nil {
		for _, el := range *obj.Chapters {
			if err := AssertChapterInfoRequired(el); err != nil {
				return err
			}
		}
	}
	if err := AssertBaseItemDtoRequired(obj.CurrentProgram); err != nil {
		return err
	}
	if obj.ExternalUrls != nil {
		for _, el := range *obj.ExternalUrls {
			if err := AssertExternalUrlRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.GenreItems != nil {
		for _, el := range *obj.GenreItems {
			if err := AssertNameGuidPairRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.ImageBlurHashes != nil {
		if err := AssertBaseItemDtoImageBlurHashesRequired(*obj.ImageBlurHashes); err != nil {
			return err
		}
	}
	if obj.MediaSources != nil {
		for _, el := range *obj.MediaSources {
			if err := AssertMediaSourceInfoRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.MediaStreams != nil {
		for _, el := range *obj.MediaStreams {
			if err := AssertMediaStreamRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.People != nil {
		for _, el := range *obj.People {
			if err := AssertBaseItemPersonRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.RemoteTrailers != nil {
		for _, el := range *obj.RemoteTrailers {
			if err := AssertMediaUrlRequired(el); err != nil {
				return err
			}
		}
	}
	if obj.Studios != nil {
		for _, el := range *obj.Studios {
			if err := AssertNameGuidPairRequired(el); err != nil {
				return err
			}
		}
	}
	if err := AssertUserItemDataDtoRequired(obj.UserData); err != nil {
		return err
	}
	return nil
}

// AssertBaseItemDtoConstraints checks if the values respects the defined constraints
func AssertBaseItemDtoConstraints(obj BaseItemDto) error {
	return nil
}
