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
    /// 
    /// </summary>
    [DataContract]
    public partial class JsonNode : IEquatable<JsonNode>
    {
        /// <summary>
        /// Gets or Sets Array
        /// </summary>
        [DataMember(Name="array", EmitDefaultValue=true)]
        public bool Array { get; set; }

        /// <summary>
        /// Gets or Sets BigDecimal
        /// </summary>
        [DataMember(Name="bigDecimal", EmitDefaultValue=true)]
        public bool BigDecimal { get; set; }

        /// <summary>
        /// Gets or Sets BigInteger
        /// </summary>
        [DataMember(Name="bigInteger", EmitDefaultValue=true)]
        public bool BigInteger { get; set; }

        /// <summary>
        /// Gets or Sets BigIntegerValue
        /// </summary>
        [DataMember(Name="bigIntegerValue", EmitDefaultValue=true)]
        public int BigIntegerValue { get; set; }

        /// <summary>
        /// Gets or Sets Binary
        /// </summary>
        [DataMember(Name="binary", EmitDefaultValue=true)]
        public bool Binary { get; set; }

        /// <summary>
        /// Gets or Sets BinaryValue
        /// </summary>
        [DataMember(Name="binaryValue", EmitDefaultValue=false)]
        public List<byte[]> BinaryValue { get; set; }

        /// <summary>
        /// Gets or Sets Boolean
        /// </summary>
        [DataMember(Name="boolean", EmitDefaultValue=true)]
        public bool Boolean { get; set; }

        /// <summary>
        /// Gets or Sets BooleanValue
        /// </summary>
        [DataMember(Name="booleanValue", EmitDefaultValue=true)]
        public bool BooleanValue { get; set; }

        /// <summary>
        /// Gets or Sets ContainerNode
        /// </summary>
        [DataMember(Name="containerNode", EmitDefaultValue=true)]
        public bool ContainerNode { get; set; }

        /// <summary>
        /// Gets or Sets DecimalValue
        /// </summary>
        [DataMember(Name="decimalValue", EmitDefaultValue=true)]
        public decimal DecimalValue { get; set; }

        /// <summary>
        /// Gets or Sets VarDouble
        /// </summary>
        [DataMember(Name="double", EmitDefaultValue=true)]
        public bool VarDouble { get; set; }

        /// <summary>
        /// Gets or Sets DoubleValue
        /// </summary>
        [DataMember(Name="doubleValue", EmitDefaultValue=true)]
        public double DoubleValue { get; set; }

        /// <summary>
        /// Gets or Sets Elements
        /// </summary>
        [DataMember(Name="elements", EmitDefaultValue=false)]
        public Object Elements { get; set; }

        /// <summary>
        /// Gets or Sets FieldNames
        /// </summary>
        [DataMember(Name="fieldNames", EmitDefaultValue=false)]
        public Object FieldNames { get; set; }

        /// <summary>
        /// Gets or Sets Fields
        /// </summary>
        [DataMember(Name="fields", EmitDefaultValue=false)]
        public Object Fields { get; set; }

        /// <summary>
        /// Gets or Sets FloatingPointNumber
        /// </summary>
        [DataMember(Name="floatingPointNumber", EmitDefaultValue=true)]
        public bool FloatingPointNumber { get; set; }

        /// <summary>
        /// Gets or Sets VarInt
        /// </summary>
        [DataMember(Name="int", EmitDefaultValue=true)]
        public bool VarInt { get; set; }

        /// <summary>
        /// Gets or Sets IntValue
        /// </summary>
        [DataMember(Name="intValue", EmitDefaultValue=true)]
        public int IntValue { get; set; }

        /// <summary>
        /// Gets or Sets IntegralNumber
        /// </summary>
        [DataMember(Name="integralNumber", EmitDefaultValue=true)]
        public bool IntegralNumber { get; set; }

        /// <summary>
        /// Gets or Sets VarLong
        /// </summary>
        [DataMember(Name="long", EmitDefaultValue=true)]
        public bool VarLong { get; set; }

        /// <summary>
        /// Gets or Sets LongValue
        /// </summary>
        [DataMember(Name="longValue", EmitDefaultValue=true)]
        public long LongValue { get; set; }

        /// <summary>
        /// Gets or Sets MissingNode
        /// </summary>
        [DataMember(Name="missingNode", EmitDefaultValue=true)]
        public bool MissingNode { get; set; }

        /// <summary>
        /// Gets or Sets VarNull
        /// </summary>
        [DataMember(Name="null", EmitDefaultValue=true)]
        public bool VarNull { get; set; }

        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [DataMember(Name="number", EmitDefaultValue=true)]
        public bool Number { get; set; }


        /// <summary>
        /// Gets or Sets NumberType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<NumberTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum NumberTypeEnum
        {
            
            /// <summary>
            /// Enum INTEnum for INT
            /// </summary>
            [EnumMember(Value = "INT")]
            INTEnum = 1,
            
            /// <summary>
            /// Enum LONGEnum for LONG
            /// </summary>
            [EnumMember(Value = "LONG")]
            LONGEnum = 2,
            
            /// <summary>
            /// Enum BIGINTEGEREnum for BIG_INTEGER
            /// </summary>
            [EnumMember(Value = "BIG_INTEGER")]
            BIGINTEGEREnum = 3,
            
            /// <summary>
            /// Enum FLOATEnum for FLOAT
            /// </summary>
            [EnumMember(Value = "FLOAT")]
            FLOATEnum = 4,
            
            /// <summary>
            /// Enum DOUBLEEnum for DOUBLE
            /// </summary>
            [EnumMember(Value = "DOUBLE")]
            DOUBLEEnum = 5,
            
            /// <summary>
            /// Enum BIGDECIMALEnum for BIG_DECIMAL
            /// </summary>
            [EnumMember(Value = "BIG_DECIMAL")]
            BIGDECIMALEnum = 6
        }

        /// <summary>
        /// Gets or Sets NumberType
        /// </summary>
        [DataMember(Name="numberType", EmitDefaultValue=true)]
        public NumberTypeEnum NumberType { get; set; }

        /// <summary>
        /// Gets or Sets NumberValue
        /// </summary>
        [DataMember(Name="numberValue", EmitDefaultValue=true)]
        public decimal NumberValue { get; set; }

        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        [DataMember(Name="object", EmitDefaultValue=true)]
        public bool VarObject { get; set; }

        /// <summary>
        /// Gets or Sets Pojo
        /// </summary>
        [DataMember(Name="pojo", EmitDefaultValue=true)]
        public bool Pojo { get; set; }

        /// <summary>
        /// Gets or Sets TextValue
        /// </summary>
        [DataMember(Name="textValue", EmitDefaultValue=false)]
        public string TextValue { get; set; }

        /// <summary>
        /// Gets or Sets Textual
        /// </summary>
        [DataMember(Name="textual", EmitDefaultValue=true)]
        public bool Textual { get; set; }

        /// <summary>
        /// Gets or Sets ValueAsBoolean
        /// </summary>
        [DataMember(Name="valueAsBoolean", EmitDefaultValue=true)]
        public bool ValueAsBoolean { get; set; }

        /// <summary>
        /// Gets or Sets ValueAsDouble
        /// </summary>
        [DataMember(Name="valueAsDouble", EmitDefaultValue=true)]
        public double ValueAsDouble { get; set; }

        /// <summary>
        /// Gets or Sets ValueAsInt
        /// </summary>
        [DataMember(Name="valueAsInt", EmitDefaultValue=true)]
        public int ValueAsInt { get; set; }

        /// <summary>
        /// Gets or Sets ValueAsLong
        /// </summary>
        [DataMember(Name="valueAsLong", EmitDefaultValue=true)]
        public long ValueAsLong { get; set; }

        /// <summary>
        /// Gets or Sets ValueAsText
        /// </summary>
        [DataMember(Name="valueAsText", EmitDefaultValue=false)]
        public string ValueAsText { get; set; }

        /// <summary>
        /// Gets or Sets ValueNode
        /// </summary>
        [DataMember(Name="valueNode", EmitDefaultValue=true)]
        public bool ValueNode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class JsonNode {\n");
            sb.Append("  Array: ").Append(Array).Append("\n");
            sb.Append("  BigDecimal: ").Append(BigDecimal).Append("\n");
            sb.Append("  BigInteger: ").Append(BigInteger).Append("\n");
            sb.Append("  BigIntegerValue: ").Append(BigIntegerValue).Append("\n");
            sb.Append("  Binary: ").Append(Binary).Append("\n");
            sb.Append("  BinaryValue: ").Append(BinaryValue).Append("\n");
            sb.Append("  Boolean: ").Append(Boolean).Append("\n");
            sb.Append("  BooleanValue: ").Append(BooleanValue).Append("\n");
            sb.Append("  ContainerNode: ").Append(ContainerNode).Append("\n");
            sb.Append("  DecimalValue: ").Append(DecimalValue).Append("\n");
            sb.Append("  VarDouble: ").Append(VarDouble).Append("\n");
            sb.Append("  DoubleValue: ").Append(DoubleValue).Append("\n");
            sb.Append("  Elements: ").Append(Elements).Append("\n");
            sb.Append("  FieldNames: ").Append(FieldNames).Append("\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
            sb.Append("  FloatingPointNumber: ").Append(FloatingPointNumber).Append("\n");
            sb.Append("  VarInt: ").Append(VarInt).Append("\n");
            sb.Append("  IntValue: ").Append(IntValue).Append("\n");
            sb.Append("  IntegralNumber: ").Append(IntegralNumber).Append("\n");
            sb.Append("  VarLong: ").Append(VarLong).Append("\n");
            sb.Append("  LongValue: ").Append(LongValue).Append("\n");
            sb.Append("  MissingNode: ").Append(MissingNode).Append("\n");
            sb.Append("  VarNull: ").Append(VarNull).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  NumberType: ").Append(NumberType).Append("\n");
            sb.Append("  NumberValue: ").Append(NumberValue).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  Pojo: ").Append(Pojo).Append("\n");
            sb.Append("  TextValue: ").Append(TextValue).Append("\n");
            sb.Append("  Textual: ").Append(Textual).Append("\n");
            sb.Append("  ValueAsBoolean: ").Append(ValueAsBoolean).Append("\n");
            sb.Append("  ValueAsDouble: ").Append(ValueAsDouble).Append("\n");
            sb.Append("  ValueAsInt: ").Append(ValueAsInt).Append("\n");
            sb.Append("  ValueAsLong: ").Append(ValueAsLong).Append("\n");
            sb.Append("  ValueAsText: ").Append(ValueAsText).Append("\n");
            sb.Append("  ValueNode: ").Append(ValueNode).Append("\n");
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
            return obj.GetType() == GetType() && Equals((JsonNode)obj);
        }

        /// <summary>
        /// Returns true if JsonNode instances are equal
        /// </summary>
        /// <param name="other">Instance of JsonNode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JsonNode other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Array == other.Array ||
                    
                    Array.Equals(other.Array)
                ) && 
                (
                    BigDecimal == other.BigDecimal ||
                    
                    BigDecimal.Equals(other.BigDecimal)
                ) && 
                (
                    BigInteger == other.BigInteger ||
                    
                    BigInteger.Equals(other.BigInteger)
                ) && 
                (
                    BigIntegerValue == other.BigIntegerValue ||
                    
                    BigIntegerValue.Equals(other.BigIntegerValue)
                ) && 
                (
                    Binary == other.Binary ||
                    
                    Binary.Equals(other.Binary)
                ) && 
                (
                    BinaryValue == other.BinaryValue ||
                    BinaryValue != null &&
                    other.BinaryValue != null &&
                    BinaryValue.SequenceEqual(other.BinaryValue)
                ) && 
                (
                    Boolean == other.Boolean ||
                    
                    Boolean.Equals(other.Boolean)
                ) && 
                (
                    BooleanValue == other.BooleanValue ||
                    
                    BooleanValue.Equals(other.BooleanValue)
                ) && 
                (
                    ContainerNode == other.ContainerNode ||
                    
                    ContainerNode.Equals(other.ContainerNode)
                ) && 
                (
                    DecimalValue == other.DecimalValue ||
                    
                    DecimalValue.Equals(other.DecimalValue)
                ) && 
                (
                    VarDouble == other.VarDouble ||
                    
                    VarDouble.Equals(other.VarDouble)
                ) && 
                (
                    DoubleValue == other.DoubleValue ||
                    
                    DoubleValue.Equals(other.DoubleValue)
                ) && 
                (
                    Elements == other.Elements ||
                    Elements != null &&
                    Elements.Equals(other.Elements)
                ) && 
                (
                    FieldNames == other.FieldNames ||
                    FieldNames != null &&
                    FieldNames.Equals(other.FieldNames)
                ) && 
                (
                    Fields == other.Fields ||
                    Fields != null &&
                    Fields.Equals(other.Fields)
                ) && 
                (
                    FloatingPointNumber == other.FloatingPointNumber ||
                    
                    FloatingPointNumber.Equals(other.FloatingPointNumber)
                ) && 
                (
                    VarInt == other.VarInt ||
                    
                    VarInt.Equals(other.VarInt)
                ) && 
                (
                    IntValue == other.IntValue ||
                    
                    IntValue.Equals(other.IntValue)
                ) && 
                (
                    IntegralNumber == other.IntegralNumber ||
                    
                    IntegralNumber.Equals(other.IntegralNumber)
                ) && 
                (
                    VarLong == other.VarLong ||
                    
                    VarLong.Equals(other.VarLong)
                ) && 
                (
                    LongValue == other.LongValue ||
                    
                    LongValue.Equals(other.LongValue)
                ) && 
                (
                    MissingNode == other.MissingNode ||
                    
                    MissingNode.Equals(other.MissingNode)
                ) && 
                (
                    VarNull == other.VarNull ||
                    
                    VarNull.Equals(other.VarNull)
                ) && 
                (
                    Number == other.Number ||
                    
                    Number.Equals(other.Number)
                ) && 
                (
                    NumberType == other.NumberType ||
                    
                    NumberType.Equals(other.NumberType)
                ) && 
                (
                    NumberValue == other.NumberValue ||
                    
                    NumberValue.Equals(other.NumberValue)
                ) && 
                (
                    VarObject == other.VarObject ||
                    
                    VarObject.Equals(other.VarObject)
                ) && 
                (
                    Pojo == other.Pojo ||
                    
                    Pojo.Equals(other.Pojo)
                ) && 
                (
                    TextValue == other.TextValue ||
                    TextValue != null &&
                    TextValue.Equals(other.TextValue)
                ) && 
                (
                    Textual == other.Textual ||
                    
                    Textual.Equals(other.Textual)
                ) && 
                (
                    ValueAsBoolean == other.ValueAsBoolean ||
                    
                    ValueAsBoolean.Equals(other.ValueAsBoolean)
                ) && 
                (
                    ValueAsDouble == other.ValueAsDouble ||
                    
                    ValueAsDouble.Equals(other.ValueAsDouble)
                ) && 
                (
                    ValueAsInt == other.ValueAsInt ||
                    
                    ValueAsInt.Equals(other.ValueAsInt)
                ) && 
                (
                    ValueAsLong == other.ValueAsLong ||
                    
                    ValueAsLong.Equals(other.ValueAsLong)
                ) && 
                (
                    ValueAsText == other.ValueAsText ||
                    ValueAsText != null &&
                    ValueAsText.Equals(other.ValueAsText)
                ) && 
                (
                    ValueNode == other.ValueNode ||
                    
                    ValueNode.Equals(other.ValueNode)
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
                    
                    hashCode = hashCode * 59 + Array.GetHashCode();
                    
                    hashCode = hashCode * 59 + BigDecimal.GetHashCode();
                    
                    hashCode = hashCode * 59 + BigInteger.GetHashCode();
                    
                    hashCode = hashCode * 59 + BigIntegerValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + Binary.GetHashCode();
                    if (BinaryValue != null)
                    hashCode = hashCode * 59 + BinaryValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + Boolean.GetHashCode();
                    
                    hashCode = hashCode * 59 + BooleanValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + ContainerNode.GetHashCode();
                    
                    hashCode = hashCode * 59 + DecimalValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarDouble.GetHashCode();
                    
                    hashCode = hashCode * 59 + DoubleValue.GetHashCode();
                    if (Elements != null)
                    hashCode = hashCode * 59 + Elements.GetHashCode();
                    if (FieldNames != null)
                    hashCode = hashCode * 59 + FieldNames.GetHashCode();
                    if (Fields != null)
                    hashCode = hashCode * 59 + Fields.GetHashCode();
                    
                    hashCode = hashCode * 59 + FloatingPointNumber.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarInt.GetHashCode();
                    
                    hashCode = hashCode * 59 + IntValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + IntegralNumber.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarLong.GetHashCode();
                    
                    hashCode = hashCode * 59 + LongValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + MissingNode.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarNull.GetHashCode();
                    
                    hashCode = hashCode * 59 + Number.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumberType.GetHashCode();
                    
                    hashCode = hashCode * 59 + NumberValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarObject.GetHashCode();
                    
                    hashCode = hashCode * 59 + Pojo.GetHashCode();
                    if (TextValue != null)
                    hashCode = hashCode * 59 + TextValue.GetHashCode();
                    
                    hashCode = hashCode * 59 + Textual.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValueAsBoolean.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValueAsDouble.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValueAsInt.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValueAsLong.GetHashCode();
                    if (ValueAsText != null)
                    hashCode = hashCode * 59 + ValueAsText.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValueNode.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(JsonNode left, JsonNode right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(JsonNode left, JsonNode right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
