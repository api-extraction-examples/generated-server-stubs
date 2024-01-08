/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Vault details and metadata
*
* vaultUuid String The UUID of the Vault to fetch Items from
* returns Vault
* */
const getVaultById = ({ vaultUuid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vaultUuid,
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
* Get all Vaults
*
* filter String Filter the Vault collection based on Vault name using SCIM eq filter (optional)
* returns List
* */
const getVaults = ({ filter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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

module.exports = {
  getVaultById,
  getVaults,
};
