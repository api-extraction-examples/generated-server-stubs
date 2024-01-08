/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// SystemInfo - Class SystemInfo.
type SystemInfo struct {

	// Gets or sets the cache path.
	CachePath *string `json:"CachePath,omitempty"`

	CanLaunchWebBrowser bool `json:"CanLaunchWebBrowser,omitempty"`

	// Gets or sets a value indicating whether this instance can self restart.
	CanSelfRestart bool `json:"CanSelfRestart,omitempty"`

	// Gets or sets the completed installations.
	CompletedInstallations *[]InstallationInfo `json:"CompletedInstallations,omitempty"`

	EncoderLocation FFmpegLocation `json:"EncoderLocation,omitempty"`

	// Gets or sets a value indicating whether this instance has pending restart.
	HasPendingRestart bool `json:"HasPendingRestart,omitempty"`

	// Gets or sets a value indicating whether this instance has update available.
	HasUpdateAvailable bool `json:"HasUpdateAvailable,omitempty"`

	// Gets or sets the id.
	Id *string `json:"Id,omitempty"`

	// Gets or sets the internal metadata path.
	InternalMetadataPath *string `json:"InternalMetadataPath,omitempty"`

	IsShuttingDown bool `json:"IsShuttingDown,omitempty"`

	// Gets or sets the items by name path.
	ItemsByNamePath *string `json:"ItemsByNamePath,omitempty"`

	// Gets or sets the local address.
	LocalAddress *string `json:"LocalAddress,omitempty"`

	// Gets or sets the log path.
	LogPath *string `json:"LogPath,omitempty"`

	// Gets or sets the operating system.
	OperatingSystem *string `json:"OperatingSystem,omitempty"`

	// Gets or sets the display name of the operating system.
	OperatingSystemDisplayName *string `json:"OperatingSystemDisplayName,omitempty"`

	// Get or sets the package name.
	PackageName *string `json:"PackageName,omitempty"`

	// Gets or sets the product name. This is the AssemblyProduct name.
	ProductName *string `json:"ProductName,omitempty"`

	// Gets or sets the program data path.
	ProgramDataPath *string `json:"ProgramDataPath,omitempty"`

	// Gets or sets the name of the server.
	ServerName *string `json:"ServerName,omitempty"`

	// Gets or sets a value indicating whether the startup wizard is completed.
	StartupWizardCompleted *bool `json:"StartupWizardCompleted,omitempty"`

	// Gets or sets a value indicating whether [supports library monitor].
	SupportsLibraryMonitor bool `json:"SupportsLibraryMonitor,omitempty"`

	SystemArchitecture Architecture `json:"SystemArchitecture,omitempty"`

	// Gets or sets the transcode path.
	TranscodingTempPath *string `json:"TranscodingTempPath,omitempty"`

	// Gets or sets the server version.
	Version *string `json:"Version,omitempty"`

	// Gets or sets the web UI resources path.
	WebPath *string `json:"WebPath,omitempty"`

	// Gets or sets the web socket port number.
	WebSocketPortNumber int32 `json:"WebSocketPortNumber,omitempty"`
}