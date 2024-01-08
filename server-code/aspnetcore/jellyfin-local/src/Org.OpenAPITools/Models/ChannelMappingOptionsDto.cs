/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
    /// Channel mapping options dto.
    /// </summary>
    [DataContract]
    public partial class ChannelMappingOptionsDto : IEquatable<ChannelMappingOptionsDto>
    {
        /// <summary>
        /// Gets or sets list of mappings.
        /// </summary>
        /// <value>Gets or sets list of mappings.</value>
        [DataMember(Name="Mappings", EmitDefaultValue=true)]
        public List<NameValuePair> Mappings { get; set; }

        /// <summary>
        /// Gets or sets list of provider channels.
        /// </summary>
        /// <value>Gets or sets list of provider channels.</value>
        [DataMember(Name="ProviderChannels", EmitDefaultValue=true)]
        public List<NameIdPair> ProviderChannels { get; set; }

        /// <summary>
        /// Gets or sets provider name.
        /// </summary>
        /// <value>Gets or sets provider name.</value>
        [DataMember(Name="ProviderName", EmitDefaultValue=true)]
        public string ProviderName { get; set; }

        /// <summary>
        /// Gets or sets list of tuner channels.
        /// </summary>
        /// <value>Gets or sets list of tuner channels.</value>
        [DataMember(Name="TunerChannels", EmitDefaultValue=true)]
        public List<TunerChannelMapping> TunerChannels { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ChannelMappingOptionsDto {\n");
            sb.Append("  Mappings: ").Append(Mappings).Append("\n");
            sb.Append("  ProviderChannels: ").Append(ProviderChannels).Append("\n");
            sb.Append("  ProviderName: ").Append(ProviderName).Append("\n");
            sb.Append("  TunerChannels: ").Append(TunerChannels).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ChannelMappingOptionsDto)obj);
        }

        /// <summary>
        /// Returns true if ChannelMappingOptionsDto instances are equal
        /// </summary>
        /// <param name="other">Instance of ChannelMappingOptionsDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChannelMappingOptionsDto other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Mappings == other.Mappings ||
                    Mappings != null &&
                    other.Mappings != null &&
                    Mappings.SequenceEqual(other.Mappings)
                ) && 
                (
                    ProviderChannels == other.ProviderChannels ||
                    ProviderChannels != null &&
                    other.ProviderChannels != null &&
                    ProviderChannels.SequenceEqual(other.ProviderChannels)
                ) && 
                (
                    ProviderName == other.ProviderName ||
                    ProviderName != null &&
                    ProviderName.Equals(other.ProviderName)
                ) && 
                (
                    TunerChannels == other.TunerChannels ||
                    TunerChannels != null &&
                    other.TunerChannels != null &&
                    TunerChannels.SequenceEqual(other.TunerChannels)
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
                    if (Mappings != null)
                    hashCode = hashCode * 59 + Mappings.GetHashCode();
                    if (ProviderChannels != null)
                    hashCode = hashCode * 59 + ProviderChannels.GetHashCode();
                    if (ProviderName != null)
                    hashCode = hashCode * 59 + ProviderName.GetHashCode();
                    if (TunerChannels != null)
                    hashCode = hashCode * 59 + TunerChannels.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ChannelMappingOptionsDto left, ChannelMappingOptionsDto right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ChannelMappingOptionsDto left, ChannelMappingOptionsDto right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}