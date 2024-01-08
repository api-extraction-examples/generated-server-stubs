/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
        /// Enum PlayCommand.
        /// </summary>
        /// <value>Enum PlayCommand.</value>
        [TypeConverter(typeof(CustomEnumConverter<PlayCommand>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PlayCommand
        {
            
            /// <summary>
            /// Enum PlayNowEnum for PlayNow
            /// </summary>
            [EnumMember(Value = "PlayNow")]
            PlayNowEnum = 1,
            
            /// <summary>
            /// Enum PlayNextEnum for PlayNext
            /// </summary>
            [EnumMember(Value = "PlayNext")]
            PlayNextEnum = 2,
            
            /// <summary>
            /// Enum PlayLastEnum for PlayLast
            /// </summary>
            [EnumMember(Value = "PlayLast")]
            PlayLastEnum = 3,
            
            /// <summary>
            /// Enum PlayInstantMixEnum for PlayInstantMix
            /// </summary>
            [EnumMember(Value = "PlayInstantMix")]
            PlayInstantMixEnum = 4,
            
            /// <summary>
            /// Enum PlayShuffleEnum for PlayShuffle
            /// </summary>
            [EnumMember(Value = "PlayShuffle")]
            PlayShuffleEnum = 5
        }
}