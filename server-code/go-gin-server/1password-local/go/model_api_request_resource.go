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