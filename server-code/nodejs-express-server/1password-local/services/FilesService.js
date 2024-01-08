/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get the content of a File
*
* vaultUuid UUID The UUID of the Vault the item is in
* itemUuid UUID The UUID of the Item the File is in
* fileUuid String UUID of the file to get content from
* returns File
* */
const downloadFileByID = ({ vaultUuid, itemUuid, fileUuid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        itemUuid,
        fileUuid,
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
* Get the details of a File
*
* vaultUuid UUID The UUID of the Vault to fetch Item from
* itemUuid UUID The UUID of the Item to fetch File from
* fileUuid UUID The UUID of the File to fetch
* inlineUnderscorefiles Boolean Tells server to return the base64-encoded file contents in the response. (optional)
* returns File
* */
const getDetailsOfFileById = ({ vaultUuid, itemUuid, fileUuid, inlineUnderscorefiles }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        itemUuid,
        fileUuid,
        inlineUnderscorefiles,
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
* Get all the files inside an Item
*
* vaultUuid UUID The UUID of the Vault to fetch Items from
* itemUuid UUID The UUID of the Item to fetch files from
* inlineUnderscorefiles Boolean Tells server to return the base64-encoded file contents in the response. (optional)
* returns List
* */
const getItemFiles = ({ vaultUuid, itemUuid, inlineUnderscorefiles }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        itemUuid,
        inlineUnderscorefiles,
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
  downloadFileByID,
  getDetailsOfFileById,
  getItemFiles,
};
