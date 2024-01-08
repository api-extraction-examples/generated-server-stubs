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


import (
	"time"
)



type Vault struct {

	// The vault version
	AttributeVersion int32 `json:"attributeVersion,omitempty"`

	// The version of the vault contents
	ContentVersion int32 `json:"contentVersion,omitempty"`

	CreatedAt time.Time `json:"createdAt,omitempty"`

	Description string `json:"description,omitempty"`

	Id string `json:"id,omitempty"`

	// Number of active items in the vault
	Items int32 `json:"items,omitempty"`

	Name string `json:"name,omitempty"`

	Type string `json:"type,omitempty"`

	UpdatedAt time.Time `json:"updatedAt,omitempty"`
}

// AssertVaultRequired checks if the required fields are not zero-ed
func AssertVaultRequired(obj Vault) error {
	return nil
}

// AssertVaultConstraints checks if the values respects the defined constraints
func AssertVaultConstraints(obj Vault) error {
	return nil
}