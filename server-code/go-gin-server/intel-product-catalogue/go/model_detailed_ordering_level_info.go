/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * API version: 0.1.0
 * Contact: pim.360.team@intel.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type DetailedOrderingLevelInfo struct {

	Result []DetailedOrderingLevelInfoResultInner `json:"result,omitempty"`

	Status string `json:"status,omitempty"`

	TotalCount int32 `json:"total_count,omitempty"`
}
