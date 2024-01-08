/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a simple directory listing of all projects
* Get a simple directory listing of all projects
*
* returns Object
* */
const buildGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get a simple directory listing of all repositories for the specified project
* Get a simple directory listing of all repositories for the specified project
*
* projectUnderscorename String Project name
* returns Object
* */
const buildProjectNameGET = ({ projectUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscorename,
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
* Apply different actions on builds/build processes of the specified project
* Apply different actions on builds/build processes of the specified project
*
* cmd String **NOTE**: All commands described below, can be scoped to a package within the project by setting the `package` parameter.  * `wipe`: Delete all binaries build by the project. * `restartbuild`: Restart all running build processes inside the project. * `rebuild`: Trigger a rebuild of all packages inside the project. * `abortbuild`: Abort all running build processes for the specified project, marking them as failed. * `killbuild`: Alias for `abortbuild`. * `unpublish`: Delete all published package binaries, for the specified project, from the download repository. * `sendsysrq`: Send a single sysrq character to the kernel of a running build. Character need to be specified                through the `sysrq` parameter. Only a subset of debugging requests are supported (eg. 9, t or w). 
* package String Name of the package. Scope the commands to the specified package. (optional)
* arch String Name of the build architecture. Scope the commands to the specified architectures. (optional)
* repository String Name of the repository. Scope the commands to the specified repository. (optional)
* no response value expected for this operation
* */
const buildProjectNamePOST = ({ cmd, package, arch, repository }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        cmd,
        package,
        arch,
        repository,
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
* Show the build dependencies of packages that are part of the project.
* Show the build dependencies of packages that are part of the project, for a given repository and architecture. 
*
* package String Name of the package. Limit results to the specified package. (optional)
* view String * `pkgnames`: Show whole package dependencies, instead of individual binaries. * `revpkgnames`: Show which packages depend on the provided project/package for   the given repository/architecture, and therefore a rebuild gets triggered on change. * `order`: Show packages ordered by dependencies.  (optional)
* returns _build__project_name___repository_name___architecture_name___builddepinfo_get_200_response
* */
const buildProjectNameRepositoryNameArchitectureNameBuilddepinfoGET = ({ package, view }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        package,
        view,
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
* List binaries built by the sources of the specified package.
* List binaries built by the sources of the specified package.
*
* packageUnderscorename String Package name
* returns Object
* */
const buildProjectNameRepositoryNameArchitectureNamePackageNameGET = ({ packageUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        packageUnderscorename,
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
* Show the build status of a currently running build job.
* Show the build status of a currently running build job. Shows an empty result if no build job is running. 
*
* returns _build__project_name___repository_name___architecture_name___package_name___jobstatus_get_200_response
* */
const buildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Show the reason for the lastly triggered build.
* Details about the reason of the lastly triggered build.
*
* returns _build__project_name___repository_name___architecture_name___package_name___reason_get_200_response
* */
const buildProjectNameRepositoryNameArchitectureNamePackageNameReasonGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* List all binaries (produced by all packages of the given project).
* List all binaries (produced by all packages of the given project) for the specified repository and architecture. 
*
* returns _build__project_name___repository_name___architecture_name___repository_get_200_response
* */
const buildProjectNameRepositoryNameArchitectureNameRepositoryGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Show the build configuration for the specified repository.
* Show the build configuration for the specified repository. Includes all base package requirements, mappings and macros. 
*
* no response value expected for this operation
* */
const buildProjectNameRepositoryNameBuildconfigGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* List of all architectures the specified project builds against a given repository.
* List of all architectures the specified project builds against a given repository.
*
* repositoryUnderscorename String Repository name
* returns Object
* */
const buildProjectNameRepositoryNameGET = ({ repositoryUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        repositoryUnderscorename,
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
* Get the build results for packages, architectures and repositories of the specified project.
* Get the build results for packages, architectures and repositories of the specified project.
*
* view String Specify which sections should be included in the result list.  * `status`: Include detailed infos about the build status. **Default** * `summary`: Include the summary of the status values. * `binarylist`: Include a list of generated binary files.  (optional)
* package String Name of the package. Limit results to the specified package. (optional)
* arch String Name of the build architecture. Limit results to the specified build architecture. (optional)
* repository String Name of the repository. Limit results to the specified repository. (optional)
* lastbuild Boolean Show the last build result (excludes current building job states). (optional)
* locallink Boolean Include build results from packages with project local links. (optional)
* multibuild Boolean Include build results from _multibuild definitions. (optional)
* returns _build__project_name___result_get_200_response
* */
const buildProjectNameResultGET = ({ view, package, arch, repository, lastbuild, locallink, multibuild }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        view,
        package,
        arch,
        repository,
        lastbuild,
        locallink,
        multibuild,
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
* This endpoint returns information about some specific artifact
*
* returns getBuildProjectRepositoryArchPackageBuildinfo_200_response
* */
const getBuildProjectRepositoryArchPackageBuildinfo = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* This endpoint returns the build history for a specific artifact
*
* returns getBuildProjectRepositoryArchPackageHistory_200_response
* */
const getBuildProjectRepositoryArchPackageHistory = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* This endpoint returns the last log file for a specific build artifact
*
* no response value expected for this operation
* */
const getBuildProjectRepositoryArchPackageLog = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* This endpoint returns the building status for a specific artifact
*
* returns getBuildProjectRepositoryArchPackageStatus_200_response
* */
const getBuildProjectRepositoryArchPackageStatus = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Return a specific artifact file contents
* Given a project, repository, architecture and package, retrieve the given file's content. 
*
* fileUnderscorename String The file name
* returns File
* */
const getBuildProjectRepositoryArchitecturePackageFile = ({ fileUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscorename,
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
* This endpoint returns details about an specific artifact
* Given a project, repository, architecture and package, retrieve the given artifact's details. 
*
* view List 
* returns getBuildProjectRepositoryArchitecturePackageFileViewFileinfo_200_response
* */
const getBuildProjectRepositoryArchitecturePackageFileViewFileinfo = ({ view }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        view,
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
* Update a specific artifact file contents
* Given a project, repository, architecture and package, update the given file's content.  This is for Admins only. 
*
* packageUnderscorename List Package name
* body String  (optional)
* returns Object
* */
const putBuildProjectRepositoryArchitecturePackageFile = ({ packageUnderscorename, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        packageUnderscorename,
        body,
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
  buildGET,
  buildProjectNameGET,
  buildProjectNamePOST,
  buildProjectNameRepositoryNameArchitectureNameBuilddepinfoGET,
  buildProjectNameRepositoryNameArchitectureNamePackageNameGET,
  buildProjectNameRepositoryNameArchitectureNamePackageNameJobstatusGET,
  buildProjectNameRepositoryNameArchitectureNamePackageNameReasonGET,
  buildProjectNameRepositoryNameArchitectureNameRepositoryGET,
  buildProjectNameRepositoryNameBuildconfigGET,
  buildProjectNameRepositoryNameGET,
  buildProjectNameResultGET,
  getBuildProjectRepositoryArchPackageBuildinfo,
  getBuildProjectRepositoryArchPackageHistory,
  getBuildProjectRepositoryArchPackageLog,
  getBuildProjectRepositoryArchPackageStatus,
  getBuildProjectRepositoryArchitecturePackageFile,
  getBuildProjectRepositoryArchitecturePackageFileViewFileinfo,
  putBuildProjectRepositoryArchitecturePackageFile,
};
