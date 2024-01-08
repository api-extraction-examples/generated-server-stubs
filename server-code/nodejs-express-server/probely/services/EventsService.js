/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List account events
*
* returns _events__get_200_response
* */
const eventsGET = () => new Promise(
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
* Retrieve account event
*
* id String Object Id
* returns Event
* */
const eventsIdGET = ({ id }) => new Promise(
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
* List target events
*
* targetUnderscoreid String Target id
* returns _events__get_200_response
* */
const targetsTargetIdEventsGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Retrieve target event
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Event
* */
const targetsTargetIdEventsIdGET = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* List target webhooks
*
* targetUnderscoreid String Target id
* returns _targets__target_id__webhooks__get_200_response
* */
const targetsTargetIdWebhooksGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Delete target webhook
*
* targetUnderscoreid String Target id
* id String Object Id
* no response value expected for this operation
* */
const targetsTargetIdWebhooksIdDELETE = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Retrieve target webhook
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Webhook
* */
const targetsTargetIdWebhooksIdGET = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Partial update target webhook
*
* targetUnderscoreid String Target id
* id String Object Id
* webhook Webhook 
* returns Webhook
* */
const targetsTargetIdWebhooksIdPATCH = ({ targetUnderscoreid, id, webhook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        webhook,
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
* Update target webhook
*
* targetUnderscoreid String Target id
* id String Object Id
* webhook Webhook 
* returns Webhook
* */
const targetsTargetIdWebhooksIdPUT = ({ targetUnderscoreid, id, webhook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        webhook,
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
* Create new target webhook
*
* targetUnderscoreid String Target id
* webhook Webhook 
* returns Webhook
* */
const targetsTargetIdWebhooksPOST = ({ targetUnderscoreid, webhook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        webhook,
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
* List account webhooks
*
* returns _targets__target_id__webhooks__get_200_response
* */
const webhooksGET = () => new Promise(
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
* Delete account webhook
*
* id String Object Id
* no response value expected for this operation
* */
const webhooksIdDELETE = ({ id }) => new Promise(
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
* Retrieve account webhook
*
* id String Object Id
* returns Webhook
* */
const webhooksIdGET = ({ id }) => new Promise(
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
* Partial update account webhook
*
* id String Object Id
* webhook Webhook 
* returns Webhook
* */
const webhooksIdPATCH = ({ id, webhook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        webhook,
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
* Update account webhook
*
* id String Object Id
* webhook Webhook 
* returns Webhook
* */
const webhooksIdPUT = ({ id, webhook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        webhook,
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
* Create new account webhook
*
* webhook Webhook 
* returns Webhook
* */
const webhooksPOST = ({ webhook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        webhook,
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
  eventsGET,
  eventsIdGET,
  targetsTargetIdEventsGET,
  targetsTargetIdEventsIdGET,
  targetsTargetIdWebhooksGET,
  targetsTargetIdWebhooksIdDELETE,
  targetsTargetIdWebhooksIdGET,
  targetsTargetIdWebhooksIdPATCH,
  targetsTargetIdWebhooksIdPUT,
  targetsTargetIdWebhooksPOST,
  webhooksGET,
  webhooksIdDELETE,
  webhooksIdGET,
  webhooksIdPATCH,
  webhooksIdPUT,
  webhooksPOST,
};
