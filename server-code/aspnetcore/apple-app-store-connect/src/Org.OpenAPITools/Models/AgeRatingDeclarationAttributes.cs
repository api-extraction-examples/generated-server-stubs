/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.1
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
    public partial class AgeRatingDeclarationAttributes : IEquatable<AgeRatingDeclarationAttributes>
    {

        /// <summary>
        /// Gets or Sets AlcoholTobaccoOrDrugUseOrReferences
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<AlcoholTobaccoOrDrugUseOrReferencesEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AlcoholTobaccoOrDrugUseOrReferencesEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets AlcoholTobaccoOrDrugUseOrReferences
        /// </summary>
        [DataMember(Name="alcoholTobaccoOrDrugUseOrReferences", EmitDefaultValue=true)]
        public AlcoholTobaccoOrDrugUseOrReferencesEnum AlcoholTobaccoOrDrugUseOrReferences { get; set; }


        /// <summary>
        /// Gets or Sets Contests
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ContestsEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ContestsEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets Contests
        /// </summary>
        [DataMember(Name="contests", EmitDefaultValue=true)]
        public ContestsEnum Contests { get; set; }

        /// <summary>
        /// Gets or Sets Gambling
        /// </summary>
        [DataMember(Name="gambling", EmitDefaultValue=true)]
        public bool Gambling { get; set; }

        /// <summary>
        /// Gets or Sets GamblingAndContests
        /// </summary>
        [DataMember(Name="gamblingAndContests", EmitDefaultValue=true)]
        public bool GamblingAndContests { get; set; }


        /// <summary>
        /// Gets or Sets GamblingSimulated
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<GamblingSimulatedEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum GamblingSimulatedEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets GamblingSimulated
        /// </summary>
        [DataMember(Name="gamblingSimulated", EmitDefaultValue=true)]
        public GamblingSimulatedEnum GamblingSimulated { get; set; }


        /// <summary>
        /// Gets or Sets HorrorOrFearThemes
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<HorrorOrFearThemesEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum HorrorOrFearThemesEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets HorrorOrFearThemes
        /// </summary>
        [DataMember(Name="horrorOrFearThemes", EmitDefaultValue=true)]
        public HorrorOrFearThemesEnum HorrorOrFearThemes { get; set; }

        /// <summary>
        /// Gets or Sets KidsAgeBand
        /// </summary>
        [DataMember(Name="kidsAgeBand", EmitDefaultValue=true)]
        public KidsAgeBand KidsAgeBand { get; set; }


        /// <summary>
        /// Gets or Sets MatureOrSuggestiveThemes
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<MatureOrSuggestiveThemesEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum MatureOrSuggestiveThemesEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets MatureOrSuggestiveThemes
        /// </summary>
        [DataMember(Name="matureOrSuggestiveThemes", EmitDefaultValue=true)]
        public MatureOrSuggestiveThemesEnum MatureOrSuggestiveThemes { get; set; }


        /// <summary>
        /// Gets or Sets MedicalOrTreatmentInformation
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<MedicalOrTreatmentInformationEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum MedicalOrTreatmentInformationEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets MedicalOrTreatmentInformation
        /// </summary>
        [DataMember(Name="medicalOrTreatmentInformation", EmitDefaultValue=true)]
        public MedicalOrTreatmentInformationEnum MedicalOrTreatmentInformation { get; set; }


        /// <summary>
        /// Gets or Sets ProfanityOrCrudeHumor
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ProfanityOrCrudeHumorEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ProfanityOrCrudeHumorEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets ProfanityOrCrudeHumor
        /// </summary>
        [DataMember(Name="profanityOrCrudeHumor", EmitDefaultValue=true)]
        public ProfanityOrCrudeHumorEnum ProfanityOrCrudeHumor { get; set; }

        /// <summary>
        /// Gets or Sets SeventeenPlus
        /// </summary>
        [DataMember(Name="seventeenPlus", EmitDefaultValue=true)]
        public bool SeventeenPlus { get; set; }


        /// <summary>
        /// Gets or Sets SexualContentGraphicAndNudity
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<SexualContentGraphicAndNudityEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SexualContentGraphicAndNudityEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets SexualContentGraphicAndNudity
        /// </summary>
        [DataMember(Name="sexualContentGraphicAndNudity", EmitDefaultValue=true)]
        public SexualContentGraphicAndNudityEnum SexualContentGraphicAndNudity { get; set; }


        /// <summary>
        /// Gets or Sets SexualContentOrNudity
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<SexualContentOrNudityEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SexualContentOrNudityEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets SexualContentOrNudity
        /// </summary>
        [DataMember(Name="sexualContentOrNudity", EmitDefaultValue=true)]
        public SexualContentOrNudityEnum SexualContentOrNudity { get; set; }

        /// <summary>
        /// Gets or Sets UnrestrictedWebAccess
        /// </summary>
        [DataMember(Name="unrestrictedWebAccess", EmitDefaultValue=true)]
        public bool UnrestrictedWebAccess { get; set; }


        /// <summary>
        /// Gets or Sets ViolenceCartoonOrFantasy
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ViolenceCartoonOrFantasyEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ViolenceCartoonOrFantasyEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets ViolenceCartoonOrFantasy
        /// </summary>
        [DataMember(Name="violenceCartoonOrFantasy", EmitDefaultValue=true)]
        public ViolenceCartoonOrFantasyEnum ViolenceCartoonOrFantasy { get; set; }


        /// <summary>
        /// Gets or Sets ViolenceRealistic
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ViolenceRealisticEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ViolenceRealisticEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets ViolenceRealistic
        /// </summary>
        [DataMember(Name="violenceRealistic", EmitDefaultValue=true)]
        public ViolenceRealisticEnum ViolenceRealistic { get; set; }


        /// <summary>
        /// Gets or Sets ViolenceRealisticProlongedGraphicOrSadistic
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ViolenceRealisticProlongedGraphicOrSadisticEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ViolenceRealisticProlongedGraphicOrSadisticEnum
        {
            
            /// <summary>
            /// Enum NONEEnum for NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONEEnum = 1,
            
            /// <summary>
            /// Enum INFREQUENTORMILDEnum for INFREQUENT_OR_MILD
            /// </summary>
            [EnumMember(Value = "INFREQUENT_OR_MILD")]
            INFREQUENTORMILDEnum = 2,
            
            /// <summary>
            /// Enum FREQUENTORINTENSEEnum for FREQUENT_OR_INTENSE
            /// </summary>
            [EnumMember(Value = "FREQUENT_OR_INTENSE")]
            FREQUENTORINTENSEEnum = 3
        }

        /// <summary>
        /// Gets or Sets ViolenceRealisticProlongedGraphicOrSadistic
        /// </summary>
        [DataMember(Name="violenceRealisticProlongedGraphicOrSadistic", EmitDefaultValue=true)]
        public ViolenceRealisticProlongedGraphicOrSadisticEnum ViolenceRealisticProlongedGraphicOrSadistic { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AgeRatingDeclarationAttributes {\n");
            sb.Append("  AlcoholTobaccoOrDrugUseOrReferences: ").Append(AlcoholTobaccoOrDrugUseOrReferences).Append("\n");
            sb.Append("  Contests: ").Append(Contests).Append("\n");
            sb.Append("  Gambling: ").Append(Gambling).Append("\n");
            sb.Append("  GamblingAndContests: ").Append(GamblingAndContests).Append("\n");
            sb.Append("  GamblingSimulated: ").Append(GamblingSimulated).Append("\n");
            sb.Append("  HorrorOrFearThemes: ").Append(HorrorOrFearThemes).Append("\n");
            sb.Append("  KidsAgeBand: ").Append(KidsAgeBand).Append("\n");
            sb.Append("  MatureOrSuggestiveThemes: ").Append(MatureOrSuggestiveThemes).Append("\n");
            sb.Append("  MedicalOrTreatmentInformation: ").Append(MedicalOrTreatmentInformation).Append("\n");
            sb.Append("  ProfanityOrCrudeHumor: ").Append(ProfanityOrCrudeHumor).Append("\n");
            sb.Append("  SeventeenPlus: ").Append(SeventeenPlus).Append("\n");
            sb.Append("  SexualContentGraphicAndNudity: ").Append(SexualContentGraphicAndNudity).Append("\n");
            sb.Append("  SexualContentOrNudity: ").Append(SexualContentOrNudity).Append("\n");
            sb.Append("  UnrestrictedWebAccess: ").Append(UnrestrictedWebAccess).Append("\n");
            sb.Append("  ViolenceCartoonOrFantasy: ").Append(ViolenceCartoonOrFantasy).Append("\n");
            sb.Append("  ViolenceRealistic: ").Append(ViolenceRealistic).Append("\n");
            sb.Append("  ViolenceRealisticProlongedGraphicOrSadistic: ").Append(ViolenceRealisticProlongedGraphicOrSadistic).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AgeRatingDeclarationAttributes)obj);
        }

        /// <summary>
        /// Returns true if AgeRatingDeclarationAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of AgeRatingDeclarationAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AgeRatingDeclarationAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AlcoholTobaccoOrDrugUseOrReferences == other.AlcoholTobaccoOrDrugUseOrReferences ||
                    
                    AlcoholTobaccoOrDrugUseOrReferences.Equals(other.AlcoholTobaccoOrDrugUseOrReferences)
                ) && 
                (
                    Contests == other.Contests ||
                    
                    Contests.Equals(other.Contests)
                ) && 
                (
                    Gambling == other.Gambling ||
                    
                    Gambling.Equals(other.Gambling)
                ) && 
                (
                    GamblingAndContests == other.GamblingAndContests ||
                    
                    GamblingAndContests.Equals(other.GamblingAndContests)
                ) && 
                (
                    GamblingSimulated == other.GamblingSimulated ||
                    
                    GamblingSimulated.Equals(other.GamblingSimulated)
                ) && 
                (
                    HorrorOrFearThemes == other.HorrorOrFearThemes ||
                    
                    HorrorOrFearThemes.Equals(other.HorrorOrFearThemes)
                ) && 
                (
                    KidsAgeBand == other.KidsAgeBand ||
                    
                    KidsAgeBand.Equals(other.KidsAgeBand)
                ) && 
                (
                    MatureOrSuggestiveThemes == other.MatureOrSuggestiveThemes ||
                    
                    MatureOrSuggestiveThemes.Equals(other.MatureOrSuggestiveThemes)
                ) && 
                (
                    MedicalOrTreatmentInformation == other.MedicalOrTreatmentInformation ||
                    
                    MedicalOrTreatmentInformation.Equals(other.MedicalOrTreatmentInformation)
                ) && 
                (
                    ProfanityOrCrudeHumor == other.ProfanityOrCrudeHumor ||
                    
                    ProfanityOrCrudeHumor.Equals(other.ProfanityOrCrudeHumor)
                ) && 
                (
                    SeventeenPlus == other.SeventeenPlus ||
                    
                    SeventeenPlus.Equals(other.SeventeenPlus)
                ) && 
                (
                    SexualContentGraphicAndNudity == other.SexualContentGraphicAndNudity ||
                    
                    SexualContentGraphicAndNudity.Equals(other.SexualContentGraphicAndNudity)
                ) && 
                (
                    SexualContentOrNudity == other.SexualContentOrNudity ||
                    
                    SexualContentOrNudity.Equals(other.SexualContentOrNudity)
                ) && 
                (
                    UnrestrictedWebAccess == other.UnrestrictedWebAccess ||
                    
                    UnrestrictedWebAccess.Equals(other.UnrestrictedWebAccess)
                ) && 
                (
                    ViolenceCartoonOrFantasy == other.ViolenceCartoonOrFantasy ||
                    
                    ViolenceCartoonOrFantasy.Equals(other.ViolenceCartoonOrFantasy)
                ) && 
                (
                    ViolenceRealistic == other.ViolenceRealistic ||
                    
                    ViolenceRealistic.Equals(other.ViolenceRealistic)
                ) && 
                (
                    ViolenceRealisticProlongedGraphicOrSadistic == other.ViolenceRealisticProlongedGraphicOrSadistic ||
                    
                    ViolenceRealisticProlongedGraphicOrSadistic.Equals(other.ViolenceRealisticProlongedGraphicOrSadistic)
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
                    
                    hashCode = hashCode * 59 + AlcoholTobaccoOrDrugUseOrReferences.GetHashCode();
                    
                    hashCode = hashCode * 59 + Contests.GetHashCode();
                    
                    hashCode = hashCode * 59 + Gambling.GetHashCode();
                    
                    hashCode = hashCode * 59 + GamblingAndContests.GetHashCode();
                    
                    hashCode = hashCode * 59 + GamblingSimulated.GetHashCode();
                    
                    hashCode = hashCode * 59 + HorrorOrFearThemes.GetHashCode();
                    
                    hashCode = hashCode * 59 + KidsAgeBand.GetHashCode();
                    
                    hashCode = hashCode * 59 + MatureOrSuggestiveThemes.GetHashCode();
                    
                    hashCode = hashCode * 59 + MedicalOrTreatmentInformation.GetHashCode();
                    
                    hashCode = hashCode * 59 + ProfanityOrCrudeHumor.GetHashCode();
                    
                    hashCode = hashCode * 59 + SeventeenPlus.GetHashCode();
                    
                    hashCode = hashCode * 59 + SexualContentGraphicAndNudity.GetHashCode();
                    
                    hashCode = hashCode * 59 + SexualContentOrNudity.GetHashCode();
                    
                    hashCode = hashCode * 59 + UnrestrictedWebAccess.GetHashCode();
                    
                    hashCode = hashCode * 59 + ViolenceCartoonOrFantasy.GetHashCode();
                    
                    hashCode = hashCode * 59 + ViolenceRealistic.GetHashCode();
                    
                    hashCode = hashCode * 59 + ViolenceRealisticProlongedGraphicOrSadistic.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AgeRatingDeclarationAttributes left, AgeRatingDeclarationAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AgeRatingDeclarationAttributes left, AgeRatingDeclarationAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
