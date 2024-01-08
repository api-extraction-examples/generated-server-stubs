import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_status_for_object201_response import CreateStatusForObject201Response  # noqa: E501
from openapi_server.models.create_status_for_object_request import CreateStatusForObjectRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_statuses_for_object200_response import GetStatusesForObject200Response  # noqa: E501
from openapi_server import util


def create_status_for_object(create_status_for_object_request, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Create a status update

    Creates a new status update on an object. Returns the full record of the newly created status update. # noqa: E501

    :param create_status_for_object_request: The status update to create.
    :type create_status_for_object_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[CreateStatusForObject201Response, Tuple[CreateStatusForObject201Response, int], Tuple[CreateStatusForObject201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_status_for_object_request = CreateStatusForObjectRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_status(status_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a status update

    Deletes a specific, existing status update.  Returns an empty data record. # noqa: E501

    :param status_gid: The status update to get.
    :type status_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_status(status_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a status update

    Returns the complete record for a single status update. # noqa: E501

    :param status_gid: The status update to get.
    :type status_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateStatusForObject201Response, Tuple[CreateStatusForObject201Response, int], Tuple[CreateStatusForObject201Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_statuses_for_object(parent, opt_pretty=None, opt_fields=None, limit=None, offset=None, created_since=None):  # noqa: E501
    """Get status updates from an object

    Returns the compact status update records for all updates on the object. # noqa: E501

    :param parent: Globally unique identifier for object to fetch statuses from. Must be a GID for a project, portfolio, or goal.
    :type parent: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str
    :param created_since: Only return statuses that have been created since the given time.
    :type created_since: str

    :rtype: Union[GetStatusesForObject200Response, Tuple[GetStatusesForObject200Response, int], Tuple[GetStatusesForObject200Response, int, Dict[str, str]]
    """
    created_since = util.deserialize_datetime(created_since)
    return 'do some magic!'
