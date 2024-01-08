/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete an integration subscription by ID.
*
* integrationKey String The key used to specify the integration kind.
* integrationId String The integration ID.
* no response value expected for this operation
* */
const deleteIntegrationSubscription = ({ integrationKey, integrationId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        integrationKey,
        integrationId,
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
* Get a single integration subscription by ID.
*
* integrationKey String The key used to specify the integration kind.
* integrationId String The integration ID.
* returns IntegrationSubscription
* */
const getIntegrationSubscription = ({ integrationKey, integrationId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        integrationKey,
        integrationId,
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
* Get a list of all configured integrations of a given kind.
*
* integrationKey String The key used to specify the integration kind.
* returns Integration
* */
const getIntegrationSubscriptions = ({ integrationKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        integrationKey,
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
* Get a list of all configured audit log event integrations associated with this account.
*
* returns Integrations
* */
const getIntegrations = () => new Promise(
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
* Modify an integration subscription by ID.
*
* integrationKey String The key used to specify the integration kind.
* integrationId String The integration ID.
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns IntegrationSubscription
* */
const patchIntegrationSubscription = ({ integrationKey, integrationId, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        integrationKey,
        integrationId,
        patchDelta,
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
* Create a new integration subscription of a given kind.
*
* integrationKey String The key used to specify the integration kind.
* subscriptionBody PostIntegrationSubscriptionRequest Create a new integration subscription.
* returns IntegrationSubscription
* */
const postIntegrationSubscription = ({ integrationKey, subscriptionBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        integrationKey,
        subscriptionBody,
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
  deleteIntegrationSubscription,
  getIntegrationSubscription,
  getIntegrationSubscriptions,
  getIntegrations,
  patchIntegrationSubscription,
  postIntegrationSubscription,
};
