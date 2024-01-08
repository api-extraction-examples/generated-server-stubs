import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bundle_id_response import BundleIdResponse  # noqa: E501
from openapi_server.models.certificates_response import CertificatesResponse  # noqa: E501
from openapi_server.models.devices_response import DevicesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.profile_create_request import ProfileCreateRequest  # noqa: E501
from openapi_server.models.profile_response import ProfileResponse  # noqa: E501
from openapi_server.models.profiles_response import ProfilesResponse  # noqa: E501
from openapi_server import util


def profiles_bundle_id_get_to_one_related(id, fields_bundle_ids=None):  # noqa: E501
    """profiles_bundle_id_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_bundle_ids: the fields to include for returned resources of type bundleIds
    :type fields_bundle_ids: List[str]

    :rtype: Union[BundleIdResponse, Tuple[BundleIdResponse, int], Tuple[BundleIdResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def profiles_certificates_get_to_many_related(id, fields_certificates=None, limit=None):  # noqa: E501
    """profiles_certificates_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_certificates: the fields to include for returned resources of type certificates
    :type fields_certificates: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[CertificatesResponse, Tuple[CertificatesResponse, int], Tuple[CertificatesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def profiles_create_instance(profile_create_request):  # noqa: E501
    """profiles_create_instance

     # noqa: E501

    :param profile_create_request: Profile representation
    :type profile_create_request: dict | bytes

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        profile_create_request = ProfileCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def profiles_delete_instance(id):  # noqa: E501
    """profiles_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def profiles_devices_get_to_many_related(id, fields_devices=None, limit=None):  # noqa: E501
    """profiles_devices_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_devices: the fields to include for returned resources of type devices
    :type fields_devices: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[DevicesResponse, Tuple[DevicesResponse, int], Tuple[DevicesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def profiles_get_collection(filter_name=None, filter_profile_state=None, filter_profile_type=None, filter_id=None, sort=None, fields_profiles=None, limit=None, include=None, fields_certificates=None, fields_devices=None, fields_bundle_ids=None, limit_certificates=None, limit_devices=None):  # noqa: E501
    """profiles_get_collection

     # noqa: E501

    :param filter_name: filter by attribute &#39;name&#39;
    :type filter_name: List[str]
    :param filter_profile_state: filter by attribute &#39;profileState&#39;
    :type filter_profile_state: List[str]
    :param filter_profile_type: filter by attribute &#39;profileType&#39;
    :type filter_profile_type: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_profiles: the fields to include for returned resources of type profiles
    :type fields_profiles: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_certificates: the fields to include for returned resources of type certificates
    :type fields_certificates: List[str]
    :param fields_devices: the fields to include for returned resources of type devices
    :type fields_devices: List[str]
    :param fields_bundle_ids: the fields to include for returned resources of type bundleIds
    :type fields_bundle_ids: List[str]
    :param limit_certificates: maximum number of related certificates returned (when they are included)
    :type limit_certificates: int
    :param limit_devices: maximum number of related devices returned (when they are included)
    :type limit_devices: int

    :rtype: Union[ProfilesResponse, Tuple[ProfilesResponse, int], Tuple[ProfilesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def profiles_get_instance(id, fields_profiles=None, include=None, fields_certificates=None, fields_devices=None, fields_bundle_ids=None, limit_certificates=None, limit_devices=None):  # noqa: E501
    """profiles_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_profiles: the fields to include for returned resources of type profiles
    :type fields_profiles: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_certificates: the fields to include for returned resources of type certificates
    :type fields_certificates: List[str]
    :param fields_devices: the fields to include for returned resources of type devices
    :type fields_devices: List[str]
    :param fields_bundle_ids: the fields to include for returned resources of type bundleIds
    :type fields_bundle_ids: List[str]
    :param limit_certificates: maximum number of related certificates returned (when they are included)
    :type limit_certificates: int
    :param limit_devices: maximum number of related devices returned (when they are included)
    :type limit_devices: int

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
