/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// MediaPathDto - Media Path dto.
type MediaPathDto struct {

	// Gets or sets the name of the library.
	Name string `json:"Name"`

	// Gets or sets the path to add.
	Path *string `json:"Path,omitempty"`

	PathInfo MediaPathInfo `json:"PathInfo,omitempty"`
}

// AssertMediaPathDtoRequired checks if the required fields are not zero-ed
func AssertMediaPathDtoRequired(obj MediaPathDto) error {
	elements := map[string]interface{}{
		"Name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMediaPathInfoRequired(obj.PathInfo); err != nil {
		return err
	}
	return nil
}

// AssertMediaPathDtoConstraints checks if the values respects the defined constraints
func AssertMediaPathDtoConstraints(obj MediaPathDto) error {
	return nil
}
