/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: pim.360.team@intel.com
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
    public partial class DetailedProductInformationResultInnerAllOfTechSpecInner : IEquatable<DetailedProductInformationResultInnerAllOfTechSpecInner>
    {
        /// <summary>
        /// Gets or Sets Disclaimer
        /// </summary>
        /// <example>Max Turbo Frequency refers to the maximum single-core processor frequency that can be achieved with Intel® Turbo Boost Technology.  See &lt;a href&#x3D;&quot;http://www.intel.com/technology/turboboost/&quot;&gt;www.intel.com/technology/turboboost/&lt;/a&gt; for more information.</example>
        [DataMember(Name="disclaimer", EmitDefaultValue=false)]
        public string Disclaimer { get; set; }

        /// <summary>
        /// Gets or Sets HighlightKey
        /// </summary>
        /// <example>TBTVersion</example>
        [DataMember(Name="highlight_key", EmitDefaultValue=false)]
        public string HighlightKey { get; set; }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        /// <example>Intel® Turbo Boost Technology &lt;small&gt;&lt;sup&gt;‡&lt;/sup&gt;&lt;/small&gt;</example>
        [DataMember(Name="label", EmitDefaultValue=false)]
        public string Label { get; set; }

        /// <summary>
        /// Gets or Sets RawValue
        /// </summary>
        /// <example>2</example>
        [DataMember(Name="raw_value", EmitDefaultValue=false)]
        public string RawValue { get; set; }

        /// <summary>
        /// Gets or Sets ToolTip
        /// </summary>
        /// <example>Intel® Turbo Boost Technology dynamically increases the processor&#39;s frequency as needed by taking advantage of thermal and power headroom to give you a burst of speed when you need it, and increased energy efficiency when you don’t.</example>
        [DataMember(Name="tool_tip", EmitDefaultValue=false)]
        public string ToolTip { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        /// <example>2.0</example>
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DetailedProductInformationResultInnerAllOfTechSpecInner {\n");
            sb.Append("  Disclaimer: ").Append(Disclaimer).Append("\n");
            sb.Append("  HighlightKey: ").Append(HighlightKey).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  RawValue: ").Append(RawValue).Append("\n");
            sb.Append("  ToolTip: ").Append(ToolTip).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DetailedProductInformationResultInnerAllOfTechSpecInner)obj);
        }

        /// <summary>
        /// Returns true if DetailedProductInformationResultInnerAllOfTechSpecInner instances are equal
        /// </summary>
        /// <param name="other">Instance of DetailedProductInformationResultInnerAllOfTechSpecInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DetailedProductInformationResultInnerAllOfTechSpecInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Disclaimer == other.Disclaimer ||
                    Disclaimer != null &&
                    Disclaimer.Equals(other.Disclaimer)
                ) && 
                (
                    HighlightKey == other.HighlightKey ||
                    HighlightKey != null &&
                    HighlightKey.Equals(other.HighlightKey)
                ) && 
                (
                    Label == other.Label ||
                    Label != null &&
                    Label.Equals(other.Label)
                ) && 
                (
                    RawValue == other.RawValue ||
                    RawValue != null &&
                    RawValue.Equals(other.RawValue)
                ) && 
                (
                    ToolTip == other.ToolTip ||
                    ToolTip != null &&
                    ToolTip.Equals(other.ToolTip)
                ) && 
                (
                    Value == other.Value ||
                    Value != null &&
                    Value.Equals(other.Value)
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
                    if (Disclaimer != null)
                    hashCode = hashCode * 59 + Disclaimer.GetHashCode();
                    if (HighlightKey != null)
                    hashCode = hashCode * 59 + HighlightKey.GetHashCode();
                    if (Label != null)
                    hashCode = hashCode * 59 + Label.GetHashCode();
                    if (RawValue != null)
                    hashCode = hashCode * 59 + RawValue.GetHashCode();
                    if (ToolTip != null)
                    hashCode = hashCode * 59 + ToolTip.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DetailedProductInformationResultInnerAllOfTechSpecInner left, DetailedProductInformationResultInnerAllOfTechSpecInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DetailedProductInformationResultInnerAllOfTechSpecInner left, DetailedProductInformationResultInnerAllOfTechSpecInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
