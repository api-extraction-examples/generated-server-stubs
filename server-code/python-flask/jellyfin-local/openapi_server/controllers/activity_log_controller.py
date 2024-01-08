import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.activity_log_entry_query_result import ActivityLogEntryQueryResult  # noqa: E501
from openapi_server import util


def get_log_entries(start_index=None, limit=None, min_date=None, has_user_id=None):  # noqa: E501
    """Gets activity log entries.

     # noqa: E501

    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param min_date: Optional. The minimum date. Format &#x3D; ISO.
    :type min_date: str
    :param has_user_id: Optional. Filter log entries if it has user id, or not.
    :type has_user_id: bool

    :rtype: Union[ActivityLogEntryQueryResult, Tuple[ActivityLogEntryQueryResult, int], Tuple[ActivityLogEntryQueryResult, int, Dict[str, str]]
    """
    min_date = util.deserialize_datetime(min_date)
    return 'do some magic!'
