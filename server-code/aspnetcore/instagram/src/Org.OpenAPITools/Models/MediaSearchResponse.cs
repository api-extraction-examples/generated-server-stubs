/*
 * Instagram API
 *
 * Description of Instagram RESTful API.  Current limitations:   * Instagram service does not support [cross origin headers](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS)   for security reasons, therefore it is not possible to use Swagger UI and make API calls directly from browser.   * Modification API requests (`POST`, `DELETE`) require additional security [scopes](https://instagram.com/developer/authorization/)   that are available for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/review/) and   started in [Sandbox Mode](http://instagram.com/developer/sandbox/).   * Consider the [Instagram limitations](https://instagram.com/developer/limits/) for API calls that depends on App Mode.  **Warning:** For Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/) API responses containing media objects no longer return the `data` field in `comments` and `likes` nodes.  Last update: 2015-11-28 
 *
 * The version of the OpenAPI document: 1.0.0
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
    public partial class MediaSearchResponse : IEquatable<MediaSearchResponse>
    {
        /// <summary>
        /// Found media entries; some end-points do not return likes informtaion
        /// </summary>
        /// <value>Found media entries; some end-points do not return likes informtaion</value>
        [DataMember(Name="data", EmitDefaultValue=false)]
        public List<MediaEntry> Data { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name="meta", EmitDefaultValue=false)]
        public MetaData Meta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaSearchResponse {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MediaSearchResponse)obj);
        }

        /// <summary>
        /// Returns true if MediaSearchResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of MediaSearchResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaSearchResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Data == other.Data ||
                    Data != null &&
                    other.Data != null &&
                    Data.SequenceEqual(other.Data)
                ) && 
                (
                    Meta == other.Meta ||
                    Meta != null &&
                    Meta.Equals(other.Meta)
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
                    if (Data != null)
                    hashCode = hashCode * 59 + Data.GetHashCode();
                    if (Meta != null)
                    hashCode = hashCode * 59 + Meta.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MediaSearchResponse left, MediaSearchResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MediaSearchResponse left, MediaSearchResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
