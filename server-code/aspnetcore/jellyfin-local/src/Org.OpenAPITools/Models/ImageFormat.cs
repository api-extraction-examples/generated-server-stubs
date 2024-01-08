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
        /// Enum ImageOutputFormat.
        /// </summary>
        /// <value>Enum ImageOutputFormat.</value>
        [TypeConverter(typeof(CustomEnumConverter<ImageFormat>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ImageFormat
        {
            
            /// <summary>
            /// Enum BmpEnum for Bmp
            /// </summary>
            [EnumMember(Value = "Bmp")]
            BmpEnum = 1,
            
            /// <summary>
            /// Enum GifEnum for Gif
            /// </summary>
            [EnumMember(Value = "Gif")]
            GifEnum = 2,
            
            /// <summary>
            /// Enum JpgEnum for Jpg
            /// </summary>
            [EnumMember(Value = "Jpg")]
            JpgEnum = 3,
            
            /// <summary>
            /// Enum PngEnum for Png
            /// </summary>
            [EnumMember(Value = "Png")]
            PngEnum = 4,
            
            /// <summary>
            /// Enum WebpEnum for Webp
            /// </summary>
            [EnumMember(Value = "Webp")]
            WebpEnum = 5
        }
}
