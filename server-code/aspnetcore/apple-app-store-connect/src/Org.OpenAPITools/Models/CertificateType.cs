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
        /// Gets or Sets CertificateType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<CertificateType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CertificateType
        {
            
            /// <summary>
            /// Enum IOSDEVELOPMENTEnum for IOS_DEVELOPMENT
            /// </summary>
            [EnumMember(Value = "IOS_DEVELOPMENT")]
            IOSDEVELOPMENTEnum = 1,
            
            /// <summary>
            /// Enum IOSDISTRIBUTIONEnum for IOS_DISTRIBUTION
            /// </summary>
            [EnumMember(Value = "IOS_DISTRIBUTION")]
            IOSDISTRIBUTIONEnum = 2,
            
            /// <summary>
            /// Enum MACAPPDISTRIBUTIONEnum for MAC_APP_DISTRIBUTION
            /// </summary>
            [EnumMember(Value = "MAC_APP_DISTRIBUTION")]
            MACAPPDISTRIBUTIONEnum = 3,
            
            /// <summary>
            /// Enum MACINSTALLERDISTRIBUTIONEnum for MAC_INSTALLER_DISTRIBUTION
            /// </summary>
            [EnumMember(Value = "MAC_INSTALLER_DISTRIBUTION")]
            MACINSTALLERDISTRIBUTIONEnum = 4,
            
            /// <summary>
            /// Enum MACAPPDEVELOPMENTEnum for MAC_APP_DEVELOPMENT
            /// </summary>
            [EnumMember(Value = "MAC_APP_DEVELOPMENT")]
            MACAPPDEVELOPMENTEnum = 5,
            
            /// <summary>
            /// Enum DEVELOPERIDKEXTEnum for DEVELOPER_ID_KEXT
            /// </summary>
            [EnumMember(Value = "DEVELOPER_ID_KEXT")]
            DEVELOPERIDKEXTEnum = 6,
            
            /// <summary>
            /// Enum DEVELOPERIDAPPLICATIONEnum for DEVELOPER_ID_APPLICATION
            /// </summary>
            [EnumMember(Value = "DEVELOPER_ID_APPLICATION")]
            DEVELOPERIDAPPLICATIONEnum = 7,
            
            /// <summary>
            /// Enum DEVELOPMENTEnum for DEVELOPMENT
            /// </summary>
            [EnumMember(Value = "DEVELOPMENT")]
            DEVELOPMENTEnum = 8,
            
            /// <summary>
            /// Enum DISTRIBUTIONEnum for DISTRIBUTION
            /// </summary>
            [EnumMember(Value = "DISTRIBUTION")]
            DISTRIBUTIONEnum = 9
        }
}