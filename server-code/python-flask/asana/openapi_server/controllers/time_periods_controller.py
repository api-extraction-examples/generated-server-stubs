import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_time_period200_response import GetTimePeriod200Response  # noqa: E501
from openapi_server.models.get_time_periods200_response import GetTimePeriods200Response  # noqa: E501
from openapi_server import util


def get_time_period(time_period_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a time period

    Returns the full record for a single time period. # noqa: E501

    :param time_period_gid: Globally unique identifier for the time period.
    :type time_period_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetTimePeriod200Response, Tuple[GetTimePeriod200Response, int], Tuple[GetTimePeriod200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_time_periods(workspace, opt_pretty=None, opt_fields=None, limit=None, offset=None, start_on=None, end_on=None):  # noqa: E501
    """Get time periods

    Returns compact time period records. # noqa: E501

    :param workspace: Globally unique identifier for the workspace.
    :type workspace: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str
    :param start_on: ISO 8601 date string
    :type start_on: str
    :param end_on: ISO 8601 date string
    :type end_on: str

    :rtype: Union[GetTimePeriods200Response, Tuple[GetTimePeriods200Response, int], Tuple[GetTimePeriods200Response, int, Dict[str, str]]
    """
    start_on = util.deserialize_date(start_on)
    end_on = util.deserialize_date(end_on)
    return 'do some magic!'
