/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PlaystateRequest struct {

	Command PlaystateCommand `json:"Command,omitempty"`

	// Gets or sets the controlling user identifier.
	ControllingUserId *string `json:"ControllingUserId,omitempty"`

	SeekPositionTicks *int64 `json:"SeekPositionTicks,omitempty"`
}

// AssertPlaystateRequestRequired checks if the required fields are not zero-ed
func AssertPlaystateRequestRequired(obj PlaystateRequest) error {
	return nil
}

// AssertPlaystateRequestConstraints checks if the values respects the defined constraints
func AssertPlaystateRequestConstraints(obj PlaystateRequest) error {
	return nil
}
