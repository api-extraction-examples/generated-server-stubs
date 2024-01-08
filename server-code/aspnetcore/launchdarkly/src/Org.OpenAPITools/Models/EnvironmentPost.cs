/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    public partial class EnvironmentPost : IEquatable<EnvironmentPost>
    {
        /// <summary>
        /// A color swatch (as an RGB hex value with no leading &#39;#&#39;, e.g. C8C8C8).
        /// </summary>
        /// <value>A color swatch (as an RGB hex value with no leading &#39;#&#39;, e.g. C8C8C8).</value>
        /// <example>417505</example>
        [Required]
        [DataMember(Name="color", EmitDefaultValue=false)]
        public string Color { get; set; }

        /// <summary>
        /// Determines if this environment requires confirmation for flag and segment changes.
        /// </summary>
        /// <value>Determines if this environment requires confirmation for flag and segment changes.</value>
        /// <example>false</example>
        [DataMember(Name="confirmChanges", EmitDefaultValue=true)]
        public bool ConfirmChanges { get; set; }

        /// <summary>
        /// Set to true to send detailed event information for newly created flags.
        /// </summary>
        /// <value>Set to true to send detailed event information for newly created flags.</value>
        /// <example>false</example>
        [DataMember(Name="defaultTrackEvents", EmitDefaultValue=true)]
        public bool DefaultTrackEvents { get; set; }

        /// <summary>
        /// The default TTL for the new environment.
        /// </summary>
        /// <value>The default TTL for the new environment.</value>
        /// <example>0.0</example>
        [DataMember(Name="defaultTtl", EmitDefaultValue=true)]
        public decimal DefaultTtl { get; set; }

        /// <summary>
        /// A project-unique key for the new environment.
        /// </summary>
        /// <value>A project-unique key for the new environment.</value>
        /// <example>dev</example>
        [Required]
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// The name of the new environment.
        /// </summary>
        /// <value>The name of the new environment.</value>
        /// <example>Development</example>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Determines if this environment requires comments for flag and segment changes.
        /// </summary>
        /// <value>Determines if this environment requires comments for flag and segment changes.</value>
        /// <example>false</example>
        [DataMember(Name="requireComments", EmitDefaultValue=true)]
        public bool RequireComments { get; set; }

        /// <summary>
        /// Determines whether the environment is in secure mode.
        /// </summary>
        /// <value>Determines whether the environment is in secure mode.</value>
        /// <example>false</example>
        [DataMember(Name="secureMode", EmitDefaultValue=true)]
        public bool SecureMode { get; set; }

        /// <summary>
        /// An array of tags for this environment.
        /// </summary>
        /// <value>An array of tags for this environment.</value>
        /// <example>[tag1, tag2]</example>
        [DataMember(Name="tags", EmitDefaultValue=false)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnvironmentPost {\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  ConfirmChanges: ").Append(ConfirmChanges).Append("\n");
            sb.Append("  DefaultTrackEvents: ").Append(DefaultTrackEvents).Append("\n");
            sb.Append("  DefaultTtl: ").Append(DefaultTtl).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  RequireComments: ").Append(RequireComments).Append("\n");
            sb.Append("  SecureMode: ").Append(SecureMode).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
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
            return obj.GetType() == GetType() && Equals((EnvironmentPost)obj);
        }

        /// <summary>
        /// Returns true if EnvironmentPost instances are equal
        /// </summary>
        /// <param name="other">Instance of EnvironmentPost to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnvironmentPost other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Color == other.Color ||
                    Color != null &&
                    Color.Equals(other.Color)
                ) && 
                (
                    ConfirmChanges == other.ConfirmChanges ||
                    
                    ConfirmChanges.Equals(other.ConfirmChanges)
                ) && 
                (
                    DefaultTrackEvents == other.DefaultTrackEvents ||
                    
                    DefaultTrackEvents.Equals(other.DefaultTrackEvents)
                ) && 
                (
                    DefaultTtl == other.DefaultTtl ||
                    
                    DefaultTtl.Equals(other.DefaultTtl)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    RequireComments == other.RequireComments ||
                    
                    RequireComments.Equals(other.RequireComments)
                ) && 
                (
                    SecureMode == other.SecureMode ||
                    
                    SecureMode.Equals(other.SecureMode)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    other.Tags != null &&
                    Tags.SequenceEqual(other.Tags)
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
                    if (Color != null)
                    hashCode = hashCode * 59 + Color.GetHashCode();
                    
                    hashCode = hashCode * 59 + ConfirmChanges.GetHashCode();
                    
                    hashCode = hashCode * 59 + DefaultTrackEvents.GetHashCode();
                    
                    hashCode = hashCode * 59 + DefaultTtl.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + RequireComments.GetHashCode();
                    
                    hashCode = hashCode * 59 + SecureMode.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(EnvironmentPost left, EnvironmentPost right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EnvironmentPost left, EnvironmentPost right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
