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
        /// An enum representing an unrated item.
        /// </summary>
        /// <value>An enum representing an unrated item.</value>
        [TypeConverter(typeof(CustomEnumConverter<UnratedItem>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum UnratedItem
        {
            
            /// <summary>
            /// Enum MovieEnum for Movie
            /// </summary>
            [EnumMember(Value = "Movie")]
            MovieEnum = 1,
            
            /// <summary>
            /// Enum TrailerEnum for Trailer
            /// </summary>
            [EnumMember(Value = "Trailer")]
            TrailerEnum = 2,
            
            /// <summary>
            /// Enum SeriesEnum for Series
            /// </summary>
            [EnumMember(Value = "Series")]
            SeriesEnum = 3,
            
            /// <summary>
            /// Enum MusicEnum for Music
            /// </summary>
            [EnumMember(Value = "Music")]
            MusicEnum = 4,
            
            /// <summary>
            /// Enum BookEnum for Book
            /// </summary>
            [EnumMember(Value = "Book")]
            BookEnum = 5,
            
            /// <summary>
            /// Enum LiveTvChannelEnum for LiveTvChannel
            /// </summary>
            [EnumMember(Value = "LiveTvChannel")]
            LiveTvChannelEnum = 6,
            
            /// <summary>
            /// Enum LiveTvProgramEnum for LiveTvProgram
            /// </summary>
            [EnumMember(Value = "LiveTvProgram")]
            LiveTvProgramEnum = 7,
            
            /// <summary>
            /// Enum ChannelContentEnum for ChannelContent
            /// </summary>
            [EnumMember(Value = "ChannelContent")]
            ChannelContentEnum = 8,
            
            /// <summary>
            /// Enum OtherEnum for Other
            /// </summary>
            [EnumMember(Value = "Other")]
            OtherEnum = 9
        }
}
