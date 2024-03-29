/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * The version of the OpenAPI document: 2019.10.15
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// Results Object
    /// </summary>
    [DataContract]
    public partial class Air05 : IEquatable<Air05>
    {
        /// <summary>
        /// Identifies which passed query system identifiers are invalid.
        /// </summary>
        /// <value>Identifies which passed query system identifiers are invalid.</value>
        [Required]
        [DataMember(Name="BadSystemIDs", EmitDefaultValue=false)]
        public string BadSystemIDs { get; set; }

        /// <summary>
        /// Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.
        /// </summary>
        /// <value>Summary count of the number of CWA facilities or SDWA public drinking water systems with current violations.</value>
        /// <example>0</example>
        [Required]
        [DataMember(Name="CVRows", EmitDefaultValue=false)]
        public string CVRows { get; set; }

        /// <summary>
        /// Summary count of the number of facilities with a formal enforcement action in the past five years
        /// </summary>
        /// <value>Summary count of the number of facilities with a formal enforcement action in the past five years</value>
        /// <example>1</example>
        [Required]
        [DataMember(Name="FEARows", EmitDefaultValue=false)]
        public string FEARows { get; set; }

        /// <summary>
        /// A complex array of facility information.
        /// </summary>
        /// <value>A complex array of facility information.</value>
        [DataMember(Name="Facilities", EmitDefaultValue=false)]
        public List<Air03> Facilities { get; set; }

        /// <summary>
        /// Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)
        /// </summary>
        /// <value>Number of facilities with insp_5yr_flag populated (CWP_DATE_LAST_INSPECTION)</value>
        /// <example>1</example>
        [Required]
        [DataMember(Name="INSPRows", EmitDefaultValue=false)]
        public string INSPRows { get; set; }

        /// <summary>
        /// Number of facilities with tribal_flag populated
        /// </summary>
        /// <value>Number of facilities with tribal_flag populated</value>
        /// <example>0</example>
        [Required]
        [DataMember(Name="IndianCountryRows", EmitDefaultValue=false)]
        public string IndianCountryRows { get; set; }

        /// <summary>
        /// Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT &gt; 0)
        /// </summary>
        /// <value>Number of facilities with infea_5yr_flag populated (INFORMAL_ENF_ACT_COUNT &gt; 0)</value>
        /// <example>0</example>
        [Required]
        [DataMember(Name="InfFEARows", EmitDefaultValue=false)]
        public string InfFEARows { get; set; }

        /// <summary>
        /// Gets or Sets MapOutput
        /// </summary>
        [DataMember(Name="MapOutput", EmitDefaultValue=false)]
        public Air04 MapOutput { get; set; }

        /// <summary>
        /// Field to record messages (typically performance-related) about packet processing
        /// </summary>
        /// <value>Field to record messages (typically performance-related) about packet processing</value>
        /// <example>Success</example>
        [Required]
        [DataMember(Name="Message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// The number of pages of results returned
        /// </summary>
        /// <value>The number of pages of results returned</value>
        /// <example>1</example>
        [Required]
        [DataMember(Name="PageNo", EmitDefaultValue=false)]
        public string PageNo { get; set; }

        /// <summary>
        /// Sequential number assigned to entire search result
        /// </summary>
        /// <value>Sequential number assigned to entire search result</value>
        /// <example>245</example>
        [Required]
        [DataMember(Name="QueryID", EmitDefaultValue=false)]
        public string QueryID { get; set; }

        /// <summary>
        /// Number of query results returned
        /// </summary>
        /// <value>Number of query results returned</value>
        /// <example>5</example>
        [Required]
        [DataMember(Name="QueryRows", EmitDefaultValue=false)]
        public string QueryRows { get; set; }

        /// <summary>
        /// Number of facilities with curr_sv_flag populated (CWP_STATUS &#x3D; \&quot;Significant Violation\&quot;)
        /// </summary>
        /// <value>Number of facilities with curr_sv_flag populated (CWP_STATUS &#x3D; \&quot;Significant Violation\&quot;)</value>
        /// <example>0</example>
        [Required]
        [DataMember(Name="SVRows", EmitDefaultValue=false)]
        public string SVRows { get; set; }

        /// <summary>
        /// The total dollar amount of either assessed or final penalties within the five year time period
        /// </summary>
        /// <value>The total dollar amount of either assessed or final penalties within the five year time period</value>
        /// <example>$963,531</example>
        [Required]
        [DataMember(Name="TotalPenalties", EmitDefaultValue=false)]
        public string TotalPenalties { get; set; }

        /// <summary>
        /// Number of facilities having one or more quarters in non-compliance (QNC) in the last three years
        /// </summary>
        /// <value>Number of facilities having one or more quarters in non-compliance (QNC) in the last three years</value>
        /// <example>2</example>
        [Required]
        [DataMember(Name="V3Rows", EmitDefaultValue=false)]
        public string V3Rows { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Air05 {\n");
            sb.Append("  BadSystemIDs: ").Append(BadSystemIDs).Append("\n");
            sb.Append("  CVRows: ").Append(CVRows).Append("\n");
            sb.Append("  FEARows: ").Append(FEARows).Append("\n");
            sb.Append("  Facilities: ").Append(Facilities).Append("\n");
            sb.Append("  INSPRows: ").Append(INSPRows).Append("\n");
            sb.Append("  IndianCountryRows: ").Append(IndianCountryRows).Append("\n");
            sb.Append("  InfFEARows: ").Append(InfFEARows).Append("\n");
            sb.Append("  MapOutput: ").Append(MapOutput).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  PageNo: ").Append(PageNo).Append("\n");
            sb.Append("  QueryID: ").Append(QueryID).Append("\n");
            sb.Append("  QueryRows: ").Append(QueryRows).Append("\n");
            sb.Append("  SVRows: ").Append(SVRows).Append("\n");
            sb.Append("  TotalPenalties: ").Append(TotalPenalties).Append("\n");
            sb.Append("  V3Rows: ").Append(V3Rows).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((Air05)obj);
        }

        /// <summary>
        /// Returns true if Air05 instances are equal
        /// </summary>
        /// <param name="other">Instance of Air05 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Air05 other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    BadSystemIDs == other.BadSystemIDs ||
                    BadSystemIDs != null &&
                    BadSystemIDs.Equals(other.BadSystemIDs)
                ) && 
                (
                    CVRows == other.CVRows ||
                    CVRows != null &&
                    CVRows.Equals(other.CVRows)
                ) && 
                (
                    FEARows == other.FEARows ||
                    FEARows != null &&
                    FEARows.Equals(other.FEARows)
                ) && 
                (
                    Facilities == other.Facilities ||
                    Facilities != null &&
                    other.Facilities != null &&
                    Facilities.SequenceEqual(other.Facilities)
                ) && 
                (
                    INSPRows == other.INSPRows ||
                    INSPRows != null &&
                    INSPRows.Equals(other.INSPRows)
                ) && 
                (
                    IndianCountryRows == other.IndianCountryRows ||
                    IndianCountryRows != null &&
                    IndianCountryRows.Equals(other.IndianCountryRows)
                ) && 
                (
                    InfFEARows == other.InfFEARows ||
                    InfFEARows != null &&
                    InfFEARows.Equals(other.InfFEARows)
                ) && 
                (
                    MapOutput == other.MapOutput ||
                    MapOutput != null &&
                    MapOutput.Equals(other.MapOutput)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                ) && 
                (
                    PageNo == other.PageNo ||
                    PageNo != null &&
                    PageNo.Equals(other.PageNo)
                ) && 
                (
                    QueryID == other.QueryID ||
                    QueryID != null &&
                    QueryID.Equals(other.QueryID)
                ) && 
                (
                    QueryRows == other.QueryRows ||
                    QueryRows != null &&
                    QueryRows.Equals(other.QueryRows)
                ) && 
                (
                    SVRows == other.SVRows ||
                    SVRows != null &&
                    SVRows.Equals(other.SVRows)
                ) && 
                (
                    TotalPenalties == other.TotalPenalties ||
                    TotalPenalties != null &&
                    TotalPenalties.Equals(other.TotalPenalties)
                ) && 
                (
                    V3Rows == other.V3Rows ||
                    V3Rows != null &&
                    V3Rows.Equals(other.V3Rows)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (BadSystemIDs != null)
                    hashCode = hashCode * 59 + BadSystemIDs.GetHashCode();
                    if (CVRows != null)
                    hashCode = hashCode * 59 + CVRows.GetHashCode();
                    if (FEARows != null)
                    hashCode = hashCode * 59 + FEARows.GetHashCode();
                    if (Facilities != null)
                    hashCode = hashCode * 59 + Facilities.GetHashCode();
                    if (INSPRows != null)
                    hashCode = hashCode * 59 + INSPRows.GetHashCode();
                    if (IndianCountryRows != null)
                    hashCode = hashCode * 59 + IndianCountryRows.GetHashCode();
                    if (InfFEARows != null)
                    hashCode = hashCode * 59 + InfFEARows.GetHashCode();
                    if (MapOutput != null)
                    hashCode = hashCode * 59 + MapOutput.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                    if (PageNo != null)
                    hashCode = hashCode * 59 + PageNo.GetHashCode();
                    if (QueryID != null)
                    hashCode = hashCode * 59 + QueryID.GetHashCode();
                    if (QueryRows != null)
                    hashCode = hashCode * 59 + QueryRows.GetHashCode();
                    if (SVRows != null)
                    hashCode = hashCode * 59 + SVRows.GetHashCode();
                    if (TotalPenalties != null)
                    hashCode = hashCode * 59 + TotalPenalties.GetHashCode();
                    if (V3Rows != null)
                    hashCode = hashCode * 59 + V3Rows.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Air05 left, Air05 right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Air05 left, Air05 right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
