/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type MusicPopularityPlaylist struct {

	Categories []string `json:"categories"`

	CommentsEnabled bool `json:"commentsEnabled"`

	Description string `json:"description"`

	ExternalPartners []ExternalPartner `json:"externalPartners"`

	Genre string `json:"genre"`

	Id string `json:"id"`

	ImagePid string `json:"imagePid"`

	ImageUrl string `json:"imageUrl"`

	Kind string `json:"kind"`

	Mood string `json:"mood"`

	OneOff bool `json:"oneOff"`

	PlaylistPlaybackType string `json:"playlistPlaybackType"`

	Score int32 `json:"score"`

	ServiceId string `json:"serviceId"`

	Title string `json:"title"`

	UpdatedAt string `json:"updatedAt"`

	Visibility string `json:"visibility"`

	WideImagePid string `json:"wideImagePid"`

	WideImageUrl string `json:"wideImageUrl"`
}

// AssertMusicPopularityPlaylistRequired checks if the required fields are not zero-ed
func AssertMusicPopularityPlaylistRequired(obj MusicPopularityPlaylist) error {
	elements := map[string]interface{}{
		"categories": obj.Categories,
		"commentsEnabled": obj.CommentsEnabled,
		"description": obj.Description,
		"externalPartners": obj.ExternalPartners,
		"genre": obj.Genre,
		"id": obj.Id,
		"imagePid": obj.ImagePid,
		"imageUrl": obj.ImageUrl,
		"kind": obj.Kind,
		"mood": obj.Mood,
		"oneOff": obj.OneOff,
		"playlistPlaybackType": obj.PlaylistPlaybackType,
		"score": obj.Score,
		"serviceId": obj.ServiceId,
		"title": obj.Title,
		"updatedAt": obj.UpdatedAt,
		"visibility": obj.Visibility,
		"wideImagePid": obj.WideImagePid,
		"wideImageUrl": obj.WideImageUrl,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.ExternalPartners {
		if err := AssertExternalPartnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertMusicPopularityPlaylistConstraints checks if the values respects the defined constraints
func AssertMusicPopularityPlaylistConstraints(obj MusicPopularityPlaylist) error {
	return nil
}