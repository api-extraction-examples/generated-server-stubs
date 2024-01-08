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




// Profile - Represents the general information about a user.
type Profile struct {

	// The first name of this user
	FirstName string `json:"first_name"`

	// Indicates whether this user has taken at least one Lyft ride
	HasTakenARide bool `json:"has_taken_a_ride"`

	// The unique ID of this user
	Id string `json:"id"`

	// The last name of this user
	LastName string `json:"last_name"`
}

// AssertProfileRequired checks if the required fields are not zero-ed
func AssertProfileRequired(obj Profile) error {
	elements := map[string]interface{}{
		"first_name": obj.FirstName,
		"has_taken_a_ride": obj.HasTakenARide,
		"id": obj.Id,
		"last_name": obj.LastName,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertProfileConstraints checks if the values respects the defined constraints
func AssertProfileConstraints(obj Profile) error {
	return nil
}
