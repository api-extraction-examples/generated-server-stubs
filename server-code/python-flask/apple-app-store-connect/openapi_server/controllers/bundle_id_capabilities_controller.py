import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bundle_id_capability_create_request import BundleIdCapabilityCreateRequest  # noqa: E501
from openapi_server.models.bundle_id_capability_response import BundleIdCapabilityResponse  # noqa: E501
from openapi_server.models.bundle_id_capability_update_request import BundleIdCapabilityUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def bundle_id_capabilities_create_instance(bundle_id_capability_create_request):  # noqa: E501
    """bundle_id_capabilities_create_instance

     # noqa: E501

    :param bundle_id_capability_create_request: BundleIdCapability representation
    :type bundle_id_capability_create_request: dict | bytes

    :rtype: Union[BundleIdCapabilityResponse, Tuple[BundleIdCapabilityResponse, int], Tuple[BundleIdCapabilityResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bundle_id_capability_create_request = BundleIdCapabilityCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def bundle_id_capabilities_delete_instance(id):  # noqa: E501
    """bundle_id_capabilities_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def bundle_id_capabilities_update_instance(id, bundle_id_capability_update_request):  # noqa: E501
    """bundle_id_capabilities_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param bundle_id_capability_update_request: BundleIdCapability representation
    :type bundle_id_capability_update_request: dict | bytes

    :rtype: Union[BundleIdCapabilityResponse, Tuple[BundleIdCapabilityResponse, int], Tuple[BundleIdCapabilityResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bundle_id_capability_update_request = BundleIdCapabilityUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
