/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AmendmentLine struct {

	HangingIndentation *string `json:"hangingIndentation,omitempty"`

	ImageType *string `json:"imageType,omitempty"`

	Indentation int32 `json:"indentation,omitempty"`

	IsImage bool `json:"isImage,omitempty"`

	Text *string `json:"text,omitempty"`
}

// AssertAmendmentLineRequired checks if the required fields are not zero-ed
func AssertAmendmentLineRequired(obj AmendmentLine) error {
	return nil
}

// AssertAmendmentLineConstraints checks if the values respects the defined constraints
func AssertAmendmentLineConstraints(obj AmendmentLine) error {
	return nil
}
