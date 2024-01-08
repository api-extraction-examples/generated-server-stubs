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




// UpdateUiModificationDetails - The details of a UI modification.
type UpdateUiModificationDetails struct {

	// List of contexts of the UI modification. The maximum number of contexts is 1000. If provided, replaces all existing contexts.
	Contexts []UiModificationContextDetails `json:"contexts,omitempty"`

	// The data of the UI modification. The maximum size of the data is 50000 characters.
	Data string `json:"data,omitempty"`

	// The description of the UI modification. The maximum length is 255 characters.
	Description string `json:"description,omitempty"`

	// The name of the UI modification. The maximum length is 255 characters.
	Name string `json:"name,omitempty"`
}

// AssertUpdateUiModificationDetailsRequired checks if the required fields are not zero-ed
func AssertUpdateUiModificationDetailsRequired(obj UpdateUiModificationDetails) error {
	for _, el := range obj.Contexts {
		if err := AssertUiModificationContextDetailsRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUpdateUiModificationDetailsConstraints checks if the values respects the defined constraints
func AssertUpdateUiModificationDetailsConstraints(obj UpdateUiModificationDetails) error {
	return nil
}