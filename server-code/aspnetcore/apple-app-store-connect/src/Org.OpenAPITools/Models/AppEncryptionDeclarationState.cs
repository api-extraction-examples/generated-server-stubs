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
        /// Gets or Sets AppEncryptionDeclarationState
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<AppEncryptionDeclarationState>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AppEncryptionDeclarationState
        {
            
            /// <summary>
            /// Enum INREVIEWEnum for IN_REVIEW
            /// </summary>
            [EnumMember(Value = "IN_REVIEW")]
            INREVIEWEnum = 1,
            
            /// <summary>
            /// Enum APPROVEDEnum for APPROVED
            /// </summary>
            [EnumMember(Value = "APPROVED")]
            APPROVEDEnum = 2,
            
            /// <summary>
            /// Enum REJECTEDEnum for REJECTED
            /// </summary>
            [EnumMember(Value = "REJECTED")]
            REJECTEDEnum = 3,
            
            /// <summary>
            /// Enum INVALIDEnum for INVALID
            /// </summary>
            [EnumMember(Value = "INVALID")]
            INVALIDEnum = 4,
            
            /// <summary>
            /// Enum EXPIREDEnum for EXPIRED
            /// </summary>
            [EnumMember(Value = "EXPIRED")]
            EXPIREDEnum = 5
        }
}
