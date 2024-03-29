/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type Cost struct {

	// Total price of the ride
	Amount int32 `json:"amount"`

	// The ISO 4217 currency code for the amount (e.g. USD)
	Currency string `json:"currency"`

	// The description for the cost
	Description string `json:"description"`
}
