/*
 * Docker Engine API
 *
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release of Docker, so API calls are versioned to ensure that clients don't break.  For Docker Engine 17.09, the API version is 1.32. To lock to this version, you prefix the URL with `/v1.32`. For example, calling `/info` is the same as calling `/v1.32/info`.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  In previous versions of Docker, it was possible to access the API without providing a version. This behaviour is now deprecated will be removed in a future version of Docker.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer Docker daemons.  This documentation is for version 1.33 of the API. Use this table to find documentation for previous versions of the API:  Docker version  | API version | Changes ----------------|-------------|--------- 17.09.x | [1.31](https://docs.docker.com/engine/api/v1.32/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-32-api-changes) 17.07.x | [1.31](https://docs.docker.com/engine/api/v1.31/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-31-api-changes) 17.06.x | [1.30](https://docs.docker.com/engine/api/v1.30/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-30-api-changes) 17.05.x | [1.29](https://docs.docker.com/engine/api/v1.29/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-29-api-changes) 17.04.x | [1.28](https://docs.docker.com/engine/api/v1.28/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-28-api-changes) 17.03.1 | [1.27](https://docs.docker.com/engine/api/v1.27/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-27-api-changes) 1.13.1 & 17.03.0 | [1.26](https://docs.docker.com/engine/api/v1.26/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-26-api-changes) 1.13.0 | [1.25](https://docs.docker.com/engine/api/v1.25/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-25-api-changes) 1.12.x | [1.24](https://docs.docker.com/engine/api/v1.24/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-24-api-changes) 1.11.x | [1.23](https://docs.docker.com/engine/api/v1.23/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-23-api-changes) 1.10.x | [1.22](https://docs.docker.com/engine/api/v1.22/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-22-api-changes) 1.9.x | [1.21](https://docs.docker.com/engine/api/v1.21/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-21-api-changes) 1.8.x | [1.20](https://docs.docker.com/engine/api/v1.20/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-20-api-changes) 1.7.x | [1.19](https://docs.docker.com/engine/api/v1.19/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-19-api-changes) 1.6.x | [1.18](https://docs.docker.com/engine/api/v1.18/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-18-api-changes)  # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a Base64 encoded (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * API version: 1.33
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// TaskSpecContainerSpec - Invalid when specified with `PluginSpec`.
type TaskSpecContainerSpec struct {

	// Arguments to the command.
	Args []string `json:"Args,omitempty"`

	// The command to be run in the image.
	Command []string `json:"Command,omitempty"`

	// Configs contains references to zero or more configs that will be exposed to the service.
	Configs []TaskSpecContainerSpecConfigsInner `json:"Configs,omitempty"`

	DNSConfig TaskSpecContainerSpecDnsConfig `json:"DNSConfig,omitempty"`

	// The working directory for commands to run in.
	Dir string `json:"Dir,omitempty"`

	// A list of environment variables in the form `VAR=value`.
	Env []string `json:"Env,omitempty"`

	// A list of additional groups that the container process will run as.
	Groups []string `json:"Groups,omitempty"`

	HealthCheck HealthConfig `json:"HealthCheck,omitempty"`

	// The hostname to use for the container, as a valid RFC 1123 hostname.
	Hostname string `json:"Hostname,omitempty"`

	// A list of hostname/IP mappings to add to the container's `hosts` file. The format of extra hosts is specified in the [hosts(5)](http://man7.org/linux/man-pages/man5/hosts.5.html) man page:      IP_address canonical_hostname [aliases...] 
	Hosts []string `json:"Hosts,omitempty"`

	// The image name to use for the container
	Image string `json:"Image,omitempty"`

	// User-defined key/value data.
	Labels map[string]string `json:"Labels,omitempty"`

	// Specification for mounts to be added to containers created as part of the service.
	Mounts []Mount `json:"Mounts,omitempty"`

	// Open `stdin`
	OpenStdin bool `json:"OpenStdin,omitempty"`

	Privileges TaskSpecContainerSpecPrivileges `json:"Privileges,omitempty"`

	// Mount the container's root filesystem as read only.
	ReadOnly bool `json:"ReadOnly,omitempty"`

	// Secrets contains references to zero or more secrets that will be exposed to the service.
	Secrets []TaskSpecContainerSpecSecretsInner `json:"Secrets,omitempty"`

	// Amount of time to wait for the container to terminate before forcefully killing it.
	StopGracePeriod int64 `json:"StopGracePeriod,omitempty"`

	// Signal to stop the container.
	StopSignal string `json:"StopSignal,omitempty"`

	// Whether a pseudo-TTY should be allocated.
	TTY bool `json:"TTY,omitempty"`

	// The user inside the container.
	User string `json:"User,omitempty"`
}

// AssertTaskSpecContainerSpecRequired checks if the required fields are not zero-ed
func AssertTaskSpecContainerSpecRequired(obj TaskSpecContainerSpec) error {
	for _, el := range obj.Configs {
		if err := AssertTaskSpecContainerSpecConfigsInnerRequired(el); err != nil {
			return err
		}
	}
	if err := AssertTaskSpecContainerSpecDnsConfigRequired(obj.DNSConfig); err != nil {
		return err
	}
	if err := AssertHealthConfigRequired(obj.HealthCheck); err != nil {
		return err
	}
	for _, el := range obj.Mounts {
		if err := AssertMountRequired(el); err != nil {
			return err
		}
	}
	if err := AssertTaskSpecContainerSpecPrivilegesRequired(obj.Privileges); err != nil {
		return err
	}
	for _, el := range obj.Secrets {
		if err := AssertTaskSpecContainerSpecSecretsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertTaskSpecContainerSpecConstraints checks if the values respects the defined constraints
func AssertTaskSpecContainerSpecConstraints(obj TaskSpecContainerSpec) error {
	return nil
}
