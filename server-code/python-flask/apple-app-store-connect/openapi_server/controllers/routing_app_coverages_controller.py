import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.routing_app_coverage_create_request import RoutingAppCoverageCreateRequest  # noqa: E501
from openapi_server.models.routing_app_coverage_response import RoutingAppCoverageResponse  # noqa: E501
from openapi_server.models.routing_app_coverage_update_request import RoutingAppCoverageUpdateRequest  # noqa: E501
from openapi_server import util


def routing_app_coverages_create_instance(routing_app_coverage_create_request):  # noqa: E501
    """routing_app_coverages_create_instance

     # noqa: E501

    :param routing_app_coverage_create_request: RoutingAppCoverage representation
    :type routing_app_coverage_create_request: dict | bytes

    :rtype: Union[RoutingAppCoverageResponse, Tuple[RoutingAppCoverageResponse, int], Tuple[RoutingAppCoverageResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        routing_app_coverage_create_request = RoutingAppCoverageCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def routing_app_coverages_delete_instance(id):  # noqa: E501
    """routing_app_coverages_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def routing_app_coverages_get_instance(id, fields_routing_app_coverages=None, include=None):  # noqa: E501
    """routing_app_coverages_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_routing_app_coverages: the fields to include for returned resources of type routingAppCoverages
    :type fields_routing_app_coverages: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[RoutingAppCoverageResponse, Tuple[RoutingAppCoverageResponse, int], Tuple[RoutingAppCoverageResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def routing_app_coverages_update_instance(id, routing_app_coverage_update_request):  # noqa: E501
    """routing_app_coverages_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param routing_app_coverage_update_request: RoutingAppCoverage representation
    :type routing_app_coverage_update_request: dict | bytes

    :rtype: Union[RoutingAppCoverageResponse, Tuple[RoutingAppCoverageResponse, int], Tuple[RoutingAppCoverageResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        routing_app_coverage_update_request = RoutingAppCoverageUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
