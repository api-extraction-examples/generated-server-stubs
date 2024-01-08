import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.bundle_id_capabilities_response import BundleIdCapabilitiesResponse  # noqa: E501
from openapi_server.models.bundle_id_create_request import BundleIdCreateRequest  # noqa: E501
from openapi_server.models.bundle_id_response import BundleIdResponse  # noqa: E501
from openapi_server.models.bundle_id_update_request import BundleIdUpdateRequest  # noqa: E501
from openapi_server.models.bundle_ids_response import BundleIdsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.profiles_response import ProfilesResponse  # noqa: E501
from openapi_server import util


def bundle_ids_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """bundle_ids_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def bundle_ids_bundle_id_capabilities_get_to_many_related(id, fields_bundle_id_capabilities=None, limit=None):  # noqa: E501
    """bundle_ids_bundle_id_capabilities_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_bundle_id_capabilities: the fields to include for returned resources of type bundleIdCapabilities
    :type fields_bundle_id_capabilities: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BundleIdCapabilitiesResponse, Tuple[BundleIdCapabilitiesResponse, int], Tuple[BundleIdCapabilitiesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def bundle_ids_create_instance(bundle_id_create_request):  # noqa: E501
    """bundle_ids_create_instance

     # noqa: E501

    :param bundle_id_create_request: BundleId representation
    :type bundle_id_create_request: dict | bytes

    :rtype: Union[BundleIdResponse, Tuple[BundleIdResponse, int], Tuple[BundleIdResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bundle_id_create_request = BundleIdCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def bundle_ids_delete_instance(id):  # noqa: E501
    """bundle_ids_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def bundle_ids_get_collection(filter_identifier=None, filter_name=None, filter_platform=None, filter_seed_id=None, filter_id=None, sort=None, fields_bundle_ids=None, limit=None, include=None, fields_bundle_id_capabilities=None, fields_profiles=None, fields_apps=None, limit_bundle_id_capabilities=None, limit_profiles=None):  # noqa: E501
    """bundle_ids_get_collection

     # noqa: E501

    :param filter_identifier: filter by attribute &#39;identifier&#39;
    :type filter_identifier: List[str]
    :param filter_name: filter by attribute &#39;name&#39;
    :type filter_name: List[str]
    :param filter_platform: filter by attribute &#39;platform&#39;
    :type filter_platform: List[str]
    :param filter_seed_id: filter by attribute &#39;seedId&#39;
    :type filter_seed_id: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_bundle_ids: the fields to include for returned resources of type bundleIds
    :type fields_bundle_ids: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_bundle_id_capabilities: the fields to include for returned resources of type bundleIdCapabilities
    :type fields_bundle_id_capabilities: List[str]
    :param fields_profiles: the fields to include for returned resources of type profiles
    :type fields_profiles: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_bundle_id_capabilities: maximum number of related bundleIdCapabilities returned (when they are included)
    :type limit_bundle_id_capabilities: int
    :param limit_profiles: maximum number of related profiles returned (when they are included)
    :type limit_profiles: int

    :rtype: Union[BundleIdsResponse, Tuple[BundleIdsResponse, int], Tuple[BundleIdsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def bundle_ids_get_instance(id, fields_bundle_ids=None, include=None, fields_bundle_id_capabilities=None, fields_profiles=None, fields_apps=None, limit_bundle_id_capabilities=None, limit_profiles=None):  # noqa: E501
    """bundle_ids_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_bundle_ids: the fields to include for returned resources of type bundleIds
    :type fields_bundle_ids: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_bundle_id_capabilities: the fields to include for returned resources of type bundleIdCapabilities
    :type fields_bundle_id_capabilities: List[str]
    :param fields_profiles: the fields to include for returned resources of type profiles
    :type fields_profiles: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_bundle_id_capabilities: maximum number of related bundleIdCapabilities returned (when they are included)
    :type limit_bundle_id_capabilities: int
    :param limit_profiles: maximum number of related profiles returned (when they are included)
    :type limit_profiles: int

    :rtype: Union[BundleIdResponse, Tuple[BundleIdResponse, int], Tuple[BundleIdResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def bundle_ids_profiles_get_to_many_related(id, fields_profiles=None, limit=None):  # noqa: E501
    """bundle_ids_profiles_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_profiles: the fields to include for returned resources of type profiles
    :type fields_profiles: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[ProfilesResponse, Tuple[ProfilesResponse, int], Tuple[ProfilesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def bundle_ids_update_instance(id, bundle_id_update_request):  # noqa: E501
    """bundle_ids_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param bundle_id_update_request: BundleId representation
    :type bundle_id_update_request: dict | bytes

    :rtype: Union[BundleIdResponse, Tuple[BundleIdResponse, int], Tuple[BundleIdResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bundle_id_update_request = BundleIdUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
