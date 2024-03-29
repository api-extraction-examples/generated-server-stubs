/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * The version of the OpenAPI document: v1
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
    /// 
    /// </summary>
    [DataContract]
    public partial class ProjectUsernameProjectPostRequest : IEquatable<ProjectUsernameProjectPostRequest>
    {
        /// <summary>
        /// Additional environment variables to inject into the build environment. A map of names to values. 
        /// </summary>
        /// <value>Additional environment variables to inject into the build environment. A map of names to values. </value>
        [DataMember(Name="build_parameters", EmitDefaultValue=false)]
        public Object BuildParameters { get; set; }

        /// <summary>
        /// The number of containers to use to run the build. Default is null and the project default is used. 
        /// </summary>
        /// <value>The number of containers to use to run the build. Default is null and the project default is used. </value>
        [DataMember(Name="parallel", EmitDefaultValue=false)]
        public string Parallel { get; set; }

        /// <summary>
        /// The specific revision to build. Default is null and the head of the branch is used. Cannot be used with tag parameter. 
        /// </summary>
        /// <value>The specific revision to build. Default is null and the head of the branch is used. Cannot be used with tag parameter. </value>
        [DataMember(Name="revision", EmitDefaultValue=false)]
        public string Revision { get; set; }

        /// <summary>
        /// The tag to build. Default is null. Cannot be used with revision parameter. 
        /// </summary>
        /// <value>The tag to build. Default is null. Cannot be used with revision parameter. </value>
        [DataMember(Name="tag", EmitDefaultValue=false)]
        public string Tag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProjectUsernameProjectPostRequest {\n");
            sb.Append("  BuildParameters: ").Append(BuildParameters).Append("\n");
            sb.Append("  Parallel: ").Append(Parallel).Append("\n");
            sb.Append("  Revision: ").Append(Revision).Append("\n");
            sb.Append("  Tag: ").Append(Tag).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProjectUsernameProjectPostRequest)obj);
        }

        /// <summary>
        /// Returns true if ProjectUsernameProjectPostRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ProjectUsernameProjectPostRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProjectUsernameProjectPostRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    BuildParameters == other.BuildParameters ||
                    BuildParameters != null &&
                    BuildParameters.Equals(other.BuildParameters)
                ) && 
                (
                    Parallel == other.Parallel ||
                    Parallel != null &&
                    Parallel.Equals(other.Parallel)
                ) && 
                (
                    Revision == other.Revision ||
                    Revision != null &&
                    Revision.Equals(other.Revision)
                ) && 
                (
                    Tag == other.Tag ||
                    Tag != null &&
                    Tag.Equals(other.Tag)
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
                    if (BuildParameters != null)
                    hashCode = hashCode * 59 + BuildParameters.GetHashCode();
                    if (Parallel != null)
                    hashCode = hashCode * 59 + Parallel.GetHashCode();
                    if (Revision != null)
                    hashCode = hashCode * 59 + Revision.GetHashCode();
                    if (Tag != null)
                    hashCode = hashCode * 59 + Tag.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProjectUsernameProjectPostRequest left, ProjectUsernameProjectPostRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProjectUsernameProjectPostRequest left, ProjectUsernameProjectPostRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
