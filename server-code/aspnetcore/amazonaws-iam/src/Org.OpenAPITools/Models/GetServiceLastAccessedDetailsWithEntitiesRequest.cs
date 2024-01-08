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
    public partial class GetServiceLastAccessedDetailsWithEntitiesRequest : IEquatable<GetServiceLastAccessedDetailsWithEntitiesRequest>
    {
        /// <summary>
        /// Gets or Sets JobId
        /// </summary>
        [Required]
        [DataMember(Name="JobId", EmitDefaultValue=false)]
        public string JobId { get; set; }

        /// <summary>
        /// Gets or Sets ServiceNamespace
        /// </summary>
        [Required]
        [DataMember(Name="ServiceNamespace", EmitDefaultValue=false)]
        public string ServiceNamespace { get; set; }

        /// <summary>
        /// Gets or Sets MaxItems
        /// </summary>
        [DataMember(Name="MaxItems", EmitDefaultValue=true)]
        public int MaxItems { get; set; }

        /// <summary>
        /// Gets or Sets Marker
        /// </summary>
        [DataMember(Name="Marker", EmitDefaultValue=false)]
        public string Marker { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetServiceLastAccessedDetailsWithEntitiesRequest {\n");
            sb.Append("  JobId: ").Append(JobId).Append("\n");
            sb.Append("  ServiceNamespace: ").Append(ServiceNamespace).Append("\n");
            sb.Append("  MaxItems: ").Append(MaxItems).Append("\n");
            sb.Append("  Marker: ").Append(Marker).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetServiceLastAccessedDetailsWithEntitiesRequest)obj);
        }

        /// <summary>
        /// Returns true if GetServiceLastAccessedDetailsWithEntitiesRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GetServiceLastAccessedDetailsWithEntitiesRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetServiceLastAccessedDetailsWithEntitiesRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    JobId == other.JobId ||
                    JobId != null &&
                    JobId.Equals(other.JobId)
                ) && 
                (
                    ServiceNamespace == other.ServiceNamespace ||
                    ServiceNamespace != null &&
                    ServiceNamespace.Equals(other.ServiceNamespace)
                ) && 
                (
                    MaxItems == other.MaxItems ||
                    
                    MaxItems.Equals(other.MaxItems)
                ) && 
                (
                    Marker == other.Marker ||
                    Marker != null &&
                    Marker.Equals(other.Marker)
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
                    if (JobId != null)
                    hashCode = hashCode * 59 + JobId.GetHashCode();
                    if (ServiceNamespace != null)
                    hashCode = hashCode * 59 + ServiceNamespace.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxItems.GetHashCode();
                    if (Marker != null)
                    hashCode = hashCode * 59 + Marker.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetServiceLastAccessedDetailsWithEntitiesRequest left, GetServiceLastAccessedDetailsWithEntitiesRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetServiceLastAccessedDetailsWithEntitiesRequest left, GetServiceLastAccessedDetailsWithEntitiesRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}