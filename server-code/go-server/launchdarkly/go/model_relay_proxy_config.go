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




type RelayProxyConfig struct {

	Creator Member `json:"_creator"`

	// The unique resource id.
	Id string `json:"_id"`

	// A unix epoch time in milliseconds specifying the creation time of this relay proxy configuration
	CreationDate int64 `json:"creationDate"`

	// The last 4 digits of the unique secret key for this relay proxy configuration
	DisplayKey string `json:"displayKey"`

	// Full secret key. Only included if creating or resetting the relay proxy configuration
	FullKey string `json:"fullKey,omitempty"`

	// A unix epoch time in milliseconds specifying the last time this relay proxy configuration was modified
	LastModified int64 `json:"lastModified"`

	// A human-friendly name for the relay proxy configuration
	Name string `json:"name"`

	Policy []Policy `json:"policy"`
}

// AssertRelayProxyConfigRequired checks if the required fields are not zero-ed
func AssertRelayProxyConfigRequired(obj RelayProxyConfig) error {
	elements := map[string]interface{}{
		"_creator": obj.Creator,
		"_id": obj.Id,
		"creationDate": obj.CreationDate,
		"displayKey": obj.DisplayKey,
		"lastModified": obj.LastModified,
		"name": obj.Name,
		"policy": obj.Policy,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMemberRequired(obj.Creator); err != nil {
		return err
	}
	for _, el := range obj.Policy {
		if err := AssertPolicyRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRelayProxyConfigConstraints checks if the values respects the defined constraints
func AssertRelayProxyConfigConstraints(obj RelayProxyConfig) error {
	return nil
}
