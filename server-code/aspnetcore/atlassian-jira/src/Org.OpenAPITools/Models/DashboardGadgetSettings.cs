/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    /// Details of the settings for a dashboard gadget.
    /// </summary>
    [DataContract]
    public partial class DashboardGadgetSettings : IEquatable<DashboardGadgetSettings>
    {
        /// <summary>
        /// The color of the gadget. Should be one of &#x60;blue&#x60;, &#x60;red&#x60;, &#x60;yellow&#x60;, &#x60;green&#x60;, &#x60;cyan&#x60;, &#x60;purple&#x60;, &#x60;gray&#x60;, or &#x60;white&#x60;.
        /// </summary>
        /// <value>The color of the gadget. Should be one of &#x60;blue&#x60;, &#x60;red&#x60;, &#x60;yellow&#x60;, &#x60;green&#x60;, &#x60;cyan&#x60;, &#x60;purple&#x60;, &#x60;gray&#x60;, or &#x60;white&#x60;.</value>
        [DataMember(Name="color", EmitDefaultValue=false)]
        public string Color { get; set; }

        /// <summary>
        /// Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn&#39;t installed.
        /// </summary>
        /// <value>Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn&#39;t installed.</value>
        [DataMember(Name="ignoreUriAndModuleKeyValidation", EmitDefaultValue=true)]
        public bool IgnoreUriAndModuleKeyValidation { get; set; }

        /// <summary>
        /// The module key of the gadget type. Can&#39;t be provided with &#x60;uri&#x60;.
        /// </summary>
        /// <value>The module key of the gadget type. Can&#39;t be provided with &#x60;uri&#x60;.</value>
        [DataMember(Name="moduleKey", EmitDefaultValue=false)]
        public string ModuleKey { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name="position", EmitDefaultValue=false)]
        public DashboardGadgetPosition Position { get; set; }

        /// <summary>
        /// The title of the gadget.
        /// </summary>
        /// <value>The title of the gadget.</value>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// The URI of the gadget type. Can&#39;t be provided with &#x60;moduleKey&#x60;.
        /// </summary>
        /// <value>The URI of the gadget type. Can&#39;t be provided with &#x60;moduleKey&#x60;.</value>
        [DataMember(Name="uri", EmitDefaultValue=false)]
        public string Uri { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DashboardGadgetSettings {\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  IgnoreUriAndModuleKeyValidation: ").Append(IgnoreUriAndModuleKeyValidation).Append("\n");
            sb.Append("  ModuleKey: ").Append(ModuleKey).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Uri: ").Append(Uri).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DashboardGadgetSettings)obj);
        }

        /// <summary>
        /// Returns true if DashboardGadgetSettings instances are equal
        /// </summary>
        /// <param name="other">Instance of DashboardGadgetSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DashboardGadgetSettings other)
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
                    IgnoreUriAndModuleKeyValidation == other.IgnoreUriAndModuleKeyValidation ||
                    
                    IgnoreUriAndModuleKeyValidation.Equals(other.IgnoreUriAndModuleKeyValidation)
                ) && 
                (
                    ModuleKey == other.ModuleKey ||
                    ModuleKey != null &&
                    ModuleKey.Equals(other.ModuleKey)
                ) && 
                (
                    Position == other.Position ||
                    Position != null &&
                    Position.Equals(other.Position)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    Uri == other.Uri ||
                    Uri != null &&
                    Uri.Equals(other.Uri)
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
                    
                    hashCode = hashCode * 59 + IgnoreUriAndModuleKeyValidation.GetHashCode();
                    if (ModuleKey != null)
                    hashCode = hashCode * 59 + ModuleKey.GetHashCode();
                    if (Position != null)
                    hashCode = hashCode * 59 + Position.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (Uri != null)
                    hashCode = hashCode * 59 + Uri.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DashboardGadgetSettings left, DashboardGadgetSettings right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DashboardGadgetSettings left, DashboardGadgetSettings right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}