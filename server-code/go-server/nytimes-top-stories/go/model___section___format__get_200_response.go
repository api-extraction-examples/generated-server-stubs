/*
 * Top Stories
 *
 * The Top Stories API provides lists of articles and associated images by section.
 *
 * API version: 2.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type SectionFormatGet200Response struct {

	Results []Article `json:"results,omitempty"`
}

// AssertSectionFormatGet200ResponseRequired checks if the required fields are not zero-ed
func AssertSectionFormatGet200ResponseRequired(obj SectionFormatGet200Response) error {
	for _, el := range obj.Results {
		if err := AssertArticleRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertSectionFormatGet200ResponseConstraints checks if the values respects the defined constraints
func AssertSectionFormatGet200ResponseConstraints(obj SectionFormatGet200Response) error {
	return nil
}
