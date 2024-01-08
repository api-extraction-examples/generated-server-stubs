/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SessionUserInfo - Class SessionUserInfo.
type SessionUserInfo struct {

	// Gets or sets the user identifier.
	UserId string `json:"UserId,omitempty"`

	// Gets or sets the name of the user.
	UserName *string `json:"UserName,omitempty"`
}

// AssertSessionUserInfoRequired checks if the required fields are not zero-ed
func AssertSessionUserInfoRequired(obj SessionUserInfo) error {
	return nil
}

// AssertSessionUserInfoConstraints checks if the values respects the defined constraints
func AssertSessionUserInfoConstraints(obj SessionUserInfo) error {
	return nil
}