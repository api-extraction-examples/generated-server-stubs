import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_batch_request200_response import CreateBatchRequest200Response  # noqa: E501
from openapi_server.models.create_batch_request_request import CreateBatchRequestRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def create_batch_request(create_batch_request_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Submit parallel requests

    Make multiple requests in parallel to Asana&#39;s API. # noqa: E501

    :param create_batch_request_request: The requests to batch together via the Batch API.
    :type create_batch_request_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateBatchRequest200Response, Tuple[CreateBatchRequest200Response, int], Tuple[CreateBatchRequest200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_batch_request_request = CreateBatchRequestRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
