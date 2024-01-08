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
        /// Gets or Sets ChannelMediaContentType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ChannelMediaContentType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ChannelMediaContentType
        {
            
            /// <summary>
            /// Enum ClipEnum for Clip
            /// </summary>
            [EnumMember(Value = "Clip")]
            ClipEnum = 1,
            
            /// <summary>
            /// Enum PodcastEnum for Podcast
            /// </summary>
            [EnumMember(Value = "Podcast")]
            PodcastEnum = 2,
            
            /// <summary>
            /// Enum TrailerEnum for Trailer
            /// </summary>
            [EnumMember(Value = "Trailer")]
            TrailerEnum = 3,
            
            /// <summary>
            /// Enum MovieEnum for Movie
            /// </summary>
            [EnumMember(Value = "Movie")]
            MovieEnum = 4,
            
            /// <summary>
            /// Enum EpisodeEnum for Episode
            /// </summary>
            [EnumMember(Value = "Episode")]
            EpisodeEnum = 5,
            
            /// <summary>
            /// Enum SongEnum for Song
            /// </summary>
            [EnumMember(Value = "Song")]
            SongEnum = 6,
            
            /// <summary>
            /// Enum MovieExtraEnum for MovieExtra
            /// </summary>
            [EnumMember(Value = "MovieExtra")]
            MovieExtraEnum = 7,
            
            /// <summary>
            /// Enum TvExtraEnum for TvExtra
            /// </summary>
            [EnumMember(Value = "TvExtra")]
            TvExtraEnum = 8
        }
}