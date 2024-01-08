/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * The version of the OpenAPI document: 1.5.7
 * Contact: support@1password.com
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
    public partial class Field : IEquatable<Field>
    {
        /// <summary>
        /// For fields with a purpose of &#x60;PASSWORD&#x60; this is the entropy of the value
        /// </summary>
        /// <value>For fields with a purpose of &#x60;PASSWORD&#x60; this is the entropy of the value</value>
        [DataMember(Name="entropy", EmitDefaultValue=true)]
        public decimal Entropy { get; set; }

        /// <summary>
        /// If value is not present then a new value should be generated for this field
        /// </summary>
        /// <value>If value is not present then a new value should be generated for this field</value>
        [DataMember(Name="generate", EmitDefaultValue=true)]
        public bool Generate { get; set; } = false;

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        [DataMember(Name="label", EmitDefaultValue=false)]
        public string Label { get; set; }


        /// <summary>
        /// Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types.
        /// </summary>
        /// <value>Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types.</value>
        [TypeConverter(typeof(CustomEnumConverter<PurposeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PurposeEnum
        {
            
            /// <summary>
            /// Enum Empty for 
            /// </summary>
            [EnumMember(Value = "")]
            Empty = 1,
            
            /// <summary>
            /// Enum USERNAMEEnum for USERNAME
            /// </summary>
            [EnumMember(Value = "USERNAME")]
            USERNAMEEnum = 2,
            
            /// <summary>
            /// Enum PASSWORDEnum for PASSWORD
            /// </summary>
            [EnumMember(Value = "PASSWORD")]
            PASSWORDEnum = 3,
            
            /// <summary>
            /// Enum NOTESEnum for NOTES
            /// </summary>
            [EnumMember(Value = "NOTES")]
            NOTESEnum = 4
        }

        /// <summary>
        /// Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types.
        /// </summary>
        /// <value>Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types.</value>
        [DataMember(Name="purpose", EmitDefaultValue=true)]
        public PurposeEnum Purpose { get; set; }

        /// <summary>
        /// Gets or Sets Recipe
        /// </summary>
        [DataMember(Name="recipe", EmitDefaultValue=false)]
        public GeneratorRecipe Recipe { get; set; }

        /// <summary>
        /// Gets or Sets Section
        /// </summary>
        [DataMember(Name="section", EmitDefaultValue=false)]
        public FieldSection Section { get; set; }


        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum STRINGEnum for STRING
            /// </summary>
            [EnumMember(Value = "STRING")]
            STRINGEnum = 1,
            
            /// <summary>
            /// Enum EMAILEnum for EMAIL
            /// </summary>
            [EnumMember(Value = "EMAIL")]
            EMAILEnum = 2,
            
            /// <summary>
            /// Enum CONCEALEDEnum for CONCEALED
            /// </summary>
            [EnumMember(Value = "CONCEALED")]
            CONCEALEDEnum = 3,
            
            /// <summary>
            /// Enum URLEnum for URL
            /// </summary>
            [EnumMember(Value = "URL")]
            URLEnum = 4,
            
            /// <summary>
            /// Enum TOTPEnum for TOTP
            /// </summary>
            [EnumMember(Value = "TOTP")]
            TOTPEnum = 5,
            
            /// <summary>
            /// Enum DATEEnum for DATE
            /// </summary>
            [EnumMember(Value = "DATE")]
            DATEEnum = 6,
            
            /// <summary>
            /// Enum MONTHYEAREnum for MONTH_YEAR
            /// </summary>
            [EnumMember(Value = "MONTH_YEAR")]
            MONTHYEAREnum = 7,
            
            /// <summary>
            /// Enum MENUEnum for MENU
            /// </summary>
            [EnumMember(Value = "MENU")]
            MENUEnum = 8
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; } = TypeEnum.STRINGEnum;

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Field {\n");
            sb.Append("  Entropy: ").Append(Entropy).Append("\n");
            sb.Append("  Generate: ").Append(Generate).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Purpose: ").Append(Purpose).Append("\n");
            sb.Append("  Recipe: ").Append(Recipe).Append("\n");
            sb.Append("  Section: ").Append(Section).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Field)obj);
        }

        /// <summary>
        /// Returns true if Field instances are equal
        /// </summary>
        /// <param name="other">Instance of Field to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Field other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Entropy == other.Entropy ||
                    
                    Entropy.Equals(other.Entropy)
                ) && 
                (
                    Generate == other.Generate ||
                    
                    Generate.Equals(other.Generate)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Label == other.Label ||
                    Label != null &&
                    Label.Equals(other.Label)
                ) && 
                (
                    Purpose == other.Purpose ||
                    
                    Purpose.Equals(other.Purpose)
                ) && 
                (
                    Recipe == other.Recipe ||
                    Recipe != null &&
                    Recipe.Equals(other.Recipe)
                ) && 
                (
                    Section == other.Section ||
                    Section != null &&
                    Section.Equals(other.Section)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
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
                    
                    hashCode = hashCode * 59 + Entropy.GetHashCode();
                    
                    hashCode = hashCode * 59 + Generate.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Label != null)
                    hashCode = hashCode * 59 + Label.GetHashCode();
                    
                    hashCode = hashCode * 59 + Purpose.GetHashCode();
                    if (Recipe != null)
                    hashCode = hashCode * 59 + Recipe.GetHashCode();
                    if (Section != null)
                    hashCode = hashCode * 59 + Section.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Field left, Field right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Field left, Field right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
