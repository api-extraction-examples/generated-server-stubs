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

type Tip struct {

	// A tip for the driver in cents. To be charged to the user's default charge account.
	Amount int32 `json:"amount,omitempty"`

	// The currency in which you want to tip. e.g. USD
	Currency string `json:"currency,omitempty"`
}
