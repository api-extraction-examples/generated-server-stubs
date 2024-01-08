/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* 
*
* alexaSkillId String Deprecated. (optional)
* apnCredentialSid String The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings. (optional)
* defaultAlexaNotificationProtocolVersion String Deprecated. (optional)
* defaultApnNotificationProtocolVersion String The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource. (optional)
* defaultFcmNotificationProtocolVersion String The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource. (optional)
* defaultGcmNotificationProtocolVersion String The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource. (optional)
* deliveryCallbackEnabled Boolean Callback configuration that enables delivery callbacks, default false (optional)
* deliveryCallbackUrl String URL to send delivery status callback. (optional)
* facebookMessengerPageId String Deprecated. (optional)
* fcmCredentialSid String The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings. (optional)
* friendlyName String A descriptive string that you create to describe the resource. It can be up to 64 characters long. (optional)
* gcmCredentialSid String The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings. (optional)
* logEnabled Boolean Whether to log notifications. Can be: `true` or `false` and the default is `true`. (optional)
* messagingServiceSid String The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. This parameter must be set in order to send SMS notifications. (optional)
* returns notify.v1.service
* */
const createService = ({ alexaSkillId, apnCredentialSid, defaultAlexaNotificationProtocolVersion, defaultApnNotificationProtocolVersion, defaultFcmNotificationProtocolVersion, defaultGcmNotificationProtocolVersion, deliveryCallbackEnabled, deliveryCallbackUrl, facebookMessengerPageId, fcmCredentialSid, friendlyName, gcmCredentialSid, logEnabled, messagingServiceSid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        alexaSkillId,
        apnCredentialSid,
        defaultAlexaNotificationProtocolVersion,
        defaultApnNotificationProtocolVersion,
        defaultFcmNotificationProtocolVersion,
        defaultGcmNotificationProtocolVersion,
        deliveryCallbackEnabled,
        deliveryCallbackUrl,
        facebookMessengerPageId,
        fcmCredentialSid,
        friendlyName,
        gcmCredentialSid,
        logEnabled,
        messagingServiceSid,
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
* 
*
* sid String The Twilio-provided string that uniquely identifies the Service resource to delete.
* no response value expected for this operation
* */
const deleteService = ({ sid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sid,
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
* 
*
* sid String The Twilio-provided string that uniquely identifies the Service resource to fetch.
* returns notify.v1.service
* */
const fetchService = ({ sid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sid,
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
* 
*
* friendlyName String The string that identifies the Service resources to read. (optional)
* pageSize Integer How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
* page Integer The page index. This value is simply for client state. (optional)
* pageToken String The page token. This is provided by the API. (optional)
* returns ListServiceResponse
* */
const listService = ({ friendlyName, pageSize, page, pageToken }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        friendlyName,
        pageSize,
        page,
        pageToken,
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
* 
*
* sid String The Twilio-provided string that uniquely identifies the Service resource to update.
* alexaSkillId String Deprecated. (optional)
* apnCredentialSid String The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings. (optional)
* defaultAlexaNotificationProtocolVersion String Deprecated. (optional)
* defaultApnNotificationProtocolVersion String The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource. (optional)
* defaultFcmNotificationProtocolVersion String The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource. (optional)
* defaultGcmNotificationProtocolVersion String The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource. (optional)
* deliveryCallbackEnabled Boolean Callback configuration that enables delivery callbacks, default false (optional)
* deliveryCallbackUrl String URL to send delivery status callback. (optional)
* facebookMessengerPageId String Deprecated. (optional)
* fcmCredentialSid String The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings. (optional)
* friendlyName String A descriptive string that you create to describe the resource. It can be up to 64 characters long. (optional)
* gcmCredentialSid String The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings. (optional)
* logEnabled Boolean Whether to log notifications. Can be: `true` or `false` and the default is `true`. (optional)
* messagingServiceSid String The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. This parameter must be set in order to send SMS notifications. (optional)
* returns notify.v1.service
* */
const updateService = ({ sid, alexaSkillId, apnCredentialSid, defaultAlexaNotificationProtocolVersion, defaultApnNotificationProtocolVersion, defaultFcmNotificationProtocolVersion, defaultGcmNotificationProtocolVersion, deliveryCallbackEnabled, deliveryCallbackUrl, facebookMessengerPageId, fcmCredentialSid, friendlyName, gcmCredentialSid, logEnabled, messagingServiceSid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sid,
        alexaSkillId,
        apnCredentialSid,
        defaultAlexaNotificationProtocolVersion,
        defaultApnNotificationProtocolVersion,
        defaultFcmNotificationProtocolVersion,
        defaultGcmNotificationProtocolVersion,
        deliveryCallbackEnabled,
        deliveryCallbackUrl,
        facebookMessengerPageId,
        fcmCredentialSid,
        friendlyName,
        gcmCredentialSid,
        logEnabled,
        messagingServiceSid,
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
  createService,
  deleteService,
  fetchService,
  listService,
  updateService,
};
