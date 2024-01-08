import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_app_localization_create_request import BetaAppLocalizationCreateRequest  # noqa: E501
from openapi_server.models.beta_app_localization_response import BetaAppLocalizationResponse  # noqa: E501
from openapi_server.models.beta_app_localization_update_request import BetaAppLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.beta_app_localizations_response import BetaAppLocalizationsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_app_localizations_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """beta_app_localizations_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_localizations_create_instance(beta_app_localization_create_request):  # noqa: E501
    """beta_app_localizations_create_instance

     # noqa: E501

    :param beta_app_localization_create_request: BetaAppLocalization representation
    :type beta_app_localization_create_request: dict | bytes

    :rtype: Union[BetaAppLocalizationResponse, Tuple[BetaAppLocalizationResponse, int], Tuple[BetaAppLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_app_localization_create_request = BetaAppLocalizationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_app_localizations_delete_instance(id):  # noqa: E501
    """beta_app_localizations_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_localizations_get_collection(filter_locale=None, filter_app=None, fields_beta_app_localizations=None, limit=None, include=None, fields_apps=None):  # noqa: E501
    """beta_app_localizations_get_collection

     # noqa: E501

    :param filter_locale: filter by attribute &#39;locale&#39;
    :type filter_locale: List[str]
    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param fields_beta_app_localizations: the fields to include for returned resources of type betaAppLocalizations
    :type fields_beta_app_localizations: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[BetaAppLocalizationsResponse, Tuple[BetaAppLocalizationsResponse, int], Tuple[BetaAppLocalizationsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_localizations_get_instance(id, fields_beta_app_localizations=None, include=None, fields_apps=None):  # noqa: E501
    """beta_app_localizations_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_app_localizations: the fields to include for returned resources of type betaAppLocalizations
    :type fields_beta_app_localizations: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[BetaAppLocalizationResponse, Tuple[BetaAppLocalizationResponse, int], Tuple[BetaAppLocalizationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_localizations_update_instance(id, beta_app_localization_update_request):  # noqa: E501
    """beta_app_localizations_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_app_localization_update_request: BetaAppLocalization representation
    :type beta_app_localization_update_request: dict | bytes

    :rtype: Union[BetaAppLocalizationResponse, Tuple[BetaAppLocalizationResponse, int], Tuple[BetaAppLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_app_localization_update_request = BetaAppLocalizationUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
