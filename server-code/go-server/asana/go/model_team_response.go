/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type TeamResponse struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The name of the team.
	Name string `json:"name,omitempty"`

	// [Opt In](/docs/input-output-options). The description of the team. 
	Description string `json:"description,omitempty"`

	// [Opt In](/docs/input-output-options). The description of the team with formatting as HTML. 
	HtmlDescription string `json:"html_description,omitempty"`

	Organization TeamResponseAllOfOrganization `json:"organization,omitempty"`

	// A url that points directly to the object within Asana.
	PermalinkUrl string `json:"permalink_url,omitempty"`

	// The visibility of the team to users in the same organization 
	Visibility string `json:"visibility,omitempty"`
}

// AssertTeamResponseRequired checks if the required fields are not zero-ed
func AssertTeamResponseRequired(obj TeamResponse) error {
	if err := AssertTeamResponseAllOfOrganizationRequired(obj.Organization); err != nil {
		return err
	}
	return nil
}

// AssertTeamResponseConstraints checks if the values respects the defined constraints
func AssertTeamResponseConstraints(obj TeamResponse) error {
	return nil
}
