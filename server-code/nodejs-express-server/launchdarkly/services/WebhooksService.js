/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a webhook by ID.
*
* resourceId String The resource ID.
* no response value expected for this operation
* */
const deleteWebhook = ({ resourceId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        resourceId,
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
* Get a webhook by ID.
*
* resourceId String The resource ID.
* returns Webhook
* */
const getWebhook = ({ resourceId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        resourceId,
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
* Fetch a list of all webhooks.
*
* returns Webhooks
* */
const getWebhooks = () => new Promise(
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
* Modify a webhook by ID.
*
* resourceId String The resource ID.
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns Webhook
* */
const patchWebhook = ({ resourceId, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        resourceId,
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
* Create a webhook.
*
* webhookBody PostWebhookRequest New webhook.
* returns Webhook
* */
const postWebhook = ({ webhookBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        webhookBody,
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
  deleteWebhook,
  getWebhook,
  getWebhooks,
  patchWebhook,
  postWebhook,
};
