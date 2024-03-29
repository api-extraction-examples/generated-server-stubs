/*
 * Dealer
 *
 * The Dealer API provides Dealer search functions.
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// Dealer - the representation of an dealer
type Dealer struct {

	Links SelfLink `json:"_links"`

	Address Address `json:"address,omitempty"`

	// network brand codes of the dealer, dealer numbers
	BrandCodes []BrandCode `json:"brandCodes,omitempty"`

	Communication CommunicationChannels `json:"communication,omitempty"`

	// GSSN unique ID, main identifier
	DealerId string `json:"dealerId"`

	Distance TheDistance `json:"distance,omitempty"`

	// list of functions for the dealer
	Functions []Function `json:"functions,omitempty"`

	GeoCoordinates GeoCoordinates `json:"geoCoordinates,omitempty"`

	// legal name of the company
	LegalName string `json:"legalName"`

	// name addition, country specific use
	NameAddition string `json:"nameAddition,omitempty"`

	// List of opening hours for each customer relevant function for each day 
	OpeningHours []FunctionOpeningHours `json:"openingHours,omitempty"`

	Region RegionRepresentation `json:"region,omitempty"`
}
