/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* 
*
* serviceSid String The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) to create the resource under.
* address String The channel-specific address. For APNS, the device token. For FCM and GCM, the registration token. For SMS, a phone number in E.164 format. For Facebook Messenger, the Messenger ID of the user or a phone number in E.164 format.
* bindingType binding_enum_binding_type 
* identity String The `identity` value that uniquely identifies the new resource's [User](https://www.twilio.com/docs/chat/rest/user-resource) within the [Service](https://www.twilio.com/docs/notify/api/service-resource). Up to 20 Bindings can be created for the same Identity in a given Service.
* credentialSid String The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) resource to be used to send notifications to this Binding. If present, this overrides the Credential specified in the Service resource. Applies to only `apn`, `fcm`, and `gcm` type Bindings. (optional)
* endpoint String Deprecated. (optional)
* notificationProtocolVersion String The protocol version to use to send the notification. This defaults to the value of `default_xxxx_notification_protocol_version` for the protocol in the [Service](https://www.twilio.com/docs/notify/api/service-resource). The current version is `\\\"3\\\"` for `apn`, `fcm`, and `gcm` type Bindings. The parameter is not applicable to `sms` and `facebook-messenger` type Bindings as the data format is fixed. (optional)
* tag List A tag that can be used to select the Bindings to notify. Repeat this parameter to specify more than one tag, up to a total of 20 tags. (optional)
* returns notify.v1.service.binding
* */
const createBinding = ({ serviceSid, address, bindingType, identity, credentialSid, endpoint, notificationProtocolVersion, tag }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceSid,
        address,
        bindingType,
        identity,
        credentialSid,
        endpoint,
        notificationProtocolVersion,
        tag,
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
* serviceSid String The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) to delete the resource from.
* sid String The Twilio-provided string that uniquely identifies the Binding resource to delete.
* no response value expected for this operation
* */
const deleteBinding = ({ serviceSid, sid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceSid,
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
* serviceSid String The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) to fetch the resource from.
* sid String The Twilio-provided string that uniquely identifies the Binding resource to fetch.
* returns notify.v1.service.binding
* */
const fetchBinding = ({ serviceSid, sid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceSid,
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
* serviceSid String The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) to read the resource from.
* startDate date Only include usage that has occurred on or after this date. Specify the date in GMT and format as `YYYY-MM-DD`. (optional)
* endDate date Only include usage that occurred on or before this date. Specify the date in GMT and format as `YYYY-MM-DD`. (optional)
* identity List The [User](https://www.twilio.com/docs/chat/rest/user-resource)'s `identity` value of the resources to read. (optional)
* tag List Only list Bindings that have all of the specified Tags. The following implicit tags are available: `all`, `apn`, `fcm`, `gcm`, `sms`, `facebook-messenger`. Up to 5 tags are allowed. (optional)
* pageSize Integer How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
* page Integer The page index. This value is simply for client state. (optional)
* pageToken String The page token. This is provided by the API. (optional)
* returns ListBindingResponse
* */
const listBinding = ({ serviceSid, startDate, endDate, identity, tag, pageSize, page, pageToken }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceSid,
        startDate,
        endDate,
        identity,
        tag,
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

module.exports = {
  createBinding,
  deleteBinding,
  fetchBinding,
  listBinding,
};
