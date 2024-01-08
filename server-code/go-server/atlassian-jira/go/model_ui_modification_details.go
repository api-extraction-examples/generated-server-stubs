/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// UiModificationDetails - The details of a UI modification.
type UiModificationDetails struct {

	// List of contexts of the UI modification. The maximum number of contexts is 1000.
	Contexts []UiModificationContextDetails `json:"contexts,omitempty"`

	// The data of the UI modification. The maximum size of the data is 50000 characters.
	Data string `json:"data,omitempty"`

	// The description of the UI modification. The maximum length is 255 characters.
	Description string `json:"description,omitempty"`

	// The ID of the UI modification.
	Id string `json:"id"`

	// The name of the UI modification. The maximum length is 255 characters.
	Name string `json:"name"`

	// The URL of the UI modification.
	Self string `json:"self"`
}

// AssertUiModificationDetailsRequired checks if the required fields are not zero-ed
func AssertUiModificationDetailsRequired(obj UiModificationDetails) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"name": obj.Name,
		"self": obj.Self,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Contexts {
		if err := AssertUiModificationContextDetailsRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUiModificationDetailsConstraints checks if the values respects the defined constraints
func AssertUiModificationDetailsConstraints(obj UiModificationDetails) error {
	return nil
}
