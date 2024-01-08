/*
 * Docker Engine API
 *
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release of Docker, so API calls are versioned to ensure that clients don't break.  For Docker Engine 17.09, the API version is 1.32. To lock to this version, you prefix the URL with `/v1.32`. For example, calling `/info` is the same as calling `/v1.32/info`.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  In previous versions of Docker, it was possible to access the API without providing a version. This behaviour is now deprecated will be removed in a future version of Docker.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer Docker daemons.  This documentation is for version 1.33 of the API. Use this table to find documentation for previous versions of the API:  Docker version  | API version | Changes ----------------|-------------|--------- 17.09.x | [1.31](https://docs.docker.com/engine/api/v1.32/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-32-api-changes) 17.07.x | [1.31](https://docs.docker.com/engine/api/v1.31/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-31-api-changes) 17.06.x | [1.30](https://docs.docker.com/engine/api/v1.30/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-30-api-changes) 17.05.x | [1.29](https://docs.docker.com/engine/api/v1.29/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-29-api-changes) 17.04.x | [1.28](https://docs.docker.com/engine/api/v1.28/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-28-api-changes) 17.03.1 | [1.27](https://docs.docker.com/engine/api/v1.27/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-27-api-changes) 1.13.1 & 17.03.0 | [1.26](https://docs.docker.com/engine/api/v1.26/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-26-api-changes) 1.13.0 | [1.25](https://docs.docker.com/engine/api/v1.25/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-25-api-changes) 1.12.x | [1.24](https://docs.docker.com/engine/api/v1.24/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-24-api-changes) 1.11.x | [1.23](https://docs.docker.com/engine/api/v1.23/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-23-api-changes) 1.10.x | [1.22](https://docs.docker.com/engine/api/v1.22/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-22-api-changes) 1.9.x | [1.21](https://docs.docker.com/engine/api/v1.21/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-21-api-changes) 1.8.x | [1.20](https://docs.docker.com/engine/api/v1.20/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-20-api-changes) 1.7.x | [1.19](https://docs.docker.com/engine/api/v1.19/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-19-api-changes) 1.6.x | [1.18](https://docs.docker.com/engine/api/v1.18/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-18-api-changes)  # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a Base64 encoded (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * API version: 1.33
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type SystemInfo struct {

	// Hardware architecture of the host, as returned by the Go runtime (`GOARCH`).  A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). 
	Architecture string `json:"Architecture,omitempty"`

	// Indicates if `bridge-nf-call-ip6tables` is available on the host.
	BridgeNfIp6tables bool `json:"BridgeNfIp6tables,omitempty"`

	// Indicates if `bridge-nf-call-iptables` is available on the host.
	BridgeNfIptables bool `json:"BridgeNfIptables,omitempty"`

	// Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt) 
	CPUSet bool `json:"CPUSet,omitempty"`

	// Indicates if CPU Shares limiting is supported by the host.
	CPUShares bool `json:"CPUShares,omitempty"`

	// The driver to use for managing cgroups. 
	CgroupDriver string `json:"CgroupDriver,omitempty"`

	// The network endpoint that the Engine advertises for the purpose of node discovery. ClusterAdvertise is a `host:port` combination on which the daemon is reachable by other hosts.  <p><br /></p>  > **Note**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty. 
	ClusterAdvertise string `json:"ClusterAdvertise,omitempty"`

	// URL of the distributed storage backend.   The storage backend is used for multihost networking (to store network and endpoint information) and by the node discovery mechanism.  <p><br /></p>  > **Note**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty. 
	ClusterStore string `json:"ClusterStore,omitempty"`

	ContainerdCommit Commit `json:"ContainerdCommit,omitempty"`

	// Total number of containers on the host.
	Containers int32 `json:"Containers,omitempty"`

	// Number of containers with status `\"paused\"`. 
	ContainersPaused int32 `json:"ContainersPaused,omitempty"`

	// Number of containers with status `\"running\"`. 
	ContainersRunning int32 `json:"ContainersRunning,omitempty"`

	// Number of containers with status `\"stopped\"`. 
	ContainersStopped int32 `json:"ContainersStopped,omitempty"`

	// Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host.
	CpuCfsPeriod bool `json:"CpuCfsPeriod,omitempty"`

	// Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host.
	CpuCfsQuota bool `json:"CpuCfsQuota,omitempty"`

	// Indicates if the daemon is running in debug-mode / with debug-level logging enabled.
	Debug bool `json:"Debug,omitempty"`

	// Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time. 
	DefaultRuntime string `json:"DefaultRuntime,omitempty"`

	// Root directory of persistent Docker state.  Defaults to `/var/lib/docker` on Linux, and `C:\\ProgramData\\docker` on Windows. 
	DockerRootDir string `json:"DockerRootDir,omitempty"`

	// Name of the storage driver in use.
	Driver string `json:"Driver,omitempty"`

	// Information specific to the storage driver, provided as \"label\" / \"value\" pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of `docker info` on the command line.  <p><br /></p>  > **Note**: The information returned in this field, including the > formatting of values and labels, should not be considered stable, > and may change without notice. 
	DriverStatus [][]string `json:"DriverStatus,omitempty"`

	// Indicates if experimental features are enabled on the daemon. 
	ExperimentalBuild bool `json:"ExperimentalBuild,omitempty"`

	// User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`)
	GenericResources []GenericResourcesInner `json:"GenericResources,omitempty"`

	// HTTP-proxy configured for the daemon. This value is obtained from the [`HTTP_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. 
	HttpProxy string `json:"HttpProxy,omitempty"`

	// HTTPS-proxy configured for the daemon. This value is obtained from the [`HTTPS_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. 
	HttpsProxy string `json:"HttpsProxy,omitempty"`

	// Unique identifier of the daemon.  <p><br /></p>  > **Note**: The format of the ID itself is not part of the API, and > should not be considered stable. 
	ID string `json:"ID,omitempty"`

	// Indicates IPv4 forwarding is enabled.
	IPv4Forwarding bool `json:"IPv4Forwarding,omitempty"`

	// Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted. 
	Images int32 `json:"Images,omitempty"`

	// Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud. 
	IndexServerAddress string `json:"IndexServerAddress,omitempty"`

	// Name and, optional, path of the the `docker-init` binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. 
	InitBinary string `json:"InitBinary,omitempty"`

	InitCommit Commit `json:"InitCommit,omitempty"`

	// Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms. 
	Isolation string `json:"Isolation,omitempty"`

	// Indicates if the host has kernel memory limit support enabled.
	KernelMemory bool `json:"KernelMemory,omitempty"`

	// Kernel version of the host.  On Linux, this information obtained from `uname`. On Windows this information is queried from the <kbd>HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\</kbd> registry value, for example _\"10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\"_. 
	KernelVersion string `json:"KernelVersion,omitempty"`

	// User-defined labels (key/value metadata) as set on the daemon.  <p><br /></p>  > **Note**: When part of a Swarm, nodes can both have _daemon_ labels, > set through the daemon configuration, and _node_ labels, set from a > manager node in the Swarm. Node labels are not included in this > field. Node labels can be retrieved using the `/nodes/(id)` endpoint > on a manager node in the Swarm. 
	Labels []string `json:"Labels,omitempty"`

	// Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected. 
	LiveRestoreEnabled bool `json:"LiveRestoreEnabled,omitempty"`

	// The logging driver to use as a default for new containers. 
	LoggingDriver string `json:"LoggingDriver,omitempty"`

	// Total amount of physical memory available on the host, in kilobytes (kB). 
	MemTotal int64 `json:"MemTotal,omitempty"`

	// Indicates if the host has memory limit support enabled.
	MemoryLimit bool `json:"MemoryLimit,omitempty"`

	// The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected. 
	NCPU int32 `json:"NCPU,omitempty"`

	// Number of event listeners subscribed.
	NEventsListener int32 `json:"NEventsListener,omitempty"`

	// The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled. 
	NFd int32 `json:"NFd,omitempty"`

	// The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled. 
	NGoroutines int32 `json:"NGoroutines,omitempty"`

	// Hostname of the host.
	Name string `json:"Name,omitempty"`

	// Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [`NO_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. 
	NoProxy string `json:"NoProxy,omitempty"`

	// Generic type of the operating system of the host, as returned by the Go runtime (`GOOS`).  Currently returned values are \"linux\" and \"windows\". A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). 
	OSType string `json:"OSType,omitempty"`

	// Indicates if OOM killer disable is supported on the host.
	OomKillDisable bool `json:"OomKillDisable,omitempty"`

	// Name of the host's operating system, for example: \"Ubuntu 16.04.2 LTS\" or \"Windows Server 2016 Datacenter\" 
	OperatingSystem string `json:"OperatingSystem,omitempty"`

	Plugins PluginsInfo `json:"Plugins,omitempty"`

	RegistryConfig *RegistryServiceConfig `json:"RegistryConfig,omitempty"`

	RuncCommit Commit `json:"RuncCommit,omitempty"`

	// List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \"name\" used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the `containerd` daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is `runc`, and automatically configured. Additional runtimes can be configured by the user and will be listed here. 
	Runtimes map[string]Runtime `json:"Runtimes,omitempty"`

	// List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, and user-namespaces (userns).  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs. 
	SecurityOptions []string `json:"SecurityOptions,omitempty"`

	// Version string of the daemon.  > **Note**: the [standalone Swarm API](https://docs.docker.com/swarm/swarm-api/) > returns the Swarm version instead of the daemon  version, for example > `swarm/1.2.8`. 
	ServerVersion string `json:"ServerVersion,omitempty"`

	// Indicates if the host has memory swap limit support enabled.
	SwapLimit bool `json:"SwapLimit,omitempty"`

	Swarm SwarmInfo `json:"Swarm,omitempty"`

	// Status information about this node (standalone Swarm API).  <p><br /></p>  > **Note**: The information returned in this field is only propagated > by the Swarm standalone API, and is empty (`null`) when using > built-in swarm mode. 
	SystemStatus [][]string `json:"SystemStatus,omitempty"`

	// Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
	SystemTime string `json:"SystemTime,omitempty"`
}
