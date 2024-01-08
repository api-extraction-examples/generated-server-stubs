/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// DisplayPreferencesDto - Defines the display preferences for any item that supports them (usually Folders).
type DisplayPreferencesDto struct {

	// Gets or sets the client.
	Client *string `json:"Client,omitempty"`

	// Gets or sets the custom prefs.
	CustomPrefs *map[string]string `json:"CustomPrefs,omitempty"`

	// Gets or sets the user id.
	Id *string `json:"Id,omitempty"`

	// Gets or sets the index by.
	IndexBy *string `json:"IndexBy,omitempty"`

	// Gets or sets the height of the primary image.
	PrimaryImageHeight int32 `json:"PrimaryImageHeight,omitempty"`

	// Gets or sets the width of the primary image.
	PrimaryImageWidth int32 `json:"PrimaryImageWidth,omitempty"`

	// Gets or sets a value indicating whether [remember indexing].
	RememberIndexing bool `json:"RememberIndexing,omitempty"`

	// Gets or sets a value indicating whether [remember sorting].
	RememberSorting bool `json:"RememberSorting,omitempty"`

	ScrollDirection ScrollDirection `json:"ScrollDirection,omitempty"`

	// Gets or sets a value indicating whether to show backdrops on this item.
	ShowBackdrop bool `json:"ShowBackdrop,omitempty"`

	// Gets or sets a value indicating whether [show sidebar].
	ShowSidebar bool `json:"ShowSidebar,omitempty"`

	// Gets or sets the sort by.
	SortBy *string `json:"SortBy,omitempty"`

	SortOrder SortOrder `json:"SortOrder,omitempty"`

	// Gets or sets the type of the view.
	ViewType *string `json:"ViewType,omitempty"`
}

// AssertDisplayPreferencesDtoRequired checks if the required fields are not zero-ed
func AssertDisplayPreferencesDtoRequired(obj DisplayPreferencesDto) error {
	return nil
}

// AssertDisplayPreferencesDtoConstraints checks if the values respects the defined constraints
func AssertDisplayPreferencesDtoConstraints(obj DisplayPreferencesDto) error {
	return nil
}
