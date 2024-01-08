import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.event_log import EventLog  # noqa: E501
from openapi_server.models.event_log_collection import EventLogCollection  # noqa: E501
from openapi_server import util


def get_event_log(event_log_id):  # noqa: E501
    """Get a log entry

     # noqa: E501

    :param event_log_id: The event log ID.
    :type event_log_id: int

    :rtype: Union[EventLog, Tuple[EventLog, int], Tuple[EventLog, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_event_logs(limit=None, offset=None, order_by=None):  # noqa: E501
    """List log entries

    List log entries from event log. # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[EventLogCollection, Tuple[EventLogCollection, int], Tuple[EventLogCollection, int, Dict[str, str]]
    """
    return 'do some magic!'
