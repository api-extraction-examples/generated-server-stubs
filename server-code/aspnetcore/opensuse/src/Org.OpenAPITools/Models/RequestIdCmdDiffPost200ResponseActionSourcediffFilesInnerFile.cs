/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * The version of the OpenAPI document: 2.10.50
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
    public partial class RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile : IEquatable<RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile>
    {
        /// <summary>
        /// Gets or Sets Diff
        /// </summary>
        /// <example>spec files:
-----------
--- test.spec
+++ test.spec
@@ -0,0 +1 @@
+# NEW COMMENT
\ No newline at end of file
</example>
        [DataMember(Name="diff", EmitDefaultValue=false)]
        public string Diff { get; set; }

        /// <summary>
        /// Gets or Sets VarNew
        /// </summary>
        [DataMember(Name="new", EmitDefaultValue=false)]
        public Object VarNew { get; set; }

        /// <summary>
        /// Gets or Sets Old
        /// </summary>
        [DataMember(Name="old", EmitDefaultValue=false)]
        public RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFileOld Old { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        /// <example>changed</example>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile {\n");
            sb.Append("  Diff: ").Append(Diff).Append("\n");
            sb.Append("  VarNew: ").Append(VarNew).Append("\n");
            sb.Append("  Old: ").Append(Old).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile)obj);
        }

        /// <summary>
        /// Returns true if RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile instances are equal
        /// </summary>
        /// <param name="other">Instance of RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Diff == other.Diff ||
                    Diff != null &&
                    Diff.Equals(other.Diff)
                ) && 
                (
                    VarNew == other.VarNew ||
                    VarNew != null &&
                    VarNew.Equals(other.VarNew)
                ) && 
                (
                    Old == other.Old ||
                    Old != null &&
                    Old.Equals(other.Old)
                ) && 
                (
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
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
                    if (Diff != null)
                    hashCode = hashCode * 59 + Diff.GetHashCode();
                    if (VarNew != null)
                    hashCode = hashCode * 59 + VarNew.GetHashCode();
                    if (Old != null)
                    hashCode = hashCode * 59 + Old.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile left, RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile left, RequestIdCmdDiffPost200ResponseActionSourcediffFilesInnerFile right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
