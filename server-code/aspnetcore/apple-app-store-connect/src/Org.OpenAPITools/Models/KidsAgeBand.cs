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
        /// Gets or Sets KidsAgeBand
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<KidsAgeBand>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum KidsAgeBand
        {
            
            /// <summary>
            /// Enum FIVEANDUNDEREnum for FIVE_AND_UNDER
            /// </summary>
            [EnumMember(Value = "FIVE_AND_UNDER")]
            FIVEANDUNDEREnum = 1,
            
            /// <summary>
            /// Enum SIXTOEIGHTEnum for SIX_TO_EIGHT
            /// </summary>
            [EnumMember(Value = "SIX_TO_EIGHT")]
            SIXTOEIGHTEnum = 2,
            
            /// <summary>
            /// Enum NINETOELEVENEnum for NINE_TO_ELEVEN
            /// </summary>
            [EnumMember(Value = "NINE_TO_ELEVEN")]
            NINETOELEVENEnum = 3
        }
}