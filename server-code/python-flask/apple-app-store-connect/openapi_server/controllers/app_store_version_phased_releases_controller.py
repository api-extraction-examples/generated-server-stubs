import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_store_version_phased_release_create_request import AppStoreVersionPhasedReleaseCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_phased_release_response import AppStoreVersionPhasedReleaseResponse  # noqa: E501
from openapi_server.models.app_store_version_phased_release_update_request import AppStoreVersionPhasedReleaseUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_store_version_phased_releases_create_instance(app_store_version_phased_release_create_request):  # noqa: E501
    """app_store_version_phased_releases_create_instance

     # noqa: E501

    :param app_store_version_phased_release_create_request: AppStoreVersionPhasedRelease representation
    :type app_store_version_phased_release_create_request: dict | bytes

    :rtype: Union[AppStoreVersionPhasedReleaseResponse, Tuple[AppStoreVersionPhasedReleaseResponse, int], Tuple[AppStoreVersionPhasedReleaseResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_phased_release_create_request = AppStoreVersionPhasedReleaseCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_store_version_phased_releases_delete_instance(id):  # noqa: E501
    """app_store_version_phased_releases_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_version_phased_releases_update_instance(id, app_store_version_phased_release_update_request):  # noqa: E501
    """app_store_version_phased_releases_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_store_version_phased_release_update_request: AppStoreVersionPhasedRelease representation
    :type app_store_version_phased_release_update_request: dict | bytes

    :rtype: Union[AppStoreVersionPhasedReleaseResponse, Tuple[AppStoreVersionPhasedReleaseResponse, int], Tuple[AppStoreVersionPhasedReleaseResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_phased_release_update_request = AppStoreVersionPhasedReleaseUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
