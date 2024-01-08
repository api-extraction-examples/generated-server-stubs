import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.beta_build_localization_create_request import BetaBuildLocalizationCreateRequest  # noqa: E501
from openapi_server.models.beta_build_localization_response import BetaBuildLocalizationResponse  # noqa: E501
from openapi_server.models.beta_build_localization_update_request import BetaBuildLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.beta_build_localizations_response import BetaBuildLocalizationsResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_build_localizations_build_get_to_one_related(id, fields_builds=None):  # noqa: E501
    """beta_build_localizations_build_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BuildResponse, Tuple[BuildResponse, int], Tuple[BuildResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_build_localizations_create_instance(beta_build_localization_create_request):  # noqa: E501
    """beta_build_localizations_create_instance

     # noqa: E501

    :param beta_build_localization_create_request: BetaBuildLocalization representation
    :type beta_build_localization_create_request: dict | bytes

    :rtype: Union[BetaBuildLocalizationResponse, Tuple[BetaBuildLocalizationResponse, int], Tuple[BetaBuildLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_build_localization_create_request = BetaBuildLocalizationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_build_localizations_delete_instance(id):  # noqa: E501
    """beta_build_localizations_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_build_localizations_get_collection(filter_locale=None, filter_build=None, fields_beta_build_localizations=None, limit=None, include=None, fields_builds=None):  # noqa: E501
    """beta_build_localizations_get_collection

     # noqa: E501

    :param filter_locale: filter by attribute &#39;locale&#39;
    :type filter_locale: List[str]
    :param filter_build: filter by id(s) of related &#39;build&#39;
    :type filter_build: List[str]
    :param fields_beta_build_localizations: the fields to include for returned resources of type betaBuildLocalizations
    :type fields_beta_build_localizations: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BetaBuildLocalizationsResponse, Tuple[BetaBuildLocalizationsResponse, int], Tuple[BetaBuildLocalizationsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_build_localizations_get_instance(id, fields_beta_build_localizations=None, include=None, fields_builds=None):  # noqa: E501
    """beta_build_localizations_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_build_localizations: the fields to include for returned resources of type betaBuildLocalizations
    :type fields_beta_build_localizations: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BetaBuildLocalizationResponse, Tuple[BetaBuildLocalizationResponse, int], Tuple[BetaBuildLocalizationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_build_localizations_update_instance(id, beta_build_localization_update_request):  # noqa: E501
    """beta_build_localizations_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_build_localization_update_request: BetaBuildLocalization representation
    :type beta_build_localization_update_request: dict | bytes

    :rtype: Union[BetaBuildLocalizationResponse, Tuple[BetaBuildLocalizationResponse, int], Tuple[BetaBuildLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_build_localization_update_request = BetaBuildLocalizationUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
