/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// MediaStream - Class MediaStream.
type MediaStream struct {

	// Gets or sets the aspect ratio.
	AspectRatio *string `json:"AspectRatio,omitempty"`

	// Gets or sets the average frame rate.
	AverageFrameRate *float32 `json:"AverageFrameRate,omitempty"`

	// Gets or sets the bit depth.
	BitDepth *int32 `json:"BitDepth,omitempty"`

	// Gets or sets the bit rate.
	BitRate *int32 `json:"BitRate,omitempty"`

	// Gets or sets the channel layout.
	ChannelLayout *string `json:"ChannelLayout,omitempty"`

	// Gets or sets the channels.
	Channels *int32 `json:"Channels,omitempty"`

	// Gets or sets the codec.
	Codec *string `json:"Codec,omitempty"`

	// Gets or sets the codec tag.
	CodecTag *string `json:"CodecTag,omitempty"`

	// Gets or sets the codec time base.
	CodecTimeBase *string `json:"CodecTimeBase,omitempty"`

	// Gets or sets the color primaries.
	ColorPrimaries *string `json:"ColorPrimaries,omitempty"`

	// Gets or sets the color range.
	ColorRange *string `json:"ColorRange,omitempty"`

	// Gets or sets the color space.
	ColorSpace *string `json:"ColorSpace,omitempty"`

	// Gets or sets the color transfer.
	ColorTransfer *string `json:"ColorTransfer,omitempty"`

	// Gets or sets the comment.
	Comment *string `json:"Comment,omitempty"`

	DeliveryMethod SubtitleDeliveryMethod `json:"DeliveryMethod,omitempty"`

	// Gets or sets the delivery URL.
	DeliveryUrl *string `json:"DeliveryUrl,omitempty"`

	DisplayTitle *string `json:"DisplayTitle,omitempty"`

	// Gets or sets the height.
	Height *int32 `json:"Height,omitempty"`

	// Gets or sets the index.
	Index int32 `json:"Index,omitempty"`

	IsAVC *bool `json:"IsAVC,omitempty"`

	// Gets a value indicating whether this instance is anamorphic.
	IsAnamorphic *bool `json:"IsAnamorphic,omitempty"`

	// Gets or sets a value indicating whether this instance is default.
	IsDefault bool `json:"IsDefault,omitempty"`

	// Gets or sets a value indicating whether this instance is external.
	IsExternal bool `json:"IsExternal,omitempty"`

	// Gets or sets a value indicating whether this instance is external URL.
	IsExternalUrl *bool `json:"IsExternalUrl,omitempty"`

	// Gets or sets a value indicating whether this instance is forced.
	IsForced bool `json:"IsForced,omitempty"`

	// Gets or sets a value indicating whether this instance is interlaced.
	IsInterlaced bool `json:"IsInterlaced,omitempty"`

	IsTextSubtitleStream bool `json:"IsTextSubtitleStream,omitempty"`

	// Gets or sets the language.
	Language *string `json:"Language,omitempty"`

	// Gets or sets the level.
	Level *float64 `json:"Level,omitempty"`

	NalLengthSize *string `json:"NalLengthSize,omitempty"`

	// Gets or sets the length of the packet.
	PacketLength *int32 `json:"PacketLength,omitempty"`

	// Gets or sets the filename.
	Path *string `json:"Path,omitempty"`

	// Gets or sets the pixel format.
	PixelFormat *string `json:"PixelFormat,omitempty"`

	// Gets or sets the profile.
	Profile *string `json:"Profile,omitempty"`

	// Gets or sets the real frame rate.
	RealFrameRate *float32 `json:"RealFrameRate,omitempty"`

	// Gets or sets the reference frames.
	RefFrames *int32 `json:"RefFrames,omitempty"`

	// Gets or sets the sample rate.
	SampleRate *int32 `json:"SampleRate,omitempty"`

	// Gets or sets the score.
	Score *int32 `json:"Score,omitempty"`

	// Gets or sets a value indicating whether [supports external stream].
	SupportsExternalStream bool `json:"SupportsExternalStream,omitempty"`

	// Gets or sets the time base.
	TimeBase *string `json:"TimeBase,omitempty"`

	// Gets or sets the title.
	Title *string `json:"Title,omitempty"`

	Type MediaStreamType `json:"Type,omitempty"`

	// Gets or sets the video range.
	VideoRange *string `json:"VideoRange,omitempty"`

	// Gets or sets the width.
	Width *int32 `json:"Width,omitempty"`

	LocalizedDefault *string `json:"localizedDefault,omitempty"`

	LocalizedForced *string `json:"localizedForced,omitempty"`

	LocalizedUndefined *string `json:"localizedUndefined,omitempty"`
}
