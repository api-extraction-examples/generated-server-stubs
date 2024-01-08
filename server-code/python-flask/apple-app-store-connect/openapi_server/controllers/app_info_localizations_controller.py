import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_info_localization_create_request import AppInfoLocalizationCreateRequest  # noqa: E501
from openapi_server.models.app_info_localization_response import AppInfoLocalizationResponse  # noqa: E501
from openapi_server.models.app_info_localization_update_request import AppInfoLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_info_localizations_create_instance(app_info_localization_create_request):  # noqa: E501
    """app_info_localizations_create_instance

     # noqa: E501

    :param app_info_localization_create_request: AppInfoLocalization representation
    :type app_info_localization_create_request: dict | bytes

    :rtype: Union[AppInfoLocalizationResponse, Tuple[AppInfoLocalizationResponse, int], Tuple[AppInfoLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_info_localization_create_request = AppInfoLocalizationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_info_localizations_delete_instance(id):  # noqa: E501
    """app_info_localizations_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_info_localizations_get_instance(id, fields_app_info_localizations=None, include=None):  # noqa: E501
    """app_info_localizations_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_info_localizations: the fields to include for returned resources of type appInfoLocalizations
    :type fields_app_info_localizations: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppInfoLocalizationResponse, Tuple[AppInfoLocalizationResponse, int], Tuple[AppInfoLocalizationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_info_localizations_update_instance(id, app_info_localization_update_request):  # noqa: E501
    """app_info_localizations_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_info_localization_update_request: AppInfoLocalization representation
    :type app_info_localization_update_request: dict | bytes

    :rtype: Union[AppInfoLocalizationResponse, Tuple[AppInfoLocalizationResponse, int], Tuple[AppInfoLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_info_localization_update_request = AppInfoLocalizationUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
