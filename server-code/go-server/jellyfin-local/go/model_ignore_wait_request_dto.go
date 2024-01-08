/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// IgnoreWaitRequestDto - Class IgnoreWaitRequestDto.
type IgnoreWaitRequestDto struct {

	// Gets or sets a value indicating whether the client should be ignored.
	IgnoreWait bool `json:"IgnoreWait,omitempty"`
}

// AssertIgnoreWaitRequestDtoRequired checks if the required fields are not zero-ed
func AssertIgnoreWaitRequestDtoRequired(obj IgnoreWaitRequestDto) error {
	return nil
}

// AssertIgnoreWaitRequestDtoConstraints checks if the values respects the defined constraints
func AssertIgnoreWaitRequestDtoConstraints(obj IgnoreWaitRequestDto) error {
	return nil
}
