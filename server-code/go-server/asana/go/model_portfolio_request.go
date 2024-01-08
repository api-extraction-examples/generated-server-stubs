/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PortfolioRequest struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The name of the portfolio.
	Name string `json:"name,omitempty"`

	// Color of the portfolio.
	Color string `json:"color,omitempty"`

	// An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.
	Members []string `json:"members,omitempty"`

	// True if the portfolio is public to its workspace members.
	Public bool `json:"public,omitempty"`

	// Gid of an object.
	Workspace string `json:"workspace,omitempty"`
}

// AssertPortfolioRequestRequired checks if the required fields are not zero-ed
func AssertPortfolioRequestRequired(obj PortfolioRequest) error {
	return nil
}

// AssertPortfolioRequestConstraints checks if the values respects the defined constraints
func AssertPortfolioRequestConstraints(obj PortfolioRequest) error {
	return nil
}