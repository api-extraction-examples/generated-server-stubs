/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserSegment struct {

	Flags []FlagListItem `json:"_flags,omitempty"`

	Links Links `json:"_links,omitempty"`

	// A unix epoch time in milliseconds specifying the creation time of this flag.
	CreationDate int64 `json:"creationDate"`

	// Description of the user segment.
	Description string `json:"description,omitempty"`

	// An array of user keys that should not be included in this segment, unless they are also listed in \"included\".
	Excluded []string `json:"excluded,omitempty"`

	// An array of user keys that are included in this segment.
	Included []string `json:"included,omitempty"`

	// Unique identifier for the user segment.
	Key string `json:"key"`

	// Name of the user segment.
	Name string `json:"name"`

	// An array of rules that can cause a user to be included in this segment.
	Rules []UserSegmentRule `json:"rules,omitempty"`

	// An array of tags for this user segment.
	Tags []string `json:"tags,omitempty"`

	// Controls whether this is considered a \"big segment\" which can support an unlimited numbers of users. Include/exclude lists sent with this payload are not used in big segments. Contact your account manager for early access to this feature.
	Unbounded bool `json:"unbounded,omitempty"`

	Version int32 `json:"version,omitempty"`
}

// AssertUserSegmentRequired checks if the required fields are not zero-ed
func AssertUserSegmentRequired(obj UserSegment) error {
	elements := map[string]interface{}{
		"creationDate": obj.CreationDate,
		"key": obj.Key,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Flags {
		if err := AssertFlagListItemRequired(el); err != nil {
			return err
		}
	}
	if err := AssertLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Rules {
		if err := AssertUserSegmentRuleRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUserSegmentConstraints checks if the values respects the defined constraints
func AssertUserSegmentConstraints(obj UserSegment) error {
	return nil
}
