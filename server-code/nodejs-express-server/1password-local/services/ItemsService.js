/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a new Item
*
* vaultUuid String The UUID of the Vault to create an Item in
* fullItem FullItem  (optional)
* returns FullItem
* */
const createVaultItem = ({ vaultUuid, fullItem }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        fullItem,
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
* Delete an Item
*
* vaultUuid String The UUID of the Vault the item is in
* itemUuid String The UUID of the Item to update
* no response value expected for this operation
* */
const deleteVaultItem = ({ vaultUuid, itemUuid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        itemUuid,
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
* Get the details of an Item
*
* vaultUuid String The UUID of the Vault to fetch Item from
* itemUuid String The UUID of the Item to fetch
* returns FullItem
* */
const getVaultItemById = ({ vaultUuid, itemUuid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        itemUuid,
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
* Get all items for inside a Vault
*
* vaultUuid String The UUID of the Vault to fetch Items from
* filter String Filter the Item collection based on Item name using SCIM eq filter (optional)
* returns List
* */
const getVaultItems = ({ vaultUuid, filter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        filter,
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
* Update a subset of Item attributes
* Applies a modified [RFC6902 JSON Patch](https://tools.ietf.org/html/rfc6902) document to an Item or ItemField. This endpoint only supports `add`, `remove` and `replace` operations.  When modifying a specific ItemField, the ItemField's ID in the `path` attribute of the operation object: `/fields/{fieldId}` 
*
* vaultUuid String The UUID of the Vault the item is in
* itemUuid String The UUID of the Item to update
* patchUnderscoreinner List  (optional)
* returns FullItem
* */
const patchVaultItem = ({ vaultUuid, itemUuid, patchUnderscoreinner }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        itemUuid,
        patchUnderscoreinner,
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
* Update an Item
*
* vaultUuid String The UUID of the Item's Vault
* itemUuid String The UUID of the Item to update
* fullItem FullItem  (optional)
* returns FullItem
* */
const updateVaultItem = ({ vaultUuid, itemUuid, fullItem }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
        itemUuid,
        fullItem,
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
  createVaultItem,
  deleteVaultItem,
  getVaultItemById,
  getVaultItems,
  patchVaultItem,
  updateVaultItem,
};
