import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.territories_response import TerritoriesResponse  # noqa: E501
from openapi_server import util


def territories_get_collection(fields_territories=None, limit=None):  # noqa: E501
    """territories_get_collection

     # noqa: E501

    :param fields_territories: the fields to include for returned resources of type territories
    :type fields_territories: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[TerritoriesResponse, Tuple[TerritoriesResponse, int], Tuple[TerritoriesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
