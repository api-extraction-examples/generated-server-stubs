/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * API version: 1.0
 * Contact: nishu@mediumapi.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type Get200Response struct {

	// Full name of the API's developer
	Developer string `json:"developer,omitempty"`

	// Link to the Medium API's documentation
	Documentation string `json:"documentation,omitempty"`

	// Email ID of the developer
	Email string `json:"email,omitempty"`

	// LinkedIn Page URL
	Linkedin string `json:"linkedin,omitempty"`

	// Full name of the API
	Name string `json:"name,omitempty"`

	// Twitter Profile URL
	Twitter string `json:"twitter,omitempty"`

	// Link to the Medium API's website
	Website string `json:"website,omitempty"`
}

// AssertGet200ResponseRequired checks if the required fields are not zero-ed
func AssertGet200ResponseRequired(obj Get200Response) error {
	return nil
}

// AssertGet200ResponseConstraints checks if the values respects the defined constraints
func AssertGet200ResponseConstraints(obj Get200Response) error {
	return nil
}