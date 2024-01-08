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
        /// Gets or Sets CodecType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<CodecType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CodecType
        {
            
            /// <summary>
            /// Enum VideoEnum for Video
            /// </summary>
            [EnumMember(Value = "Video")]
            VideoEnum = 1,
            
            /// <summary>
            /// Enum VideoAudioEnum for VideoAudio
            /// </summary>
            [EnumMember(Value = "VideoAudio")]
            VideoAudioEnum = 2,
            
            /// <summary>
            /// Enum AudioEnum for Audio
            /// </summary>
            [EnumMember(Value = "Audio")]
            AudioEnum = 3
        }
}