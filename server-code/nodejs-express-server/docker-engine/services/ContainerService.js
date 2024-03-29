/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get an archive of a filesystem resource in a container
* Get a tar archive of a resource in the filesystem of container id.
*
* id String ID or name of the container
* path String Resource in the container’s filesystem to archive.
* no response value expected for this operation
* */
const containerArchive = ({ id, path }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        path,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get information about files in a container
* A response header `X-Docker-Container-Path-Stat` is return containing a base64 - encoded JSON object with some filesystem header information about the path.
*
* id String ID or name of the container
* path String Resource in the container’s filesystem to archive.
* no response value expected for this operation
* */
const containerArchiveInfo = ({ id, path }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        path,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Attach to a container
* Attach to a container to read its output or send it input. You can attach to the same container multiple times and you can reattach to containers that have been detached.  Either the `stream` or `logs` parameter must be `true` for this endpoint to do anything.  See [the documentation for the `docker attach` command](https://docs.docker.com/engine/reference/commandline/attach/) for more details.  ### Hijacking  This endpoint hijacks the HTTP connection to transport `stdin`, `stdout`, and `stderr` on the same socket.  This is the response from the daemon for an attach request:  ``` HTTP/1.1 200 OK Content-Type: application/vnd.docker.raw-stream  [STREAM] ```  After the headers and two new lines, the TCP connection can now be used for raw, bidirectional communication between the client and server.  To hint potential proxies about connection hijacking, the Docker client can also optionally send connection upgrade headers.  For example, the client sends this request to upgrade the connection:  ``` POST /containers/16253994b7c4/attach?stream=1&stdout=1 HTTP/1.1 Upgrade: tcp Connection: Upgrade ```  The Docker daemon will respond with a `101 UPGRADED` response, and will similarly follow with the raw stream:  ``` HTTP/1.1 101 UPGRADED Content-Type: application/vnd.docker.raw-stream Connection: Upgrade Upgrade: tcp  [STREAM] ```  ### Stream format  When the TTY setting is disabled in [`POST /containers/create`](#operation/ContainerCreate), the stream over the hijacked connected is multiplexed to separate out `stdout` and `stderr`. The stream consists of a series of frames, each containing a header and a payload.  The header contains the information which the stream writes (`stdout` or `stderr`). It also contains the size of the associated frame encoded in the last four bytes (`uint32`).  It is encoded on the first eight bytes like this:  ```go header := [8]byte{STREAM_TYPE, 0, 0, 0, SIZE1, SIZE2, SIZE3, SIZE4} ```  `STREAM_TYPE` can be:  - 0: `stdin` (is written on `stdout`) - 1: `stdout` - 2: `stderr`  `SIZE1, SIZE2, SIZE3, SIZE4` are the four bytes of the `uint32` size encoded as big endian.  Following the header is the payload, which is the specified number of bytes of `STREAM_TYPE`.  The simplest way to implement this protocol is the following:  1. Read 8 bytes. 2. Choose `stdout` or `stderr` depending on the first byte. 3. Extract the frame size from the last four bytes. 4. Read the extracted size and output it on the correct output. 5. Goto 1.  ### Stream format when using a TTY  When the TTY setting is enabled in [`POST /containers/create`](#operation/ContainerCreate), the stream is not multiplexed. The data exchanged over the hijacked connection is simply the raw data from the process PTY and client's `stdin`. 
*
* id String ID or name of the container
* detachKeys String Override the key sequence for detaching a container.Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`. (optional)
* logs Boolean Replay previous logs from the container.  This is useful for attaching to a container that has started and you want to output everything since the container started.  If `stream` is also enabled, once all the previous output has been returned, it will seamlessly transition into streaming current output.  (optional)
* stream Boolean Stream attached streams from the time the request was made onwards (optional)
* stdin Boolean Attach to `stdin` (optional)
* stdout Boolean Attach to `stdout` (optional)
* stderr Boolean Attach to `stderr` (optional)
* no response value expected for this operation
* */
const containerAttach = ({ id, detachKeys, logs, stream, stdin, stdout, stderr }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        detachKeys,
        logs,
        stream,
        stdin,
        stdout,
        stderr,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Attach to a container via a websocket
*
* id String ID or name of the container
* detachKeys String Override the key sequence for detaching a container.Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,`, or `_`. (optional)
* logs Boolean Return logs (optional)
* stream Boolean Return stream (optional)
* stdin Boolean Attach to `stdin` (optional)
* stdout Boolean Attach to `stdout` (optional)
* stderr Boolean Attach to `stderr` (optional)
* no response value expected for this operation
* */
const containerAttachWebsocket = ({ id, detachKeys, logs, stream, stdin, stdout, stderr }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        detachKeys,
        logs,
        stream,
        stdin,
        stdout,
        stderr,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get changes on a container’s filesystem
* Returns which files in a container's filesystem have been added, deleted, or modified. The `Kind` of modification can be one of:  - `0`: Modified - `1`: Added - `2`: Deleted 
*
* id String ID or name of the container
* returns List
* */
const containerChanges = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a container
*
* containerCreateRequest ContainerCreateRequest Container to create
* name String Assign the specified name to the container. Must match `/?[a-zA-Z0-9_-]+`. (optional)
* returns ContainerCreate_201_response
* */
const containerCreate = ({ containerCreateRequest, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        containerCreateRequest,
        name,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove a container
*
* id String ID or name of the container
* v Boolean Remove the volumes associated with the container. (optional)
* force Boolean If the container is running, kill it before removing it. (optional)
* link Boolean Remove the specified link associated with the container. (optional)
* no response value expected for this operation
* */
const containerDelete = ({ id, v, force, link }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        v,
        force,
        link,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Export a container
* Export the contents of a container as a tarball.
*
* id String ID or name of the container
* no response value expected for this operation
* */
const containerExport = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Inspect a container
* Return low-level information about a container.
*
* id String ID or name of the container
* size Boolean Return the size of container as fields `SizeRw` and `SizeRootFs` (optional)
* returns ContainerInspect_200_response
* */
const containerInspect = ({ id, size }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        size,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Kill a container
* Send a POSIX signal to a container, defaulting to killing to the container.
*
* id String ID or name of the container
* signal String Signal to send to the container as an integer or string (e.g. `SIGINT`) (optional)
* no response value expected for this operation
* */
const containerKill = ({ id, signal }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        signal,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List containers
* Returns a list of containers. For details on the format, see [the inspect endpoint](#operation/ContainerInspect).  Note that it uses a different, smaller representation of a container than inspecting a single container. For example, the list of linked containers is not propagated . 
*
* all Boolean Return all containers. By default, only running containers are shown (optional)
* limit Integer Return this number of most recently created containers, including non-running ones. (optional)
* size Boolean Return the size of container as fields `SizeRw` and `SizeRootFs`. (optional)
* filters String Filters to process on the container list, encoded as JSON (a `map[string][]string`). For example, `{\"status\": [\"paused\"]}` will only return paused containers. Available filters:  - `ancestor`=(`<image-name>[:<tag>]`, `<image id>`, or `<image@digest>`) - `before`=(`<container id>` or `<container name>`) - `expose`=(`<port>[/<proto>]`|`<startport-endport>/[<proto>]`) - `exited=<int>` containers with exit code of `<int>` - `health`=(`starting`|`healthy`|`unhealthy`|`none`) - `id=<ID>` a container's ID - `isolation=`(`default`|`process`|`hyperv`) (Windows daemon only) - `is-task=`(`true`|`false`) - `label=key` or `label=\"key=value\"` of a container label - `name=<name>` a container's name - `network`=(`<network id>` or `<network name>`) - `publish`=(`<port>[/<proto>]`|`<startport-endport>/[<proto>]`) - `since`=(`<container id>` or `<container name>`) - `status=`(`created`|`restarting`|`running`|`removing`|`paused`|`exited`|`dead`) - `volume`=(`<volume name>` or `<mount point destination>`)  (optional)
* returns List
* */
const containerList = ({ all, limit, size, filters }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        all,
        limit,
        size,
        filters,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get container logs
* Get `stdout` and `stderr` logs from a container.  Note: This endpoint works only for containers with the `json-file` or `journald` logging driver. 
*
* id String ID or name of the container
* follow Boolean Return the logs as a stream.  This will return a `101` HTTP response with a `Connection: upgrade` header, then hijack the HTTP connection to send raw output. For more information about hijacking and the stream format, [see the documentation for the attach endpoint](#operation/ContainerAttach).  (optional)
* stdout Boolean Return logs from `stdout` (optional)
* stderr Boolean Return logs from `stderr` (optional)
* since Integer Only return logs since this time, as a UNIX timestamp (optional)
* timestamps Boolean Add timestamps to every log line (optional)
* tail String Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. (optional)
* returns String
* */
const containerLogs = ({ id, follow, stdout, stderr, since, timestamps, tail }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        follow,
        stdout,
        stderr,
        since,
        timestamps,
        tail,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Pause a container
* Use the cgroups freezer to suspend all processes in a container.  Traditionally, when suspending a process the `SIGSTOP` signal is used, which is observable by the process being suspended. With the cgroups freezer the process is unaware, and unable to capture, that it is being suspended, and subsequently resumed. 
*
* id String ID or name of the container
* no response value expected for this operation
* */
const containerPause = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete stopped containers
*
* filters String Filters to process on the prune list, encoded as JSON (a `map[string][]string`).  Available filters: - `until=<timestamp>` Prune containers created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time. - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune containers with (or without, in case `label!=...` is used) the specified labels.  (optional)
* returns ContainerPrune_200_response
* */
const containerPrune = ({ filters }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filters,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Rename a container
*
* id String ID or name of the container
* name String New name for the container
* no response value expected for this operation
* */
const containerRename = ({ id, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        name,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Resize a container TTY
* Resize the TTY for a container. You must restart the container for the resize to take effect.
*
* id String ID or name of the container
* h Integer Height of the tty session in characters (optional)
* w Integer Width of the tty session in characters (optional)
* no response value expected for this operation
* */
const containerResize = ({ id, h, w }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        h,
        w,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Restart a container
*
* id String ID or name of the container
* t Integer Number of seconds to wait before killing the container (optional)
* no response value expected for this operation
* */
const containerRestart = ({ id, t }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        t,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Start a container
*
* id String ID or name of the container
* detachKeys String Override the key sequence for detaching a container. Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`. (optional)
* no response value expected for this operation
* */
const containerStart = ({ id, detachKeys }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        detachKeys,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get container stats based on resource usage
* This endpoint returns a live stream of a container’s resource usage statistics.  The `precpu_stats` is the CPU statistic of last read, which is used for calculating the CPU usage percentage. It is not the same as the `cpu_stats` field.  If either `precpu_stats.online_cpus` or `cpu_stats.online_cpus` is nil then for compatibility with older daemons the length of the corresponding `cpu_usage.percpu_usage` array should be used. 
*
* id String ID or name of the container
* stream Boolean Stream the output. If false, the stats will be output once and then it will disconnect. (optional)
* returns Object
* */
const containerStats = ({ id, stream }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        stream,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Stop a container
*
* id String ID or name of the container
* t Integer Number of seconds to wait before killing the container (optional)
* no response value expected for this operation
* */
const containerStop = ({ id, t }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        t,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List processes running inside a container
* On Unix systems, this is done by running the `ps` command. This endpoint is not supported on Windows.
*
* id String ID or name of the container
* psUnderscoreargs String The arguments to pass to `ps`. For example, `aux` (optional)
* returns ContainerTop_200_response
* */
const containerTop = ({ id, psUnderscoreargs }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        psUnderscoreargs,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unpause a container
* Resume a container which has been paused.
*
* id String ID or name of the container
* no response value expected for this operation
* */
const containerUnpause = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update a container
* Change various configuration options of a container without having to recreate it.
*
* id String ID or name of the container
* containerUpdateRequest ContainerUpdateRequest 
* returns ContainerUpdate_200_response
* */
const containerUpdate = ({ id, containerUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        containerUpdateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Wait for a container
* Block until a container stops, then returns the exit code.
*
* id String ID or name of the container
* condition String Wait until a container state reaches the given condition, either 'not-running' (default), 'next-exit', or 'removed'. (optional)
* returns ContainerWait_200_response
* */
const containerWait = ({ id, condition }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        condition,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Extract an archive of files or folders to a directory in a container
* Upload a tar archive to be extracted to a path in the filesystem of container id.
*
* id String ID or name of the container
* path String Path to a directory in the container to extract the archive’s contents into. 
* body String The input stream must be a tar archive compressed with one of the following algorithms: identity (no compression), gzip, bzip2, xz.
* noOverwriteDirNonDir String If “1”, “true”, or “True” then it will be an error if unpacking the given content would cause an existing directory to be replaced with a non-directory and vice versa. (optional)
* no response value expected for this operation
* */
const putContainerArchive = ({ id, path, body, noOverwriteDirNonDir }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        path,
        body,
        noOverwriteDirNonDir,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  containerArchive,
  containerArchiveInfo,
  containerAttach,
  containerAttachWebsocket,
  containerChanges,
  containerCreate,
  containerDelete,
  containerExport,
  containerInspect,
  containerKill,
  containerList,
  containerLogs,
  containerPause,
  containerPrune,
  containerRename,
  containerResize,
  containerRestart,
  containerStart,
  containerStats,
  containerStop,
  containerTop,
  containerUnpause,
  containerUpdate,
  containerWait,
  putContainerArchive,
};
