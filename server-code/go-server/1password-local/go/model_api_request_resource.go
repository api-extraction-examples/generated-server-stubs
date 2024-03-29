/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * API version: 1.5.7
 * Contact: support@1password.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ApiRequestResource struct {

	Item ApiRequestResourceItem `json:"item,omitempty"`

	ItemVersion int32 `json:"itemVersion,omitempty"`

	Type string `json:"type,omitempty"`

	Vault ApiRequestResourceItem `json:"vault,omitempty"`
}

// AssertApiRequestResourceRequired checks if the required fields are not zero-ed
func AssertApiRequestResourceRequired(obj ApiRequestResource) error {
	if err := AssertApiRequestResourceItemRequired(obj.Item); err != nil {
		return err
	}
	if err := AssertApiRequestResourceItemRequired(obj.Vault); err != nil {
		return err
	}
	return nil
}

// AssertApiRequestResourceConstraints checks if the values respects the defined constraints
func AssertApiRequestResourceConstraints(obj ApiRequestResource) error {
	return nil
}
