/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type TaskAddFollowersRequest struct {

	// An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.
	Followers []string `json:"followers"`
}

// AssertTaskAddFollowersRequestRequired checks if the required fields are not zero-ed
func AssertTaskAddFollowersRequestRequired(obj TaskAddFollowersRequest) error {
	elements := map[string]interface{}{
		"followers": obj.Followers,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertTaskAddFollowersRequestConstraints checks if the values respects the defined constraints
func AssertTaskAddFollowersRequestConstraints(obj TaskAddFollowersRequest) error {
	return nil
}