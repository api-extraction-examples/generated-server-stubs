/*
 * Reimbursements API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PolicyTagInput - Expensify policy tag information
type PolicyTagInput struct {

	// email of the individual or beneficiary
	Email string `json:"Email,omitempty"`

	// Unique ID of the ticket - required for travel funds
	TicketID string `json:"TicketID,omitempty"`

	// Type of transaction
	TxnType string `json:"TxnType,omitempty"`

	// Unique username or lfId of the individual
	Username string `json:"Username,omitempty"`
}

// AssertPolicyTagInputRequired checks if the required fields are not zero-ed
func AssertPolicyTagInputRequired(obj PolicyTagInput) error {
	return nil
}

// AssertPolicyTagInputConstraints checks if the values respects the defined constraints
func AssertPolicyTagInputConstraints(obj PolicyTagInput) error {
	return nil
}