/*
 * AltoroJ REST API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.2
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type Transfer struct {

	FromAccount string `json:"fromAccount"`

	ToAccount string `json:"toAccount"`

	TransferAmount string `json:"transferAmount"`
}