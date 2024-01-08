/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// LibraryUpdateInfo - Class LibraryUpdateInfo.
type LibraryUpdateInfo struct {

	CollectionFolders *[]string `json:"CollectionFolders,omitempty"`

	// Gets or sets the folders added to.
	FoldersAddedTo *[]string `json:"FoldersAddedTo,omitempty"`

	// Gets or sets the folders removed from.
	FoldersRemovedFrom *[]string `json:"FoldersRemovedFrom,omitempty"`

	IsEmpty bool `json:"IsEmpty,omitempty"`

	// Gets or sets the items added.
	ItemsAdded *[]string `json:"ItemsAdded,omitempty"`

	// Gets or sets the items removed.
	ItemsRemoved *[]string `json:"ItemsRemoved,omitempty"`

	// Gets or sets the items updated.
	ItemsUpdated *[]string `json:"ItemsUpdated,omitempty"`
}

// AssertLibraryUpdateInfoRequired checks if the required fields are not zero-ed
func AssertLibraryUpdateInfoRequired(obj LibraryUpdateInfo) error {
	return nil
}

// AssertLibraryUpdateInfoConstraints checks if the values respects the defined constraints
func AssertLibraryUpdateInfoConstraints(obj LibraryUpdateInfo) error {
	return nil
}