/*
 * AWS Identity and Access Management
 *
 * <fullname>Identity and Access Management</fullname> <p>Identity and Access Management (IAM) is a web service for securely controlling access to Amazon Web Services services. With IAM, you can centrally manage users, security credentials such as access keys, and permissions that control which Amazon Web Services resources users and applications can access. For more information about IAM, see <a href=\"http://aws.amazon.com/iam/\">Identity and Access Management (IAM)</a> and the <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/\">Identity and Access Management User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2010-05-08
 * Contact: mike.ralphson@gmail.com
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
    /// 
    /// </summary>
    [DataContract]
    public partial class GetServiceLastAccessedDetailsWithEntitiesResponse : IEquatable<GetServiceLastAccessedDetailsWithEntitiesResponse>
    {
        /// <summary>
        /// Gets or Sets JobStatus
        /// </summary>
        [Required]
        [DataMember(Name="JobStatus", EmitDefaultValue=true)]
        public JobStatusType JobStatus { get; set; }

        /// <summary>
        /// Gets or Sets JobCreationDate
        /// </summary>
        [Required]
        [DataMember(Name="JobCreationDate", EmitDefaultValue=false)]
        public DateTime JobCreationDate { get; set; }

        /// <summary>
        /// Gets or Sets JobCompletionDate
        /// </summary>
        [Required]
        [DataMember(Name="JobCompletionDate", EmitDefaultValue=false)]
        public DateTime JobCompletionDate { get; set; }

        /// <summary>
        /// Gets or Sets EntityDetailsList
        /// </summary>
        [Required]
        [DataMember(Name="EntityDetailsList", EmitDefaultValue=false)]
        public List EntityDetailsList { get; set; }

        /// <summary>
        /// Gets or Sets IsTruncated
        /// </summary>
        [DataMember(Name="IsTruncated", EmitDefaultValue=true)]
        public bool IsTruncated { get; set; }

        /// <summary>
        /// Gets or Sets Marker
        /// </summary>
        [DataMember(Name="Marker", EmitDefaultValue=false)]
        public string Marker { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name="Error", EmitDefaultValue=false)]
        public GetServiceLastAccessedDetailsResponseError Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetServiceLastAccessedDetailsWithEntitiesResponse {\n");
            sb.Append("  JobStatus: ").Append(JobStatus).Append("\n");
            sb.Append("  JobCreationDate: ").Append(JobCreationDate).Append("\n");
            sb.Append("  JobCompletionDate: ").Append(JobCompletionDate).Append("\n");
            sb.Append("  EntityDetailsList: ").Append(EntityDetailsList).Append("\n");
            sb.Append("  IsTruncated: ").Append(IsTruncated).Append("\n");
            sb.Append("  Marker: ").Append(Marker).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetServiceLastAccessedDetailsWithEntitiesResponse)obj);
        }

        /// <summary>
        /// Returns true if GetServiceLastAccessedDetailsWithEntitiesResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of GetServiceLastAccessedDetailsWithEntitiesResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetServiceLastAccessedDetailsWithEntitiesResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    JobStatus == other.JobStatus ||
                    
                    JobStatus.Equals(other.JobStatus)
                ) && 
                (
                    JobCreationDate == other.JobCreationDate ||
                    JobCreationDate != null &&
                    JobCreationDate.Equals(other.JobCreationDate)
                ) && 
                (
                    JobCompletionDate == other.JobCompletionDate ||
                    JobCompletionDate != null &&
                    JobCompletionDate.Equals(other.JobCompletionDate)
                ) && 
                (
                    EntityDetailsList == other.EntityDetailsList ||
                    EntityDetailsList != null &&
                    EntityDetailsList.Equals(other.EntityDetailsList)
                ) && 
                (
                    IsTruncated == other.IsTruncated ||
                    
                    IsTruncated.Equals(other.IsTruncated)
                ) && 
                (
                    Marker == other.Marker ||
                    Marker != null &&
                    Marker.Equals(other.Marker)
                ) && 
                (
                    Error == other.Error ||
                    Error != null &&
                    Error.Equals(other.Error)
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
                    
                    hashCode = hashCode * 59 + JobStatus.GetHashCode();
                    if (JobCreationDate != null)
                    hashCode = hashCode * 59 + JobCreationDate.GetHashCode();
                    if (JobCompletionDate != null)
                    hashCode = hashCode * 59 + JobCompletionDate.GetHashCode();
                    if (EntityDetailsList != null)
                    hashCode = hashCode * 59 + EntityDetailsList.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsTruncated.GetHashCode();
                    if (Marker != null)
                    hashCode = hashCode * 59 + Marker.GetHashCode();
                    if (Error != null)
                    hashCode = hashCode * 59 + Error.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetServiceLastAccessedDetailsWithEntitiesResponse left, GetServiceLastAccessedDetailsWithEntitiesResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetServiceLastAccessedDetailsWithEntitiesResponse left, GetServiceLastAccessedDetailsWithEntitiesResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}