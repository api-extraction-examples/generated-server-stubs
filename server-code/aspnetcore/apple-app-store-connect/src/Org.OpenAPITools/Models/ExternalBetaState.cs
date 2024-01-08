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
        /// Gets or Sets ExternalBetaState
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ExternalBetaState>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ExternalBetaState
        {
            
            /// <summary>
            /// Enum PROCESSINGEnum for PROCESSING
            /// </summary>
            [EnumMember(Value = "PROCESSING")]
            PROCESSINGEnum = 1,
            
            /// <summary>
            /// Enum PROCESSINGEXCEPTIONEnum for PROCESSING_EXCEPTION
            /// </summary>
            [EnumMember(Value = "PROCESSING_EXCEPTION")]
            PROCESSINGEXCEPTIONEnum = 2,
            
            /// <summary>
            /// Enum MISSINGEXPORTCOMPLIANCEEnum for MISSING_EXPORT_COMPLIANCE
            /// </summary>
            [EnumMember(Value = "MISSING_EXPORT_COMPLIANCE")]
            MISSINGEXPORTCOMPLIANCEEnum = 3,
            
            /// <summary>
            /// Enum READYFORBETATESTINGEnum for READY_FOR_BETA_TESTING
            /// </summary>
            [EnumMember(Value = "READY_FOR_BETA_TESTING")]
            READYFORBETATESTINGEnum = 4,
            
            /// <summary>
            /// Enum INBETATESTINGEnum for IN_BETA_TESTING
            /// </summary>
            [EnumMember(Value = "IN_BETA_TESTING")]
            INBETATESTINGEnum = 5,
            
            /// <summary>
            /// Enum EXPIREDEnum for EXPIRED
            /// </summary>
            [EnumMember(Value = "EXPIRED")]
            EXPIREDEnum = 6,
            
            /// <summary>
            /// Enum READYFORBETASUBMISSIONEnum for READY_FOR_BETA_SUBMISSION
            /// </summary>
            [EnumMember(Value = "READY_FOR_BETA_SUBMISSION")]
            READYFORBETASUBMISSIONEnum = 7,
            
            /// <summary>
            /// Enum INEXPORTCOMPLIANCEREVIEWEnum for IN_EXPORT_COMPLIANCE_REVIEW
            /// </summary>
            [EnumMember(Value = "IN_EXPORT_COMPLIANCE_REVIEW")]
            INEXPORTCOMPLIANCEREVIEWEnum = 8,
            
            /// <summary>
            /// Enum WAITINGFORBETAREVIEWEnum for WAITING_FOR_BETA_REVIEW
            /// </summary>
            [EnumMember(Value = "WAITING_FOR_BETA_REVIEW")]
            WAITINGFORBETAREVIEWEnum = 9,
            
            /// <summary>
            /// Enum INBETAREVIEWEnum for IN_BETA_REVIEW
            /// </summary>
            [EnumMember(Value = "IN_BETA_REVIEW")]
            INBETAREVIEWEnum = 10,
            
            /// <summary>
            /// Enum BETAREJECTEDEnum for BETA_REJECTED
            /// </summary>
            [EnumMember(Value = "BETA_REJECTED")]
            BETAREJECTEDEnum = 11,
            
            /// <summary>
            /// Enum BETAAPPROVEDEnum for BETA_APPROVED
            /// </summary>
            [EnumMember(Value = "BETA_APPROVED")]
            BETAAPPROVEDEnum = 12
        }
}
