/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get audit log events
* Retrieve the audit log events that have been captured in your domain.  This endpoint will return a list of [AuditLogEvent](/docs/audit-log-event) objects, sorted by creation time in ascending order. Note that the Audit Log API captures events from October 8th, 2021 and later. Queries for events before this date will not return results.  There are a number of query parameters (below) that can be used to filter the set of [AuditLogEvent](/docs/audit-log-event) objects that are returned in the response. Any combination of query parameters is valid. When no filters are provided, all of the events that have been captured in your domain will match.  The list of events will always be [paginated](/docs/pagination). The default limit is 1000 events. The next set of events can be retrieved using the `offset` from the previous response. If there are no events that match the provided filters in your domain, the endpoint will return `null` for the `next_page` field. Querying again with the same filters may return new events if they were captured after the last request. Once a response includes a `next_page` with an `offset`, subsequent requests can be made with the latest `offset` to poll for new events that match the provided filters.  When no `offset` is provided, the response will begin with the oldest events that match the provided filters. It is important to note that [AuditLogEvent](/docs/audit-log-event) objects will be permanently deleted from our systems after 90 days. If you wish to keep a permanent record of these events, we recommend using a SIEM tool to ingest and store these logs.
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* startUnderscoreat Date Filter to events created after this time (inclusive). (optional)
* endUnderscoreat Date Filter to events created before this time (exclusive). (optional)
* eventUnderscoretype String Filter to events of this type. Refer to the [Supported AuditLogEvents](/docs/supported-auditlogevents) for a full list of values. (optional)
* actorUnderscoretype String Filter to events with an actor of this type. This only needs to be included if querying for actor types without an ID. If `actor_gid` is included, this should be excluded. (optional)
* actorUnderscoregid String Filter to events triggered by the actor with this ID. (optional)
* resourceUnderscoregid String Filter to events with this resource ID. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getAuditLogEvents_200_response
* */
const getAuditLogEvents = ({ workspaceUnderscoregid, startUnderscoreat, endUnderscoreat, eventUnderscoretype, actorUnderscoretype, actorUnderscoregid, resourceUnderscoregid, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
        startUnderscoreat,
        endUnderscoreat,
        eventUnderscoretype,
        actorUnderscoretype,
        actorUnderscoregid,
        resourceUnderscoregid,
        limit,
        offset,
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
  getAuditLogEvents,
};
