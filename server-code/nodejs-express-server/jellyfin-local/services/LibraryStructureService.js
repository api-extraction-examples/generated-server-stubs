/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add a media path to a library.
*
* mediaPathDto MediaPathDto The media path dto.
* refreshLibrary Boolean Whether to refresh the library. (optional)
* no response value expected for this operation
* */
const addMediaPath = ({ mediaPathDto, refreshLibrary }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaPathDto,
        refreshLibrary,
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
* Adds a virtual folder.
*
* name String The name of the virtual folder. (optional)
* collectionType String The type of the collection. (optional)
* paths List The paths of the virtual folder. (optional)
* refreshLibrary Boolean Whether to refresh the library. (optional)
* addVirtualFolderDto AddVirtualFolderDto The library options. (optional)
* no response value expected for this operation
* */
const addVirtualFolder = ({ name, collectionType, paths, refreshLibrary, addVirtualFolderDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        collectionType,
        paths,
        refreshLibrary,
        addVirtualFolderDto,
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
* Gets all virtual folders.
*
* returns List
* */
const getVirtualFolders = () => new Promise(
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
* Remove a media path.
*
* name String The name of the library. (optional)
* path String The path to remove. (optional)
* refreshLibrary Boolean Whether to refresh the library. (optional)
* no response value expected for this operation
* */
const removeMediaPath = ({ name, path, refreshLibrary }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        path,
        refreshLibrary,
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
* Removes a virtual folder.
*
* name String The name of the folder. (optional)
* refreshLibrary Boolean Whether to refresh the library. (optional)
* no response value expected for this operation
* */
const removeVirtualFolder = ({ name, refreshLibrary }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        refreshLibrary,
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
* Renames a virtual folder.
*
* name String The name of the virtual folder. (optional)
* newName String The new name. (optional)
* refreshLibrary Boolean Whether to refresh the library. (optional)
* no response value expected for this operation
* */
const renameVirtualFolder = ({ name, newName, refreshLibrary }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        newName,
        refreshLibrary,
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
* Update library options.
*
* updateLibraryOptionsDto UpdateLibraryOptionsDto The library name and options. (optional)
* no response value expected for this operation
* */
const updateLibraryOptions = ({ updateLibraryOptionsDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        updateLibraryOptionsDto,
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
* Updates a media path.
*
* name String The name of the library. (optional)
* mediaPathInfo MediaPathInfo The path info. (optional)
* no response value expected for this operation
* */
const updateMediaPath = ({ name, mediaPathInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        mediaPathInfo,
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
  addMediaPath,
  addVirtualFolder,
  getVirtualFolders,
  removeMediaPath,
  removeVirtualFolder,
  renameVirtualFolder,
  updateLibraryOptions,
  updateMediaPath,
};
