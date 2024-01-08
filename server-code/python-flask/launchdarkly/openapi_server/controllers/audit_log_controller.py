import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.audit_log_entries import AuditLogEntries  # noqa: E501
from openapi_server.models.audit_log_entry import AuditLogEntry  # noqa: E501
from openapi_server import util


def get_audit_log_entries(before=None, after=None, q=None, limit=None, spec=None):  # noqa: E501
    """Get a list of all audit log entries. The query parameters allow you to restrict the returned results by date ranges, resource specifiers, or a full-text search query.

     # noqa: E501

    :param before: A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have before this timestamp.
    :type before: int
    :param after: A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occurred after this timestamp.
    :type after: int
    :param q: Text to search for. You can search for the full or partial name of the resource involved or full or partial email address of the member who made the change.
    :type q: str
    :param limit: A limit on the number of audit log entries to be returned, between 1 and 20.
    :type limit: 
    :param spec: A resource specifier, allowing you to filter audit log listings by resource.
    :type spec: str

    :rtype: Union[AuditLogEntries, Tuple[AuditLogEntries, int], Tuple[AuditLogEntries, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_audit_log_entry(resource_id):  # noqa: E501
    """Use this endpoint to fetch a single audit log entry by its resouce ID.

     # noqa: E501

    :param resource_id: The resource ID.
    :type resource_id: str

    :rtype: Union[AuditLogEntry, Tuple[AuditLogEntry, int], Tuple[AuditLogEntry, int, Dict[str, str]]
    """
    return 'do some magic!'
