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
    public partial class ModelEnvironment : IEquatable<ModelEnvironment>
    {
        /// <summary>
        /// The unique resource id.
        /// </summary>
        /// <value>The unique resource id.</value>
        /// <example>5a580a01b4ff89217bdf9dc1</example>
        [DataMember(Name="_id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public Links Links { get; set; }

        /// <summary>
        /// The SDK key for backend LaunchDarkly SDKs.
        /// </summary>
        /// <value>The SDK key for backend LaunchDarkly SDKs.</value>
        /// <example>XXX</example>
        [DataMember(Name="apiKey", EmitDefaultValue=false)]
        public string ApiKey { get; set; }

        /// <summary>
        /// Gets or Sets ApprovalSettings
        /// </summary>
        [DataMember(Name="approvalSettings", EmitDefaultValue=false)]
        public EnvironmentApprovalSettings ApprovalSettings { get; set; }

        /// <summary>
        /// The swatch color for the environment.
        /// </summary>
        /// <value>The swatch color for the environment.</value>
        /// <example>417505</example>
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
        /// Set to true to send detailed event information for new flags.
        /// </summary>
        /// <value>Set to true to send detailed event information for new flags.</value>
        /// <example>false</example>
        [DataMember(Name="defaultTrackEvents", EmitDefaultValue=true)]
        public bool DefaultTrackEvents { get; set; }

        /// <summary>
        /// The default TTL.
        /// </summary>
        /// <value>The default TTL.</value>
        /// <example>0.0</example>
        [DataMember(Name="defaultTtl", EmitDefaultValue=true)]
        public decimal DefaultTtl { get; set; }

        /// <summary>
        /// The key for the environment.
        /// </summary>
        /// <value>The key for the environment.</value>
        /// <example>production</example>
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// The SDK key for mobile LaunchDarkly SDKs.
        /// </summary>
        /// <value>The SDK key for mobile LaunchDarkly SDKs.</value>
        /// <example>XXX</example>
        [DataMember(Name="mobileKey", EmitDefaultValue=false)]
        public string MobileKey { get; set; }

        /// <summary>
        /// The name of the environment.
        /// </summary>
        /// <value>The name of the environment.</value>
        /// <example>Production</example>
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
        /// Determines if this environment is in safe mode.
        /// </summary>
        /// <value>Determines if this environment is in safe mode.</value>
        /// <example>false</example>
        [DataMember(Name="secureMode", EmitDefaultValue=true)]
        public bool SecureMode { get; set; }

        /// <summary>
        /// An array of tags for this environment.
        /// </summary>
        /// <value>An array of tags for this environment.</value>
        [DataMember(Name="tags", EmitDefaultValue=false)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelEnvironment {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  ApiKey: ").Append(ApiKey).Append("\n");
            sb.Append("  ApprovalSettings: ").Append(ApprovalSettings).Append("\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  ConfirmChanges: ").Append(ConfirmChanges).Append("\n");
            sb.Append("  DefaultTrackEvents: ").Append(DefaultTrackEvents).Append("\n");
            sb.Append("  DefaultTtl: ").Append(DefaultTtl).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  MobileKey: ").Append(MobileKey).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ModelEnvironment)obj);
        }

        /// <summary>
        /// Returns true if ModelEnvironment instances are equal
        /// </summary>
        /// <param name="other">Instance of ModelEnvironment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelEnvironment other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Links == other.Links ||
                    Links != null &&
                    Links.Equals(other.Links)
                ) && 
                (
                    ApiKey == other.ApiKey ||
                    ApiKey != null &&
                    ApiKey.Equals(other.ApiKey)
                ) && 
                (
                    ApprovalSettings == other.ApprovalSettings ||
                    ApprovalSettings != null &&
                    ApprovalSettings.Equals(other.ApprovalSettings)
                ) && 
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
                    MobileKey == other.MobileKey ||
                    MobileKey != null &&
                    MobileKey.Equals(other.MobileKey)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Links != null)
                    hashCode = hashCode * 59 + Links.GetHashCode();
                    if (ApiKey != null)
                    hashCode = hashCode * 59 + ApiKey.GetHashCode();
                    if (ApprovalSettings != null)
                    hashCode = hashCode * 59 + ApprovalSettings.GetHashCode();
                    if (Color != null)
                    hashCode = hashCode * 59 + Color.GetHashCode();
                    
                    hashCode = hashCode * 59 + ConfirmChanges.GetHashCode();
                    
                    hashCode = hashCode * 59 + DefaultTrackEvents.GetHashCode();
                    
                    hashCode = hashCode * 59 + DefaultTtl.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (MobileKey != null)
                    hashCode = hashCode * 59 + MobileKey.GetHashCode();
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

        public static bool operator ==(ModelEnvironment left, ModelEnvironment right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ModelEnvironment left, ModelEnvironment right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
