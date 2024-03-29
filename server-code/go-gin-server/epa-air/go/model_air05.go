/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * API version: 2019.10.15
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// Air05 - Results Object
type Air05 struct {

	// Identifies which passed query system identifiers are invalid.
	BadSystemIDs string `json:"BadSystemIDs"`

	// Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.
	CVRows string `json:"CVRows"`

	// Summary count of the number of facilities with a formal enforcement action in the past five years
	FEARows string `json:"FEARows"`

	// A complex array of facility information.
	Facilities []Air03 `json:"Facilities,omitempty"`

	// Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)
	INSPRows string `json:"INSPRows"`

	// Number of facilities with tribal_flag populated
	IndianCountryRows string `json:"IndianCountryRows"`

	// Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT > 0)
	InfFEARows string `json:"InfFEARows"`

	MapOutput Air04 `json:"MapOutput,omitempty"`

	// Field to record messages (typically performance-related) about packet processing
	Message string `json:"Message"`

	// The number of pages of results returned
	PageNo string `json:"PageNo"`

	// Sequential number assigned to entire search result
	QueryID string `json:"QueryID"`

	// Number of query results returned
	QueryRows string `json:"QueryRows"`

	// Number of facilities with curr_sv_flag populated (CWP_STATUS = \"Significant Violation\")
	SVRows string `json:"SVRows"`

	// The total dollar amount of either assessed or final penalties within the five year time period
	TotalPenalties string `json:"TotalPenalties"`

	// Number of facilities having one or more quarters in non-compliance (QNC) in the last three years
	V3Rows string `json:"V3Rows"`
}
