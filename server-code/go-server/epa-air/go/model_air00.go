/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * API version: 2019.10.15
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// Air00 - Cluster Data Object
type Air00 struct {

	// Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.
	CVRows string `json:"CVRows"`

	// The number of facilities or cases in the cluster.
	ClusterCount string `json:"ClusterCount"`

	// The icon file used to reprsent the cluster.
	ClusterIcon string `json:"ClusterIcon"`

	// The latitude in decimal degrees expressed using the NAD83 horizontal datum.
	ClusterLatitude string `json:"ClusterLatitude"`

	// The longitude in decimal degrees expressed using the NAD83 horizontal datum.
	ClusterLongitude string `json:"ClusterLongitude"`

	// THe name or the identifier of the geographic area used for clustering.  Examples:  Alaska, Fairfax County, 22314
	ClusterName string `json:"ClusterName"`

	// The representative geographic area used for clustering.  Examples:  State, County, Zip Code
	ClusterType string `json:"ClusterType"`

	// The value, internal to the database report object, that represents this cluster, like a state abbreviation, zip code, or county FIPS code.  Examples: AK, 22314, 50011
	ClusterValue string `json:"ClusterValue"`

	// The EPA region where the facility is located. EPA has 10 regional offices that execute programs within several states and territories
	EPARegionCode string `json:"EPARegionCode"`

	// Summary count of the number of facilities with a formal enforcement action in the past five years
	FEARows string `json:"FEARows"`

	// Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)
	INSPRows string `json:"INSPRows"`

	// Number of facilities with tribal_flag populated
	IndianCountryRows string `json:"IndianCountryRows"`

	// Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT > 0)
	InfFEARows string `json:"InfFEARows"`

	// Sequential number assigned to each facility or cluster returned.
	ObjectId string `json:"ObjectId"`

	// Number of facilities with curr_sv_flag populated (CWP_STATUS = \"Significant Violation\")
	SVRows string `json:"SVRows"`

	// The total dollar amount of either assessed or final penalties within the five year time period
	TotalPenalties string `json:"TotalPenalties"`

	// Number of facilities having one or more quarters in non-compliance (QNC) in the last three years
	V3Rows string `json:"V3Rows"`
}

// AssertAir00Required checks if the required fields are not zero-ed
func AssertAir00Required(obj Air00) error {
	elements := map[string]interface{}{
		"CVRows": obj.CVRows,
		"ClusterCount": obj.ClusterCount,
		"ClusterIcon": obj.ClusterIcon,
		"ClusterLatitude": obj.ClusterLatitude,
		"ClusterLongitude": obj.ClusterLongitude,
		"ClusterName": obj.ClusterName,
		"ClusterType": obj.ClusterType,
		"ClusterValue": obj.ClusterValue,
		"EPARegionCode": obj.EPARegionCode,
		"FEARows": obj.FEARows,
		"INSPRows": obj.INSPRows,
		"IndianCountryRows": obj.IndianCountryRows,
		"InfFEARows": obj.InfFEARows,
		"ObjectId": obj.ObjectId,
		"SVRows": obj.SVRows,
		"TotalPenalties": obj.TotalPenalties,
		"V3Rows": obj.V3Rows,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAir00Constraints checks if the values respects the defined constraints
func AssertAir00Constraints(obj Air00) error {
	return nil
}
