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
    /// Results Column Object
    /// </summary>
    [DataContract]
    public partial class Meta3 : IEquatable<Meta3>
    {
        /// <summary>
        /// Gets or Sets ColumnID
        /// </summary>
        [Required]
        [DataMember(Name="ColumnID", EmitDefaultValue=false)]
        public string ColumnID { get; set; }

        /// <summary>
        /// Gets or Sets ColumnName
        /// </summary>
        [Required]
        [DataMember(Name="ColumnName", EmitDefaultValue=false)]
        public string ColumnName { get; set; }

        /// <summary>
        /// Data length for EPA program database column.
        /// </summary>
        /// <value>Data length for EPA program database column.</value>
        /// <example>10</example>
        [Required]
        [DataMember(Name="DataLength", EmitDefaultValue=false)]
        public string DataLength { get; set; }

        /// <summary>
        /// Data type for EPA program database column.
        /// </summary>
        /// <value>Data type for EPA program database column.</value>
        /// <example>NUMBER</example>
        [Required]
        [DataMember(Name="DataType", EmitDefaultValue=false)]
        public string DataType { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [Required]
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The JSON name used for the database column.
        /// </summary>
        /// <value>The JSON name used for the database column.</value>
        /// <example>CaseName</example>
        [Required]
        [DataMember(Name="ObjectName", EmitDefaultValue=false)]
        public string ObjectName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Meta3 {\n");
            sb.Append("  ColumnID: ").Append(ColumnID).Append("\n");
            sb.Append("  ColumnName: ").Append(ColumnName).Append("\n");
            sb.Append("  DataLength: ").Append(DataLength).Append("\n");
            sb.Append("  DataType: ").Append(DataType).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ObjectName: ").Append(ObjectName).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Meta3)obj);
        }

        /// <summary>
        /// Returns true if Meta3 instances are equal
        /// </summary>
        /// <param name="other">Instance of Meta3 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Meta3 other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ColumnID == other.ColumnID ||
                    ColumnID != null &&
                    ColumnID.Equals(other.ColumnID)
                ) && 
                (
                    ColumnName == other.ColumnName ||
                    ColumnName != null &&
                    ColumnName.Equals(other.ColumnName)
                ) && 
                (
                    DataLength == other.DataLength ||
                    DataLength != null &&
                    DataLength.Equals(other.DataLength)
                ) && 
                (
                    DataType == other.DataType ||
                    DataType != null &&
                    DataType.Equals(other.DataType)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    ObjectName == other.ObjectName ||
                    ObjectName != null &&
                    ObjectName.Equals(other.ObjectName)
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
                    if (ColumnID != null)
                    hashCode = hashCode * 59 + ColumnID.GetHashCode();
                    if (ColumnName != null)
                    hashCode = hashCode * 59 + ColumnName.GetHashCode();
                    if (DataLength != null)
                    hashCode = hashCode * 59 + DataLength.GetHashCode();
                    if (DataType != null)
                    hashCode = hashCode * 59 + DataType.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (ObjectName != null)
                    hashCode = hashCode * 59 + ObjectName.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Meta3 left, Meta3 right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Meta3 left, Meta3 right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
