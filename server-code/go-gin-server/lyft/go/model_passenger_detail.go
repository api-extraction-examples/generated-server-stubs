/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type PassengerDetail struct {

	// The passenger's first name
	FirstName string `json:"first_name"`

	// The passenger's profile image
	ImageUrl string `json:"image_url"`

	// The passenger's rating
	Rating string `json:"rating"`

	// The passenger's last name
	LastName string `json:"last_name,omitempty"`

	// The passenger's lyft user id
	UserId string `json:"user_id,omitempty"`
}
