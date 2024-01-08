/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type PersonalisedRadioActivity struct {

	Action string `json:"action"`

	Activity string `json:"activity"`

	AddedAt string `json:"added_at"`

	Data ProgrammeSummary `json:"data"`

	Domain string `json:"domain"`

	Id string `json:"id"`

	Metadata MetaData `json:"metadata"`

	Type string `json:"type"`

	UasType string `json:"uas_type"`

	Urn string `json:"urn"`
}