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
        /// Enum MediaStreamType.
        /// </summary>
        /// <value>Enum MediaStreamType.</value>
        [TypeConverter(typeof(CustomEnumConverter<MediaStreamType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum MediaStreamType
        {
            
            /// <summary>
            /// Enum AudioEnum for Audio
            /// </summary>
            [EnumMember(Value = "Audio")]
            AudioEnum = 1,
            
            /// <summary>
            /// Enum VideoEnum for Video
            /// </summary>
            [EnumMember(Value = "Video")]
            VideoEnum = 2,
            
            /// <summary>
            /// Enum SubtitleEnum for Subtitle
            /// </summary>
            [EnumMember(Value = "Subtitle")]
            SubtitleEnum = 3,
            
            /// <summary>
            /// Enum EmbeddedImageEnum for EmbeddedImage
            /// </summary>
            [EnumMember(Value = "EmbeddedImage")]
            EmbeddedImageEnum = 4
        }
}