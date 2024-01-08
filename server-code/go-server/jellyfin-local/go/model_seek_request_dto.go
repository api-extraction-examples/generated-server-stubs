/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SeekRequestDto - Class SeekRequestDto.
type SeekRequestDto struct {

	// Gets or sets the position ticks.
	PositionTicks int64 `json:"PositionTicks,omitempty"`
}

// AssertSeekRequestDtoRequired checks if the required fields are not zero-ed
func AssertSeekRequestDtoRequired(obj SeekRequestDto) error {
	return nil
}

// AssertSeekRequestDtoConstraints checks if the values respects the defined constraints
func AssertSeekRequestDtoConstraints(obj SeekRequestDto) error {
	return nil
}