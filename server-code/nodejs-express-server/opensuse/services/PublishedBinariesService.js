/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List all the published projects.
* Get a list of all the projects, all of them are considered published. 
*
* returns Object
* */
const publishedGET = () => new Promise(
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
* List the repositories of a project with published binaries
* Get a list of the repositories of the project that already have published binaries. 
*
* returns Object
* */
const publishedProjectNameGET = () => new Promise(
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
* Return the binary file itself.
* Allow to download the binary file that was published and stored under the directory given by project/repository/architecture/. Can response with Media Types like application/x-rpm, text/xml, etc. NOTE: Use this only if you absolutely have to, as it doesn't use the redirector. 
*
* binaryUnderscorefilename String Binary filename
* returns File
* */
const publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGET = ({ binaryUnderscorefilename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        binaryUnderscorefilename,
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
* Generate a ymp pattern that includes the needed repositories to install the given binary.
* Generate a ymp pattern, which contains the list of packages needed for intalling certain software without having to create dependencies between them. Read more about patterns [in this tutorial](https://en.opensuse.org/openSUSE:Build_Service_Tutorial#Create_Patterns). 
*
* returns _published__project_name___repository_name___architecture_name___binary_filename__view_ymp_get_200_response
* */
const publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGET = () => new Promise(
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
* List the content of the directory tree where the binaries are published at the level project/repository/architecture.
* Get a list of binaries and other files present at the level project/repository/architecture of the directory tree as a result of successful building and publishing processes. 
*
* returns Object
* */
const publishedProjectNameRepositoryNameArchitectureNameGET = () => new Promise(
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
* List the content of the directory tree where the binaries are published at the level project/repository.
* Get a list of architectures' directories and other files (.repo, .ymp, etc.) present at the level project/repository of the directory tree where the published binaries are stored. 
*
* returns Object
* */
const publishedProjectNameRepositoryNameGET = () => new Promise(
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
* Present information about the last publication of the pair project and repository.
* Get information about the build process (build id, start time, etc.) for the pair project and repository. 
*
* view String Set this parameter to status in order to get details about the last publication. (optional)
* returns _published__project_name___repository_name__view_status_get_200_response
* */
const publishedProjectNameRepositoryNameviewstatusGET = ({ view }) => new Promise(
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

module.exports = {
  publishedGET,
  publishedProjectNameGET,
  publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGET,
  publishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGET,
  publishedProjectNameRepositoryNameArchitectureNameGET,
  publishedProjectNameRepositoryNameGET,
  publishedProjectNameRepositoryNameviewstatusGET,
};
