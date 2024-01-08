/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * API version: 2019.10.15
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"fmt"
)


// FormDataFPGhgCat : Green House Gas (GHG) Gas Code Category.  Must be used with either a formatted (p_ghg_amt) or custom (p_ghg_any_amt) release amount.
type FormDataFPGhgCat string

// List of FormDataFPGhgCat
const (
	ALL FormDataFPGhgCat = "ALL"
	BIOCO2 FormDataFPGhgCat = "BIOCO2"
	CH4 FormDataFPGhgCat = "CH4"
	CO2 FormDataFPGhgCat = "CO2"
	HFC FormDataFPGhgCat = "HFC"
	N2_O FormDataFPGhgCat = "N2O"
	NF3 FormDataFPGhgCat = "NF3"
	OTHER_L FormDataFPGhgCat = "OTHER_L"
	PFC FormDataFPGhgCat = "PFC"
	SF6 FormDataFPGhgCat = "SF6"
)

// AllowedFormDataFPGhgCatEnumValues is all the allowed values of FormDataFPGhgCat enum
var AllowedFormDataFPGhgCatEnumValues = []FormDataFPGhgCat{
	"ALL",
	"BIOCO2",
	"CH4",
	"CO2",
	"HFC",
	"N2O",
	"NF3",
	"OTHER_L",
	"PFC",
	"SF6",
}

// validFormDataFPGhgCatEnumValue provides a map of FormDataFPGhgCats for fast verification of use input
var validFormDataFPGhgCatEnumValues = map[FormDataFPGhgCat]struct{}{
	"ALL": {},
	"BIOCO2": {},
	"CH4": {},
	"CO2": {},
	"HFC": {},
	"N2O": {},
	"NF3": {},
	"OTHER_L": {},
	"PFC": {},
	"SF6": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v FormDataFPGhgCat) IsValid() bool {
	_, ok := validFormDataFPGhgCatEnumValues[v]
	return ok
}

// NewFormDataFPGhgCatFromValue returns a pointer to a valid FormDataFPGhgCat
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewFormDataFPGhgCatFromValue(v string) (FormDataFPGhgCat, error) {
	ev := FormDataFPGhgCat(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for FormDataFPGhgCat: valid values are %v", v, AllowedFormDataFPGhgCatEnumValues)
	}
}



// AssertFormDataFPGhgCatRequired checks if the required fields are not zero-ed
func AssertFormDataFPGhgCatRequired(obj FormDataFPGhgCat) error {
	return nil
}

// AssertFormDataFPGhgCatConstraints checks if the values respects the defined constraints
func AssertFormDataFPGhgCatConstraints(obj FormDataFPGhgCat) error {
	return nil
}